/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations;

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
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getTargetTransition <em>Target Transition</em>}</li>
 * </ul>
 *
 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getEnabledTransition()
 * @model
 * @generated
 */
public interface EnabledTransition extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Source Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Transition</em>' reference.
	 * @see #setSourceTransition(SelectArc)
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getEnabledTransition_SourceTransition()
	 * @model
	 * @generated
	 */
	SelectArc getSourceTransition();

	/**
	 * Sets the value of the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getSourceTransition <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Transition</em>' reference.
	 * @see #getSourceTransition()
	 * @generated
	 */
	void setSourceTransition(SelectArc value);

	/**
	 * Returns the value of the '<em><b>Target Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Transition</em>' reference.
	 * @see #setTargetTransition(SelectArc)
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getEnabledTransition_TargetTransition()
	 * @model
	 * @generated
	 */
	SelectArc getTargetTransition();

	/**
	 * Sets the value of the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition#getTargetTransition <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Transition</em>' reference.
	 * @see #getTargetTransition()
	 * @generated
	 */
	void setTargetTransition(SelectArc value);

} // EnabledTransition
