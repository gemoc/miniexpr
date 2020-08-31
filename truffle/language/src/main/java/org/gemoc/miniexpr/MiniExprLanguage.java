package org.gemoc.miniexpr;

import org.gemoc.miniexpr.parser.MiniExprParser;
import org.gemoc.miniexpr.runtime.MiniExprContext;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Scope;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.ContextPolicy;
import com.oracle.truffle.api.debug.DebuggerTags;
import com.oracle.truffle.api.instrumentation.ProvidedTags;
import com.oracle.truffle.api.instrumentation.StandardTags;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.source.Source;

@TruffleLanguage.Registration(id = MiniExprLanguage.ID, name = "MiniExpr", defaultMimeType = MiniExprLanguage.MIME_TYPE, characterMimeTypes = MiniExprLanguage.MIME_TYPE, contextPolicy = ContextPolicy.SHARED, fileTypeDetectors = MiniExprFileDetector.class)
@ProvidedTags({StandardTags.CallTag.class, StandardTags.StatementTag.class, StandardTags.RootTag.class, StandardTags.RootBodyTag.class, StandardTags.ExpressionTag.class, DebuggerTags.AlwaysHalt.class,
                StandardTags.ReadVariableTag.class, StandardTags.WriteVariableTag.class})
public final class MiniExprLanguage extends TruffleLanguage<MiniExprContext> {
    public static volatile int counter;

    public static final String ID = "mnxpr";
    public static final String MIME_TYPE = "application/x-mnxpr";

    public MiniExprLanguage() {
        counter++;
    }

    @Override
    protected MiniExprContext createContext(Env env) {
        return new MiniExprContext(env);
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        Source source = request.getSource();
        return MiniExprParser.parseMiniExpr(this, source);
    }

//    @Override
//    protected Object getLanguageView(MiniExprContext context, Object value) {
//        return MiniExprLanguageView.create(value);
//    }
    
    @Override
    protected Iterable<Scope> findTopScopes(MiniExprContext context) {
    	return context.getTopScopes();
    }

    @Override
    protected boolean isVisible(MiniExprContext context, Object value) {
        return !InteropLibrary.getFactory().getUncached(value).isNull(value);
    }

    public static MiniExprContext getCurrentContext() {
        return getCurrentContext(MiniExprLanguage.class);
    }

}
