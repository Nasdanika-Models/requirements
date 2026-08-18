/**
 */
package org.nasdanika.models.requirements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.governance.GovernancePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.requirements.RequirementsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://requirements.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.nasdanika.models.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.RequirementKindImpl <em>Requirement Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.RequirementKindImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getRequirementKind()
	 * @generated
	 */
	int REQUIREMENT_KIND = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND__SUPER_TYPE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Requirement Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_KIND_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.SatisfierImpl <em>Satisfier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.SatisfierImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getSatisfier()
	 * @generated
	 */
	int SATISFIER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__ID = WorkPackage.WORKABLE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__DOCUMENTATION = WorkPackage.WORKABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__DOC_REF = WorkPackage.WORKABLE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__DOC_FORMAT = WorkPackage.WORKABLE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__DOC_CONTENTS = WorkPackage.WORKABLE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__DOC_SECTIONS = WorkPackage.WORKABLE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__MARKERS = WorkPackage.WORKABLE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__ICON = WorkPackage.WORKABLE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__URIS = WorkPackage.WORKABLE__URIS;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__CONTROL_APPLICATIONS = WorkPackage.WORKABLE__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__RISKS = WorkPackage.WORKABLE__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__WAIVERS = WorkPackage.WORKABLE__WAIVERS;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__WORK = WorkPackage.WORKABLE__WORK;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__REQUIREMENTS = WorkPackage.WORKABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER__SATISFACTIONS = WorkPackage.WORKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Satisfier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER_FEATURE_COUNT = WorkPackage.WORKABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER___COLLECT__OBJECT_EREFERENCE_ELIST = WorkPackage.WORKABLE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER___GET_REFERRERS__EREFERENCE = WorkPackage.WORKABLE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Satisfier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIER_OPERATION_COUNT = WorkPackage.WORKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.AbstractRequirementImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getAbstractRequirement()
	 * @generated
	 */
	int ABSTRACT_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SATISFIED_BY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ORIGIN = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.RequirementImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = GovernancePackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOCUMENTATION = GovernancePackage.REQUIREMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOC_REF = GovernancePackage.REQUIREMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOC_FORMAT = GovernancePackage.REQUIREMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOC_CONTENTS = GovernancePackage.REQUIREMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOC_SECTIONS = GovernancePackage.REQUIREMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MARKERS = GovernancePackage.REQUIREMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ICON = GovernancePackage.REQUIREMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__URIS = GovernancePackage.REQUIREMENT__URIS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFERENCE = GovernancePackage.REQUIREMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHILDREN = GovernancePackage.REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ORIGIN = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONTROL_APPLICATIONS = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RISKS = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__WAIVERS = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__WORK = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENTS = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Satisfactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFACTIONS = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__KIND = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATEMENT = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RATIONALE = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCES = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Acceptance Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACCEPTANCE_CRITERIA = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Verifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFICATIONS = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = GovernancePackage.REQUIREMENT_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___COLLECT__OBJECT_EREFERENCE_ELIST = GovernancePackage.REQUIREMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_REFERRERS__EREFERENCE = GovernancePackage.REQUIREMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = GovernancePackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.RequirementReferenceImpl <em>Requirement Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.RequirementReferenceImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getRequirementReference()
	 * @generated
	 */
	int REQUIREMENT_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__ID = ABSTRACT_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__DOCUMENTATION = ABSTRACT_REQUIREMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__DOC_REF = ABSTRACT_REQUIREMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__DOC_FORMAT = ABSTRACT_REQUIREMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__DOC_CONTENTS = ABSTRACT_REQUIREMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__DOC_SECTIONS = ABSTRACT_REQUIREMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__MARKERS = ABSTRACT_REQUIREMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__ICON = ABSTRACT_REQUIREMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__URIS = ABSTRACT_REQUIREMENT__URIS;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__SATISFIED_BY = ABSTRACT_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__ORIGIN = ABSTRACT_REQUIREMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE__TARGET = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = ABSTRACT_REQUIREMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE___GET_REFERRERS__EREFERENCE = ABSTRACT_REQUIREMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Requirement Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFERENCE_OPERATION_COUNT = ABSTRACT_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.AcceptanceCriterionImpl <em>Acceptance Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.AcceptanceCriterionImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getAcceptanceCriterion()
	 * @generated
	 */
	int ACCEPTANCE_CRITERION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__STATEMENT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION__METHOD = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Acceptance Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Acceptance Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_CRITERION_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.VerificationImpl <em>Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.VerificationImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getVerification()
	 * @generated
	 */
	int VERIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__METHOD = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__CRITERIA = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__DATE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__PASSED = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__EVIDENCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.SatisfactionImpl <em>Satisfaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.SatisfactionImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getSatisfaction()
	 * @generated
	 */
	int SATISFACTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__REQUIREMENT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__RATIONALE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION__PARTIAL = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Satisfaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Satisfaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.impl.RequirementDomainImpl <em>Requirement Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.impl.RequirementDomainImpl
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getRequirementDomain()
	 * @generated
	 */
	int REQUIREMENT_DOMAIN = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__ID = SATISFIER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__DOCUMENTATION = SATISFIER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__DOC_REF = SATISFIER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__DOC_FORMAT = SATISFIER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__DOC_CONTENTS = SATISFIER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__DOC_SECTIONS = SATISFIER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__MARKERS = SATISFIER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__ICON = SATISFIER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__URIS = SATISFIER__URIS;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__CONTROL_APPLICATIONS = SATISFIER__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__RISKS = SATISFIER__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__WAIVERS = SATISFIER__WAIVERS;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__WORK = SATISFIER__WORK;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__REQUIREMENTS = SATISFIER__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Satisfactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__SATISFACTIONS = SATISFIER__SATISFACTIONS;

	/**
	 * The feature id for the '<em><b>Requirement Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN__REQUIREMENT_KINDS = SATISFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN_FEATURE_COUNT = SATISFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = SATISFIER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN___GET_REFERRERS__EREFERENCE = SATISFIER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Requirement Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOMAIN_OPERATION_COUNT = SATISFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.requirements.VerificationMethod <em>Verification Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.requirements.VerificationMethod
	 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getVerificationMethod()
	 * @generated
	 */
	int VERIFICATION_METHOD = 9;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.RequirementKind <em>Requirement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Kind</em>'.
	 * @see org.nasdanika.models.requirements.RequirementKind
	 * @generated
	 */
	EClass getRequirementKind();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.requirements.RequirementKind#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.nasdanika.models.requirements.RequirementKind#getSuperType()
	 * @see #getRequirementKind()
	 * @generated
	 */
	EReference getRequirementKind_SuperType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.Satisfier <em>Satisfier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfier</em>'.
	 * @see org.nasdanika.models.requirements.Satisfier
	 * @generated
	 */
	EClass getSatisfier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.requirements.Satisfier#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.nasdanika.models.requirements.Satisfier#getRequirements()
	 * @see #getSatisfier()
	 * @generated
	 */
	EReference getSatisfier_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.requirements.Satisfier#getSatisfactions <em>Satisfactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satisfactions</em>'.
	 * @see org.nasdanika.models.requirements.Satisfier#getSatisfactions()
	 * @see #getSatisfier()
	 * @generated
	 */
	EReference getSatisfier_Satisfactions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.AbstractRequirement <em>Abstract Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Requirement</em>'.
	 * @see org.nasdanika.models.requirements.AbstractRequirement
	 * @generated
	 */
	EClass getAbstractRequirement();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.requirements.AbstractRequirement#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfied By</em>'.
	 * @see org.nasdanika.models.requirements.AbstractRequirement#getSatisfiedBy()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_SatisfiedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.AbstractRequirement#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.nasdanika.models.requirements.AbstractRequirement#getOrigin()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Origin();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.nasdanika.models.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.requirements.Requirement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see org.nasdanika.models.requirements.Requirement#getKind()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.Requirement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.nasdanika.models.requirements.Requirement#getStatement()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Statement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.Requirement#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.nasdanika.models.requirements.Requirement#getRationale()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.nasdanika.models.requirements.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.requirements.Requirement#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see org.nasdanika.models.requirements.Requirement#getSources()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Sources();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.requirements.Requirement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see org.nasdanika.models.requirements.Requirement#getDerivedFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.requirements.Requirement#getAcceptanceCriteria <em>Acceptance Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acceptance Criteria</em>'.
	 * @see org.nasdanika.models.requirements.Requirement#getAcceptanceCriteria()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_AcceptanceCriteria();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.requirements.Requirement#getVerifications <em>Verifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verifications</em>'.
	 * @see org.nasdanika.models.requirements.Requirement#getVerifications()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Verifications();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.RequirementReference <em>Requirement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Reference</em>'.
	 * @see org.nasdanika.models.requirements.RequirementReference
	 * @generated
	 */
	EClass getRequirementReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.requirements.RequirementReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.requirements.RequirementReference#getTarget()
	 * @see #getRequirementReference()
	 * @generated
	 */
	EReference getRequirementReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.AcceptanceCriterion <em>Acceptance Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptance Criterion</em>'.
	 * @see org.nasdanika.models.requirements.AcceptanceCriterion
	 * @generated
	 */
	EClass getAcceptanceCriterion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.AcceptanceCriterion#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.nasdanika.models.requirements.AcceptanceCriterion#getStatement()
	 * @see #getAcceptanceCriterion()
	 * @generated
	 */
	EAttribute getAcceptanceCriterion_Statement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.AcceptanceCriterion#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.requirements.AcceptanceCriterion#getMethod()
	 * @see #getAcceptanceCriterion()
	 * @generated
	 */
	EAttribute getAcceptanceCriterion_Method();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.Verification <em>Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification</em>'.
	 * @see org.nasdanika.models.requirements.Verification
	 * @generated
	 */
	EClass getVerification();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.Verification#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.requirements.Verification#getMethod()
	 * @see #getVerification()
	 * @generated
	 */
	EAttribute getVerification_Method();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.requirements.Verification#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria</em>'.
	 * @see org.nasdanika.models.requirements.Verification#getCriteria()
	 * @see #getVerification()
	 * @generated
	 */
	EReference getVerification_Criteria();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.Verification#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.requirements.Verification#getDate()
	 * @see #getVerification()
	 * @generated
	 */
	EAttribute getVerification_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.Verification#getPassed <em>Passed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passed</em>'.
	 * @see org.nasdanika.models.requirements.Verification#getPassed()
	 * @see #getVerification()
	 * @generated
	 */
	EAttribute getVerification_Passed();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.requirements.Verification#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see org.nasdanika.models.requirements.Verification#getEvidence()
	 * @see #getVerification()
	 * @generated
	 */
	EReference getVerification_Evidence();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.Satisfaction <em>Satisfaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfaction</em>'.
	 * @see org.nasdanika.models.requirements.Satisfaction
	 * @generated
	 */
	EClass getSatisfaction();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.requirements.Satisfaction#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.nasdanika.models.requirements.Satisfaction#getRequirement()
	 * @see #getSatisfaction()
	 * @generated
	 */
	EReference getSatisfaction_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.Satisfaction#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.nasdanika.models.requirements.Satisfaction#getRationale()
	 * @see #getSatisfaction()
	 * @generated
	 */
	EAttribute getSatisfaction_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.requirements.Satisfaction#getPartial <em>Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partial</em>'.
	 * @see org.nasdanika.models.requirements.Satisfaction#getPartial()
	 * @see #getSatisfaction()
	 * @generated
	 */
	EAttribute getSatisfaction_Partial();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.requirements.RequirementDomain <em>Requirement Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Domain</em>'.
	 * @see org.nasdanika.models.requirements.RequirementDomain
	 * @generated
	 */
	EClass getRequirementDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.requirements.RequirementDomain#getRequirementKinds <em>Requirement Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Kinds</em>'.
	 * @see org.nasdanika.models.requirements.RequirementDomain#getRequirementKinds()
	 * @see #getRequirementDomain()
	 * @generated
	 */
	EReference getRequirementDomain_RequirementKinds();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.requirements.VerificationMethod <em>Verification Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verification Method</em>'.
	 * @see org.nasdanika.models.requirements.VerificationMethod
	 * @generated
	 */
	EEnum getVerificationMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.RequirementKindImpl <em>Requirement Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.RequirementKindImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getRequirementKind()
		 * @generated
		 */
		EClass REQUIREMENT_KIND = eINSTANCE.getRequirementKind();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_KIND__SUPER_TYPE = eINSTANCE.getRequirementKind_SuperType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.SatisfierImpl <em>Satisfier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.SatisfierImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getSatisfier()
		 * @generated
		 */
		EClass SATISFIER = eINSTANCE.getSatisfier();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFIER__REQUIREMENTS = eINSTANCE.getSatisfier_Requirements();

		/**
		 * The meta object literal for the '<em><b>Satisfactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFIER__SATISFACTIONS = eINSTANCE.getSatisfier_Satisfactions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.AbstractRequirementImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getAbstractRequirement()
		 * @generated
		 */
		EClass ABSTRACT_REQUIREMENT = eINSTANCE.getAbstractRequirement();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__SATISFIED_BY = eINSTANCE.getAbstractRequirement_SatisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__ORIGIN = eINSTANCE.getAbstractRequirement_Origin();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.RequirementImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__KIND = eINSTANCE.getRequirement_Kind();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATEMENT = eINSTANCE.getRequirement_Statement();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RATIONALE = eINSTANCE.getRequirement_Rationale();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SOURCES = eINSTANCE.getRequirement_Sources();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DERIVED_FROM = eINSTANCE.getRequirement_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Acceptance Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ACCEPTANCE_CRITERIA = eINSTANCE.getRequirement_AcceptanceCriteria();

		/**
		 * The meta object literal for the '<em><b>Verifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__VERIFICATIONS = eINSTANCE.getRequirement_Verifications();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.RequirementReferenceImpl <em>Requirement Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.RequirementReferenceImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getRequirementReference()
		 * @generated
		 */
		EClass REQUIREMENT_REFERENCE = eINSTANCE.getRequirementReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_REFERENCE__TARGET = eINSTANCE.getRequirementReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.AcceptanceCriterionImpl <em>Acceptance Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.AcceptanceCriterionImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getAcceptanceCriterion()
		 * @generated
		 */
		EClass ACCEPTANCE_CRITERION = eINSTANCE.getAcceptanceCriterion();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTANCE_CRITERION__STATEMENT = eINSTANCE.getAcceptanceCriterion_Statement();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTANCE_CRITERION__METHOD = eINSTANCE.getAcceptanceCriterion_Method();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.VerificationImpl <em>Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.VerificationImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getVerification()
		 * @generated
		 */
		EClass VERIFICATION = eINSTANCE.getVerification();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION__METHOD = eINSTANCE.getVerification_Method();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION__CRITERIA = eINSTANCE.getVerification_Criteria();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION__DATE = eINSTANCE.getVerification_Date();

		/**
		 * The meta object literal for the '<em><b>Passed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION__PASSED = eINSTANCE.getVerification_Passed();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION__EVIDENCE = eINSTANCE.getVerification_Evidence();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.SatisfactionImpl <em>Satisfaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.SatisfactionImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getSatisfaction()
		 * @generated
		 */
		EClass SATISFACTION = eINSTANCE.getSatisfaction();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFACTION__REQUIREMENT = eINSTANCE.getSatisfaction_Requirement();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATISFACTION__RATIONALE = eINSTANCE.getSatisfaction_Rationale();

		/**
		 * The meta object literal for the '<em><b>Partial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATISFACTION__PARTIAL = eINSTANCE.getSatisfaction_Partial();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.impl.RequirementDomainImpl <em>Requirement Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.impl.RequirementDomainImpl
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getRequirementDomain()
		 * @generated
		 */
		EClass REQUIREMENT_DOMAIN = eINSTANCE.getRequirementDomain();

		/**
		 * The meta object literal for the '<em><b>Requirement Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOMAIN__REQUIREMENT_KINDS = eINSTANCE.getRequirementDomain_RequirementKinds();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.requirements.VerificationMethod <em>Verification Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.requirements.VerificationMethod
		 * @see org.nasdanika.models.requirements.impl.RequirementsPackageImpl#getVerificationMethod()
		 * @generated
		 */
		EEnum VERIFICATION_METHOD = eINSTANCE.getVerificationMethod();

	}

} //RequirementsPackage
