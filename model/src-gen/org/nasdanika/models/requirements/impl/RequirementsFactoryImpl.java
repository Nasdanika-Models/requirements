/**
 */
package org.nasdanika.models.requirements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.requirements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsFactoryImpl extends EFactoryImpl implements RequirementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementsFactory init() {
		try {
			RequirementsFactory theRequirementsFactory = (RequirementsFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementsPackage.eNS_URI);
			if (theRequirementsFactory != null) {
				return theRequirementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementsPackage.REQUIREMENT_KIND: return createRequirementKind();
			case RequirementsPackage.REQUIREMENT: return createRequirement();
			case RequirementsPackage.REQUIREMENT_REFERENCE: return createRequirementReference();
			case RequirementsPackage.ACCEPTANCE_CRITERION: return createAcceptanceCriterion();
			case RequirementsPackage.VERIFICATION: return createVerification();
			case RequirementsPackage.SATISFACTION: return createSatisfaction();
			case RequirementsPackage.REQUIREMENT_DOMAIN: return createRequirementDomain();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RequirementsPackage.VERIFICATION_METHOD:
				return createVerificationMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RequirementsPackage.VERIFICATION_METHOD:
				return convertVerificationMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementKind createRequirementKind() {
		RequirementKindImpl requirementKind = new RequirementKindImpl();
		return requirementKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementReference createRequirementReference() {
		RequirementReferenceImpl requirementReference = new RequirementReferenceImpl();
		return requirementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptanceCriterion createAcceptanceCriterion() {
		AcceptanceCriterionImpl acceptanceCriterion = new AcceptanceCriterionImpl();
		return acceptanceCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verification createVerification() {
		VerificationImpl verification = new VerificationImpl();
		return verification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Satisfaction createSatisfaction() {
		SatisfactionImpl satisfaction = new SatisfactionImpl();
		return satisfaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementDomain createRequirementDomain() {
		RequirementDomainImpl requirementDomain = new RequirementDomainImpl();
		return requirementDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationMethod createVerificationMethodFromString(EDataType eDataType, String initialValue) {
		VerificationMethod result = VerificationMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerificationMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsPackage getRequirementsPackage() {
		return (RequirementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementsPackage getPackage() {
		return RequirementsPackage.eINSTANCE;
	}

} //RequirementsFactoryImpl
