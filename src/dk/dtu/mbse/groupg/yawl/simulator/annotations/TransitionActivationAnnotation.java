/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Activation Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.TransitionActivationAnnotation#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getTransitionActivationAnnotation()
 * @model
 * @generated
 */
public interface TransitionActivationAnnotation extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.dtu.mbse.groupg.yawl.simulator.annotations.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.Mode
	 * @see #setMode(Mode)
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getTransitionActivationAnnotation_Mode()
	 * @model
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.TransitionActivationAnnotation#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

} // TransitionActivationAnnotation
