/**
 */
package org.nasdanika.models.requirements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.governance.GovernancePackage;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.LifecyclePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.requirements.AbstractRequirement;
import org.nasdanika.models.requirements.AcceptanceCriterion;
import org.nasdanika.models.requirements.Requirement;
import org.nasdanika.models.requirements.RequirementDomain;
import org.nasdanika.models.requirements.RequirementKind;
import org.nasdanika.models.requirements.RequirementReference;
import org.nasdanika.models.requirements.RequirementsFactory;
import org.nasdanika.models.requirements.RequirementsPackage;
import org.nasdanika.models.requirements.Satisfaction;
import org.nasdanika.models.requirements.Satisfier;
import org.nasdanika.models.requirements.Verification;
import org.nasdanika.models.requirements.VerificationMethod;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

import org.nasdanika.models.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsPackageImpl extends EPackageImpl implements RequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptanceCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verificationMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.requirements.RequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsPackageImpl() {
		super(eNS_URI, RequirementsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsPackage init() {
		if (isInited) return (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRequirementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = registeredRequirementsPackage instanceof RequirementsPackageImpl ? (RequirementsPackageImpl)registeredRequirementsPackage : new RequirementsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		WorkPackage.eINSTANCE.eClass();
		GovernancePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		LifecyclePackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		SealPackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsPackage.eNS_URI, theRequirementsPackage);
		return theRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementKind() {
		return requirementKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementKind_SuperType() {
		return (EReference)requirementKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSatisfier() {
		return satisfierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfier_Requirements() {
		return (EReference)satisfierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfier_Satisfactions() {
		return (EReference)satisfierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractRequirement() {
		return abstractRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_SatisfiedBy() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractRequirement_Origin() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Kind() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Statement() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Rationale() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Priority() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Sources() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_DerivedFrom() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_AcceptanceCriteria() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Verifications() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementReference() {
		return requirementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementReference_Target() {
		return (EReference)requirementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcceptanceCriterion() {
		return acceptanceCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcceptanceCriterion_Statement() {
		return (EAttribute)acceptanceCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcceptanceCriterion_Method() {
		return (EAttribute)acceptanceCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerification() {
		return verificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerification_Method() {
		return (EAttribute)verificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerification_Criteria() {
		return (EReference)verificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerification_Date() {
		return (EAttribute)verificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerification_Passed() {
		return (EAttribute)verificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerification_Evidence() {
		return (EReference)verificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSatisfaction() {
		return satisfactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfaction_Requirement() {
		return (EReference)satisfactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfaction_Rationale() {
		return (EAttribute)satisfactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfaction_Partial() {
		return (EAttribute)satisfactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementDomain() {
		return requirementDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDomain_RequirementKinds() {
		return (EReference)requirementDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerificationMethod() {
		return verificationMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsFactory getRequirementsFactory() {
		return (RequirementsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		requirementKindEClass = createEClass(REQUIREMENT_KIND);
		createEReference(requirementKindEClass, REQUIREMENT_KIND__SUPER_TYPE);

		satisfierEClass = createEClass(SATISFIER);
		createEReference(satisfierEClass, SATISFIER__REQUIREMENTS);
		createEReference(satisfierEClass, SATISFIER__SATISFACTIONS);

		abstractRequirementEClass = createEClass(ABSTRACT_REQUIREMENT);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__SATISFIED_BY);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__ORIGIN);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__KIND);
		createEAttribute(requirementEClass, REQUIREMENT__STATEMENT);
		createEAttribute(requirementEClass, REQUIREMENT__RATIONALE);
		createEAttribute(requirementEClass, REQUIREMENT__PRIORITY);
		createEReference(requirementEClass, REQUIREMENT__SOURCES);
		createEReference(requirementEClass, REQUIREMENT__DERIVED_FROM);
		createEReference(requirementEClass, REQUIREMENT__ACCEPTANCE_CRITERIA);
		createEReference(requirementEClass, REQUIREMENT__VERIFICATIONS);

		requirementReferenceEClass = createEClass(REQUIREMENT_REFERENCE);
		createEReference(requirementReferenceEClass, REQUIREMENT_REFERENCE__TARGET);

		acceptanceCriterionEClass = createEClass(ACCEPTANCE_CRITERION);
		createEAttribute(acceptanceCriterionEClass, ACCEPTANCE_CRITERION__STATEMENT);
		createEAttribute(acceptanceCriterionEClass, ACCEPTANCE_CRITERION__METHOD);

		verificationEClass = createEClass(VERIFICATION);
		createEAttribute(verificationEClass, VERIFICATION__METHOD);
		createEReference(verificationEClass, VERIFICATION__CRITERIA);
		createEAttribute(verificationEClass, VERIFICATION__DATE);
		createEAttribute(verificationEClass, VERIFICATION__PASSED);
		createEReference(verificationEClass, VERIFICATION__EVIDENCE);

		satisfactionEClass = createEClass(SATISFACTION);
		createEReference(satisfactionEClass, SATISFACTION__REQUIREMENT);
		createEAttribute(satisfactionEClass, SATISFACTION__RATIONALE);
		createEAttribute(satisfactionEClass, SATISFACTION__PARTIAL);

		requirementDomainEClass = createEClass(REQUIREMENT_DOMAIN);
		createEReference(requirementDomainEClass, REQUIREMENT_DOMAIN__REQUIREMENT_KINDS);

		// Create enums
		verificationMethodEEnum = createEEnum(VERIFICATION_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		WorkPackage theWorkPackage = (WorkPackage)EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GovernancePackage theGovernancePackage = (GovernancePackage)EPackage.Registry.INSTANCE.getEPackage(GovernancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementKindEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		satisfierEClass.getESuperTypes().add(theWorkPackage.getWorkable());
		abstractRequirementEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		requirementEClass.getESuperTypes().add(theGovernancePackage.getRequirement());
		requirementEClass.getESuperTypes().add(this.getAbstractRequirement());
		requirementEClass.getESuperTypes().add(this.getSatisfier());
		requirementReferenceEClass.getESuperTypes().add(this.getAbstractRequirement());
		acceptanceCriterionEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		verificationEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		satisfactionEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		requirementDomainEClass.getESuperTypes().add(this.getSatisfier());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementKindEClass, RequirementKind.class, "RequirementKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementKind_SuperType(), this.getRequirementKind(), null, "superType", null, 0, 1, RequirementKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satisfierEClass, Satisfier.class, "Satisfier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatisfier_Requirements(), this.getAbstractRequirement(), null, "requirements", null, 0, -1, Satisfier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatisfier_Satisfactions(), this.getSatisfaction(), null, "satisfactions", null, 0, -1, Satisfier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRequirementEClass, AbstractRequirement.class, "AbstractRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRequirement_SatisfiedBy(), this.getSatisfaction(), this.getSatisfaction_Requirement(), "satisfiedBy", null, 0, -1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractRequirement_Origin(), theEcorePackage.getEString(), "origin", null, 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_Kind(), this.getRequirementKind(), null, "kind", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Statement(), theEcorePackage.getEString(), "statement", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Rationale(), theEcorePackage.getEString(), "rationale", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Priority(), theEcorePackage.getEIntegerObject(), "priority", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Sources(), theEcorePackage.getEObject(), null, "sources", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_DerivedFrom(), this.getAbstractRequirement(), null, "derivedFrom", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_AcceptanceCriteria(), this.getAcceptanceCriterion(), null, "acceptanceCriteria", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Verifications(), this.getVerification(), null, "verifications", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementReferenceEClass, RequirementReference.class, "RequirementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementReference_Target(), this.getRequirement(), null, "target", null, 0, 1, RequirementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptanceCriterionEClass, AcceptanceCriterion.class, "AcceptanceCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptanceCriterion_Statement(), theEcorePackage.getEString(), "statement", null, 0, 1, AcceptanceCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcceptanceCriterion_Method(), this.getVerificationMethod(), "method", null, 0, 1, AcceptanceCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verificationEClass, Verification.class, "Verification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerification_Method(), this.getVerificationMethod(), "method", null, 0, 1, Verification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerification_Criteria(), this.getAcceptanceCriterion(), null, "criteria", null, 0, -1, Verification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerification_Date(), theEcorePackage.getEDate(), "date", null, 0, 1, Verification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerification_Passed(), theEcorePackage.getEBooleanObject(), "passed", null, 0, 1, Verification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerification_Evidence(), theEcorePackage.getEObject(), null, "evidence", null, 0, -1, Verification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satisfactionEClass, Satisfaction.class, "Satisfaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatisfaction_Requirement(), this.getAbstractRequirement(), this.getAbstractRequirement_SatisfiedBy(), "requirement", null, 0, 1, Satisfaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatisfaction_Rationale(), theEcorePackage.getEString(), "rationale", null, 0, 1, Satisfaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatisfaction_Partial(), theEcorePackage.getEBooleanObject(), "partial", null, 0, 1, Satisfaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementDomainEClass, RequirementDomain.class, "RequirementDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementDomain_RequirementKinds(), this.getRequirementKind(), null, "requirementKinds", null, 0, -1, RequirementDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(verificationMethodEEnum, VerificationMethod.class, "VerificationMethod");
		addEEnumLiteral(verificationMethodEEnum, VerificationMethod.INSPECTION);
		addEEnumLiteral(verificationMethodEEnum, VerificationMethod.ANALYSIS);
		addEEnumLiteral(verificationMethodEEnum, VerificationMethod.DEMONSTRATION);
		addEEnumLiteral(verificationMethodEEnum, VerificationMethod.TEST);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (requirementKindEClass,
		   source,
		   new String[] {
			   "documentation", " Base (ModelElement, Property) is imported from the tower rather than\nredefined; collapses into nxcore on base extraction."
		   });
		addAnnotation
		  (satisfierEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Satisfier: the extension point of this floor ----"
		   });
		addAnnotation
		  (getSatisfier_Requirements(),
		   source,
		   new String[] {
			   "documentation", "Requirements ON this element: what must be true of it. For a\nRequirement, contained requirements are its refinement (SysML\nrefine; DOORS module hierarchy)."
		   });
		addAnnotation
		  (getSatisfier_Satisfactions(),
		   source,
		   new String[] {
			   "documentation", "Satisfaction claims BY this element: which requirements (its own\nor, via references, another model\'s) it satisfies, and why."
		   });
		addAnnotation
		  (abstractRequirementEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Requirements ----"
		   });
		addAnnotation
		  (getAbstractRequirement_SatisfiedBy(),
		   source,
		   new String[] {
			   "documentation", " Satisfaction claims targeting this requirement; coverage is a query over this list."
		   });
		addAnnotation
		  (getAbstractRequirement_Origin(),
		   source,
		   new String[] {
			   "documentation", " URI of the source this requirement was loaded from: Word paragraph, Excel row, Confluence page, ReqIF spec object, tracker item."
		   });
		addAnnotation
		  (requirementEClass,
		   source,
		   new String[] {
			   "documentation", "A requirement: a normative statement about the element that carries\nit. A Satisfier itself, so requirements nest (refinement) and a\nderived requirement can record satisfaction of the requirement it\nflows down from. Workable through the tower: elaboration and\nimplementation work attach here, which is the typed reason this floor\nsits on work. Status, approval signatures, and assignment arrive\nthrough the tower (lifecycle, seal, role), not as attributes.\n\nSAME-NAME SHADOW: extends (shadows) the governance model\'s\nRequirement, the thin framework-clause class (reference id, children),\nper the shadow-chain rule and the decision binding model\'s Alternative\nprecedent. Additive-only: this class adds kind, statement, criteria,\nverification, satisfaction; it removes nothing. The payoff is\npolymorphism downward: governance Policy.satisfies is typed against\nthe thin class, so a policy can cite a full requirement authored at\nthis floor without governance ever depending upward. The inherited\nchildren containment duplicates Satisfier.requirements for the\nframework-mirroring case; prefer requirements, treat children as the\nlegacy clause hierarchy pending governance re-wire."
		   });
		addAnnotation
		  (getRequirement_Statement(),
		   source,
		   new String[] {
			   "documentation", "The normative statement, EARS-friendly by convention:\n\"WHEN <trigger> the <system> SHALL <response>\". The inherited\nname/description carry title and discussion; statement is the\ntestable sentence."
		   });
		addAnnotation
		  (getRequirement_Rationale(),
		   source,
		   new String[] {
			   "documentation", " Why this requirement exists; distinct from sources (where it came from)."
		   });
		addAnnotation
		  (getRequirement_Priority(),
		   source,
		   new String[] {
			   "documentation", " Smaller is more important; absent means unprioritized. MoSCoW and similar schemes are a kind or property catalog concern."
		   });
		addAnnotation
		  (getRequirement_Sources(),
		   source,
		   new String[] {
			   "documentation", "Where this requirement comes from: a stakeholder or persona, a\nregulation clause, a threat, a bound decision. Typed as EObject\nbecause sources live across micro-models without a shared base\nyet; narrow on base convergence (SysML trace, DOORS source link)."
		   });
		addAnnotation
		  (getRequirement_DerivedFrom(),
		   source,
		   new String[] {
			   "documentation", "Requirements this one is derived from (SysML derive): flow-down\nacross levels and, via RequirementReference, across federated\nmodels - a subsystem\'s requirements derive from the system\'s the\nway code depends on a Maven artifact."
		   });
		addAnnotation
		  (requirementReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "A reference to a requirement defined in another (published, federated)\nmodel: flow-down without copying. A supplier satisfies, derives from,\nor verifies against a customer\'s published requirement by citing it."
		   });
		addAnnotation
		  (verificationMethodEEnum,
		   source,
		   new String[] {
			   "documentation", " ---- Acceptance and verification ----"
		   });
		addAnnotation
		  (acceptanceCriterionEClass,
		   source,
		   new String[] {
			   "documentation", "A single testable condition of satisfaction. Kept as contained records\nrather than a text blob so generators, test scaffolding, and agents\nconsume criteria individually - the spec-driven development contract."
		   });
		addAnnotation
		  (verificationEClass,
		   source,
		   new String[] {
			   "documentation", "A dated verification record: the requirement (or a subset of its\ncriteria) was checked by a method, with a verdict and evidence.\nEvidence may be a test run URI, an analysis document, or a signed\nlifecycle sojourn; who verified is attributable through the tower\n(IAM), and a signed verification is non-repudiable via seal."
		   });
		addAnnotation
		  (getVerification_Criteria(),
		   source,
		   new String[] {
			   "documentation", " Criteria covered by this verification; empty means the requirement as a whole."
		   });
		addAnnotation
		  (getVerification_Evidence(),
		   source,
		   new String[] {
			   "documentation", " Evidence elements: test runs, analyses, documents, signed sojourns. Typed as EObject pending base convergence."
		   });
		addAnnotation
		  (satisfactionEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Satisfaction ----"
		   });
		addAnnotation
		  (getSatisfaction_Rationale(),
		   source,
		   new String[] {
			   "documentation", " How the containing element satisfies the requirement."
		   });
		addAnnotation
		  (getSatisfaction_Partial(),
		   source,
		   new String[] {
			   "documentation", " Partial satisfaction: the requirement needs other satisfiers too (DOORS partial links)."
		   });
		addAnnotation
		  (requirementDomainEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Root ----"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //RequirementsPackageImpl
