package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprBinaryNode;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "*")
public abstract class MiniExprMulNode extends MiniExprBinaryNode {

	@Specialization
	protected long mul(long left, long right) {
		return left * right;
	}

	@Specialization
	protected double mul(double left, double right) {
		return left * right;
	}

	@Specialization
	protected double mul(long left, double right) {
		return left * right;
	}

	@Specialization
	protected double mul(double left, long right) {
		return left * right;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw MiniExprException.typeError(this, left, right);
	}

}
