package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprUnaryNode;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "!")
public abstract class MiniExprNotNode extends MiniExprUnaryNode {

	@Specialization
	protected boolean not(boolean value) {
		return !value;
	}

	@Fallback
	protected Object typeError(Object value) {
		throw MiniExprException.typeError(this, value);
	}

}
