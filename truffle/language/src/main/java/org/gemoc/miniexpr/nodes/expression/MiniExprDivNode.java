package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprBinaryNode;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "/")
public abstract class MiniExprDivNode extends MiniExprBinaryNode {

	@Specialization(guards = "right != 0")
	protected long div(long left, long right) {
		return left / right;
	}

	@Specialization(guards = "notZero(right)")
	protected double div(double left, double right) {
		return left / right;
	}

	@Specialization(guards = "notZero(right)")
	protected double div(long left, double right) {
		return left / right;
	}

	@Specialization(guards = "right != 0")
	protected double div(double left, long right) {
		return left / right;
	}
	
	protected boolean notZero(double d) {
		return d != 0;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw MiniExprException.typeError(this, left, right);
	}

}
