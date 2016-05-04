/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsFactory
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
	AnnotationsPackage eINSTANCE = dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.EnabledTransitionImpl <em>Enabled Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.EnabledTransitionImpl
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getEnabledTransition()
	 * @generated
	 */
	int ENABLED_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Source Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__SOURCE_TRANSITION = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__TARGET_TRANSITION = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enabled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.SelectArcImpl <em>Select Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.SelectArcImpl
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getSelectArc()
	 * @generated
	 */
	int SELECT_ARC = 1;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__SELECTED = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__OUT_ARCS = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__IN_ARCS = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Select Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.MarkingImpl
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 2;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__VALUE = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.PlaceSelectionAnnotationImpl <em>Place Selection Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.PlaceSelectionAnnotationImpl
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getPlaceSelectionAnnotation()
	 * @generated
	 */
	int PLACE_SELECTION_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_SELECTION_ANNOTATION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_SELECTION_ANNOTATION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_SELECTION_ANNOTATION__SELECTED = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Selection Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_SELECTION_ANNOTATION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.PlaceMarkingAnnotationImpl <em>Place Marking Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.PlaceMarkingAnnotationImpl
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getPlaceMarkingAnnotation()
	 * @generated
	 */
	int PLACE_MARKING_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_ANNOTATION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_ANNOTATION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_ANNOTATION__TEXT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Marking Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_ANNOTATION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition <em>Enabled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabled Transition</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition
	 * @generated
	 */
	EClass getEnabledTransition();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Transition</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getSourceTransition()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_SourceTransition();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Transition</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getTargetTransition()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_TargetTransition();

	/**
	 * Returns the meta object for class '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc <em>Select Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Arc</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc
	 * @generated
	 */
	EClass getSelectArc();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#isSelected()
	 * @see #getSelectArc()
	 * @generated
	 */
	EAttribute getSelectArc_Selected();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getOutArcs()
	 * @see #getSelectArc()
	 * @generated
	 */
	EReference getSelectArc_OutArcs();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getInArcs()
	 * @see #getSelectArc()
	 * @generated
	 */
	EReference getSelectArc_InArcs();

	/**
	 * Returns the meta object for class '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking#getValue()
	 * @see #getMarking()
	 * @generated
	 */
	EAttribute getMarking_Value();

	/**
	 * Returns the meta object for class '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceSelectionAnnotation <em>Place Selection Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Selection Annotation</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceSelectionAnnotation
	 * @generated
	 */
	EClass getPlaceSelectionAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceSelectionAnnotation#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceSelectionAnnotation#isSelected()
	 * @see #getPlaceSelectionAnnotation()
	 * @generated
	 */
	EAttribute getPlaceSelectionAnnotation_Selected();

	/**
	 * Returns the meta object for class '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceMarkingAnnotation <em>Place Marking Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Marking Annotation</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceMarkingAnnotation
	 * @generated
	 */
	EClass getPlaceMarkingAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceMarkingAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceMarkingAnnotation#getText()
	 * @see #getPlaceMarkingAnnotation()
	 * @generated
	 */
	EAttribute getPlaceMarkingAnnotation_Text();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.EnabledTransitionImpl <em>Enabled Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.EnabledTransitionImpl
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getEnabledTransition()
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
		 * The meta object literal for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.SelectArcImpl <em>Select Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.SelectArcImpl
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getSelectArc()
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
		 * The meta object literal for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.MarkingImpl
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getMarking()
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
		 * The meta object literal for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.PlaceSelectionAnnotationImpl <em>Place Selection Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.PlaceSelectionAnnotationImpl
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getPlaceSelectionAnnotation()
		 * @generated
		 */
		EClass PLACE_SELECTION_ANNOTATION = eINSTANCE.getPlaceSelectionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_SELECTION_ANNOTATION__SELECTED = eINSTANCE.getPlaceSelectionAnnotation_Selected();

		/**
		 * The meta object literal for the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.PlaceMarkingAnnotationImpl <em>Place Marking Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.PlaceMarkingAnnotationImpl
		 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.AnnotationsPackageImpl#getPlaceMarkingAnnotation()
		 * @generated
		 */
		EClass PLACE_MARKING_ANNOTATION = eINSTANCE.getPlaceMarkingAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_MARKING_ANNOTATION__TEXT = eINSTANCE.getPlaceMarkingAnnotation_Text();

	}

} //AnnotationsPackage
