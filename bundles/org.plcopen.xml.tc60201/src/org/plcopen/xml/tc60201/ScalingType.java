/**
 */
package org.plcopen.xml.tc60201;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ScalingType#getX <em>X</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ScalingType#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getScalingType()
 * @model extendedMetaData="name='scaling_._type' kind='empty'"
 * @generated
 */
public interface ScalingType extends EObject {
    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #setX(BigDecimal)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getScalingType_X()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
     *        extendedMetaData="kind='attribute' name='x'"
     * @generated
     */
    BigDecimal getX();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.ScalingType#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #getX()
     * @generated
     */
    void setX(BigDecimal value);

    /**
     * Returns the value of the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y</em>' attribute.
     * @see #setY(BigDecimal)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getScalingType_Y()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
     *        extendedMetaData="kind='attribute' name='y'"
     * @generated
     */
    BigDecimal getY();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.ScalingType#getY <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y</em>' attribute.
     * @see #getY()
     * @generated
     */
    void setY(BigDecimal value);

} // ScalingType
