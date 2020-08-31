/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.miniexpr.miniExpr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.miniexpr.miniExpr.NumberConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getNumberConstant()
 * @model
 * @generated
 */
public interface NumberConstant extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getNumberConstant_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.gemoc.miniexpr.miniExpr.NumberConstant#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // NumberConstant
