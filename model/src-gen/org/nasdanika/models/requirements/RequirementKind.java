/**
 */
package org.nasdanika.models.requirements;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Base (ModelElement, Property) is imported from the tower rather than
 * redefined; collapses into nxcore on base extraction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.RequirementKind#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirementKind()
 * @model
 * @generated
 */
public interface RequirementKind extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(RequirementKind)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirementKind_SuperType()
	 * @model
	 * @generated
	 */
	RequirementKind getSuperType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.RequirementKind#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(RequirementKind value);

} // RequirementKind
