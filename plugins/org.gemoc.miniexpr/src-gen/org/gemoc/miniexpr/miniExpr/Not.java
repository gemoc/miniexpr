/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.miniexpr.miniExpr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.miniexpr.miniExpr.Not#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends Expression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getNot_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.gemoc.miniexpr.miniExpr.Not#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Not
