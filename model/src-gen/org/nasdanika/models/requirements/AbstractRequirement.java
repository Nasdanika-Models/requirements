/**
 */
package org.nasdanika.models.requirements;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Requirements ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.requirements.AbstractRequirement#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.nasdanika.models.requirements.AbstractRequirement#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.requirements.RequirementsPackage#getAbstractRequirement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRequirement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Satisfied By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.requirements.Satisfaction}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.requirements.Satisfaction#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Satisfaction claims targeting this requirement; coverage is a query over this list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied By</em>' reference list.
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getAbstractRequirement_SatisfiedBy()
	 * @see org.nasdanika.models.requirements.Satisfaction#getRequirement
	 * @model opposite="requirement"
	 * @generated
	 */
	EList<Satisfaction> getSatisfiedBy();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URI of the source this requirement was loaded from: Word paragraph, Excel row, Confluence page, ReqIF spec object, tracker item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see org.nasdanika.models.requirements.RequirementsPackage#getAbstractRequirement_Origin()
	 * @model unique="false"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.requirements.AbstractRequirement#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

} // AbstractRequirement
