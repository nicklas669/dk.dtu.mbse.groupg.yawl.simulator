/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Selection Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceSelectionAnnotation#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getPlaceSelectionAnnotation()
 * @model
 * @generated
 */
public interface PlaceSelectionAnnotation extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getPlaceSelectionAnnotation_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceSelectionAnnotation#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // PlaceSelectionAnnotation
