/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.miniexpr.miniExpr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.miniexpr.miniExpr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniExprFactoryImpl extends EFactoryImpl implements MiniExprFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MiniExprFactory init()
  {
    try
    {
      MiniExprFactory theMiniExprFactory = (MiniExprFactory)EPackage.Registry.INSTANCE.getEFactory(MiniExprPackage.eNS_URI);
      if (theMiniExprFactory != null)
      {
        return theMiniExprFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MiniExprFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniExprFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MiniExprPackage.MODEL: return createModel();
      case MiniExprPackage.EXPRESSION: return createExpression();
      case MiniExprPackage.REF: return createRef();
      case MiniExprPackage.SIMPLE_VAR_REF: return createSimpleVarRef();
      case MiniExprPackage.ARRAY_SIZE: return createArraySize();
      case MiniExprPackage.CONTRACTED_IF: return createContractedIf();
      case MiniExprPackage.OR: return createOr();
      case MiniExprPackage.AND: return createAnd();
      case MiniExprPackage.EQUALITY: return createEquality();
      case MiniExprPackage.COMPARISON: return createComparison();
      case MiniExprPackage.PLUS: return createPlus();
      case MiniExprPackage.MINUS: return createMinus();
      case MiniExprPackage.MUL: return createMul();
      case MiniExprPackage.DIV: return createDiv();
      case MiniExprPackage.MODULO: return createModulo();
      case MiniExprPackage.PARENTHESIS: return createParenthesis();
      case MiniExprPackage.UNARY_MINUS: return createUnaryMinus();
      case MiniExprPackage.NOT: return createNot();
      case MiniExprPackage.NUMBER_CONSTANT: return createNumberConstant();
      case MiniExprPackage.BOOL_CONSTANT: return createBoolConstant();
      case MiniExprPackage.VECTOR_CONSTANT: return createVectorConstant();
      case MiniExprPackage.ARRAY_REF: return createArrayRef();
      case MiniExprPackage.PROPERTY_REF: return createPropertyRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ref createRef()
  {
    RefImpl ref = new RefImpl();
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleVarRef createSimpleVarRef()
  {
    SimpleVarRefImpl simpleVarRef = new SimpleVarRefImpl();
    return simpleVarRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArraySize createArraySize()
  {
    ArraySizeImpl arraySize = new ArraySizeImpl();
    return arraySize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContractedIf createContractedIf()
  {
    ContractedIfImpl contractedIf = new ContractedIfImpl();
    return contractedIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mul createMul()
  {
    MulImpl mul = new MulImpl();
    return mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Modulo createModulo()
  {
    ModuloImpl modulo = new ModuloImpl();
    return modulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenthesis createParenthesis()
  {
    ParenthesisImpl parenthesis = new ParenthesisImpl();
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryMinus createUnaryMinus()
  {
    UnaryMinusImpl unaryMinus = new UnaryMinusImpl();
    return unaryMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberConstant createNumberConstant()
  {
    NumberConstantImpl numberConstant = new NumberConstantImpl();
    return numberConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VectorConstant createVectorConstant()
  {
    VectorConstantImpl vectorConstant = new VectorConstantImpl();
    return vectorConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayRef createArrayRef()
  {
    ArrayRefImpl arrayRef = new ArrayRefImpl();
    return arrayRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyRef createPropertyRef()
  {
    PropertyRefImpl propertyRef = new PropertyRefImpl();
    return propertyRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MiniExprPackage getMiniExprPackage()
  {
    return (MiniExprPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MiniExprPackage getPackage()
  {
    return MiniExprPackage.eINSTANCE;
  }

} //MiniExprFactoryImpl
