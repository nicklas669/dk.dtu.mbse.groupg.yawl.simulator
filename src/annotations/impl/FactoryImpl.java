/**
 */
package annotations.impl;

import annotations.*;
import annotations.Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryImpl extends EFactoryImpl implements Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Factory init() {
		try {
			Factory theFactory = (Factory)EPackage.Registry.INSTANCE.getEFactory(Package.eNS_URI);
			if (theFactory != null) {
				return theFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Package.ENABLED_TRANSITION: return createEnabledTransition();
			case Package.SELECT_ARC: return createSelectArc();
			case Package.MARKING: return createMarking();
			case Package.OBJECT_ANNOTATION: return createObjectAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition createEnabledTransition() {
		EnabledTransitionImpl enabledTransition = new EnabledTransitionImpl();
		return enabledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectArc createSelectArc() {
		SelectArcImpl selectArc = new SelectArcImpl();
		return selectArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking() {
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAnnotation createObjectAnnotation() {
		ObjectAnnotationImpl objectAnnotation = new ObjectAnnotationImpl();
		return objectAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package getPackage() {
		return (Package)getEPackage();
	}


} //FactoryImpl
