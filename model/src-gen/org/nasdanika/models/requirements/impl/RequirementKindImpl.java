/**
 */
package org.nasdanika.models.requirements.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.requirements.RequirementKind;
import org.nasdanika.models.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementKindImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementKindImpl extends ModelElementImpl implements RequirementKind {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT_KIND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementKind getSuperType() {
		return (RequirementKind)eDynamicGet(RequirementsPackage.REQUIREMENT_KIND__SUPER_TYPE, RequirementsPackage.Literals.REQUIREMENT_KIND__SUPER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementKind basicGetSuperType() {
		return (RequirementKind)eDynamicGet(RequirementsPackage.REQUIREMENT_KIND__SUPER_TYPE, RequirementsPackage.Literals.REQUIREMENT_KIND__SUPER_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperType(RequirementKind newSuperType) {
		eDynamicSet(RequirementsPackage.REQUIREMENT_KIND__SUPER_TYPE, RequirementsPackage.Literals.REQUIREMENT_KIND__SUPER_TYPE, newSuperType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT_KIND__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
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
			case RequirementsPackage.REQUIREMENT_KIND__SUPER_TYPE:
				setSuperType((RequirementKind)newValue);
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
			case RequirementsPackage.REQUIREMENT_KIND__SUPER_TYPE:
				setSuperType((RequirementKind)null);
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
			case RequirementsPackage.REQUIREMENT_KIND__SUPER_TYPE:
				return basicGetSuperType() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementKindImpl
