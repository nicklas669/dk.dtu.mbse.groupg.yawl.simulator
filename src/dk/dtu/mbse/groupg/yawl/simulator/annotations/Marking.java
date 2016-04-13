/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.TextualAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getMarking()
 * @model
 * @generated
 */
public interface Marking extends ObjectAnnotation, TextualAnnotation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getMarking_Value()
	 * @model default="1"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Marking
