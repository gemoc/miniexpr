package org.gemoc.miniexpr.nodes.util;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.Node;

public class MiniExprPrologNode extends Node {

	@Children
	private final MiniExprImportVariableNode[] imports;

	public MiniExprPrologNode(MiniExprImportVariableNode[] imports) {
		this.imports = imports;
	}

	@ExplodeLoop
	public boolean execute(VirtualFrame frame) {
		boolean result = true;
		for (int i = 0; i < imports.length; i++) {
			if (!result) {
				break;
			}
			result = imports[i].execute(frame);
		}
		return result;
	}
}
