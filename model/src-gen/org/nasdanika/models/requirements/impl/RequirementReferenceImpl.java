/**
 */
package org.nasdanika.models.requirements.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.requirements.Requirement;
import org.nasdanika.models.requirements.RequirementReference;
import org.nasdanika.models.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementReferenceImpl extends AbstractRequirementImpl implements RequirementReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement getTarget() {
		return (Requirement)eDynamicGet(RequirementsPackage.REQUIREMENT_REFERENCE__TARGET, RequirementsPackage.Literals.REQUIREMENT_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetTarget() {
		return (Requirement)eDynamicGet(RequirementsPackage.REQUIREMENT_REFERENCE__TARGET, RequirementsPackage.Literals.REQUIREMENT_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Requirement newTarget) {
		eDynamicSet(RequirementsPackage.REQUIREMENT_REFERENCE__TARGET, RequirementsPackage.Literals.REQUIREMENT_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case RequirementsPackage.REQUIREMENT_REFERENCE__TARGET:
				setTarget((Requirement)newValue);
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
			case RequirementsPackage.REQUIREMENT_REFERENCE__TARGET:
				setTarget((Requirement)null);
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
			case RequirementsPackage.REQUIREMENT_REFERENCE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementReferenceImpl
