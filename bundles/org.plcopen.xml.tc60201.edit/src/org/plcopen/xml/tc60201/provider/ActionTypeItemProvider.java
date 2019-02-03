/**
 */
package org.plcopen.xml.tc60201.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.plcopen.xml.tc60201.ActionType;
import org.plcopen.xml.tc60201.Tc60201Factory;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * This is the item provider adapter for a {@link org.plcopen.xml.tc60201.ActionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionTypeItemProvider 
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
	public ActionTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDurationPropertyDescriptor(object);
			addExecutionOrderIdPropertyDescriptor(object);
			addGlobalIdPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addIndicatorPropertyDescriptor(object);
			addLocalIdPropertyDescriptor(object);
			addQualifierPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionType_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionType_duration_feature", "_UI_ActionType_type"),
				 Tc60201Package.eINSTANCE.getActionType_Duration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Order Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionOrderIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionType_executionOrderId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionType_executionOrderId_feature", "_UI_ActionType_type"),
				 Tc60201Package.eINSTANCE.getActionType_ExecutionOrderId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionType_globalId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionType_globalId_feature", "_UI_ActionType_type"),
				 Tc60201Package.eINSTANCE.getActionType_GlobalId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionType_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionType_height_feature", "_UI_ActionType_type"),
				 Tc60201Package.eINSTANCE.getActionType_Height(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indicator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndicatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionType_indicator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionType_indicator_feature", "_UI_ActionType_type"),
				 Tc60201Package.eINSTANCE.getActionType_Indicator(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionType_localId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionType_localId_feature", "_UI_ActionType_type"),
				 Tc60201Package.eINSTANCE.getActionType_LocalId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qualifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionType_qualifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionType_qualifier_feature", "_UI_ActionType_type"),
				 Tc60201Package.eINSTANCE.getActionType_Qualifier(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionType_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionType_width_feature", "_UI_ActionType_type"),
				 Tc60201Package.eINSTANCE.getActionType_Width(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(Tc60201Package.eINSTANCE.getActionType_RelPosition());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getActionType_Reference());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getActionType_Inline());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getActionType_ConnectionPointOut());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getActionType_AddData());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getActionType_Documentation());
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
	 * This returns ActionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActionType)object).getDuration();
		return label == null || label.length() == 0 ?
			getString("_UI_ActionType_type") :
			getString("_UI_ActionType_type") + " " + label;
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

		switch (notification.getFeatureID(ActionType.class)) {
			case Tc60201Package.ACTION_TYPE__DURATION:
			case Tc60201Package.ACTION_TYPE__EXECUTION_ORDER_ID:
			case Tc60201Package.ACTION_TYPE__GLOBAL_ID:
			case Tc60201Package.ACTION_TYPE__HEIGHT:
			case Tc60201Package.ACTION_TYPE__INDICATOR:
			case Tc60201Package.ACTION_TYPE__LOCAL_ID:
			case Tc60201Package.ACTION_TYPE__QUALIFIER:
			case Tc60201Package.ACTION_TYPE__WIDTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Tc60201Package.ACTION_TYPE__REL_POSITION:
			case Tc60201Package.ACTION_TYPE__REFERENCE:
			case Tc60201Package.ACTION_TYPE__INLINE:
			case Tc60201Package.ACTION_TYPE__CONNECTION_POINT_OUT:
			case Tc60201Package.ACTION_TYPE__ADD_DATA:
			case Tc60201Package.ACTION_TYPE__DOCUMENTATION:
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
				(Tc60201Package.eINSTANCE.getActionType_RelPosition(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getActionType_Reference(),
				 Tc60201Factory.eINSTANCE.createReferenceType1()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getActionType_Inline(),
				 Tc60201Factory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getActionType_ConnectionPointOut(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getActionType_AddData(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getActionType_Documentation(),
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
