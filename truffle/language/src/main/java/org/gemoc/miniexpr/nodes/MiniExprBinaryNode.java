package org.gemoc.miniexpr.nodes;

import com.oracle.truffle.api.dsl.NodeChild;

@NodeChild("leftNode")
@NodeChild("rightNode")
public abstract class MiniExprBinaryNode extends MiniExprExpressionNode {
}
