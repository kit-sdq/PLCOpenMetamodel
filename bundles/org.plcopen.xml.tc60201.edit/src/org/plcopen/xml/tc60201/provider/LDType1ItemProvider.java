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

import org.plcopen.xml.tc60201.LDType1;
import org.plcopen.xml.tc60201.Tc60201Factory;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * This is the item provider adapter for a {@link org.plcopen.xml.tc60201.LDType1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LDType1ItemProvider 
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
	public LDType1ItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Tc60201Package.eINSTANCE.getLDType1_Group());
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
	 * This returns LDType1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LDType1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LDType1_type");
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

		switch (notification.getFeatureID(LDType1.class)) {
			case Tc60201Package.LD_TYPE1__GROUP:
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
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Comment(),
					 Tc60201Factory.eINSTANCE.createCommentType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Error(),
					 Tc60201Factory.eINSTANCE.createErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Connector(),
					 Tc60201Factory.eINSTANCE.createConnectorType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Continuation(),
					 Tc60201Factory.eINSTANCE.createContinuationType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_ActionBlock(),
					 Tc60201Factory.eINSTANCE.createActionBlockType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_VendorElement(),
					 Tc60201Factory.eINSTANCE.createVendorElementType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Block(),
					 Tc60201Factory.eINSTANCE.createBlockType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_InVariable(),
					 Tc60201Factory.eINSTANCE.createInVariableType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_OutVariable(),
					 Tc60201Factory.eINSTANCE.createOutVariableType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_InOutVariable(),
					 Tc60201Factory.eINSTANCE.createInOutVariableType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Label(),
					 Tc60201Factory.eINSTANCE.createLabelType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Jump(),
					 Tc60201Factory.eINSTANCE.createJumpType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Return(),
					 Tc60201Factory.eINSTANCE.createReturnType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_LeftPowerRail(),
					 Tc60201Factory.eINSTANCE.createLeftPowerRailType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_RightPowerRail(),
					 Tc60201Factory.eINSTANCE.createRightPowerRailType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Coil(),
					 Tc60201Factory.eINSTANCE.createCoilType())));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getLDType1_Group(),
				 FeatureMapUtil.createEntry
					(Tc60201Package.eINSTANCE.getLDType1_Contact(),
					 Tc60201Factory.eINSTANCE.createContactType())));
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
