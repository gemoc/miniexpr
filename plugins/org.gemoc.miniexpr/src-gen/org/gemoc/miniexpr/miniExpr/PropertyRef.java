/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.miniexpr.miniExpr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.miniexpr.miniExpr.PropertyRef#getObject <em>Object</em>}</li>
 *   <li>{@link org.gemoc.miniexpr.miniExpr.PropertyRef#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getPropertyRef()
 * @model
 * @generated
 */
public interface PropertyRef extends Ref
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference.
   * @see #setObject(Ref)
   * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getPropertyRef_Object()
   * @model containment="true"
   * @generated
   */
  Ref getObject();

  /**
   * Sets the value of the '{@link org.gemoc.miniexpr.miniExpr.PropertyRef#getObject <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' containment reference.
   * @see #getObject()
   * @generated
   */
  void setObject(Ref value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see org.gemoc.miniexpr.miniExpr.MiniExprPackage#getPropertyRef_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link org.gemoc.miniexpr.miniExpr.PropertyRef#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

} // PropertyRef