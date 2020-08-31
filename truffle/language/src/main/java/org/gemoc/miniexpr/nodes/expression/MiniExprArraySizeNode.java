package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.nodes.MiniExprExpressionNode;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild("receiverNode")
public abstract class MiniExprArraySizeNode extends MiniExprExpressionNode {

	@Specialization(guards = "receiver.hasArrayElements()")
	protected Object writeArray(Value receiver) {
		return receiver.getArraySize();
	}
}
