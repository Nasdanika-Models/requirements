/**
 */
package org.nasdanika.models.requirements.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.requirements.AbstractRequirement;
import org.nasdanika.models.requirements.RequirementsPackage;
import org.nasdanika.models.requirements.Satisfaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satisfaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.SatisfactionImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.SatisfactionImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.SatisfactionImpl#getPartial <em>Partial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatisfactionImpl extends ModelElementImpl implements Satisfaction {
	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPartial() <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PARTIAL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SATISFACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRequirement getRequirement() {
		return (AbstractRequirement)eDynamicGet(RequirementsPackage.SATISFACTION__REQUIREMENT, RequirementsPackage.Literals.SATISFACTION__REQUIREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRequirement basicGetRequirement() {
		return (AbstractRequirement)eDynamicGet(RequirementsPackage.SATISFACTION__REQUIREMENT, RequirementsPackage.Literals.SATISFACTION__REQUIREMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(AbstractRequirement newRequirement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRequirement, RequirementsPackage.SATISFACTION__REQUIREMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirement(AbstractRequirement newRequirement) {
		eDynamicSet(RequirementsPackage.SATISFACTION__REQUIREMENT, RequirementsPackage.Literals.SATISFACTION__REQUIREMENT, newRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return (String)eDynamicGet(RequirementsPackage.SATISFACTION__RATIONALE, RequirementsPackage.Literals.SATISFACTION__RATIONALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		eDynamicSet(RequirementsPackage.SATISFACTION__RATIONALE, RequirementsPackage.Literals.SATISFACTION__RATIONALE, newRationale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPartial() {
		return (Boolean)eDynamicGet(RequirementsPackage.SATISFACTION__PARTIAL, RequirementsPackage.Literals.SATISFACTION__PARTIAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartial(Boolean newPartial) {
		eDynamicSet(RequirementsPackage.SATISFACTION__PARTIAL, RequirementsPackage.Literals.SATISFACTION__PARTIAL, newPartial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.SATISFACTION__REQUIREMENT:
				AbstractRequirement requirement = basicGetRequirement();
				if (requirement != null)
					msgs = ((InternalEObject)requirement).eInverseRemove(this, RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY, AbstractRequirement.class, msgs);
				return basicSetRequirement((AbstractRequirement)otherEnd, msgs);
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
			case RequirementsPackage.SATISFACTION__REQUIREMENT:
				return basicSetRequirement(null, msgs);
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
			case RequirementsPackage.SATISFACTION__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
			case RequirementsPackage.SATISFACTION__RATIONALE:
				return getRationale();
			case RequirementsPackage.SATISFACTION__PARTIAL:
				return getPartial();
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
			case RequirementsPackage.SATISFACTION__REQUIREMENT:
				setRequirement((AbstractRequirement)newValue);
				return;
			case RequirementsPackage.SATISFACTION__RATIONALE:
				setRationale((String)newValue);
				return;
			case RequirementsPackage.SATISFACTION__PARTIAL:
				setPartial((Boolean)newValue);
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
			case RequirementsPackage.SATISFACTION__REQUIREMENT:
				setRequirement((AbstractRequirement)null);
				return;
			case RequirementsPackage.SATISFACTION__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case RequirementsPackage.SATISFACTION__PARTIAL:
				setPartial(PARTIAL_EDEFAULT);
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
			case RequirementsPackage.SATISFACTION__REQUIREMENT:
				return basicGetRequirement() != null;
			case RequirementsPackage.SATISFACTION__RATIONALE:
				return RATIONALE_EDEFAULT == null ? getRationale() != null : !RATIONALE_EDEFAULT.equals(getRationale());
			case RequirementsPackage.SATISFACTION__PARTIAL:
				return PARTIAL_EDEFAULT == null ? getPartial() != null : !PARTIAL_EDEFAULT.equals(getPartial());
		}
		return super.eIsSet(featureID);
	}

} //SatisfactionImpl
