package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprBinaryNode;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = ">")
public abstract class MiniExprGreaterThanNode extends MiniExprBinaryNode {

	@Specialization
	protected boolean greaterThan(long left, long right) {
		return left > right;
	}

	@Specialization
	protected boolean greaterThan(double left, double right) {
		return left > right;
	}

	@Specialization
	protected boolean greaterThan(long left, double right) {
		return left > right;
	}

	@Specialization
	protected boolean greaterThan(double left, long right) {
		return left > right;
	}

	@Specialization
	protected boolean greaterThan(String left, double right) {
		return Double.parseDouble(left) > right;
	}

	@Specialization
	protected boolean greaterThan(double left, String right) {
		return left > Double.parseDouble(right);
	}

	@Specialization
	protected boolean greaterThan(String left, long right) {
		return Double.parseDouble(left) > right;
	}

	@Specialization
	protected boolean greaterThan(long left, String right) {
		return left > Double.parseDouble(right);
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw MiniExprException.typeError(this, left, right);
	}

}
