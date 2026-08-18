/**
 */
package org.nasdanika.models.requirements;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Satisfaction ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.Satisfaction#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Satisfaction#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Satisfaction#getPartial <em>Partial</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getSatisfaction()
 * @model
 * @generated
 */
public interface Satisfaction extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.requirements.AbstractRequirement#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(AbstractRequirement)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getSatisfaction_Requirement()
	 * @see org.nasdanika.models.requirements.AbstractRequirement#getSatisfiedBy
	 * @model opposite="satisfiedBy"
	 * @generated
	 */
	AbstractRequirement getRequirement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Satisfaction#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(AbstractRequirement value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  How the containing element satisfies the requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getSatisfaction_Rationale()
	 * @model unique="false"
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Satisfaction#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Partial satisfaction: the requirement needs other satisfiers too (DOORS partial links).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partial</em>' attribute.
	 * @see #setPartial(Boolean)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getSatisfaction_Partial()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getPartial();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.Satisfaction#getPartial <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial</em>' attribute.
	 * @see #getPartial()
	 * @generated
	 */
	void setPartial(Boolean value);

} // Satisfaction
