package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.nodes.MiniExprExpressionNode;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild("receiverNode")
public abstract class MiniExprReadPropertyNode extends MiniExprExpressionNode {

	static final int LIBRARY_LIMIT = 3;
	
	private final String propertyName;
	
	public MiniExprReadPropertyNode(String propertyName) {
		this.propertyName = propertyName;
	}

	@Specialization(guards = "receiver.hasMembers()")
	protected Object readObject(Value receiver) {
		return receiver.getMember(propertyName);
	}
}
