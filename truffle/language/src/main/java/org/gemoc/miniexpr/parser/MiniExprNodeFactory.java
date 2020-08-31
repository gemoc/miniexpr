package org.gemoc.miniexpr.parser;

import java.util.Iterator;
import java.util.List;

import org.gemoc.miniexpr.MiniExprLanguage;
import org.gemoc.miniexpr.miniExpr.And;
import org.gemoc.miniexpr.miniExpr.ArrayRef;
import org.gemoc.miniexpr.miniExpr.ArraySize;
import org.gemoc.miniexpr.miniExpr.Comparison;
import org.gemoc.miniexpr.miniExpr.ContractedIf;
import org.gemoc.miniexpr.miniExpr.Div;
import org.gemoc.miniexpr.miniExpr.Equality;
import org.gemoc.miniexpr.miniExpr.Expression;
import org.gemoc.miniexpr.miniExpr.MiniExprPackage;
import org.gemoc.miniexpr.miniExpr.Minus;
import org.gemoc.miniexpr.miniExpr.Modulo;
import org.gemoc.miniexpr.miniExpr.Mul;
import org.gemoc.miniexpr.miniExpr.Not;
import org.gemoc.miniexpr.miniExpr.NumberConstant;
import org.gemoc.miniexpr.miniExpr.Or;
import org.gemoc.miniexpr.miniExpr.Parenthesis;
import org.gemoc.miniexpr.miniExpr.Plus;
import org.gemoc.miniexpr.miniExpr.PropertyRef;
import org.gemoc.miniexpr.miniExpr.SimpleVarRef;
import org.gemoc.miniexpr.miniExpr.UnaryMinus;
import org.gemoc.miniexpr.nodes.MiniExprExpressionNode;
import org.gemoc.miniexpr.nodes.MiniExprRootNode;
import org.gemoc.miniexpr.nodes.expression.MiniExprAddNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprAndNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprArraySizeNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprDivNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprDoubleLiteralNode;
import org.gemoc.miniexpr.nodes.expression.MiniExprEqNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprGreaterEqualNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprGreaterThanNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprIfNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprLessEqualNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprLessThanNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprLongLiteralNode;
import org.gemoc.miniexpr.nodes.expression.MiniExprMinusNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprModNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprMulNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprNeqNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprNotNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprOrNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprReadArrayNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprReadLocalVariableNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprReadPropertyNodeGen;
import org.gemoc.miniexpr.nodes.expression.MiniExprSubNodeGen;
import org.gemoc.miniexpr.nodes.util.MiniExprImportVariableNode;
import org.gemoc.miniexpr.nodes.util.MiniExprImportVariableNodeGen;
import org.gemoc.miniexpr.nodes.util.MiniExprUnboxValueNodeGen;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.source.Source;

public class MiniExprNodeFactory {

	private FrameDescriptor frameDescriptor = new FrameDescriptor();

	private final MiniExprLanguage language;

	public MiniExprNodeFactory(MiniExprLanguage language) {
		this.language = language;
	}

	public RootCallTarget createExpression(Expression expression, Source source) {
		final MiniExprExpressionNode expressionNode = createExpressionNode(expression);
		final MiniExprRootNode rootNode = new MiniExprRootNode(language, frameDescriptor, createImportVariableNodes(),
				expressionNode, source.createUnavailableSection(), "some expression");
		return Truffle.getRuntime().createCallTarget(rootNode);
	}

	private MiniExprImportVariableNode[] createImportVariableNodes() {
		final List<? extends FrameSlot> frameSlots = frameDescriptor.getSlots();
		final MiniExprImportVariableNode[] result = new MiniExprImportVariableNode[frameSlots.size()];
		for (int i = 0; i < frameSlots.size(); i++) {
			final FrameSlot slot = frameSlots.get(i);
			result[i] = MiniExprImportVariableNodeGen.create(slot);
		}
		return result;
	}

	private MiniExprExpressionNode createExpressionNode(Expression expression) {
		final MiniExprExpressionNode expressionNode;
		switch (expression.eClass().getClassifierID()) {
		case MiniExprPackage.NUMBER_CONSTANT:
			expressionNode = createMiniExprNumberConstantNode(((NumberConstant) expression).getValue());
			break;
		case MiniExprPackage.SIMPLE_VAR_REF:
			expressionNode = createReadVariableNode((SimpleVarRef) expression);
			break;
		case MiniExprPackage.ARRAY_REF:
			expressionNode = createReadArrayNode((ArrayRef) expression);
			break;
		case MiniExprPackage.PROPERTY_REF:
			expressionNode = createReadPropertyNode((PropertyRef) expression);
			break;
		case MiniExprPackage.PARENTHESIS:
			expressionNode = createExpressionNode(((Parenthesis) expression).getExpression());
			break;
		case MiniExprPackage.CONTRACTED_IF:
			expressionNode = createIfNode((ContractedIf) expression);
			break;
		case MiniExprPackage.EQUALITY:
			expressionNode = createEqNode((Equality) expression);
			break;
		case MiniExprPackage.AND:
			expressionNode = createAndNode((And) expression);
			break;
		case MiniExprPackage.OR:
			expressionNode = createOrNode((Or) expression);
			break;
		case MiniExprPackage.PLUS:
			expressionNode = createPlusNode((Plus) expression);
			break;
		case MiniExprPackage.MINUS:
			expressionNode = createMinusNode((Minus) expression);
			break;
		case MiniExprPackage.MUL:
			expressionNode = createMulNode((Mul) expression);
			break;
		case MiniExprPackage.MODULO:
			expressionNode = createModuloNode((Modulo) expression);
			break;
		case MiniExprPackage.DIV:
			expressionNode = createDivNode((Div) expression);
			break;
		case MiniExprPackage.COMPARISON:
			expressionNode = createComparisonNode((Comparison) expression);
			break;
		case MiniExprPackage.UNARY_MINUS:
			expressionNode = createMinusNode((UnaryMinus) expression);
			break;
		case MiniExprPackage.NOT:
			expressionNode = createNotNode((Not) expression);
			break;
		case MiniExprPackage.ARRAY_SIZE:
			expressionNode = createArraySizeNode((ArraySize) expression);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return expressionNode;
	}

	private MiniExprExpressionNode createMiniExprNumberConstantNode(String value) {
		try {
			long v = Long.valueOf(value);
			return new MiniExprLongLiteralNode(v);
		} catch (NumberFormatException e) {
			double v = Double.valueOf(value);
			return new MiniExprDoubleLiteralNode(v);
		}
	}

	private MiniExprExpressionNode createReadVariableNode(SimpleVarRef varRef) {
		final FrameSlot slot = frameDescriptor.findOrAddFrameSlot(varRef.getTarget(), FrameSlotKind.Illegal);
		return MiniExprReadLocalVariableNodeGen.create(slot);
	}

	private MiniExprExpressionNode createReadArrayNode(ArrayRef arrayRef) {
		MiniExprExpressionNode array = createExpressionNode(arrayRef.getArray());
		final List<Expression> indices = arrayRef.getIndices();
		final Iterator<Expression> indicesIterator = indices.iterator();
		while (indicesIterator.hasNext()) {
			array = MiniExprReadArrayNodeGen.create(array, createExpressionNode(indicesIterator.next()));
		}
		return MiniExprUnboxValueNodeGen.create(array);
	}

	private MiniExprExpressionNode createReadPropertyNode(PropertyRef propRef) {
		final MiniExprExpressionNode object = createExpressionNode(propRef.getObject());
		final MiniExprExpressionNode value = MiniExprReadPropertyNodeGen.create(propRef.getProperty(), object);
		return MiniExprUnboxValueNodeGen.create(value);
	}

	private MiniExprExpressionNode createIfNode(ContractedIf contractedIf) {
		final MiniExprExpressionNode condition = createExpressionNode(contractedIf.getCondition());
		final MiniExprExpressionNode thenNode = createExpressionNode(contractedIf.getThen());
		final MiniExprExpressionNode elseNode = createExpressionNode(contractedIf.getElse());
		return MiniExprIfNodeGen.create(condition, thenNode, elseNode);
	}

	private MiniExprExpressionNode createEqNode(Equality eq) {
		final MiniExprExpressionNode left = createExpressionNode(eq.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(eq.getRight());
		switch (eq.getOp()) {
		case "==":
			return MiniExprEqNodeGen.create(left, right);
		case "!=":
			return MiniExprNeqNodeGen.create(left, right);
		default:
			throw new IllegalArgumentException("Unknown operator: " + eq.getOp());
		}
		
	}

	private MiniExprExpressionNode createAndNode(And plus) {
		final MiniExprExpressionNode left = createExpressionNode(plus.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(plus.getRight());
		return MiniExprAndNodeGen.create(left, right);
	}

	private MiniExprExpressionNode createOrNode(Or plus) {
		final MiniExprExpressionNode left = createExpressionNode(plus.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(plus.getRight());
		return MiniExprOrNodeGen.create(left, right);
	}

	private MiniExprExpressionNode createPlusNode(Plus plus) {
		final MiniExprExpressionNode left = createExpressionNode(plus.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(plus.getRight());
		return MiniExprAddNodeGen.create(left, right);
	}

	private MiniExprExpressionNode createMinusNode(Minus minus) {
		final MiniExprExpressionNode left = createExpressionNode(minus.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(minus.getRight());
		return MiniExprSubNodeGen.create(left, right);
	}

	private MiniExprExpressionNode createMulNode(Mul mul) {
		final MiniExprExpressionNode left = createExpressionNode(mul.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(mul.getRight());
		return MiniExprMulNodeGen.create(left, right);
	}

	private MiniExprExpressionNode createModuloNode(Modulo modulo) {
		final MiniExprExpressionNode left = createExpressionNode(modulo.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(modulo.getRight());
		return MiniExprModNodeGen.create(left, right);
	}

	private MiniExprExpressionNode createDivNode(Div div) {
		final MiniExprExpressionNode left = createExpressionNode(div.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(div.getRight());
		return MiniExprDivNodeGen.create(left, right);
	}

	private MiniExprExpressionNode createMinusNode(UnaryMinus minus) {
		final MiniExprExpressionNode expr = createExpressionNode(minus.getExpression());
		return MiniExprMinusNodeGen.create(expr);
	}

	private MiniExprExpressionNode createComparisonNode(Comparison comparison) {
		final MiniExprExpressionNode left = createExpressionNode(comparison.getLeft());
		final MiniExprExpressionNode right = createExpressionNode(comparison.getRight());
		switch (comparison.getOp()) {
		case ">=":
			return MiniExprGreaterEqualNodeGen.create(left, right);
		case "<=":
			return MiniExprLessEqualNodeGen.create(left, right);
		case ">":
			return MiniExprGreaterThanNodeGen.create(left, right);
		case "<":
			return MiniExprLessThanNodeGen.create(left, right);
		default:
			throw new IllegalArgumentException("Unknown operator: " + comparison.getOp());
		}
	}

	private MiniExprExpressionNode createNotNode(Not not) {
		final MiniExprExpressionNode expr = createExpressionNode(not.getExpression());
		return MiniExprNotNodeGen.create(expr);
	}

	private MiniExprExpressionNode createArraySizeNode(ArraySize arraySize) {
		final MiniExprExpressionNode expr = createExpressionNode(arraySize.getArray());
		return MiniExprArraySizeNodeGen.create(expr);
	}
}
