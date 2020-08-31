package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.nodes.MiniExprExpressionNode;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.ConditionProfile;

@NodeChild(value = "condition", type = MiniExprExpressionNode.class)
public abstract class MiniExprIfNode extends MiniExprExpressionNode {

	@Child
	private MiniExprExpressionNode thenNode;
	@Child
	private MiniExprExpressionNode elseNode;

	private final ConditionProfile conditionProfile = ConditionProfile.createCountingProfile();
	
	protected MiniExprIfNode(MiniExprExpressionNode left, MiniExprExpressionNode right) {
		this.thenNode = left;
		this.elseNode = right;
	}

	@Specialization
	public Object execute(VirtualFrame frame, boolean condition) {
		if (conditionProfile.profile(condition)) {
			return thenNode.executeGeneric(frame);
		} else {
			return elseNode.executeGeneric(frame);
		}
	}
}
