/**
 */
package annotations.impl;

import annotations.EnabledTransition;
import annotations.Factory;
import annotations.Marking;
import annotations.ObjectAnnotation;
import annotations.SelectArc;
import annotations.TextualAnnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageImpl extends EPackageImpl implements annotations.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enabledTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualAnnotationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see annotations.Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackageImpl() {
		super(eNS_URI, Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link annotations.Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static annotations.Package init() {
		if (isInited) return (annotations.Package)EPackage.Registry.INSTANCE.getEPackage(annotations.Package.eNS_URI);

		// Obtain or create and register package
		PackageImpl thePackage = (PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePackage.createPackageContents();

		// Initialize created meta-data
		thePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(annotations.Package.eNS_URI, thePackage);
		return thePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnabledTransition() {
		return enabledTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledTransition_SourceTransition() {
		return (EReference)enabledTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledTransition_TargetTransition() {
		return (EReference)enabledTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectArc() {
		return selectArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectArc_Selected() {
		return (EAttribute)selectArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectArc_OutArcs() {
		return (EReference)selectArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectArc_InArcs() {
		return (EReference)selectArcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarking() {
		return markingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarking_Value() {
		return (EAttribute)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAnnotation() {
		return objectAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualAnnotation() {
		return textualAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextualAnnotation__GetAnnotationAttribute() {
		return textualAnnotationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factory getFactory() {
		return (Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		enabledTransitionEClass = createEClass(ENABLED_TRANSITION);
		createEReference(enabledTransitionEClass, ENABLED_TRANSITION__SOURCE_TRANSITION);
		createEReference(enabledTransitionEClass, ENABLED_TRANSITION__TARGET_TRANSITION);

		selectArcEClass = createEClass(SELECT_ARC);
		createEAttribute(selectArcEClass, SELECT_ARC__SELECTED);
		createEReference(selectArcEClass, SELECT_ARC__OUT_ARCS);
		createEReference(selectArcEClass, SELECT_ARC__IN_ARCS);

		markingEClass = createEClass(MARKING);
		createEAttribute(markingEClass, MARKING__VALUE);

		objectAnnotationEClass = createEClass(OBJECT_ANNOTATION);

		textualAnnotationEClass = createEClass(TEXTUAL_ANNOTATION);
		createEOperation(textualAnnotationEClass, TEXTUAL_ANNOTATION___GET_ANNOTATION_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enabledTransitionEClass.getESuperTypes().add(this.getObjectAnnotation());
		selectArcEClass.getESuperTypes().add(this.getObjectAnnotation());
		markingEClass.getESuperTypes().add(this.getTextualAnnotation());
		markingEClass.getESuperTypes().add(this.getObjectAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(enabledTransitionEClass, EnabledTransition.class, "EnabledTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnabledTransition_SourceTransition(), this.getSelectArc(), null, "sourceTransition", null, 0, 1, EnabledTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnabledTransition_TargetTransition(), this.getSelectArc(), null, "targetTransition", null, 0, 1, EnabledTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectArcEClass, SelectArc.class, "SelectArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectArc_Selected(), ecorePackage.getEBoolean(), "selected", "false", 0, 1, SelectArc.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectArc_OutArcs(), this.getEnabledTransition(), null, "outArcs", null, 0, -1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectArc_InArcs(), this.getEnabledTransition(), null, "inArcs", null, 0, -1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarking_Value(), ecorePackage.getEInt(), "value", "1", 0, 1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectAnnotationEClass, ObjectAnnotation.class, "ObjectAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualAnnotationEClass, TextualAnnotation.class, "TextualAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTextualAnnotation__GetAnnotationAttribute(), ecorePackage.getEAttribute(), "getAnnotationAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PackageImpl
