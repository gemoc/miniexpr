package org.gemoc.miniexpr.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

public abstract class MiniExprExpressionNode extends Node {

	public abstract Object executeGeneric(VirtualFrame frame);

    public boolean executeBoolean(VirtualFrame frame) throws UnexpectedResultException {
        return MiniExprTypesGen.expectBoolean(executeGeneric(frame));
    }
    
	public long executeLong(VirtualFrame frame) throws UnexpectedResultException {
        return MiniExprTypesGen.expectLong(executeGeneric(frame));
    }
    
	public double executeDouble(VirtualFrame frame) throws UnexpectedResultException {
        return MiniExprTypesGen.expectDouble(executeGeneric(frame));
    }
	
}
