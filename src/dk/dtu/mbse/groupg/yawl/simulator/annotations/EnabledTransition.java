/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations;

import org.eclipse.emf.common.util.EList;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getInArcs <em>In Arcs</em>}</li>
 * </ul>
 *
 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getEnabledTransition()
 * @model
 * @generated
 */
public interface EnabledTransition extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getEnabledTransition_OutArcs()
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getSourceTransition
	 * @model opposite="sourceTransition"
	 * @generated
	 */
	EList<SelectArc> getOutArcs();

	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getEnabledTransition_InArcs()
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getTargetTransition
	 * @model opposite="targetTransition"
	 * @generated
	 */
	EList<SelectArc> getInArcs();

} // EnabledTransition
