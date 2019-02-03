/**
 */
package org.plcopen.xml.tc60201.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.plcopen.xml.tc60201.InterfaceType;
import org.plcopen.xml.tc60201.Tc60201Factory;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * This is the item provider adapter for a {@link org.plcopen.xml.tc60201.InterfaceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceTypeItemProvider 
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
	public InterfaceTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInterfaceType_ReturnType());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInterfaceType_Group());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInterfaceType_AddData());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInterfaceType_Documentation());
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
	 * This returns InterfaceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InterfaceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_InterfaceType_type");
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

		switch (notification.getFeatureID(InterfaceType.class)) {
			case Tc60201Package.INTERFACE_TYPE__RETURN_TYPE:
			case Tc60201Package.INTERFACE_TYPE__GROUP:
			case Tc60201Package.INTERFACE_TYPE__ADD_DATA:
			case Tc60201Package.INTERFACE_TYPE__DOCUMENTATION:
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
				(Tc60201Package.eINSTANCE.getInterfaceType_ReturnType(),
				 Tc60201Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getInterfaceType_LocalVars(),
					 Tc60201Factory.eINSTANCE.createLocalVarsType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getInterfaceType_TempVars(),
					 Tc60201Factory.eINSTANCE.createTempVarsType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getInterfaceType_InputVars(),
					 Tc60201Factory.eINSTANCE.createInputVarsType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getInterfaceType_OutputVars(),
					 Tc60201Factory.eINSTANCE.createOutputVarsType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getInterfaceType_InOutVars(),
					 Tc60201Factory.eINSTANCE.createInOutVarsType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getInterfaceType_ExternalVars(),
					 Tc60201Factory.eINSTANCE.createExternalVarsType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getInterfaceType_GlobalVars(),
					 Tc60201Factory.eINSTANCE.createGlobalVarsType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getInterfaceType_AccessVars(),
					 Tc60201Factory.eINSTANCE.createVarList())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_AddData(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInterfaceType_Documentation(),
				 Tc60201Factory.eINSTANCE.createFormattedText()));
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
