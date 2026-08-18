/**
 */
package org.nasdanika.models.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.requirements.AbstractRequirement;
import org.nasdanika.models.requirements.RequirementsPackage;
import org.nasdanika.models.requirements.Satisfaction;
import org.nasdanika.models.requirements.Satisfier;

import org.nasdanika.models.work.impl.WorkableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satisfier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.SatisfierImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.SatisfierImpl#getSatisfactions <em>Satisfactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SatisfierImpl extends WorkableImpl implements Satisfier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SATISFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractRequirement> getRequirements() {
		return (EList<AbstractRequirement>)eDynamicGet(RequirementsPackage.SATISFIER__REQUIREMENTS, RequirementsPackage.Literals.SATISFIER__REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Satisfaction> getSatisfactions() {
		return (EList<Satisfaction>)eDynamicGet(RequirementsPackage.SATISFIER__SATISFACTIONS, RequirementsPackage.Literals.SATISFIER__SATISFACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.SATISFIER__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.SATISFIER__SATISFACTIONS:
				return ((InternalEList<?>)getSatisfactions()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.SATISFIER__REQUIREMENTS:
				return getRequirements();
			case RequirementsPackage.SATISFIER__SATISFACTIONS:
				return getSatisfactions();
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
			case RequirementsPackage.SATISFIER__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends AbstractRequirement>)newValue);
				return;
			case RequirementsPackage.SATISFIER__SATISFACTIONS:
				getSatisfactions().clear();
				getSatisfactions().addAll((Collection<? extends Satisfaction>)newValue);
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
			case RequirementsPackage.SATISFIER__REQUIREMENTS:
				getRequirements().clear();
				return;
			case RequirementsPackage.SATISFIER__SATISFACTIONS:
				getSatisfactions().clear();
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
			case RequirementsPackage.SATISFIER__REQUIREMENTS:
				return !getRequirements().isEmpty();
			case RequirementsPackage.SATISFIER__SATISFACTIONS:
				return !getSatisfactions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SatisfierImpl
