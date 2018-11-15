/**
 */
package org.plcopen.xml.tc60201.provider;


import java.math.BigInteger;

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

import org.plcopen.xml.tc60201.ReturnType;
import org.plcopen.xml.tc60201.Tc60201Factory;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * This is the item provider adapter for a {@link org.plcopen.xml.tc60201.ReturnType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnTypeItemProvider 
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
    public ReturnTypeItemProvider(AdapterFactory adapterFactory) {
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

			addExecutionOrderIdPropertyDescriptor(object);
			addGlobalIdPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addLocalIdPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ReturnType_executionOrderId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReturnType_executionOrderId_feature", "_UI_ReturnType_type"),
				 Tc60201Package.eINSTANCE.getReturnType_ExecutionOrderId(),
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
				 getString("_UI_ReturnType_globalId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReturnType_globalId_feature", "_UI_ReturnType_type"),
				 Tc60201Package.eINSTANCE.getReturnType_GlobalId(),
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
				 getString("_UI_ReturnType_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReturnType_height_feature", "_UI_ReturnType_type"),
				 Tc60201Package.eINSTANCE.getReturnType_Height(),
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
				 getString("_UI_ReturnType_localId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReturnType_localId_feature", "_UI_ReturnType_type"),
				 Tc60201Package.eINSTANCE.getReturnType_LocalId(),
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
				 getString("_UI_ReturnType_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReturnType_width_feature", "_UI_ReturnType_type"),
				 Tc60201Package.eINSTANCE.getReturnType_Width(),
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
			childrenFeatures.add(Tc60201Package.eINSTANCE.getReturnType_Position());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getReturnType_ConnectionPointIn());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getReturnType_AddData());
			childrenFeatures.add(Tc60201Package.eINSTANCE.getReturnType_Documentation());
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
	 * This returns ReturnType.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReturnType"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		BigInteger labelValue = ((ReturnType)object).getExecutionOrderId();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ReturnType_type") :
			getString("_UI_ReturnType_type") + " " + label;
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

		switch (notification.getFeatureID(ReturnType.class)) {
			case Tc60201Package.RETURN_TYPE__EXECUTION_ORDER_ID:
			case Tc60201Package.RETURN_TYPE__GLOBAL_ID:
			case Tc60201Package.RETURN_TYPE__HEIGHT:
			case Tc60201Package.RETURN_TYPE__LOCAL_ID:
			case Tc60201Package.RETURN_TYPE__WIDTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Tc60201Package.RETURN_TYPE__POSITION:
			case Tc60201Package.RETURN_TYPE__CONNECTION_POINT_IN:
			case Tc60201Package.RETURN_TYPE__ADD_DATA:
			case Tc60201Package.RETURN_TYPE__DOCUMENTATION:
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
				(Tc60201Package.eINSTANCE.getReturnType_Position(),
				 Tc60201Factory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getReturnType_ConnectionPointIn(),
				 Tc60201Factory.eINSTANCE.createConnectionPointIn()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getReturnType_AddData(),
				 Tc60201Factory.eINSTANCE.createAddData()));

		newChildDescriptors.add
			(createChildParameter
				(Tc60201Package.eINSTANCE.getReturnType_Documentation(),
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
