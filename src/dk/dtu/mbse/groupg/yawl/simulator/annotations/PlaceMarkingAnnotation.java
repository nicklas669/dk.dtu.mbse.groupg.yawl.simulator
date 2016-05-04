/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.TextualAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Marking Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceMarkingAnnotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getPlaceMarkingAnnotation()
 * @model
 * @generated
 */
public interface PlaceMarkingAnnotation extends ObjectAnnotation, TextualAnnotation {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(int)
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getPlaceMarkingAnnotation_Text()
	 * @model
	 * @generated
	 */
	int getText();

	/**
	 * Sets the value of the '{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceMarkingAnnotation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(int value);

} // PlaceMarkingAnnotation
