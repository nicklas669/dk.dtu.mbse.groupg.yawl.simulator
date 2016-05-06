/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations.impl;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.SelectArcImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.SelectArcImpl#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.SelectArcImpl#getInArcs <em>In Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectArcImpl extends ObjectAnnotationImpl implements SelectArc {
	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutArcs() <em>Out Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<EnabledTransition> outArcs;

	/**
	 * The cached value of the '{@link #getInArcs() <em>In Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<EnabledTransition> inArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.SELECT_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSelected() {
		// TODO: implement this method to return the 'Selected' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.SELECT_ARC__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnabledTransition> getOutArcs() {
		if (outArcs == null) {
			outArcs = new EObjectResolvingEList<EnabledTransition>(EnabledTransition.class, this, AnnotationsPackage.SELECT_ARC__OUT_ARCS);
		}
		return outArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnabledTransition> getInArcs() {
		if (inArcs == null) {
			inArcs = new EObjectResolvingEList<EnabledTransition>(EnabledTransition.class, this, AnnotationsPackage.SELECT_ARC__IN_ARCS);
		}
		return inArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.SELECT_ARC__SELECTED:
				return isSelected();
			case AnnotationsPackage.SELECT_ARC__OUT_ARCS:
				return getOutArcs();
			case AnnotationsPackage.SELECT_ARC__IN_ARCS:
				return getInArcs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnnotationsPackage.SELECT_ARC__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case AnnotationsPackage.SELECT_ARC__OUT_ARCS:
				getOutArcs().clear();
				getOutArcs().addAll((Collection<? extends EnabledTransition>)newValue);
				return;
			case AnnotationsPackage.SELECT_ARC__IN_ARCS:
				getInArcs().clear();
				getInArcs().addAll((Collection<? extends EnabledTransition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnnotationsPackage.SELECT_ARC__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case AnnotationsPackage.SELECT_ARC__OUT_ARCS:
				getOutArcs().clear();
				return;
			case AnnotationsPackage.SELECT_ARC__IN_ARCS:
				getInArcs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnnotationsPackage.SELECT_ARC__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case AnnotationsPackage.SELECT_ARC__OUT_ARCS:
				return outArcs != null && !outArcs.isEmpty();
			case AnnotationsPackage.SELECT_ARC__IN_ARCS:
				return inArcs != null && !inArcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //SelectArcImpl
