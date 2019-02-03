/**
 */
package org.plcopen.xml.tc60201.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.plcopen.xml.tc60201.ArrayType;
import org.plcopen.xml.tc60201.DataType;
import org.plcopen.xml.tc60201.DerivedType;
import org.plcopen.xml.tc60201.EnumType;
import org.plcopen.xml.tc60201.PointerType;
import org.plcopen.xml.tc60201.StringType;
import org.plcopen.xml.tc60201.SubrangeSignedType;
import org.plcopen.xml.tc60201.SubrangeUnsignedType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.VarListPlain;
import org.plcopen.xml.tc60201.WstringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getBOOL <em>BOOL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getBYTE <em>BYTE</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getWORD <em>WORD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getDWORD <em>DWORD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getLWORD <em>LWORD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getSINT <em>SINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getINT <em>INT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getDINT <em>DINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getLINT <em>LINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getUSINT <em>USINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getUINT <em>UINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getUDINT <em>UDINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getULINT <em>ULINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getREAL <em>REAL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getLREAL <em>LREAL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getTIME <em>TIME</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getDATE <em>DATE</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getDT <em>DT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getTOD <em>TOD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getString <em>String</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getWstring <em>Wstring</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANY <em>ANY</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYDERIVED <em>ANYDERIVED</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYELEMENTARY <em>ANYELEMENTARY</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYMAGNITUDE <em>ANYMAGNITUDE</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYNUM <em>ANYNUM</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYREAL <em>ANYREAL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYINT <em>ANYINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYBIT <em>ANYBIT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYSTRING <em>ANYSTRING</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getANYDATE <em>ANYDATE</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getDerived <em>Derived</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getSubrangeSigned <em>Subrange Signed</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getSubrangeUnsigned <em>Subrange Unsigned</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataTypeImpl#getPointer <em>Pointer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
	/**
	 * The cached value of the '{@link #getBOOL() <em>BOOL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOOL()
	 * @generated
	 * @ordered
	 */
	protected EObject bool;

	/**
	 * The cached value of the '{@link #getBYTE() <em>BYTE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBYTE()
	 * @generated
	 * @ordered
	 */
	protected EObject byte_;

	/**
	 * The cached value of the '{@link #getWORD() <em>WORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWORD()
	 * @generated
	 * @ordered
	 */
	protected EObject word;

	/**
	 * The cached value of the '{@link #getDWORD() <em>DWORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWORD()
	 * @generated
	 * @ordered
	 */
	protected EObject dword;

	/**
	 * The cached value of the '{@link #getLWORD() <em>LWORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLWORD()
	 * @generated
	 * @ordered
	 */
	protected EObject lword;

	/**
	 * The cached value of the '{@link #getSINT() <em>SINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSINT()
	 * @generated
	 * @ordered
	 */
	protected EObject sint;

	/**
	 * The cached value of the '{@link #getINT() <em>INT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINT()
	 * @generated
	 * @ordered
	 */
	protected EObject int_;

	/**
	 * The cached value of the '{@link #getDINT() <em>DINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDINT()
	 * @generated
	 * @ordered
	 */
	protected EObject dint;

	/**
	 * The cached value of the '{@link #getLINT() <em>LINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLINT()
	 * @generated
	 * @ordered
	 */
	protected EObject lint;

	/**
	 * The cached value of the '{@link #getUSINT() <em>USINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSINT()
	 * @generated
	 * @ordered
	 */
	protected EObject usint;

	/**
	 * The cached value of the '{@link #getUINT() <em>UINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUINT()
	 * @generated
	 * @ordered
	 */
	protected EObject uint;

	/**
	 * The cached value of the '{@link #getUDINT() <em>UDINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUDINT()
	 * @generated
	 * @ordered
	 */
	protected EObject udint;

	/**
	 * The cached value of the '{@link #getULINT() <em>ULINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getULINT()
	 * @generated
	 * @ordered
	 */
	protected EObject ulint;

	/**
	 * The cached value of the '{@link #getREAL() <em>REAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREAL()
	 * @generated
	 * @ordered
	 */
	protected EObject real;

	/**
	 * The cached value of the '{@link #getLREAL() <em>LREAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLREAL()
	 * @generated
	 * @ordered
	 */
	protected EObject lreal;

	/**
	 * The cached value of the '{@link #getTIME() <em>TIME</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTIME()
	 * @generated
	 * @ordered
	 */
	protected EObject time;

	/**
	 * The cached value of the '{@link #getDATE() <em>DATE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATE()
	 * @generated
	 * @ordered
	 */
	protected EObject date;

	/**
	 * The cached value of the '{@link #getDT() <em>DT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDT()
	 * @generated
	 * @ordered
	 */
	protected EObject dt;

	/**
	 * The cached value of the '{@link #getTOD() <em>TOD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOD()
	 * @generated
	 * @ordered
	 */
	protected EObject tod;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected StringType string;

	/**
	 * The cached value of the '{@link #getWstring() <em>Wstring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWstring()
	 * @generated
	 * @ordered
	 */
	protected WstringType wstring;

	/**
	 * The cached value of the '{@link #getANY() <em>ANY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANY()
	 * @generated
	 * @ordered
	 */
	protected EObject any;

	/**
	 * The cached value of the '{@link #getANYDERIVED() <em>ANYDERIVED</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYDERIVED()
	 * @generated
	 * @ordered
	 */
	protected EObject anyderived;

	/**
	 * The cached value of the '{@link #getANYELEMENTARY() <em>ANYELEMENTARY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYELEMENTARY()
	 * @generated
	 * @ordered
	 */
	protected EObject anyelementary;

	/**
	 * The cached value of the '{@link #getANYMAGNITUDE() <em>ANYMAGNITUDE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYMAGNITUDE()
	 * @generated
	 * @ordered
	 */
	protected EObject anymagnitude;

	/**
	 * The cached value of the '{@link #getANYNUM() <em>ANYNUM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYNUM()
	 * @generated
	 * @ordered
	 */
	protected EObject anynum;

	/**
	 * The cached value of the '{@link #getANYREAL() <em>ANYREAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYREAL()
	 * @generated
	 * @ordered
	 */
	protected EObject anyreal;

	/**
	 * The cached value of the '{@link #getANYINT() <em>ANYINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYINT()
	 * @generated
	 * @ordered
	 */
	protected EObject anyint;

	/**
	 * The cached value of the '{@link #getANYBIT() <em>ANYBIT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYBIT()
	 * @generated
	 * @ordered
	 */
	protected EObject anybit;

	/**
	 * The cached value of the '{@link #getANYSTRING() <em>ANYSTRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYSTRING()
	 * @generated
	 * @ordered
	 */
	protected EObject anystring;

	/**
	 * The cached value of the '{@link #getANYDATE() <em>ANYDATE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANYDATE()
	 * @generated
	 * @ordered
	 */
	protected EObject anydate;

	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected ArrayType array;

	/**
	 * The cached value of the '{@link #getDerived() <em>Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerived()
	 * @generated
	 * @ordered
	 */
	protected DerivedType derived;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EnumType enum_;

	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected VarListPlain struct;

	/**
	 * The cached value of the '{@link #getSubrangeSigned() <em>Subrange Signed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrangeSigned()
	 * @generated
	 * @ordered
	 */
	protected SubrangeSignedType subrangeSigned;

	/**
	 * The cached value of the '{@link #getSubrangeUnsigned() <em>Subrange Unsigned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrangeUnsigned()
	 * @generated
	 * @ordered
	 */
	protected SubrangeUnsignedType subrangeUnsigned;

	/**
	 * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer()
	 * @generated
	 * @ordered
	 */
	protected PointerType pointer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBOOL() {
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBOOL(EObject newBOOL, NotificationChain msgs) {
		EObject oldBOOL = bool;
		bool = newBOOL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__BOOL, oldBOOL, newBOOL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBOOL(EObject newBOOL) {
		if (newBOOL != bool) {
			NotificationChain msgs = null;
			if (bool != null)
				msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__BOOL, null, msgs);
			if (newBOOL != null)
				msgs = ((InternalEObject)newBOOL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__BOOL, null, msgs);
			msgs = basicSetBOOL(newBOOL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__BOOL, newBOOL, newBOOL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBYTE() {
		return byte_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBYTE(EObject newBYTE, NotificationChain msgs) {
		EObject oldBYTE = byte_;
		byte_ = newBYTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__BYTE, oldBYTE, newBYTE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBYTE(EObject newBYTE) {
		if (newBYTE != byte_) {
			NotificationChain msgs = null;
			if (byte_ != null)
				msgs = ((InternalEObject)byte_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__BYTE, null, msgs);
			if (newBYTE != null)
				msgs = ((InternalEObject)newBYTE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__BYTE, null, msgs);
			msgs = basicSetBYTE(newBYTE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__BYTE, newBYTE, newBYTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWORD() {
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWORD(EObject newWORD, NotificationChain msgs) {
		EObject oldWORD = word;
		word = newWORD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__WORD, oldWORD, newWORD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWORD(EObject newWORD) {
		if (newWORD != word) {
			NotificationChain msgs = null;
			if (word != null)
				msgs = ((InternalEObject)word).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__WORD, null, msgs);
			if (newWORD != null)
				msgs = ((InternalEObject)newWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__WORD, null, msgs);
			msgs = basicSetWORD(newWORD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__WORD, newWORD, newWORD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDWORD() {
		return dword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWORD(EObject newDWORD, NotificationChain msgs) {
		EObject oldDWORD = dword;
		dword = newDWORD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DWORD, oldDWORD, newDWORD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDWORD(EObject newDWORD) {
		if (newDWORD != dword) {
			NotificationChain msgs = null;
			if (dword != null)
				msgs = ((InternalEObject)dword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DWORD, null, msgs);
			if (newDWORD != null)
				msgs = ((InternalEObject)newDWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DWORD, null, msgs);
			msgs = basicSetDWORD(newDWORD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DWORD, newDWORD, newDWORD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLWORD() {
		return lword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLWORD(EObject newLWORD, NotificationChain msgs) {
		EObject oldLWORD = lword;
		lword = newLWORD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__LWORD, oldLWORD, newLWORD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLWORD(EObject newLWORD) {
		if (newLWORD != lword) {
			NotificationChain msgs = null;
			if (lword != null)
				msgs = ((InternalEObject)lword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__LWORD, null, msgs);
			if (newLWORD != null)
				msgs = ((InternalEObject)newLWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__LWORD, null, msgs);
			msgs = basicSetLWORD(newLWORD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__LWORD, newLWORD, newLWORD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSINT() {
		return sint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSINT(EObject newSINT, NotificationChain msgs) {
		EObject oldSINT = sint;
		sint = newSINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__SINT, oldSINT, newSINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSINT(EObject newSINT) {
		if (newSINT != sint) {
			NotificationChain msgs = null;
			if (sint != null)
				msgs = ((InternalEObject)sint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__SINT, null, msgs);
			if (newSINT != null)
				msgs = ((InternalEObject)newSINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__SINT, null, msgs);
			msgs = basicSetSINT(newSINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__SINT, newSINT, newSINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getINT() {
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINT(EObject newINT, NotificationChain msgs) {
		EObject oldINT = int_;
		int_ = newINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__INT, oldINT, newINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINT(EObject newINT) {
		if (newINT != int_) {
			NotificationChain msgs = null;
			if (int_ != null)
				msgs = ((InternalEObject)int_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__INT, null, msgs);
			if (newINT != null)
				msgs = ((InternalEObject)newINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__INT, null, msgs);
			msgs = basicSetINT(newINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__INT, newINT, newINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDINT() {
		return dint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDINT(EObject newDINT, NotificationChain msgs) {
		EObject oldDINT = dint;
		dint = newDINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DINT, oldDINT, newDINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDINT(EObject newDINT) {
		if (newDINT != dint) {
			NotificationChain msgs = null;
			if (dint != null)
				msgs = ((InternalEObject)dint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DINT, null, msgs);
			if (newDINT != null)
				msgs = ((InternalEObject)newDINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DINT, null, msgs);
			msgs = basicSetDINT(newDINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DINT, newDINT, newDINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLINT() {
		return lint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLINT(EObject newLINT, NotificationChain msgs) {
		EObject oldLINT = lint;
		lint = newLINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__LINT, oldLINT, newLINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLINT(EObject newLINT) {
		if (newLINT != lint) {
			NotificationChain msgs = null;
			if (lint != null)
				msgs = ((InternalEObject)lint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__LINT, null, msgs);
			if (newLINT != null)
				msgs = ((InternalEObject)newLINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__LINT, null, msgs);
			msgs = basicSetLINT(newLINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__LINT, newLINT, newLINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUSINT() {
		return usint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUSINT(EObject newUSINT, NotificationChain msgs) {
		EObject oldUSINT = usint;
		usint = newUSINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__USINT, oldUSINT, newUSINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUSINT(EObject newUSINT) {
		if (newUSINT != usint) {
			NotificationChain msgs = null;
			if (usint != null)
				msgs = ((InternalEObject)usint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__USINT, null, msgs);
			if (newUSINT != null)
				msgs = ((InternalEObject)newUSINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__USINT, null, msgs);
			msgs = basicSetUSINT(newUSINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__USINT, newUSINT, newUSINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUINT() {
		return uint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUINT(EObject newUINT, NotificationChain msgs) {
		EObject oldUINT = uint;
		uint = newUINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__UINT, oldUINT, newUINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUINT(EObject newUINT) {
		if (newUINT != uint) {
			NotificationChain msgs = null;
			if (uint != null)
				msgs = ((InternalEObject)uint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__UINT, null, msgs);
			if (newUINT != null)
				msgs = ((InternalEObject)newUINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__UINT, null, msgs);
			msgs = basicSetUINT(newUINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__UINT, newUINT, newUINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUDINT() {
		return udint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUDINT(EObject newUDINT, NotificationChain msgs) {
		EObject oldUDINT = udint;
		udint = newUDINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__UDINT, oldUDINT, newUDINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUDINT(EObject newUDINT) {
		if (newUDINT != udint) {
			NotificationChain msgs = null;
			if (udint != null)
				msgs = ((InternalEObject)udint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__UDINT, null, msgs);
			if (newUDINT != null)
				msgs = ((InternalEObject)newUDINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__UDINT, null, msgs);
			msgs = basicSetUDINT(newUDINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__UDINT, newUDINT, newUDINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getULINT() {
		return ulint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetULINT(EObject newULINT, NotificationChain msgs) {
		EObject oldULINT = ulint;
		ulint = newULINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ULINT, oldULINT, newULINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setULINT(EObject newULINT) {
		if (newULINT != ulint) {
			NotificationChain msgs = null;
			if (ulint != null)
				msgs = ((InternalEObject)ulint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ULINT, null, msgs);
			if (newULINT != null)
				msgs = ((InternalEObject)newULINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ULINT, null, msgs);
			msgs = basicSetULINT(newULINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ULINT, newULINT, newULINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getREAL() {
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetREAL(EObject newREAL, NotificationChain msgs) {
		EObject oldREAL = real;
		real = newREAL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__REAL, oldREAL, newREAL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREAL(EObject newREAL) {
		if (newREAL != real) {
			NotificationChain msgs = null;
			if (real != null)
				msgs = ((InternalEObject)real).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__REAL, null, msgs);
			if (newREAL != null)
				msgs = ((InternalEObject)newREAL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__REAL, null, msgs);
			msgs = basicSetREAL(newREAL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__REAL, newREAL, newREAL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLREAL() {
		return lreal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLREAL(EObject newLREAL, NotificationChain msgs) {
		EObject oldLREAL = lreal;
		lreal = newLREAL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__LREAL, oldLREAL, newLREAL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLREAL(EObject newLREAL) {
		if (newLREAL != lreal) {
			NotificationChain msgs = null;
			if (lreal != null)
				msgs = ((InternalEObject)lreal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__LREAL, null, msgs);
			if (newLREAL != null)
				msgs = ((InternalEObject)newLREAL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__LREAL, null, msgs);
			msgs = basicSetLREAL(newLREAL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__LREAL, newLREAL, newLREAL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTIME() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTIME(EObject newTIME, NotificationChain msgs) {
		EObject oldTIME = time;
		time = newTIME;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__TIME, oldTIME, newTIME);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTIME(EObject newTIME) {
		if (newTIME != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__TIME, null, msgs);
			if (newTIME != null)
				msgs = ((InternalEObject)newTIME).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__TIME, null, msgs);
			msgs = basicSetTIME(newTIME, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__TIME, newTIME, newTIME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDATE() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDATE(EObject newDATE, NotificationChain msgs) {
		EObject oldDATE = date;
		date = newDATE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DATE, oldDATE, newDATE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATE(EObject newDATE) {
		if (newDATE != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DATE, null, msgs);
			if (newDATE != null)
				msgs = ((InternalEObject)newDATE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DATE, null, msgs);
			msgs = basicSetDATE(newDATE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DATE, newDATE, newDATE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDT() {
		return dt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDT(EObject newDT, NotificationChain msgs) {
		EObject oldDT = dt;
		dt = newDT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DT, oldDT, newDT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDT(EObject newDT) {
		if (newDT != dt) {
			NotificationChain msgs = null;
			if (dt != null)
				msgs = ((InternalEObject)dt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DT, null, msgs);
			if (newDT != null)
				msgs = ((InternalEObject)newDT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DT, null, msgs);
			msgs = basicSetDT(newDT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DT, newDT, newDT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTOD() {
		return tod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTOD(EObject newTOD, NotificationChain msgs) {
		EObject oldTOD = tod;
		tod = newTOD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__TOD, oldTOD, newTOD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOD(EObject newTOD) {
		if (newTOD != tod) {
			NotificationChain msgs = null;
			if (tod != null)
				msgs = ((InternalEObject)tod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__TOD, null, msgs);
			if (newTOD != null)
				msgs = ((InternalEObject)newTOD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__TOD, null, msgs);
			msgs = basicSetTOD(newTOD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__TOD, newTOD, newTOD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(StringType newString, NotificationChain msgs) {
		StringType oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__STRING, oldString, newString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(StringType newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__STRING, newString, newString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WstringType getWstring() {
		return wstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWstring(WstringType newWstring, NotificationChain msgs) {
		WstringType oldWstring = wstring;
		wstring = newWstring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__WSTRING, oldWstring, newWstring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWstring(WstringType newWstring) {
		if (newWstring != wstring) {
			NotificationChain msgs = null;
			if (wstring != null)
				msgs = ((InternalEObject)wstring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__WSTRING, null, msgs);
			if (newWstring != null)
				msgs = ((InternalEObject)newWstring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__WSTRING, null, msgs);
			msgs = basicSetWstring(newWstring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__WSTRING, newWstring, newWstring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANY() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANY(EObject newANY, NotificationChain msgs) {
		EObject oldANY = any;
		any = newANY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANY, oldANY, newANY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANY(EObject newANY) {
		if (newANY != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANY, null, msgs);
			if (newANY != null)
				msgs = ((InternalEObject)newANY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANY, null, msgs);
			msgs = basicSetANY(newANY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANY, newANY, newANY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYDERIVED() {
		return anyderived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYDERIVED(EObject newANYDERIVED, NotificationChain msgs) {
		EObject oldANYDERIVED = anyderived;
		anyderived = newANYDERIVED;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYDERIVED, oldANYDERIVED, newANYDERIVED);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYDERIVED(EObject newANYDERIVED) {
		if (newANYDERIVED != anyderived) {
			NotificationChain msgs = null;
			if (anyderived != null)
				msgs = ((InternalEObject)anyderived).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYDERIVED, null, msgs);
			if (newANYDERIVED != null)
				msgs = ((InternalEObject)newANYDERIVED).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYDERIVED, null, msgs);
			msgs = basicSetANYDERIVED(newANYDERIVED, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYDERIVED, newANYDERIVED, newANYDERIVED));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYELEMENTARY() {
		return anyelementary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYELEMENTARY(EObject newANYELEMENTARY, NotificationChain msgs) {
		EObject oldANYELEMENTARY = anyelementary;
		anyelementary = newANYELEMENTARY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYELEMENTARY, oldANYELEMENTARY, newANYELEMENTARY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYELEMENTARY(EObject newANYELEMENTARY) {
		if (newANYELEMENTARY != anyelementary) {
			NotificationChain msgs = null;
			if (anyelementary != null)
				msgs = ((InternalEObject)anyelementary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYELEMENTARY, null, msgs);
			if (newANYELEMENTARY != null)
				msgs = ((InternalEObject)newANYELEMENTARY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYELEMENTARY, null, msgs);
			msgs = basicSetANYELEMENTARY(newANYELEMENTARY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYELEMENTARY, newANYELEMENTARY, newANYELEMENTARY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYMAGNITUDE() {
		return anymagnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYMAGNITUDE(EObject newANYMAGNITUDE, NotificationChain msgs) {
		EObject oldANYMAGNITUDE = anymagnitude;
		anymagnitude = newANYMAGNITUDE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYMAGNITUDE, oldANYMAGNITUDE, newANYMAGNITUDE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYMAGNITUDE(EObject newANYMAGNITUDE) {
		if (newANYMAGNITUDE != anymagnitude) {
			NotificationChain msgs = null;
			if (anymagnitude != null)
				msgs = ((InternalEObject)anymagnitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYMAGNITUDE, null, msgs);
			if (newANYMAGNITUDE != null)
				msgs = ((InternalEObject)newANYMAGNITUDE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYMAGNITUDE, null, msgs);
			msgs = basicSetANYMAGNITUDE(newANYMAGNITUDE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYMAGNITUDE, newANYMAGNITUDE, newANYMAGNITUDE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYNUM() {
		return anynum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYNUM(EObject newANYNUM, NotificationChain msgs) {
		EObject oldANYNUM = anynum;
		anynum = newANYNUM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYNUM, oldANYNUM, newANYNUM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYNUM(EObject newANYNUM) {
		if (newANYNUM != anynum) {
			NotificationChain msgs = null;
			if (anynum != null)
				msgs = ((InternalEObject)anynum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYNUM, null, msgs);
			if (newANYNUM != null)
				msgs = ((InternalEObject)newANYNUM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYNUM, null, msgs);
			msgs = basicSetANYNUM(newANYNUM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYNUM, newANYNUM, newANYNUM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYREAL() {
		return anyreal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYREAL(EObject newANYREAL, NotificationChain msgs) {
		EObject oldANYREAL = anyreal;
		anyreal = newANYREAL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYREAL, oldANYREAL, newANYREAL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYREAL(EObject newANYREAL) {
		if (newANYREAL != anyreal) {
			NotificationChain msgs = null;
			if (anyreal != null)
				msgs = ((InternalEObject)anyreal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYREAL, null, msgs);
			if (newANYREAL != null)
				msgs = ((InternalEObject)newANYREAL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYREAL, null, msgs);
			msgs = basicSetANYREAL(newANYREAL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYREAL, newANYREAL, newANYREAL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYINT() {
		return anyint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYINT(EObject newANYINT, NotificationChain msgs) {
		EObject oldANYINT = anyint;
		anyint = newANYINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYINT, oldANYINT, newANYINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYINT(EObject newANYINT) {
		if (newANYINT != anyint) {
			NotificationChain msgs = null;
			if (anyint != null)
				msgs = ((InternalEObject)anyint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYINT, null, msgs);
			if (newANYINT != null)
				msgs = ((InternalEObject)newANYINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYINT, null, msgs);
			msgs = basicSetANYINT(newANYINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYINT, newANYINT, newANYINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYBIT() {
		return anybit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYBIT(EObject newANYBIT, NotificationChain msgs) {
		EObject oldANYBIT = anybit;
		anybit = newANYBIT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYBIT, oldANYBIT, newANYBIT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYBIT(EObject newANYBIT) {
		if (newANYBIT != anybit) {
			NotificationChain msgs = null;
			if (anybit != null)
				msgs = ((InternalEObject)anybit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYBIT, null, msgs);
			if (newANYBIT != null)
				msgs = ((InternalEObject)newANYBIT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYBIT, null, msgs);
			msgs = basicSetANYBIT(newANYBIT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYBIT, newANYBIT, newANYBIT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYSTRING() {
		return anystring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYSTRING(EObject newANYSTRING, NotificationChain msgs) {
		EObject oldANYSTRING = anystring;
		anystring = newANYSTRING;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYSTRING, oldANYSTRING, newANYSTRING);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYSTRING(EObject newANYSTRING) {
		if (newANYSTRING != anystring) {
			NotificationChain msgs = null;
			if (anystring != null)
				msgs = ((InternalEObject)anystring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYSTRING, null, msgs);
			if (newANYSTRING != null)
				msgs = ((InternalEObject)newANYSTRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYSTRING, null, msgs);
			msgs = basicSetANYSTRING(newANYSTRING, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYSTRING, newANYSTRING, newANYSTRING));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getANYDATE() {
		return anydate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANYDATE(EObject newANYDATE, NotificationChain msgs) {
		EObject oldANYDATE = anydate;
		anydate = newANYDATE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYDATE, oldANYDATE, newANYDATE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANYDATE(EObject newANYDATE) {
		if (newANYDATE != anydate) {
			NotificationChain msgs = null;
			if (anydate != null)
				msgs = ((InternalEObject)anydate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYDATE, null, msgs);
			if (newANYDATE != null)
				msgs = ((InternalEObject)newANYDATE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ANYDATE, null, msgs);
			msgs = basicSetANYDATE(newANYDATE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ANYDATE, newANYDATE, newANYDATE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType getArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(ArrayType newArray, NotificationChain msgs) {
		ArrayType oldArray = array;
		array = newArray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ARRAY, oldArray, newArray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(ArrayType newArray) {
		if (newArray != array) {
			NotificationChain msgs = null;
			if (array != null)
				msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ARRAY, null, msgs);
			if (newArray != null)
				msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ARRAY, null, msgs);
			msgs = basicSetArray(newArray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ARRAY, newArray, newArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType getDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerived(DerivedType newDerived, NotificationChain msgs) {
		DerivedType oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DERIVED, oldDerived, newDerived);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(DerivedType newDerived) {
		if (newDerived != derived) {
			NotificationChain msgs = null;
			if (derived != null)
				msgs = ((InternalEObject)derived).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DERIVED, null, msgs);
			if (newDerived != null)
				msgs = ((InternalEObject)newDerived).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__DERIVED, null, msgs);
			msgs = basicSetDerived(newDerived, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__DERIVED, newDerived, newDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType getEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnum(EnumType newEnum, NotificationChain msgs) {
		EnumType oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ENUM, oldEnum, newEnum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum(EnumType newEnum) {
		if (newEnum != enum_) {
			NotificationChain msgs = null;
			if (enum_ != null)
				msgs = ((InternalEObject)enum_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ENUM, null, msgs);
			if (newEnum != null)
				msgs = ((InternalEObject)newEnum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__ENUM, null, msgs);
			msgs = basicSetEnum(newEnum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__ENUM, newEnum, newEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarListPlain getStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(VarListPlain newStruct, NotificationChain msgs) {
		VarListPlain oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(VarListPlain newStruct) {
		if (newStruct != struct) {
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__STRUCT, newStruct, newStruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeSignedType getSubrangeSigned() {
		return subrangeSigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubrangeSigned(SubrangeSignedType newSubrangeSigned, NotificationChain msgs) {
		SubrangeSignedType oldSubrangeSigned = subrangeSigned;
		subrangeSigned = newSubrangeSigned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED, oldSubrangeSigned, newSubrangeSigned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubrangeSigned(SubrangeSignedType newSubrangeSigned) {
		if (newSubrangeSigned != subrangeSigned) {
			NotificationChain msgs = null;
			if (subrangeSigned != null)
				msgs = ((InternalEObject)subrangeSigned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED, null, msgs);
			if (newSubrangeSigned != null)
				msgs = ((InternalEObject)newSubrangeSigned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED, null, msgs);
			msgs = basicSetSubrangeSigned(newSubrangeSigned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED, newSubrangeSigned, newSubrangeSigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeUnsignedType getSubrangeUnsigned() {
		return subrangeUnsigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubrangeUnsigned(SubrangeUnsignedType newSubrangeUnsigned, NotificationChain msgs) {
		SubrangeUnsignedType oldSubrangeUnsigned = subrangeUnsigned;
		subrangeUnsigned = newSubrangeUnsigned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED, oldSubrangeUnsigned, newSubrangeUnsigned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubrangeUnsigned(SubrangeUnsignedType newSubrangeUnsigned) {
		if (newSubrangeUnsigned != subrangeUnsigned) {
			NotificationChain msgs = null;
			if (subrangeUnsigned != null)
				msgs = ((InternalEObject)subrangeUnsigned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED, null, msgs);
			if (newSubrangeUnsigned != null)
				msgs = ((InternalEObject)newSubrangeUnsigned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED, null, msgs);
			msgs = basicSetSubrangeUnsigned(newSubrangeUnsigned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED, newSubrangeUnsigned, newSubrangeUnsigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerType getPointer() {
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointer(PointerType newPointer, NotificationChain msgs) {
		PointerType oldPointer = pointer;
		pointer = newPointer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__POINTER, oldPointer, newPointer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointer(PointerType newPointer) {
		if (newPointer != pointer) {
			NotificationChain msgs = null;
			if (pointer != null)
				msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__POINTER, null, msgs);
			if (newPointer != null)
				msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.DATA_TYPE__POINTER, null, msgs);
			msgs = basicSetPointer(newPointer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE__POINTER, newPointer, newPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.DATA_TYPE__BOOL:
				return basicSetBOOL(null, msgs);
			case Tc60201Package.DATA_TYPE__BYTE:
				return basicSetBYTE(null, msgs);
			case Tc60201Package.DATA_TYPE__WORD:
				return basicSetWORD(null, msgs);
			case Tc60201Package.DATA_TYPE__DWORD:
				return basicSetDWORD(null, msgs);
			case Tc60201Package.DATA_TYPE__LWORD:
				return basicSetLWORD(null, msgs);
			case Tc60201Package.DATA_TYPE__SINT:
				return basicSetSINT(null, msgs);
			case Tc60201Package.DATA_TYPE__INT:
				return basicSetINT(null, msgs);
			case Tc60201Package.DATA_TYPE__DINT:
				return basicSetDINT(null, msgs);
			case Tc60201Package.DATA_TYPE__LINT:
				return basicSetLINT(null, msgs);
			case Tc60201Package.DATA_TYPE__USINT:
				return basicSetUSINT(null, msgs);
			case Tc60201Package.DATA_TYPE__UINT:
				return basicSetUINT(null, msgs);
			case Tc60201Package.DATA_TYPE__UDINT:
				return basicSetUDINT(null, msgs);
			case Tc60201Package.DATA_TYPE__ULINT:
				return basicSetULINT(null, msgs);
			case Tc60201Package.DATA_TYPE__REAL:
				return basicSetREAL(null, msgs);
			case Tc60201Package.DATA_TYPE__LREAL:
				return basicSetLREAL(null, msgs);
			case Tc60201Package.DATA_TYPE__TIME:
				return basicSetTIME(null, msgs);
			case Tc60201Package.DATA_TYPE__DATE:
				return basicSetDATE(null, msgs);
			case Tc60201Package.DATA_TYPE__DT:
				return basicSetDT(null, msgs);
			case Tc60201Package.DATA_TYPE__TOD:
				return basicSetTOD(null, msgs);
			case Tc60201Package.DATA_TYPE__STRING:
				return basicSetString(null, msgs);
			case Tc60201Package.DATA_TYPE__WSTRING:
				return basicSetWstring(null, msgs);
			case Tc60201Package.DATA_TYPE__ANY:
				return basicSetANY(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYDERIVED:
				return basicSetANYDERIVED(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYELEMENTARY:
				return basicSetANYELEMENTARY(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYMAGNITUDE:
				return basicSetANYMAGNITUDE(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYNUM:
				return basicSetANYNUM(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYREAL:
				return basicSetANYREAL(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYINT:
				return basicSetANYINT(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYBIT:
				return basicSetANYBIT(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYSTRING:
				return basicSetANYSTRING(null, msgs);
			case Tc60201Package.DATA_TYPE__ANYDATE:
				return basicSetANYDATE(null, msgs);
			case Tc60201Package.DATA_TYPE__ARRAY:
				return basicSetArray(null, msgs);
			case Tc60201Package.DATA_TYPE__DERIVED:
				return basicSetDerived(null, msgs);
			case Tc60201Package.DATA_TYPE__ENUM:
				return basicSetEnum(null, msgs);
			case Tc60201Package.DATA_TYPE__STRUCT:
				return basicSetStruct(null, msgs);
			case Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED:
				return basicSetSubrangeSigned(null, msgs);
			case Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED:
				return basicSetSubrangeUnsigned(null, msgs);
			case Tc60201Package.DATA_TYPE__POINTER:
				return basicSetPointer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tc60201Package.DATA_TYPE__BOOL:
				return getBOOL();
			case Tc60201Package.DATA_TYPE__BYTE:
				return getBYTE();
			case Tc60201Package.DATA_TYPE__WORD:
				return getWORD();
			case Tc60201Package.DATA_TYPE__DWORD:
				return getDWORD();
			case Tc60201Package.DATA_TYPE__LWORD:
				return getLWORD();
			case Tc60201Package.DATA_TYPE__SINT:
				return getSINT();
			case Tc60201Package.DATA_TYPE__INT:
				return getINT();
			case Tc60201Package.DATA_TYPE__DINT:
				return getDINT();
			case Tc60201Package.DATA_TYPE__LINT:
				return getLINT();
			case Tc60201Package.DATA_TYPE__USINT:
				return getUSINT();
			case Tc60201Package.DATA_TYPE__UINT:
				return getUINT();
			case Tc60201Package.DATA_TYPE__UDINT:
				return getUDINT();
			case Tc60201Package.DATA_TYPE__ULINT:
				return getULINT();
			case Tc60201Package.DATA_TYPE__REAL:
				return getREAL();
			case Tc60201Package.DATA_TYPE__LREAL:
				return getLREAL();
			case Tc60201Package.DATA_TYPE__TIME:
				return getTIME();
			case Tc60201Package.DATA_TYPE__DATE:
				return getDATE();
			case Tc60201Package.DATA_TYPE__DT:
				return getDT();
			case Tc60201Package.DATA_TYPE__TOD:
				return getTOD();
			case Tc60201Package.DATA_TYPE__STRING:
				return getString();
			case Tc60201Package.DATA_TYPE__WSTRING:
				return getWstring();
			case Tc60201Package.DATA_TYPE__ANY:
				return getANY();
			case Tc60201Package.DATA_TYPE__ANYDERIVED:
				return getANYDERIVED();
			case Tc60201Package.DATA_TYPE__ANYELEMENTARY:
				return getANYELEMENTARY();
			case Tc60201Package.DATA_TYPE__ANYMAGNITUDE:
				return getANYMAGNITUDE();
			case Tc60201Package.DATA_TYPE__ANYNUM:
				return getANYNUM();
			case Tc60201Package.DATA_TYPE__ANYREAL:
				return getANYREAL();
			case Tc60201Package.DATA_TYPE__ANYINT:
				return getANYINT();
			case Tc60201Package.DATA_TYPE__ANYBIT:
				return getANYBIT();
			case Tc60201Package.DATA_TYPE__ANYSTRING:
				return getANYSTRING();
			case Tc60201Package.DATA_TYPE__ANYDATE:
				return getANYDATE();
			case Tc60201Package.DATA_TYPE__ARRAY:
				return getArray();
			case Tc60201Package.DATA_TYPE__DERIVED:
				return getDerived();
			case Tc60201Package.DATA_TYPE__ENUM:
				return getEnum();
			case Tc60201Package.DATA_TYPE__STRUCT:
				return getStruct();
			case Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED:
				return getSubrangeSigned();
			case Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED:
				return getSubrangeUnsigned();
			case Tc60201Package.DATA_TYPE__POINTER:
				return getPointer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tc60201Package.DATA_TYPE__BOOL:
				setBOOL((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__BYTE:
				setBYTE((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__WORD:
				setWORD((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__DWORD:
				setDWORD((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__LWORD:
				setLWORD((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__SINT:
				setSINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__INT:
				setINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__DINT:
				setDINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__LINT:
				setLINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__USINT:
				setUSINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__UINT:
				setUINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__UDINT:
				setUDINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ULINT:
				setULINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__REAL:
				setREAL((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__LREAL:
				setLREAL((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__TIME:
				setTIME((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__DATE:
				setDATE((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__DT:
				setDT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__TOD:
				setTOD((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__STRING:
				setString((StringType)newValue);
				return;
			case Tc60201Package.DATA_TYPE__WSTRING:
				setWstring((WstringType)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANY:
				setANY((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYDERIVED:
				setANYDERIVED((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYELEMENTARY:
				setANYELEMENTARY((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYMAGNITUDE:
				setANYMAGNITUDE((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYNUM:
				setANYNUM((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYREAL:
				setANYREAL((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYINT:
				setANYINT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYBIT:
				setANYBIT((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYSTRING:
				setANYSTRING((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ANYDATE:
				setANYDATE((EObject)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ARRAY:
				setArray((ArrayType)newValue);
				return;
			case Tc60201Package.DATA_TYPE__DERIVED:
				setDerived((DerivedType)newValue);
				return;
			case Tc60201Package.DATA_TYPE__ENUM:
				setEnum((EnumType)newValue);
				return;
			case Tc60201Package.DATA_TYPE__STRUCT:
				setStruct((VarListPlain)newValue);
				return;
			case Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED:
				setSubrangeSigned((SubrangeSignedType)newValue);
				return;
			case Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED:
				setSubrangeUnsigned((SubrangeUnsignedType)newValue);
				return;
			case Tc60201Package.DATA_TYPE__POINTER:
				setPointer((PointerType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tc60201Package.DATA_TYPE__BOOL:
				setBOOL((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__BYTE:
				setBYTE((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__WORD:
				setWORD((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__DWORD:
				setDWORD((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__LWORD:
				setLWORD((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__SINT:
				setSINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__INT:
				setINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__DINT:
				setDINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__LINT:
				setLINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__USINT:
				setUSINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__UINT:
				setUINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__UDINT:
				setUDINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ULINT:
				setULINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__REAL:
				setREAL((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__LREAL:
				setLREAL((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__TIME:
				setTIME((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__DATE:
				setDATE((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__DT:
				setDT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__TOD:
				setTOD((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__STRING:
				setString((StringType)null);
				return;
			case Tc60201Package.DATA_TYPE__WSTRING:
				setWstring((WstringType)null);
				return;
			case Tc60201Package.DATA_TYPE__ANY:
				setANY((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYDERIVED:
				setANYDERIVED((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYELEMENTARY:
				setANYELEMENTARY((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYMAGNITUDE:
				setANYMAGNITUDE((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYNUM:
				setANYNUM((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYREAL:
				setANYREAL((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYINT:
				setANYINT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYBIT:
				setANYBIT((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYSTRING:
				setANYSTRING((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ANYDATE:
				setANYDATE((EObject)null);
				return;
			case Tc60201Package.DATA_TYPE__ARRAY:
				setArray((ArrayType)null);
				return;
			case Tc60201Package.DATA_TYPE__DERIVED:
				setDerived((DerivedType)null);
				return;
			case Tc60201Package.DATA_TYPE__ENUM:
				setEnum((EnumType)null);
				return;
			case Tc60201Package.DATA_TYPE__STRUCT:
				setStruct((VarListPlain)null);
				return;
			case Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED:
				setSubrangeSigned((SubrangeSignedType)null);
				return;
			case Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED:
				setSubrangeUnsigned((SubrangeUnsignedType)null);
				return;
			case Tc60201Package.DATA_TYPE__POINTER:
				setPointer((PointerType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tc60201Package.DATA_TYPE__BOOL:
				return bool != null;
			case Tc60201Package.DATA_TYPE__BYTE:
				return byte_ != null;
			case Tc60201Package.DATA_TYPE__WORD:
				return word != null;
			case Tc60201Package.DATA_TYPE__DWORD:
				return dword != null;
			case Tc60201Package.DATA_TYPE__LWORD:
				return lword != null;
			case Tc60201Package.DATA_TYPE__SINT:
				return sint != null;
			case Tc60201Package.DATA_TYPE__INT:
				return int_ != null;
			case Tc60201Package.DATA_TYPE__DINT:
				return dint != null;
			case Tc60201Package.DATA_TYPE__LINT:
				return lint != null;
			case Tc60201Package.DATA_TYPE__USINT:
				return usint != null;
			case Tc60201Package.DATA_TYPE__UINT:
				return uint != null;
			case Tc60201Package.DATA_TYPE__UDINT:
				return udint != null;
			case Tc60201Package.DATA_TYPE__ULINT:
				return ulint != null;
			case Tc60201Package.DATA_TYPE__REAL:
				return real != null;
			case Tc60201Package.DATA_TYPE__LREAL:
				return lreal != null;
			case Tc60201Package.DATA_TYPE__TIME:
				return time != null;
			case Tc60201Package.DATA_TYPE__DATE:
				return date != null;
			case Tc60201Package.DATA_TYPE__DT:
				return dt != null;
			case Tc60201Package.DATA_TYPE__TOD:
				return tod != null;
			case Tc60201Package.DATA_TYPE__STRING:
				return string != null;
			case Tc60201Package.DATA_TYPE__WSTRING:
				return wstring != null;
			case Tc60201Package.DATA_TYPE__ANY:
				return any != null;
			case Tc60201Package.DATA_TYPE__ANYDERIVED:
				return anyderived != null;
			case Tc60201Package.DATA_TYPE__ANYELEMENTARY:
				return anyelementary != null;
			case Tc60201Package.DATA_TYPE__ANYMAGNITUDE:
				return anymagnitude != null;
			case Tc60201Package.DATA_TYPE__ANYNUM:
				return anynum != null;
			case Tc60201Package.DATA_TYPE__ANYREAL:
				return anyreal != null;
			case Tc60201Package.DATA_TYPE__ANYINT:
				return anyint != null;
			case Tc60201Package.DATA_TYPE__ANYBIT:
				return anybit != null;
			case Tc60201Package.DATA_TYPE__ANYSTRING:
				return anystring != null;
			case Tc60201Package.DATA_TYPE__ANYDATE:
				return anydate != null;
			case Tc60201Package.DATA_TYPE__ARRAY:
				return array != null;
			case Tc60201Package.DATA_TYPE__DERIVED:
				return derived != null;
			case Tc60201Package.DATA_TYPE__ENUM:
				return enum_ != null;
			case Tc60201Package.DATA_TYPE__STRUCT:
				return struct != null;
			case Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED:
				return subrangeSigned != null;
			case Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED:
				return subrangeUnsigned != null;
			case Tc60201Package.DATA_TYPE__POINTER:
				return pointer != null;
		}
		return super.eIsSet(featureID);
	}

} //DataTypeImpl
