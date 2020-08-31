package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.nodes.MiniExprExpressionNode;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

@NodeInfo(shortName = "const")
public final class MiniExprDoubleLiteralNode extends MiniExprExpressionNode {

    private final double value;

    public MiniExprDoubleLiteralNode(double value) {
        this.value = value;
    }

    @Override
    public double executeDouble(VirtualFrame frame) throws UnexpectedResultException {
        return value;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return value;
    }
}
