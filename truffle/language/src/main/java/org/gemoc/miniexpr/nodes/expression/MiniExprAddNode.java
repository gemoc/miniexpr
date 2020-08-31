package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprBinaryNode;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "+")
public abstract class MiniExprAddNode extends MiniExprBinaryNode {

	@Specialization
	protected long add(long left, long right) {
		return left + right;
	}

	@Specialization
	protected double add(double left, double right) {
		return left + right;
	}

	@Specialization
	protected double add(long left, double right) {
		return left + right;
	}

	@Specialization
	protected double add(double left, long right) {
		return left + right;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw MiniExprException.typeError(this, left, right);
	}

}
