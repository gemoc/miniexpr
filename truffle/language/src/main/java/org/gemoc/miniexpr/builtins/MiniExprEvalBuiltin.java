package org.gemoc.miniexpr.builtins;

import org.gemoc.miniexpr.MiniExprLanguage;
import org.gemoc.miniexpr.runtime.MiniExprContext;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.CachedContext;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.DirectCallNode;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.source.Source;

@NodeInfo(shortName = "eval")
@SuppressWarnings("unused")
public abstract class MiniExprEvalBuiltin extends MiniExprBuiltinNode {

    @Specialization(guards = {"stringsEqual(cachedId, id)", "stringsEqual(cachedCode, code)"})
    public Object evalCached(String id, String code,
                    @Cached("id") String cachedId,
                    @Cached("code") String cachedCode,
                    @CachedContext(MiniExprLanguage.class) MiniExprContext context,
                    @Cached("create(parse(id, code, context))") DirectCallNode callNode) {
        return callNode.call(new Object[]{});
    }

    @TruffleBoundary
    @Specialization(replaces = "evalCached")
    public Object evalUncached(String id, String code, @CachedContext(MiniExprLanguage.class) MiniExprContext context) {
        return parse(id, code, context).call();
    }

    protected CallTarget parse(String id, String code, MiniExprContext context) {
        final Source source = Source.newBuilder(id, code, "(eval)").build();
        return context.parse(source);
    }

    protected static boolean stringsEqual(String a, String b) {
        return a.equals(b);
    }
}