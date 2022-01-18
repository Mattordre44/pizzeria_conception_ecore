/**
 */
package pizzeria;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pizzeria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Pizzeria#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link pizzeria.Pizzeria#getNom <em>Nom</em>}</li>
 *   <li>{@link pizzeria.Pizzeria#getDateDeCreation <em>Date De Creation</em>}</li>
 *   <li>{@link pizzeria.Pizzeria#getVehicule <em>Vehicule</em>}</li>
 *   <li>{@link pizzeria.Pizzeria#getEmploye <em>Employe</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getPizzeria()
 * @model
 * @generated
 */
public interface Pizzeria extends EObject {
	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see pizzeria.PizzeriaPackage#getPizzeria_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link pizzeria.Pizzeria#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see pizzeria.PizzeriaPackage#getPizzeria_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link pizzeria.Pizzeria#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Date De Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date De Creation</em>' attribute.
	 * @see #setDateDeCreation(Date)
	 * @see pizzeria.PizzeriaPackage#getPizzeria_DateDeCreation()
	 * @model
	 * @generated
	 */
	Date getDateDeCreation();

	/**
	 * Sets the value of the '{@link pizzeria.Pizzeria#getDateDeCreation <em>Date De Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Creation</em>' attribute.
	 * @see #getDateDeCreation()
	 * @generated
	 */
	void setDateDeCreation(Date value);

	/**
	 * Returns the value of the '<em><b>Vehicule</b></em>' containment reference list.
	 * The list contents are of type {@link pizzeria.Vehicule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicule</em>' containment reference list.
	 * @see pizzeria.PizzeriaPackage#getPizzeria_Vehicule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vehicule> getVehicule();

	/**
	 * Returns the value of the '<em><b>Employe</b></em>' containment reference list.
	 * The list contents are of type {@link pizzeria.Employe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employe</em>' containment reference list.
	 * @see pizzeria.PizzeriaPackage#getPizzeria_Employe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employe> getEmploye();

} // Pizzeria
