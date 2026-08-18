/**
 */
package org.nasdanika.models.requirements.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.requirements.AcceptanceCriterion;
import org.nasdanika.models.requirements.RequirementsPackage;
import org.nasdanika.models.requirements.Verification;
import org.nasdanika.models.requirements.VerificationMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.VerificationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.VerificationImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.VerificationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.VerificationImpl#getPassed <em>Passed</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.VerificationImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationImpl extends ModelElementImpl implements Verification {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final VerificationMethod METHOD_EDEFAULT = VerificationMethod.INSPECTION;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPassed() <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PASSED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.VERIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationMethod getMethod() {
		return (VerificationMethod)eDynamicGet(RequirementsPackage.VERIFICATION__METHOD, RequirementsPackage.Literals.VERIFICATION__METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(VerificationMethod newMethod) {
		eDynamicSet(RequirementsPackage.VERIFICATION__METHOD, RequirementsPackage.Literals.VERIFICATION__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AcceptanceCriterion> getCriteria() {
		return (EList<AcceptanceCriterion>)eDynamicGet(RequirementsPackage.VERIFICATION__CRITERIA, RequirementsPackage.Literals.VERIFICATION__CRITERIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(RequirementsPackage.VERIFICATION__DATE, RequirementsPackage.Literals.VERIFICATION__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(RequirementsPackage.VERIFICATION__DATE, RequirementsPackage.Literals.VERIFICATION__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPassed() {
		return (Boolean)eDynamicGet(RequirementsPackage.VERIFICATION__PASSED, RequirementsPackage.Literals.VERIFICATION__PASSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassed(Boolean newPassed) {
		eDynamicSet(RequirementsPackage.VERIFICATION__PASSED, RequirementsPackage.Literals.VERIFICATION__PASSED, newPassed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getEvidence() {
		return (EList<EObject>)eDynamicGet(RequirementsPackage.VERIFICATION__EVIDENCE, RequirementsPackage.Literals.VERIFICATION__EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.VERIFICATION__METHOD:
				return getMethod();
			case RequirementsPackage.VERIFICATION__CRITERIA:
				return getCriteria();
			case RequirementsPackage.VERIFICATION__DATE:
				return getDate();
			case RequirementsPackage.VERIFICATION__PASSED:
				return getPassed();
			case RequirementsPackage.VERIFICATION__EVIDENCE:
				return getEvidence();
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
			case RequirementsPackage.VERIFICATION__METHOD:
				setMethod((VerificationMethod)newValue);
				return;
			case RequirementsPackage.VERIFICATION__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends AcceptanceCriterion>)newValue);
				return;
			case RequirementsPackage.VERIFICATION__DATE:
				setDate((Date)newValue);
				return;
			case RequirementsPackage.VERIFICATION__PASSED:
				setPassed((Boolean)newValue);
				return;
			case RequirementsPackage.VERIFICATION__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends EObject>)newValue);
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
			case RequirementsPackage.VERIFICATION__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case RequirementsPackage.VERIFICATION__CRITERIA:
				getCriteria().clear();
				return;
			case RequirementsPackage.VERIFICATION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case RequirementsPackage.VERIFICATION__PASSED:
				setPassed(PASSED_EDEFAULT);
				return;
			case RequirementsPackage.VERIFICATION__EVIDENCE:
				getEvidence().clear();
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
			case RequirementsPackage.VERIFICATION__METHOD:
				return getMethod() != METHOD_EDEFAULT;
			case RequirementsPackage.VERIFICATION__CRITERIA:
				return !getCriteria().isEmpty();
			case RequirementsPackage.VERIFICATION__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case RequirementsPackage.VERIFICATION__PASSED:
				return PASSED_EDEFAULT == null ? getPassed() != null : !PASSED_EDEFAULT.equals(getPassed());
			case RequirementsPackage.VERIFICATION__EVIDENCE:
				return !getEvidence().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerificationImpl
