/**
 */
package org.nasdanika.models.requirements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.governance.Governed;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

import org.nasdanika.models.requirements.*;

import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.requirements.RequirementsPackage
 * @generated
 */
public class RequirementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RequirementsPackage.REQUIREMENT_KIND: {
				RequirementKind requirementKind = (RequirementKind)theEObject;
				T result = caseRequirementKind(requirementKind);
				if (result == null) result = caseModelElement(requirementKind);
				if (result == null) result = caseStringIdentity(requirementKind);
				if (result == null) result = caseDocumented(requirementKind);
				if (result == null) result = caseMarked(requirementKind);
				if (result == null) result = caseReferrable(requirementKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.SATISFIER: {
				Satisfier satisfier = (Satisfier)theEObject;
				T result = caseSatisfier(satisfier);
				if (result == null) result = caseWorkable(satisfier);
				if (result == null) result = caseGoverned(satisfier);
				if (result == null) result = caseModelElement(satisfier);
				if (result == null) result = caseStringIdentity(satisfier);
				if (result == null) result = caseDocumented(satisfier);
				if (result == null) result = caseMarked(satisfier);
				if (result == null) result = caseReferrable(satisfier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.ABSTRACT_REQUIREMENT: {
				AbstractRequirement abstractRequirement = (AbstractRequirement)theEObject;
				T result = caseAbstractRequirement(abstractRequirement);
				if (result == null) result = caseModelElement(abstractRequirement);
				if (result == null) result = caseStringIdentity(abstractRequirement);
				if (result == null) result = caseDocumented(abstractRequirement);
				if (result == null) result = caseMarked(abstractRequirement);
				if (result == null) result = caseReferrable(abstractRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseGovernance_Requirement(requirement);
				if (result == null) result = caseAbstractRequirement(requirement);
				if (result == null) result = caseSatisfier(requirement);
				if (result == null) result = caseWorkable(requirement);
				if (result == null) result = caseStringIdentity(requirement);
				if (result == null) result = caseDocumented(requirement);
				if (result == null) result = caseMarked(requirement);
				if (result == null) result = caseGoverned(requirement);
				if (result == null) result = caseModelElement(requirement);
				if (result == null) result = caseReferrable(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENT_REFERENCE: {
				RequirementReference requirementReference = (RequirementReference)theEObject;
				T result = caseRequirementReference(requirementReference);
				if (result == null) result = caseAbstractRequirement(requirementReference);
				if (result == null) result = caseModelElement(requirementReference);
				if (result == null) result = caseStringIdentity(requirementReference);
				if (result == null) result = caseDocumented(requirementReference);
				if (result == null) result = caseMarked(requirementReference);
				if (result == null) result = caseReferrable(requirementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.ACCEPTANCE_CRITERION: {
				AcceptanceCriterion acceptanceCriterion = (AcceptanceCriterion)theEObject;
				T result = caseAcceptanceCriterion(acceptanceCriterion);
				if (result == null) result = caseModelElement(acceptanceCriterion);
				if (result == null) result = caseStringIdentity(acceptanceCriterion);
				if (result == null) result = caseDocumented(acceptanceCriterion);
				if (result == null) result = caseMarked(acceptanceCriterion);
				if (result == null) result = caseReferrable(acceptanceCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.VERIFICATION: {
				Verification verification = (Verification)theEObject;
				T result = caseVerification(verification);
				if (result == null) result = caseModelElement(verification);
				if (result == null) result = caseStringIdentity(verification);
				if (result == null) result = caseDocumented(verification);
				if (result == null) result = caseMarked(verification);
				if (result == null) result = caseReferrable(verification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.SATISFACTION: {
				Satisfaction satisfaction = (Satisfaction)theEObject;
				T result = caseSatisfaction(satisfaction);
				if (result == null) result = caseModelElement(satisfaction);
				if (result == null) result = caseStringIdentity(satisfaction);
				if (result == null) result = caseDocumented(satisfaction);
				if (result == null) result = caseMarked(satisfaction);
				if (result == null) result = caseReferrable(satisfaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENT_DOMAIN: {
				RequirementDomain requirementDomain = (RequirementDomain)theEObject;
				T result = caseRequirementDomain(requirementDomain);
				if (result == null) result = caseSatisfier(requirementDomain);
				if (result == null) result = caseWorkable(requirementDomain);
				if (result == null) result = caseGoverned(requirementDomain);
				if (result == null) result = caseModelElement(requirementDomain);
				if (result == null) result = caseStringIdentity(requirementDomain);
				if (result == null) result = caseDocumented(requirementDomain);
				if (result == null) result = caseMarked(requirementDomain);
				if (result == null) result = caseReferrable(requirementDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementKind(RequirementKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfier(Satisfier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRequirement(AbstractRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementReference(RequirementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceptance Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceptance Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptanceCriterion(AcceptanceCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerification(Verification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfaction(Satisfaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementDomain(RequirementDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Governed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Governed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoverned(Governed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkable(Workable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGovernance_Requirement(org.nasdanika.models.governance.Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RequirementsSwitch
