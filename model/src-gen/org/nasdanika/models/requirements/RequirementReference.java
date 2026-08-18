/**
 */
package org.nasdanika.models.requirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a requirement defined in another (published, federated)
 * model: flow-down without copying. A supplier satisfies, derives from,
 * or verifies against a customer's published requirement by citing it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.RequirementReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirementReference()
 * @model
 * @generated
 */
public interface RequirementReference extends AbstractRequirement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Requirement)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirementReference_Target()
	 * @model
	 * @generated
	 */
	Requirement getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.RequirementReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Requirement value);

} // RequirementReference
