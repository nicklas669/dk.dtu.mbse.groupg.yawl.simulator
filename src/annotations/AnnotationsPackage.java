/**
 */
package annotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www2.compute.dtu.dk/annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "anno";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link annotations.impl.ObjectAnnotationImpl <em>Object Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotations.impl.ObjectAnnotationImpl
	 * @see annotations.impl.AnnotationsPackageImpl#getObjectAnnotation()
	 * @generated
	 */
	int OBJECT_ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Object Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link annotations.impl.EnabledTransitionImpl <em>Enabled Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotations.impl.EnabledTransitionImpl
	 * @see annotations.impl.AnnotationsPackageImpl#getEnabledTransition()
	 * @generated
	 */
	int ENABLED_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Source Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__SOURCE_TRANSITION = OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__TARGET_TRANSITION = OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enabled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION_FEATURE_COUNT = OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enabled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION_OPERATION_COUNT = OBJECT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link annotations.impl.SelectArcImpl <em>Select Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotations.impl.SelectArcImpl
	 * @see annotations.impl.AnnotationsPackageImpl#getSelectArc()
	 * @generated
	 */
	int SELECT_ARC = 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__SELECTED = OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__OUT_ARCS = OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__IN_ARCS = OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Select Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC_FEATURE_COUNT = OBJECT_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Select Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC_OPERATION_COUNT = OBJECT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link annotations.impl.TextualAnnotationImpl <em>Textual Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotations.impl.TextualAnnotationImpl
	 * @see annotations.impl.AnnotationsPackageImpl#getTextualAnnotation()
	 * @generated
	 */
	int TEXTUAL_ANNOTATION = 4;

	/**
	 * The number of structural features of the '<em>Textual Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Annotation Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ANNOTATION___GET_ANNOTATION_ATTRIBUTE = 0;

	/**
	 * The number of operations of the '<em>Textual Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ANNOTATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link annotations.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotations.impl.MarkingImpl
	 * @see annotations.impl.AnnotationsPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__VALUE = TEXTUAL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_FEATURE_COUNT = TEXTUAL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Annotation Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING___GET_ANNOTATION_ATTRIBUTE = TEXTUAL_ANNOTATION___GET_ANNOTATION_ATTRIBUTE;

	/**
	 * The number of operations of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_OPERATION_COUNT = TEXTUAL_ANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link annotations.EnabledTransition <em>Enabled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabled Transition</em>'.
	 * @see annotations.EnabledTransition
	 * @generated
	 */
	EClass getEnabledTransition();

	/**
	 * Returns the meta object for the reference '{@link annotations.EnabledTransition#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Transition</em>'.
	 * @see annotations.EnabledTransition#getSourceTransition()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_SourceTransition();

	/**
	 * Returns the meta object for the reference '{@link annotations.EnabledTransition#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Transition</em>'.
	 * @see annotations.EnabledTransition#getTargetTransition()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_TargetTransition();

	/**
	 * Returns the meta object for class '{@link annotations.SelectArc <em>Select Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Arc</em>'.
	 * @see annotations.SelectArc
	 * @generated
	 */
	EClass getSelectArc();

	/**
	 * Returns the meta object for the attribute '{@link annotations.SelectArc#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see annotations.SelectArc#isSelected()
	 * @see #getSelectArc()
	 * @generated
	 */
	EAttribute getSelectArc_Selected();

	/**
	 * Returns the meta object for the reference list '{@link annotations.SelectArc#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see annotations.SelectArc#getOutArcs()
	 * @see #getSelectArc()
	 * @generated
	 */
	EReference getSelectArc_OutArcs();

	/**
	 * Returns the meta object for the reference list '{@link annotations.SelectArc#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see annotations.SelectArc#getInArcs()
	 * @see #getSelectArc()
	 * @generated
	 */
	EReference getSelectArc_InArcs();

	/**
	 * Returns the meta object for class '{@link annotations.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see annotations.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for the attribute '{@link annotations.Marking#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see annotations.Marking#getValue()
	 * @see #getMarking()
	 * @generated
	 */
	EAttribute getMarking_Value();

	/**
	 * Returns the meta object for class '{@link annotations.ObjectAnnotation <em>Object Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Annotation</em>'.
	 * @see annotations.ObjectAnnotation
	 * @generated
	 */
	EClass getObjectAnnotation();

	/**
	 * Returns the meta object for class '{@link annotations.TextualAnnotation <em>Textual Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Annotation</em>'.
	 * @see annotations.TextualAnnotation
	 * @generated
	 */
	EClass getTextualAnnotation();

	/**
	 * Returns the meta object for the '{@link annotations.TextualAnnotation#getAnnotationAttribute() <em>Get Annotation Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Annotation Attribute</em>' operation.
	 * @see annotations.TextualAnnotation#getAnnotationAttribute()
	 * @generated
	 */
	EOperation getTextualAnnotation__GetAnnotationAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationsFactory getAnnotationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link annotations.impl.EnabledTransitionImpl <em>Enabled Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotations.impl.EnabledTransitionImpl
		 * @see annotations.impl.AnnotationsPackageImpl#getEnabledTransition()
		 * @generated
		 */
		EClass ENABLED_TRANSITION = eINSTANCE.getEnabledTransition();

		/**
		 * The meta object literal for the '<em><b>Source Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRANSITION__SOURCE_TRANSITION = eINSTANCE.getEnabledTransition_SourceTransition();

		/**
		 * The meta object literal for the '<em><b>Target Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRANSITION__TARGET_TRANSITION = eINSTANCE.getEnabledTransition_TargetTransition();

		/**
		 * The meta object literal for the '{@link annotations.impl.SelectArcImpl <em>Select Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotations.impl.SelectArcImpl
		 * @see annotations.impl.AnnotationsPackageImpl#getSelectArc()
		 * @generated
		 */
		EClass SELECT_ARC = eINSTANCE.getSelectArc();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_ARC__SELECTED = eINSTANCE.getSelectArc_Selected();

		/**
		 * The meta object literal for the '<em><b>Out Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ARC__OUT_ARCS = eINSTANCE.getSelectArc_OutArcs();

		/**
		 * The meta object literal for the '<em><b>In Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ARC__IN_ARCS = eINSTANCE.getSelectArc_InArcs();

		/**
		 * The meta object literal for the '{@link annotations.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotations.impl.MarkingImpl
		 * @see annotations.impl.AnnotationsPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING__VALUE = eINSTANCE.getMarking_Value();

		/**
		 * The meta object literal for the '{@link annotations.impl.ObjectAnnotationImpl <em>Object Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotations.impl.ObjectAnnotationImpl
		 * @see annotations.impl.AnnotationsPackageImpl#getObjectAnnotation()
		 * @generated
		 */
		EClass OBJECT_ANNOTATION = eINSTANCE.getObjectAnnotation();

		/**
		 * The meta object literal for the '{@link annotations.impl.TextualAnnotationImpl <em>Textual Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotations.impl.TextualAnnotationImpl
		 * @see annotations.impl.AnnotationsPackageImpl#getTextualAnnotation()
		 * @generated
		 */
		EClass TEXTUAL_ANNOTATION = eINSTANCE.getTextualAnnotation();

		/**
		 * The meta object literal for the '<em><b>Get Annotation Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXTUAL_ANNOTATION___GET_ANNOTATION_ATTRIBUTE = eINSTANCE.getTextualAnnotation__GetAnnotationAttribute();

	}

} //AnnotationsPackage
