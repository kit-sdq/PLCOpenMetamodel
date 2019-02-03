/**
 */
package org.plcopen.xml.tc60201.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.plcopen.xml.tc60201.DataType;
import org.plcopen.xml.tc60201.Tc60201Factory;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * This is the item provider adapter for a {@link org.plcopen.xml.tc60201.DataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_BOOL());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_BYTE());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_WORD());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_DWORD());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_LWORD());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_SINT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_INT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_DINT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_LINT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_USINT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_UINT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_UDINT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ULINT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_REAL());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_LREAL());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_TIME());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_DATE());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_DT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_TOD());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_String());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_Wstring());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANY());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYNUM());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYREAL());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYINT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYBIT());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYSTRING());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_ANYDATE());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_Array());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_Derived());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_Enum());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_Struct());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_SubrangeSigned());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_SubrangeUnsigned());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getDataType_Pointer());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DataType_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataType.class)) {
			case Tc60201Package.DATA_TYPE__BOOL:
			case Tc60201Package.DATA_TYPE__BYTE:
			case Tc60201Package.DATA_TYPE__WORD:
			case Tc60201Package.DATA_TYPE__DWORD:
			case Tc60201Package.DATA_TYPE__LWORD:
			case Tc60201Package.DATA_TYPE__SINT:
			case Tc60201Package.DATA_TYPE__INT:
			case Tc60201Package.DATA_TYPE__DINT:
			case Tc60201Package.DATA_TYPE__LINT:
			case Tc60201Package.DATA_TYPE__USINT:
			case Tc60201Package.DATA_TYPE__UINT:
			case Tc60201Package.DATA_TYPE__UDINT:
			case Tc60201Package.DATA_TYPE__ULINT:
			case Tc60201Package.DATA_TYPE__REAL:
			case Tc60201Package.DATA_TYPE__LREAL:
			case Tc60201Package.DATA_TYPE__TIME:
			case Tc60201Package.DATA_TYPE__DATE:
			case Tc60201Package.DATA_TYPE__DT:
			case Tc60201Package.DATA_TYPE__TOD:
			case Tc60201Package.DATA_TYPE__STRING:
			case Tc60201Package.DATA_TYPE__WSTRING:
			case Tc60201Package.DATA_TYPE__ANY:
			case Tc60201Package.DATA_TYPE__ANYDERIVED:
			case Tc60201Package.DATA_TYPE__ANYELEMENTARY:
			case Tc60201Package.DATA_TYPE__ANYMAGNITUDE:
			case Tc60201Package.DATA_TYPE__ANYNUM:
			case Tc60201Package.DATA_TYPE__ANYREAL:
			case Tc60201Package.DATA_TYPE__ANYINT:
			case Tc60201Package.DATA_TYPE__ANYBIT:
			case Tc60201Package.DATA_TYPE__ANYSTRING:
			case Tc60201Package.DATA_TYPE__ANYDATE:
			case Tc60201Package.DATA_TYPE__ARRAY:
			case Tc60201Package.DATA_TYPE__DERIVED:
			case Tc60201Package.DATA_TYPE__ENUM:
			case Tc60201Package.DATA_TYPE__STRUCT:
			case Tc60201Package.DATA_TYPE__SUBRANGE_SIGNED:
			case Tc60201Package.DATA_TYPE__SUBRANGE_UNSIGNED:
			case Tc60201Package.DATA_TYPE__POINTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BOOL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_BYTE(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_WORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DWORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LWORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_INT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_USINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_UDINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ULINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_REAL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_LREAL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TIME(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DATE(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_DT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_TOD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_String(),
				 Tc60201Factory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_Wstring(),
				 Tc60201Factory.eINSTANCE.createWstringType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANY(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDERIVED(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYNUM(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYREAL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYBIT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYSTRING(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createAddDataInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createPouInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createRangeSigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createRangeUnsigned()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createVarListAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 Tc60201Factory.eINSTANCE.createVarListConfig()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_ANYDATE(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_Array(),
				 Tc60201Factory.eINSTANCE.createArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_Derived(),
				 Tc60201Factory.eINSTANCE.createDerivedType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_Enum(),
				 Tc60201Factory.eINSTANCE.createEnumType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_Struct(),
				 Tc60201Factory.eINSTANCE.createVarListPlain()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_Struct(),
				 Tc60201Factory.eINSTANCE.createVarList()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SubrangeSigned(),
				 Tc60201Factory.eINSTANCE.createSubrangeSignedType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_SubrangeUnsigned(),
				 Tc60201Factory.eINSTANCE.createSubrangeUnsignedType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getDataType_Pointer(),
				 Tc60201Factory.eINSTANCE.createPointerType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Tc60201Package.eINSTANCE.getDataType_BOOL() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_BYTE() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_WORD() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_DWORD() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_LWORD() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_SINT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_INT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_DINT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_LINT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_USINT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_UINT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_UDINT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ULINT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_REAL() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_LREAL() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_TIME() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_DATE() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_DT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_TOD() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANY() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYDERIVED() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYELEMENTARY() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYMAGNITUDE() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYNUM() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYREAL() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYINT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYBIT() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYSTRING() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_ANYDATE() ||
			childFeature == Tc60201Package.eINSTANCE.getDataType_Struct();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Tc6_xml_v201EditPlugin.INSTANCE;
	}

}
