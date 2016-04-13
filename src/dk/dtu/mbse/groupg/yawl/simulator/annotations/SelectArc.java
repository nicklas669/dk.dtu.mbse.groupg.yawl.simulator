/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#isSelected <em>Selected</em>}</li>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc#getInArcs <em>In Arcs</em>}</li>
 * </ul>
 *
 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getSelectArc()
 * @model
 * @generated
 */
public interface SelectArc extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getSelectArc_Selected()
	 * @model default="false" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getSelectArc_OutArcs()
	 * @model
	 * @generated
	 */
	EList<EnabledTransition> getOutArcs();

	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage#getSelectArc_InArcs()
	 * @model
	 * @generated
	 */
	EList<EnabledTransition> getInArcs();

} // SelectArc
