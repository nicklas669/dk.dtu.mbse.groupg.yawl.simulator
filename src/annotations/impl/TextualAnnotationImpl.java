/**
 */
package annotations.impl;

import annotations.AnnotationsPackage;
import annotations.TextualAnnotation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TextualAnnotationImpl extends MinimalEObjectImpl.Container implements TextualAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.TEXTUAL_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EAttribute getAnnotationAttribute() {
		return AnnotationsPackage.eINSTANCE.getMarking_Value();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AnnotationsPackage.TEXTUAL_ANNOTATION___GET_ANNOTATION_ATTRIBUTE:
				return getAnnotationAttribute();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TextualAnnotationImpl
