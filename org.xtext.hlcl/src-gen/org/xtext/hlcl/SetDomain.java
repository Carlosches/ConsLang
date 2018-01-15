/**
 * generated by Xtext 2.13.0
 */
package org.xtext.hlcl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hlcl.SetDomain#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hlcl.HlclPackage#getSetDomain()
 * @model
 * @generated
 */
public interface SetDomain extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(int)
   * @see org.xtext.hlcl.HlclPackage#getSetDomain_List()
   * @model
   * @generated
   */
  int getList();

  /**
   * Sets the value of the '{@link org.xtext.hlcl.SetDomain#getList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #getList()
   * @generated
   */
  void setList(int value);

} // SetDomain
