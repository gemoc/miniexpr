package org.gemoc.miniexpr.nodes.util;

import org.gemoc.miniexpr.runtime.MiniExprInitializationPerformedException;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;


/**
 * This class resolves symbols from the program being executed and
 * copies their associated value into the frame of the expression being
 * evaluated.
 * 
 * @author dleroy
 *
 */
public abstract class MiniExprImportVariableNode extends Node {

	protected final FrameSlot localSlot;
	
	private final Value bindings;

	@Child
	protected MiniExprUnboxValueNode unbox;
	
	public MiniExprImportVariableNode(FrameSlot slot) {
		this.localSlot = slot;
		this.bindings = Context.getCurrent().getBindings("mnxpr");
	}

	public abstract boolean execute(VirtualFrame frame);

	@Specialization(rewriteOn = MiniExprInitializationPerformedException.class)
	protected boolean initialize(VirtualFrame frame) throws MiniExprInitializationPerformedException {
		final Value value = bindings.getMember(localSlot.getIdentifier().toString());
		if (value != null) {
			if (value.isBoolean()) {
				frame.getFrameDescriptor().setFrameSlotKind(localSlot, FrameSlotKind.Boolean);
				frame.setBoolean(localSlot, value.asBoolean());
				throw new MiniExprInitializationPerformedException();
			} else if (value.isNumber()) {
				if (value.fitsInByte() || value.fitsInInt() || value.fitsInLong()) {
					frame.getFrameDescriptor().setFrameSlotKind(localSlot, FrameSlotKind.Long);
					frame.setLong(localSlot, value.asLong());
					throw new MiniExprInitializationPerformedException();
				} else if (value.fitsInFloat() || value.fitsInDouble()) {
					frame.getFrameDescriptor().setFrameSlotKind(localSlot, FrameSlotKind.Double);
					frame.setDouble(localSlot, value.asDouble());
					throw new MiniExprInitializationPerformedException();
				}
			} else if (value.hasArrayElements() || value.isString() || value.hasMembers()) {
				frame.getFrameDescriptor().setFrameSlotKind(localSlot, FrameSlotKind.Object);
				frame.setObject(localSlot, value);
				throw new MiniExprInitializationPerformedException();
			}
		}
		return false;
	}
	
	@Specialization(guards = "isDouble(frame)")
	protected boolean copyDouble(VirtualFrame frame) {
		final double value = bindings.getMember(localSlot.getIdentifier().toString()).asDouble();
		frame.setDouble(localSlot, value);
		return true;
	}
	
	@Specialization(guards = "isLong(frame)")
	protected boolean copyLong(VirtualFrame frame) {
		final long value = bindings.getMember(localSlot.getIdentifier().toString()).asLong();
		frame.setLong(localSlot, value);
		return true;
	}
	
	@Specialization(guards = "isBoolean(frame)")
	protected boolean copyBoolean(VirtualFrame frame) {
		final boolean value = bindings.getMember(localSlot.getIdentifier().toString()).asBoolean();
		frame.setBoolean(localSlot, value);
		return true;
	}
	
	@Specialization(replaces = {"copyBoolean", "copyLong", "copyDouble"})
	protected boolean copyObject(VirtualFrame frame) {
		final Value value = bindings.getMember(localSlot.getIdentifier().toString());
		frame.setObject(localSlot, value);
		return true;
	}
	
	protected boolean isBoolean(VirtualFrame frame) {
		return frame.getFrameDescriptor().getFrameSlotKind(localSlot).equals(FrameSlotKind.Boolean);
	}
	
	protected boolean isLong(VirtualFrame frame) {
		return frame.getFrameDescriptor().getFrameSlotKind(localSlot).equals(FrameSlotKind.Long);
	}
	
	protected boolean isDouble(VirtualFrame frame) {
		return frame.getFrameDescriptor().getFrameSlotKind(localSlot).equals(FrameSlotKind.Double);
	}
}