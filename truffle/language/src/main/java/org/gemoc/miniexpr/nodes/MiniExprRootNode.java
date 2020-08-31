package org.gemoc.miniexpr.nodes;

import org.gemoc.miniexpr.MiniExprLanguage;
import org.gemoc.miniexpr.nodes.util.MiniExprImportVariableNode;
import org.gemoc.miniexpr.nodes.util.MiniExprPrologNode;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;
import com.oracle.truffle.api.source.SourceSection;

@NodeInfo(language = "MiniExpr", description = "The root of all MiniExpr execution trees")
public class MiniExprRootNode extends RootNode {
	
	@Child private MiniExprPrologNode prologNode;
	
    @Child private MiniExprExpressionNode bodyNode;

    /** The name of the function, for printing purposes only. */
    private final String name;

    private boolean isCloningAllowed;

    private final SourceSection sourceSection;

    public MiniExprRootNode(MiniExprLanguage language, FrameDescriptor frameDescriptor, MiniExprImportVariableNode[] importNodes, MiniExprExpressionNode bodyNode, SourceSection sourceSection, String name) {
        super(language, frameDescriptor);
        this.prologNode = new MiniExprPrologNode(importNodes);
        this.bodyNode = bodyNode;
        this.name = name;
        this.sourceSection = sourceSection;
    }

    @Override
    public SourceSection getSourceSection() {
        return sourceSection;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        assert lookupContextReference(MiniExprLanguage.class).get() != null;
        if (prologNode.execute(frame)) {
        	return bodyNode.executeGeneric(frame);
        }
    	return null;
    }

    public MiniExprExpressionNode getBodyNode() {
        return bodyNode;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setCloningAllowed(boolean isCloningAllowed) {
        this.isCloningAllowed = isCloningAllowed;
    }

    @Override
    public boolean isCloningAllowed() {
        return isCloningAllowed;
    }

    @Override
    public String toString() {
        return "root " + name;
    }
}
