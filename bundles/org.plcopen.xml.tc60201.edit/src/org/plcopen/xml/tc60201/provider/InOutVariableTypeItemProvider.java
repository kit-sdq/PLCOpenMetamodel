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

import org.plcopen.xml.tc60201.InOutVariableType;
import org.plcopen.xml.tc60201.Tc60201Factory;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * This is the item provider adapter for a {@link org.plcopen.xml.tc60201.InOutVariableType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InOutVariableTypeItemProvider 
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
	public InOutVariableTypeItemProvider(AdapterFactory adapterFactory) {
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

			addExpressionPropertyDescriptor(object);
			addEdgeInPropertyDescriptor(object);
			addEdgeOutPropertyDescriptor(object);
			addExecutionOrderIdPropertyDescriptor(object);
			addGlobalIdPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addLocalIdPropertyDescriptor(object);
			addNegatedInPropertyDescriptor(object);
			addNegatedOutPropertyDescriptor(object);
			addStorageInPropertyDescriptor(object);
			addStorageOutPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InOutVariableType_expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_expression_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_Expression(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edge In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgeInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InOutVariableType_edgeIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_edgeIn_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_EdgeIn(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edge Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgeOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InOutVariableType_edgeOut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_edgeOut_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_EdgeOut(),
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
				 getString("_UI_InOutVariableType_executionOrderId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_executionOrderId_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_ExecutionOrderId(),
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
				 getString("_UI_InOutVariableType_globalId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_globalId_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_GlobalId(),
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
				 getString("_UI_InOutVariableType_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_height_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_Height(),
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
				 getString("_UI_InOutVariableType_localId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_localId_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_LocalId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negated In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegatedInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InOutVariableType_negatedIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_negatedIn_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_NegatedIn(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negated Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegatedOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InOutVariableType_negatedOut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_negatedOut_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_NegatedOut(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Storage In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InOutVariableType_storageIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_storageIn_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_StorageIn(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Storage Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InOutVariableType_storageOut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_storageOut_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_StorageOut(),
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
				 getString("_UI_InOutVariableType_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InOutVariableType_width_feature", "_UI_InOutVariableType_type"),
				 Tc60201Package.eINSTANCE.getInOutVariableType_Width(),
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
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInOutVariableType_Position());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInOutVariableType_ConnectionPointIn());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInOutVariableType_ConnectionPointOut());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInOutVariableType_AddData());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getInOutVariableType_Documentation());
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
	 * This returns InOutVariableType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InOutVariableType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InOutVariableType)object).getExpression();
		return label == null || label.length() == 0 ?
			getString("_UI_InOutVariableType_type") :
			getString("_UI_InOutVariableType_type") + " " + label;
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

		switch (notification.getFeatureID(InOutVariableType.class)) {
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXPRESSION:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_IN:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_OUT:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXECUTION_ORDER_ID:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__GLOBAL_ID:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__HEIGHT:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__LOCAL_ID:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_IN:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_OUT:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_IN:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_OUT:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__WIDTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA:
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION:
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
				(Tc60201Package.eINSTANCE.getInOutVariableType_Position(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInOutVariableType_ConnectionPointIn(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInOutVariableType_ConnectionPointOut(),
				 Tc60201Factory.eINSTANCE.createConnectionPointOut()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInOutVariableType_AddData(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getInOutVariableType_Documentation(),
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
