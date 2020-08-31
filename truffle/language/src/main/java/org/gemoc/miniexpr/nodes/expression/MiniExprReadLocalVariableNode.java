package org.gemoc.miniexpr.nodes.expression;

import org.gemoc.miniexpr.nodes.MiniExprExpressionNode;
import org.gemoc.miniexpr.nodes.interop.NodeObjectDescriptor;
import org.gemoc.miniexpr.nodes.util.MiniExprUnboxValueNode;
import org.gemoc.miniexpr.nodes.util.MiniExprUnboxValueNodeGen;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameUtil;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.instrumentation.GenerateWrapper;
import com.oracle.truffle.api.instrumentation.InstrumentableNode;
import com.oracle.truffle.api.instrumentation.ProbeNode;
import com.oracle.truffle.api.instrumentation.StandardTags.ReadVariableTag;
import com.oracle.truffle.api.instrumentation.Tag;

@GenerateWrapper
@NodeField(name = "slot", type = FrameSlot.class)
public abstract class MiniExprReadLocalVariableNode extends MiniExprExpressionNode implements InstrumentableNode {

	protected abstract FrameSlot getSlot();
	
	@CompilationFinal
	private boolean unboxed = false;

	@Specialization(guards = "frame.isDouble(getSlot())")
	protected double readDouble(VirtualFrame frame) {
		return FrameUtil.getDoubleSafe(frame, getSlot());
	}

	@Specialization(guards = "frame.isLong(getSlot())")
	protected long readLong(VirtualFrame frame) {
		return FrameUtil.getLongSafe(frame, getSlot());
	}

	@Specialization(guards = "frame.isBoolean(getSlot())")
	protected boolean readBoolean(VirtualFrame frame) {
		return FrameUtil.getBooleanSafe(frame, getSlot());
	}

	@Specialization(replaces = { "readDouble", "readLong", "readBoolean" })
	protected Object readObject(VirtualFrame frame) {
		if (!frame.isObject(getSlot())) {
			CompilerDirectives.transferToInterpreter();
			Object result = frame.getValue(getSlot());
			frame.setObject(getSlot(), result);
			return result;
		}
		if (!unboxed) {
			CompilerDirectives.transferToInterpreter();
			final MiniExprUnboxValueNode[] unboxPtr = new MiniExprUnboxValueNode[1]; 
			atomic(() -> {
				unboxPtr[0] = MiniExprUnboxValueNodeGen.create(this);
				replace(unboxPtr[0]);
				unboxed = true;
			});
			return unboxPtr[0].executeGeneric(frame);
		}
		return FrameUtil.getObjectSafe(frame, getSlot());
	}
	
	@Override
	public boolean hasTag(Class<? extends Tag> tag) {
		return tag.equals(ReadVariableTag.class);
	}
	
	@Override
	public boolean isInstrumentable() {
		return false;
	}

	@Override
	public WrapperNode createWrapper(ProbeNode probeNode) {
		return new MiniExprReadLocalVariableNodeWrapper(this, probeNode);
	}
	
	@Override
    public Object getNodeObject() {
        return NodeObjectDescriptor.readVariable(getSlot().getIdentifier().toString());
    }
}
