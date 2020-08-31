package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprBinaryNode;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "!=")
public abstract class MiniExprNeqNode extends MiniExprBinaryNode {

	@Specialization
	protected boolean neq(long left, long right) {
		return left != right;
	}

	@Specialization
	protected boolean neq(double left, double right) {
		return left != right;
	}

	@Specialization
	protected boolean neq(long left, double right) {
		return left != right;
	}

	@Specialization
	protected boolean neq(double left, long right) {
		return left != right;
	}

	@Specialization
	protected boolean neq(boolean left, boolean right) {
		return left != right;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw MiniExprException.typeError(this, left, right);
	}

}
