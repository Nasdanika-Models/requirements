/**
 */
package org.nasdanika.models.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.requirements.AbstractRequirement;
import org.nasdanika.models.requirements.RequirementsPackage;
import org.nasdanika.models.requirements.Satisfaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.AbstractRequirementImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.AbstractRequirementImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRequirementImpl extends ModelElementImpl implements AbstractRequirement {
	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.ABSTRACT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Satisfaction> getSatisfiedBy() {
		return (EList<Satisfaction>)eDynamicGet(RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY, RequirementsPackage.Literals.ABSTRACT_REQUIREMENT__SATISFIED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigin() {
		return (String)eDynamicGet(RequirementsPackage.ABSTRACT_REQUIREMENT__ORIGIN, RequirementsPackage.Literals.ABSTRACT_REQUIREMENT__ORIGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(String newOrigin) {
		eDynamicSet(RequirementsPackage.ABSTRACT_REQUIREMENT__ORIGIN, RequirementsPackage.Literals.ABSTRACT_REQUIREMENT__ORIGIN, newOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSatisfiedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY:
				return ((InternalEList<?>)getSatisfiedBy()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY:
				return getSatisfiedBy();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__ORIGIN:
				return getOrigin();
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
			case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				getSatisfiedBy().addAll((Collection<? extends Satisfaction>)newValue);
				return;
			case RequirementsPackage.ABSTRACT_REQUIREMENT__ORIGIN:
				setOrigin((String)newValue);
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
			case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				return;
			case RequirementsPackage.ABSTRACT_REQUIREMENT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
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
			case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY:
				return !getSatisfiedBy().isEmpty();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__ORIGIN:
				return ORIGIN_EDEFAULT == null ? getOrigin() != null : !ORIGIN_EDEFAULT.equals(getOrigin());
		}
		return super.eIsSet(featureID);
	}

} //AbstractRequirementImpl
