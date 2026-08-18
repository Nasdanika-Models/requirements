/**
 */
package org.nasdanika.models.requirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A requirement: a normative statement about the element that carries
 * it. A Satisfier itself, so requirements nest (refinement) and a
 * derived requirement can record satisfaction of the requirement it
 * flows down from. Workable through the tower: elaboration and
 * implementation work attach here, which is the typed reason this floor
 * sits on work. Status, approval signatures, and assignment arrive
 * through the tower (lifecycle, seal, role), not as attributes.
 * 
 * SAME-NAME SHADOW: extends (shadows) the governance model's
 * Requirement, the thin framework-clause class (reference id, children),
 * per the shadow-chain rule and the decision binding model's Alternative
 * precedent. Additive-only: this class adds kind, statement, criteria,
 * verification, satisfaction; it removes nothing. The payoff is
 * polymorphism downward: governance Policy.satisfies is typed against
 * the thin class, so a policy can cite a full requirement authored at
 * this floor without governance ever depending upward. The inherited
 * children containment duplicates Satisfier.requirements for the
 * framework-mirroring case; prefer requirements, treat children as the
 * legacy clause hierarchy pending governance re-wire.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.Requirement#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Requirement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Requirement#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Requirement#getSources <em>Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Requirement#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Requirement#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Requirement#getVerifications <em>Verifications</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends org.nasdanika.models.governance.Requirement, AbstractRequirement, Satisfier {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(RequirementKind)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement_Kind()
	 * @model
	 * @generated
	 */
	RequirementKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Requirement#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(RequirementKind value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The normative statement, EARS-friendly by convention:
	 * "WHEN <trigger> the <system> SHALL <response>". The inherited
	 * name/description carry title and discussion; statement is the
	 * testable sentence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement_Statement()
	 * @model unique="false"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Requirement#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Why this requirement exists; distinct from sources (where it came from).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement_Rationale()
	 * @model unique="false"
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Requirement#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Smaller is more important; absent means unprioritized. MoSCoW and similar schemes are a kind or property catalog concern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement_Priority()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where this requirement comes from: a stakeholder or persona, a
	 * regulation clause, a threat, a bound decision. Typed as EObject
	 * because sources live across micro-models without a shared base
	 * yet; narrow on base convergence (SysML trace, DOORS source link).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement_Sources()
	 * @model
	 * @generated
	 */
	EList<EObject> getSources();

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.requirements.AbstractRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements this one is derived from (SysML derive): flow-down
	 * across levels and, via RequirementReference, across federated
	 * models - a subsystem's requirements derive from the system's the
	 * way code depends on a Maven artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement_DerivedFrom()
	 * @model
	 * @generated
	 */
	EList<AbstractRequirement> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Acceptance Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.requirements.AcceptanceCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Criteria</em>' containment reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement_AcceptanceCriteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<AcceptanceCriterion> getAcceptanceCriteria();

	/**
	 * Returns the value of the '<em><b>Verifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.requirements.Verification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifications</em>' containment reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirement_Verifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Verification> getVerifications();

} // Requirement
