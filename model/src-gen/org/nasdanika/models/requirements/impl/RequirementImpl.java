/**
 */
package org.nasdanika.models.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.requirements.AbstractRequirement;
import org.nasdanika.models.requirements.AcceptanceCriterion;
import org.nasdanika.models.requirements.Requirement;
import org.nasdanika.models.requirements.RequirementKind;
import org.nasdanika.models.requirements.RequirementsPackage;
import org.nasdanika.models.requirements.Satisfaction;
import org.nasdanika.models.requirements.Satisfier;
import org.nasdanika.models.requirements.Verification;

import org.nasdanika.models.work.AbstractWork;
import org.nasdanika.models.work.WorkPackage;
import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getWork <em>Work</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getSatisfactions <em>Satisfactions</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.impl.RequirementImpl#getVerifications <em>Verifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends org.nasdanika.models.governance.impl.RequirementImpl implements Requirement {
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
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Satisfaction> getSatisfiedBy() {
		return (EList<Satisfaction>)eDynamicGet(RequirementsPackage.REQUIREMENT__SATISFIED_BY, RequirementsPackage.Literals.ABSTRACT_REQUIREMENT__SATISFIED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigin() {
		return (String)eDynamicGet(RequirementsPackage.REQUIREMENT__ORIGIN, RequirementsPackage.Literals.ABSTRACT_REQUIREMENT__ORIGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(String newOrigin) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__ORIGIN, RequirementsPackage.Literals.ABSTRACT_REQUIREMENT__ORIGIN, newOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(RequirementsPackage.REQUIREMENT__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(RequirementsPackage.REQUIREMENT__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractWork> getWork() {
		return (EList<AbstractWork>)eDynamicGet(RequirementsPackage.REQUIREMENT__WORK, WorkPackage.Literals.WORKABLE__WORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractRequirement> getRequirements() {
		return (EList<AbstractRequirement>)eDynamicGet(RequirementsPackage.REQUIREMENT__REQUIREMENTS, RequirementsPackage.Literals.SATISFIER__REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Satisfaction> getSatisfactions() {
		return (EList<Satisfaction>)eDynamicGet(RequirementsPackage.REQUIREMENT__SATISFACTIONS, RequirementsPackage.Literals.SATISFIER__SATISFACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementKind getKind() {
		return (RequirementKind)eDynamicGet(RequirementsPackage.REQUIREMENT__KIND, RequirementsPackage.Literals.REQUIREMENT__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementKind basicGetKind() {
		return (RequirementKind)eDynamicGet(RequirementsPackage.REQUIREMENT__KIND, RequirementsPackage.Literals.REQUIREMENT__KIND, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(RequirementKind newKind) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__KIND, RequirementsPackage.Literals.REQUIREMENT__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatement() {
		return (String)eDynamicGet(RequirementsPackage.REQUIREMENT__STATEMENT, RequirementsPackage.Literals.REQUIREMENT__STATEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(String newStatement) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__STATEMENT, RequirementsPackage.Literals.REQUIREMENT__STATEMENT, newStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return (String)eDynamicGet(RequirementsPackage.REQUIREMENT__RATIONALE, RequirementsPackage.Literals.REQUIREMENT__RATIONALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__RATIONALE, RequirementsPackage.Literals.REQUIREMENT__RATIONALE, newRationale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriority() {
		return (Integer)eDynamicGet(RequirementsPackage.REQUIREMENT__PRIORITY, RequirementsPackage.Literals.REQUIREMENT__PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Integer newPriority) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__PRIORITY, RequirementsPackage.Literals.REQUIREMENT__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getSources() {
		return (EList<EObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__SOURCES, RequirementsPackage.Literals.REQUIREMENT__SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractRequirement> getDerivedFrom() {
		return (EList<AbstractRequirement>)eDynamicGet(RequirementsPackage.REQUIREMENT__DERIVED_FROM, RequirementsPackage.Literals.REQUIREMENT__DERIVED_FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AcceptanceCriterion> getAcceptanceCriteria() {
		return (EList<AcceptanceCriterion>)eDynamicGet(RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERIA, RequirementsPackage.Literals.REQUIREMENT__ACCEPTANCE_CRITERIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Verification> getVerifications() {
		return (EList<Verification>)eDynamicGet(RequirementsPackage.REQUIREMENT__VERIFICATIONS, RequirementsPackage.Literals.REQUIREMENT__VERIFICATIONS, true, true);
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
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSatisfiedBy()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__WAIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWaivers()).basicAdd(otherEnd, msgs);
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
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				return ((InternalEList<?>)getSatisfiedBy()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__WORK:
				return ((InternalEList<?>)getWork()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__SATISFACTIONS:
				return ((InternalEList<?>)getSatisfactions()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				return ((InternalEList<?>)getAcceptanceCriteria()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__VERIFICATIONS:
				return ((InternalEList<?>)getVerifications()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				return getSatisfiedBy();
			case RequirementsPackage.REQUIREMENT__ORIGIN:
				return getOrigin();
			case RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS:
				return getControlApplications();
			case RequirementsPackage.REQUIREMENT__RISKS:
				return getRisks();
			case RequirementsPackage.REQUIREMENT__WAIVERS:
				return getWaivers();
			case RequirementsPackage.REQUIREMENT__WORK:
				return getWork();
			case RequirementsPackage.REQUIREMENT__REQUIREMENTS:
				return getRequirements();
			case RequirementsPackage.REQUIREMENT__SATISFACTIONS:
				return getSatisfactions();
			case RequirementsPackage.REQUIREMENT__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case RequirementsPackage.REQUIREMENT__STATEMENT:
				return getStatement();
			case RequirementsPackage.REQUIREMENT__RATIONALE:
				return getRationale();
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case RequirementsPackage.REQUIREMENT__SOURCES:
				return getSources();
			case RequirementsPackage.REQUIREMENT__DERIVED_FROM:
				return getDerivedFrom();
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				return getAcceptanceCriteria();
			case RequirementsPackage.REQUIREMENT__VERIFICATIONS:
				return getVerifications();
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
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				getSatisfiedBy().addAll((Collection<? extends Satisfaction>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ORIGIN:
				setOrigin((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__WORK:
				getWork().clear();
				getWork().addAll((Collection<? extends AbstractWork>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends AbstractRequirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SATISFACTIONS:
				getSatisfactions().clear();
				getSatisfactions().addAll((Collection<? extends Satisfaction>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__KIND:
				setKind((RequirementKind)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__STATEMENT:
				setStatement((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__RATIONALE:
				setRationale((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends EObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends AbstractRequirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				getAcceptanceCriteria().clear();
				getAcceptanceCriteria().addAll((Collection<? extends AcceptanceCriterion>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__VERIFICATIONS:
				getVerifications().clear();
				getVerifications().addAll((Collection<? extends Verification>)newValue);
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
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				return;
			case RequirementsPackage.REQUIREMENT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case RequirementsPackage.REQUIREMENT__RISKS:
				getRisks().clear();
				return;
			case RequirementsPackage.REQUIREMENT__WAIVERS:
				getWaivers().clear();
				return;
			case RequirementsPackage.REQUIREMENT__WORK:
				getWork().clear();
				return;
			case RequirementsPackage.REQUIREMENT__REQUIREMENTS:
				getRequirements().clear();
				return;
			case RequirementsPackage.REQUIREMENT__SATISFACTIONS:
				getSatisfactions().clear();
				return;
			case RequirementsPackage.REQUIREMENT__KIND:
				setKind((RequirementKind)null);
				return;
			case RequirementsPackage.REQUIREMENT__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__SOURCES:
				getSources().clear();
				return;
			case RequirementsPackage.REQUIREMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				getAcceptanceCriteria().clear();
				return;
			case RequirementsPackage.REQUIREMENT__VERIFICATIONS:
				getVerifications().clear();
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
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				return !getSatisfiedBy().isEmpty();
			case RequirementsPackage.REQUIREMENT__ORIGIN:
				return ORIGIN_EDEFAULT == null ? getOrigin() != null : !ORIGIN_EDEFAULT.equals(getOrigin());
			case RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case RequirementsPackage.REQUIREMENT__RISKS:
				return !getRisks().isEmpty();
			case RequirementsPackage.REQUIREMENT__WAIVERS:
				return !getWaivers().isEmpty();
			case RequirementsPackage.REQUIREMENT__WORK:
				return !getWork().isEmpty();
			case RequirementsPackage.REQUIREMENT__REQUIREMENTS:
				return !getRequirements().isEmpty();
			case RequirementsPackage.REQUIREMENT__SATISFACTIONS:
				return !getSatisfactions().isEmpty();
			case RequirementsPackage.REQUIREMENT__KIND:
				return basicGetKind() != null;
			case RequirementsPackage.REQUIREMENT__STATEMENT:
				return STATEMENT_EDEFAULT == null ? getStatement() != null : !STATEMENT_EDEFAULT.equals(getStatement());
			case RequirementsPackage.REQUIREMENT__RATIONALE:
				return RATIONALE_EDEFAULT == null ? getRationale() != null : !RATIONALE_EDEFAULT.equals(getRationale());
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? getPriority() != null : !PRIORITY_EDEFAULT.equals(getPriority());
			case RequirementsPackage.REQUIREMENT__SOURCES:
				return !getSources().isEmpty();
			case RequirementsPackage.REQUIREMENT__DERIVED_FROM:
				return !getDerivedFrom().isEmpty();
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				return !getAcceptanceCriteria().isEmpty();
			case RequirementsPackage.REQUIREMENT__VERIFICATIONS:
				return !getVerifications().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractRequirement.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__SATISFIED_BY: return RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY;
				case RequirementsPackage.REQUIREMENT__ORIGIN: return RequirementsPackage.ABSTRACT_REQUIREMENT__ORIGIN;
				default: return -1;
			}
		}
		if (baseClass == Governed.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case RequirementsPackage.REQUIREMENT__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case RequirementsPackage.REQUIREMENT__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
				default: return -1;
			}
		}
		if (baseClass == Workable.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__WORK: return WorkPackage.WORKABLE__WORK;
				default: return -1;
			}
		}
		if (baseClass == Satisfier.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__REQUIREMENTS: return RequirementsPackage.SATISFIER__REQUIREMENTS;
				case RequirementsPackage.REQUIREMENT__SATISFACTIONS: return RequirementsPackage.SATISFIER__SATISFACTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractRequirement.class) {
			switch (baseFeatureID) {
				case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY: return RequirementsPackage.REQUIREMENT__SATISFIED_BY;
				case RequirementsPackage.ABSTRACT_REQUIREMENT__ORIGIN: return RequirementsPackage.REQUIREMENT__ORIGIN;
				default: return -1;
			}
		}
		if (baseClass == Governed.class) {
			switch (baseFeatureID) {
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return RequirementsPackage.REQUIREMENT__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return RequirementsPackage.REQUIREMENT__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return RequirementsPackage.REQUIREMENT__WAIVERS;
				default: return -1;
			}
		}
		if (baseClass == Workable.class) {
			switch (baseFeatureID) {
				case WorkPackage.WORKABLE__WORK: return RequirementsPackage.REQUIREMENT__WORK;
				default: return -1;
			}
		}
		if (baseClass == Satisfier.class) {
			switch (baseFeatureID) {
				case RequirementsPackage.SATISFIER__REQUIREMENTS: return RequirementsPackage.REQUIREMENT__REQUIREMENTS;
				case RequirementsPackage.SATISFIER__SATISFACTIONS: return RequirementsPackage.REQUIREMENT__SATISFACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RequirementImpl
