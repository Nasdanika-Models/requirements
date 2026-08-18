/**
 */
package org.nasdanika.models.requirements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.requirements.RequirementsPackage
 * @generated
 */
public interface RequirementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsFactory eINSTANCE = org.nasdanika.models.requirements.impl.RequirementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirement Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Kind</em>'.
	 * @generated
	 */
	RequirementKind createRequirementKind();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Requirement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Reference</em>'.
	 * @generated
	 */
	RequirementReference createRequirementReference();

	/**
	 * Returns a new object of class '<em>Acceptance Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceptance Criterion</em>'.
	 * @generated
	 */
	AcceptanceCriterion createAcceptanceCriterion();

	/**
	 * Returns a new object of class '<em>Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification</em>'.
	 * @generated
	 */
	Verification createVerification();

	/**
	 * Returns a new object of class '<em>Satisfaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfaction</em>'.
	 * @generated
	 */
	Satisfaction createSatisfaction();

	/**
	 * Returns a new object of class '<em>Requirement Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Domain</em>'.
	 * @generated
	 */
	RequirementDomain createRequirementDomain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementsPackage getRequirementsPackage();

} //RequirementsFactory
