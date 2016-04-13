/**
 */
package dk.dtu.mbse.groupg.yawl.simulator.annotations.impl;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.EnabledTransitionImpl#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link dk.dtu.mbse.groupg.yawl.simulator.annotations.impl.EnabledTransitionImpl#getTargetTransition <em>Target Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnabledTransitionImpl extends ObjectAnnotationImpl implements EnabledTransition {
	/**
	 * The cached value of the '{@link #getSourceTransition() <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTransition()
	 * @generated
	 * @ordered
	 */
	protected SelectArc sourceTransition;

	/**
	 * The cached value of the '{@link #getTargetTransition() <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTransition()
	 * @generated
	 * @ordered
	 */
	protected SelectArc targetTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnabledTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.ENABLED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectArc getSourceTransition() {
		if (sourceTransition != null && sourceTransition.eIsProxy()) {
			InternalEObject oldSourceTransition = (InternalEObject)sourceTransition;
			sourceTransition = (SelectArc)eResolveProxy(oldSourceTransition);
			if (sourceTransition != oldSourceTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.ENABLED_TRANSITION__SOURCE_TRANSITION, oldSourceTransition, sourceTransition));
			}
		}
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectArc basicGetSourceTransition() {
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTransition(SelectArc newSourceTransition) {
		SelectArc oldSourceTransition = sourceTransition;
		sourceTransition = newSourceTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ENABLED_TRANSITION__SOURCE_TRANSITION, oldSourceTransition, sourceTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectArc getTargetTransition() {
		if (targetTransition != null && targetTransition.eIsProxy()) {
			InternalEObject oldTargetTransition = (InternalEObject)targetTransition;
			targetTransition = (SelectArc)eResolveProxy(oldTargetTransition);
			if (targetTransition != oldTargetTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.ENABLED_TRANSITION__TARGET_TRANSITION, oldTargetTransition, targetTransition));
			}
		}
		return targetTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectArc basicGetTargetTransition() {
		return targetTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTransition(SelectArc newTargetTransition) {
		SelectArc oldTargetTransition = targetTransition;
		targetTransition = newTargetTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ENABLED_TRANSITION__TARGET_TRANSITION, oldTargetTransition, targetTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.ENABLED_TRANSITION__SOURCE_TRANSITION:
				if (resolve) return getSourceTransition();
				return basicGetSourceTransition();
			case AnnotationsPackage.ENABLED_TRANSITION__TARGET_TRANSITION:
				if (resolve) return getTargetTransition();
				return basicGetTargetTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnnotationsPackage.ENABLED_TRANSITION__SOURCE_TRANSITION:
				setSourceTransition((SelectArc)newValue);
				return;
			case AnnotationsPackage.ENABLED_TRANSITION__TARGET_TRANSITION:
				setTargetTransition((SelectArc)newValue);
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
			case AnnotationsPackage.ENABLED_TRANSITION__SOURCE_TRANSITION:
				setSourceTransition((SelectArc)null);
				return;
			case AnnotationsPackage.ENABLED_TRANSITION__TARGET_TRANSITION:
				setTargetTransition((SelectArc)null);
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
			case AnnotationsPackage.ENABLED_TRANSITION__SOURCE_TRANSITION:
				return sourceTransition != null;
			case AnnotationsPackage.ENABLED_TRANSITION__TARGET_TRANSITION:
				return targetTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //EnabledTransitionImpl
