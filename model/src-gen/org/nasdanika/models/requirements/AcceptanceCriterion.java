/**
 */
package org.nasdanika.models.requirements;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acceptance Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single testable condition of satisfaction. Kept as contained records
 * rather than a text blob so generators, test scaffolding, and agents
 * consume criteria individually - the spec-driven development contract.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.AcceptanceCriterion#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.AcceptanceCriterion#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getAcceptanceCriterion()
 * @model
 * @generated
 */
public interface AcceptanceCriterion extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getAcceptanceCriterion_Statement()
	 * @model unique="false"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.AcceptanceCriterion#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.requirements.VerificationMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see org.nasdanika.models.requirements.VerificationMethod
	 * @see #setMethod(VerificationMethod)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getAcceptanceCriterion_Method()
	 * @model unique="false"
	 * @generated
	 */
	VerificationMethod getMethod();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.AcceptanceCriterion#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see org.nasdanika.models.requirements.VerificationMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(VerificationMethod value);

} // AcceptanceCriterion
