/**
 */
package org.nasdanika.models.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.requirements.RequirementDomain;
import org.nasdanika.models.requirements.RequirementKind;
import org.nasdanika.models.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementDomainImpl#getRequirementKinds <em>Requirement Kinds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementDomainImpl extends SatisfierImpl implements RequirementDomain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RequirementKind> getRequirementKinds() {
		return (EList<RequirementKind>)eDynamicGet(RequirementsPackage.REQUIREMENT_DOMAIN__REQUIREMENT_KINDS, RequirementsPackage.Literals.REQUIREMENT_DOMAIN__REQUIREMENT_KINDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT_DOMAIN__REQUIREMENT_KINDS:
				return ((InternalEList<?>)getRequirementKinds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT_DOMAIN__REQUIREMENT_KINDS:
				return getRequirementKinds();
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
			case RequirementsPackage.REQUIREMENT_DOMAIN__REQUIREMENT_KINDS:
				getRequirementKinds().clear();
				getRequirementKinds().addAll((Collection<? extends RequirementKind>)newValue);
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
			case RequirementsPackage.REQUIREMENT_DOMAIN__REQUIREMENT_KINDS:
				getRequirementKinds().clear();
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
			case RequirementsPackage.REQUIREMENT_DOMAIN__REQUIREMENT_KINDS:
				return !getRequirementKinds().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementDomainImpl
