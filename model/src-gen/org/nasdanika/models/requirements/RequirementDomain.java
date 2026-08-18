/**
 */
package org.nasdanika.models.requirements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Root ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.RequirementDomain#getRequirementKinds <em>Requirement Kinds</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirementDomain()
 * @model
 * @generated
 */
public interface RequirementDomain extends Satisfier {
	/**
	 * Returns the value of the '<em><b>Requirement Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.requirements.RequirementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Kinds</em>' containment reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getRequirementDomain_RequirementKinds()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementKind> getRequirementKinds();

} // RequirementDomain
