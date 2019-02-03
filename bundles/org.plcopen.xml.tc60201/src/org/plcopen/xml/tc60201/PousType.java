/**
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pous Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.PousType#getPou <em>Pou</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PousType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getPousType()
 * @model extendedMetaData="name='pous_._type' kind='elementOnly'"
 * @generated
 */
public interface PousType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pou</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.PouType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pou</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pou</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPousType_Pou()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pou' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PouType1> getPou();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPousType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PousType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PousType
