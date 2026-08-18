/**
 */
package org.nasdanika.models.requirements;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Satisfier: the extension point of this floor ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.Satisfier#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.Satisfier#getSatisfactions <em>Satisfactions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getSatisfier()
 * @model abstract="true"
 * @generated
 */
public interface Satisfier extends Workable {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.requirements.AbstractRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements ON this element: what must be true of it. For a
	 * Requirement, contained requirements are its refinement (SysML
	 * refine; DOORS module hierarchy).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getSatisfier_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractRequirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Satisfactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.requirements.Satisfaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Satisfaction claims BY this element: which requirements (its own
	 * or, via references, another model's) it satisfies, and why.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfactions</em>' containment reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getSatisfier_Satisfactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Satisfaction> getSatisfactions();

} // Satisfier
