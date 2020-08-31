package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprBinaryNode;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "||")
public abstract class MiniExprOrNode extends MiniExprBinaryNode {

	@Specialization
	protected boolean or(boolean left, boolean right) {
		return left || right;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw MiniExprException.typeError(this, left, right);
	}

}
