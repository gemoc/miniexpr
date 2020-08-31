/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.miniexpr.miniExpr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.miniexpr.miniExpr.SimpleVarRef#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getSimpleVarRef()
 * @model
 * @generated
 */
public interface SimpleVarRef extends Ref
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getSimpleVarRef_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.gemoc.miniexpr.miniExpr.SimpleVarRef#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // SimpleVarRef