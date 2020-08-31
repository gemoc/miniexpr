package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprUnaryNode;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "-")
public abstract class MiniExprMinusNode extends MiniExprUnaryNode {

	@Specialization
	protected double minus(double value) {
		return -value;
	}
	
	@Specialization
	protected long minus(long value) {
		return -value;
	}

	@Fallback
	protected Object typeError(Object value) {
		throw MiniExprException.typeError(this, value);
	}

}
