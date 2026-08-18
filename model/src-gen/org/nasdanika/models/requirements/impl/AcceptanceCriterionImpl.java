/**
 */
package org.nasdanika.models.requirements.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.requirements.AcceptanceCriterion;
import org.nasdanika.models.requirements.RequirementsPackage;
import org.nasdanika.models.requirements.VerificationMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acceptance Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.AcceptanceCriterionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.AcceptanceCriterionImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptanceCriterionImpl extends ModelElementImpl implements AcceptanceCriterion {
	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptanceCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.ACCEPTANCE_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatement() {
		return (String)eDynamicGet(RequirementsPackage.ACCEPTANCE_CRITERION__STATEMENT, RequirementsPackage.Literals.ACCEPTANCE_CRITERION__STATEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(String newStatement) {
		eDynamicSet(RequirementsPackage.ACCEPTANCE_CRITERION__STATEMENT, RequirementsPackage.Literals.ACCEPTANCE_CRITERION__STATEMENT, newStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationMethod getMethod() {
		return (VerificationMethod)eDynamicGet(RequirementsPackage.ACCEPTANCE_CRITERION__METHOD, RequirementsPackage.Literals.ACCEPTANCE_CRITERION__METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(VerificationMethod newMethod) {
		eDynamicSet(RequirementsPackage.ACCEPTANCE_CRITERION__METHOD, RequirementsPackage.Literals.ACCEPTANCE_CRITERION__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.ACCEPTANCE_CRITERION__STATEMENT:
				return getStatement();
			case RequirementsPackage.ACCEPTANCE_CRITERION__METHOD:
				return getMethod();
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
			case RequirementsPackage.ACCEPTANCE_CRITERION__STATEMENT:
				setStatement((String)newValue);
				return;
			case RequirementsPackage.ACCEPTANCE_CRITERION__METHOD:
				setMethod((VerificationMethod)newValue);
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
			case RequirementsPackage.ACCEPTANCE_CRITERION__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case RequirementsPackage.ACCEPTANCE_CRITERION__METHOD:
				setMethod(METHOD_EDEFAULT);
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
			case RequirementsPackage.ACCEPTANCE_CRITERION__STATEMENT:
				return STATEMENT_EDEFAULT == null ? getStatement() != null : !STATEMENT_EDEFAULT.equals(getStatement());
			case RequirementsPackage.ACCEPTANCE_CRITERION__METHOD:
				return getMethod() != METHOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //AcceptanceCriterionImpl
