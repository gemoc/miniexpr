package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.nodes.MiniExprExpressionNode;
import org.gemoc.miniexpr.runtime.MiniExprUndefinedNameException;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;

@NodeChild("receiverNode")
@NodeChild("nameNode")
public abstract class MiniExprReadArrayNode extends MiniExprExpressionNode {

	static final int LIBRARY_LIMIT = 3;

	@Specialization(guards = "receiver.hasArrayElements()", limit = "LIBRARY_LIMIT")
	protected Object readArray(Value receiver, Object index, @CachedLibrary("index") InteropLibrary numbers) {
		try {
			final Object result = receiver.getArrayElement(numbers.asLong(index));
			return result;
		} catch (UnsupportedMessageException e) {
			throw MiniExprUndefinedNameException.undefinedProperty(this, index);
		}
	}
}
