/**
 */
package org.nasdanika.models.requirements;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A dated verification record: the requirement (or a subset of its
 * criteria) was checked by a method, with a verdict and evidence.
 * Evidence may be a test run URI, an analysis document, or a signed
 * lifecycle sojourn; who verified is attributable through the tower
 * (IAM), and a signed verification is non-repudiable via seal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.Verification#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Verification#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Verification#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Verification#getPassed <em>Passed</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Verification#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getVerification()
 * @model
 * @generated
 */
public interface Verification extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.requirements.VerificationMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see org.nasdanika.models.requirements.VerificationMethod
	 * @see #setMethod(VerificationMethod)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getVerification_Method()
	 * @model unique="false"
	 * @generated
	 */
	VerificationMethod getMethod();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Verification#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see org.nasdanika.models.requirements.VerificationMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(VerificationMethod value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.requirements.AcceptanceCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Criteria covered by this verification; empty means the requirement as a whole.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criteria</em>' reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getVerification_Criteria()
	 * @model
	 * @generated
	 */
	EList<AcceptanceCriterion> getCriteria();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getVerification_Date()
	 * @model unique="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Verification#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passed</em>' attribute.
	 * @see #setPassed(Boolean)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getVerification_Passed()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getPassed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Verification#getPassed <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passed</em>' attribute.
	 * @see #getPassed()
	 * @generated
	 */
	void setPassed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Evidence elements: test runs, analyses, documents, signed sojourns. Typed as EObject pending base convergence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getVerification_Evidence()
	 * @model
	 * @generated
	 */
	EList<EObject> getEvidence();

} // Verification
