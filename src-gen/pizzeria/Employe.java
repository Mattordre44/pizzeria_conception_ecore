/**
 */
package pizzeria;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Employe#getNom <em>Nom</em>}</li>
 *   <li>{@link pizzeria.Employe#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link pizzeria.Employe#getSalaire <em>Salaire</em>}</li>
 *   <li>{@link pizzeria.Employe#getDateDeNaissance <em>Date De Naissance</em>}</li>
 *   <li>{@link pizzeria.Employe#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getEmploye()
 * @model abstract="true"
 * @generated
 */
public interface Employe extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see pizzeria.PizzeriaPackage#getEmploye_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link pizzeria.Employe#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see pizzeria.PizzeriaPackage#getEmploye_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link pizzeria.Employe#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salaire</em>' attribute.
	 * @see #setSalaire(double)
	 * @see pizzeria.PizzeriaPackage#getEmploye_Salaire()
	 * @model
	 * @generated
	 */
	double getSalaire();

	/**
	 * Sets the value of the '{@link pizzeria.Employe#getSalaire <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salaire</em>' attribute.
	 * @see #getSalaire()
	 * @generated
	 */
	void setSalaire(double value);

	/**
	 * Returns the value of the '<em><b>Date De Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date De Naissance</em>' attribute.
	 * @see #setDateDeNaissance(Date)
	 * @see pizzeria.PizzeriaPackage#getEmploye_DateDeNaissance()
	 * @model
	 * @generated
	 */
	Date getDateDeNaissance();

	/**
	 * Sets the value of the '{@link pizzeria.Employe#getDateDeNaissance <em>Date De Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Naissance</em>' attribute.
	 * @see #getDateDeNaissance()
	 * @generated
	 */
	void setDateDeNaissance(Date value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pizzeria.Manager#getEmploye <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Manager)
	 * @see pizzeria.PizzeriaPackage#getEmploye_Manager()
	 * @see pizzeria.Manager#getEmploye
	 * @model opposite="employe"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link pizzeria.Employe#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

} // Employe
