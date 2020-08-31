package org.gemoc.miniexpr.builtins;

import org.gemoc.miniexpr.MiniExprException;
import org.gemoc.miniexpr.nodes.MiniExprExpressionNode;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.UnsupportedSpecializationException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

@NodeChild(value = "arguments", type = MiniExprExpressionNode[].class)
@GenerateNodeFactory
public abstract class MiniExprBuiltinNode extends MiniExprExpressionNode {

    @Override
    public final Object executeGeneric(VirtualFrame frame) {
        try {
            return execute(frame);
        } catch (UnsupportedSpecializationException e) {
            throw MiniExprException.typeError(e.getNode(), e.getSuppliedValues());
        }
    }

    @Override
    public final boolean executeBoolean(VirtualFrame frame) throws UnexpectedResultException {
        return super.executeBoolean(frame);
    }

    @Override
    public final long executeLong(VirtualFrame frame) throws UnexpectedResultException {
        return super.executeLong(frame);
    }
    
    @Override
    public double executeDouble(VirtualFrame frame) throws UnexpectedResultException {
    	return super.executeDouble(frame);
    }

    protected abstract Object execute(VirtualFrame frame);
}