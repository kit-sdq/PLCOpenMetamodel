/**
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an inputVariable of a Function or a FunctionBlock
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.VariableType2#getConnectionPointIn <em>Connection Point In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VariableType2#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VariableType2#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VariableType2#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VariableType2#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VariableType2#isNegated <em>Negated</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VariableType2#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getVariableType2()
 * @model extendedMetaData="name='variable_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface VariableType2 extends EObject {
    /**
     * Returns the value of the '<em><b>Connection Point In</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Point In</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Point In</em>' containment reference.
     * @see #setConnectionPointIn(ConnectionPointIn)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getVariableType2_ConnectionPointIn()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='connectionPointIn' namespace='##targetNamespace'"
     * @generated
     */
    ConnectionPointIn getConnectionPointIn();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getConnectionPointIn <em>Connection Point In</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Point In</em>' containment reference.
     * @see #getConnectionPointIn()
     * @generated
     */
    void setConnectionPointIn(ConnectionPointIn value);

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference.
     * @see #setDocumentation(FormattedText)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getVariableType2_Documentation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
     * @generated
     */
    FormattedText getDocumentation();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(FormattedText value);

    /**
     * Returns the value of the '<em><b>Edge</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * The literals are from the enumeration {@link org.plcopen.xml.tc60201.EdgeModifierType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Edge</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Edge</em>' attribute.
     * @see org.plcopen.xml.tc60201.EdgeModifierType
     * @see #isSetEdge()
     * @see #unsetEdge()
     * @see #setEdge(EdgeModifierType)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getVariableType2_Edge()
     * @model default="none" unsettable="true"
     *        extendedMetaData="kind='attribute' name='edge'"
     * @generated
     */
    EdgeModifierType getEdge();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getEdge <em>Edge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Edge</em>' attribute.
     * @see org.plcopen.xml.tc60201.EdgeModifierType
     * @see #isSetEdge()
     * @see #unsetEdge()
     * @see #getEdge()
     * @generated
     */
    void setEdge(EdgeModifierType value);

    /**
     * Unsets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getEdge <em>Edge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEdge()
     * @see #getEdge()
     * @see #setEdge(EdgeModifierType)
     * @generated
     */
    void unsetEdge();

    /**
     * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getEdge <em>Edge</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Edge</em>' attribute is set.
     * @see #unsetEdge()
     * @see #getEdge()
     * @see #setEdge(EdgeModifierType)
     * @generated
     */
    boolean isSetEdge();

    /**
     * Returns the value of the '<em><b>Formal Parameter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formal Parameter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formal Parameter</em>' attribute.
     * @see #setFormalParameter(String)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getVariableType2_FormalParameter()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='formalParameter'"
     * @generated
     */
    String getFormalParameter();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getFormalParameter <em>Formal Parameter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formal Parameter</em>' attribute.
     * @see #getFormalParameter()
     * @generated
     */
    void setFormalParameter(String value);

    /**
     * Returns the value of the '<em><b>Hidden</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hidden</em>' attribute.
     * @see #isSetHidden()
     * @see #unsetHidden()
     * @see #setHidden(boolean)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getVariableType2_Hidden()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='hidden'"
     * @generated
     */
    boolean isHidden();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#isHidden <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hidden</em>' attribute.
     * @see #isSetHidden()
     * @see #unsetHidden()
     * @see #isHidden()
     * @generated
     */
    void setHidden(boolean value);

    /**
     * Unsets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#isHidden <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHidden()
     * @see #isHidden()
     * @see #setHidden(boolean)
     * @generated
     */
    void unsetHidden();

    /**
     * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VariableType2#isHidden <em>Hidden</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hidden</em>' attribute is set.
     * @see #unsetHidden()
     * @see #isHidden()
     * @see #setHidden(boolean)
     * @generated
     */
    boolean isSetHidden();

    /**
     * Returns the value of the '<em><b>Negated</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Negated</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Negated</em>' attribute.
     * @see #isSetNegated()
     * @see #unsetNegated()
     * @see #setNegated(boolean)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getVariableType2_Negated()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='negated'"
     * @generated
     */
    boolean isNegated();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#isNegated <em>Negated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Negated</em>' attribute.
     * @see #isSetNegated()
     * @see #unsetNegated()
     * @see #isNegated()
     * @generated
     */
    void setNegated(boolean value);

    /**
     * Unsets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#isNegated <em>Negated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNegated()
     * @see #isNegated()
     * @see #setNegated(boolean)
     * @generated
     */
    void unsetNegated();

    /**
     * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VariableType2#isNegated <em>Negated</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Negated</em>' attribute is set.
     * @see #unsetNegated()
     * @see #isNegated()
     * @see #setNegated(boolean)
     * @generated
     */
    boolean isSetNegated();

    /**
     * Returns the value of the '<em><b>Storage</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * The literals are from the enumeration {@link org.plcopen.xml.tc60201.StorageModifierType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Storage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Storage</em>' attribute.
     * @see org.plcopen.xml.tc60201.StorageModifierType
     * @see #isSetStorage()
     * @see #unsetStorage()
     * @see #setStorage(StorageModifierType)
     * @see org.plcopen.xml.tc60201.Tc60201Package#getVariableType2_Storage()
     * @model default="none" unsettable="true"
     *        extendedMetaData="kind='attribute' name='storage'"
     * @generated
     */
    StorageModifierType getStorage();

    /**
     * Sets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getStorage <em>Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Storage</em>' attribute.
     * @see org.plcopen.xml.tc60201.StorageModifierType
     * @see #isSetStorage()
     * @see #unsetStorage()
     * @see #getStorage()
     * @generated
     */
    void setStorage(StorageModifierType value);

    /**
     * Unsets the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getStorage <em>Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStorage()
     * @see #getStorage()
     * @see #setStorage(StorageModifierType)
     * @generated
     */
    void unsetStorage();

    /**
     * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VariableType2#getStorage <em>Storage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Storage</em>' attribute is set.
     * @see #unsetStorage()
     * @see #getStorage()
     * @see #setStorage(StorageModifierType)
     * @generated
     */
    boolean isSetStorage();

} // VariableType2
