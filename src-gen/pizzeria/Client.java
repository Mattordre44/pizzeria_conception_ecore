/**
 */
package pizzeria;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Client#getNom <em>Nom</em>}</li>
 *   <li>{@link pizzeria.Client#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link pizzeria.Client#getNumeroDeTelephone <em>Numero De Telephone</em>}</li>
 *   <li>{@link pizzeria.Client#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link pizzeria.Client#getLivreur <em>Livreur</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see pizzeria.PizzeriaPackage#getClient_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link pizzeria.Client#getNom <em>Nom</em>}' attribute.
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
	 * @see pizzeria.PizzeriaPackage#getClient_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link pizzeria.Client#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Numero De Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero De Telephone</em>' attribute.
	 * @see #setNumeroDeTelephone(String)
	 * @see pizzeria.PizzeriaPackage#getClient_NumeroDeTelephone()
	 * @model
	 * @generated
	 */
	String getNumeroDeTelephone();

	/**
	 * Sets the value of the '{@link pizzeria.Client#getNumeroDeTelephone <em>Numero De Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero De Telephone</em>' attribute.
	 * @see #getNumeroDeTelephone()
	 * @generated
	 */
	void setNumeroDeTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see pizzeria.PizzeriaPackage#getClient_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link pizzeria.Client#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Livreur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pizzeria.Livreur#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Livreur</em>' reference.
	 * @see #setLivreur(Livreur)
	 * @see pizzeria.PizzeriaPackage#getClient_Livreur()
	 * @see pizzeria.Livreur#getClient
	 * @model opposite="client"
	 * @generated
	 */
	Livreur getLivreur();

	/**
	 * Sets the value of the '{@link pizzeria.Client#getLivreur <em>Livreur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Livreur</em>' reference.
	 * @see #getLivreur()
	 * @generated
	 */
	void setLivreur(Livreur value);

} // Client
