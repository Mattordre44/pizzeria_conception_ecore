/**
 */
package pizzeria;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Commande#getDate <em>Date</em>}</li>
 *   <li>{@link pizzeria.Commande#getMontant <em>Montant</em>}</li>
 *   <li>{@link pizzeria.Commande#getPizza <em>Pizza</em>}</li>
 *   <li>{@link pizzeria.Commande#getLivreur <em>Livreur</em>}</li>
 *   <li>{@link pizzeria.Commande#isLivrable <em>Livrable</em>}</li>
 *   <li>{@link pizzeria.Commande#getCaissier <em>Caissier</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getCommande()
 * @model
 * @generated
 */
public interface Commande extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see pizzeria.PizzeriaPackage#getCommande_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link pizzeria.Commande#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Montant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Montant</em>' attribute.
	 * @see #setMontant(double)
	 * @see pizzeria.PizzeriaPackage#getCommande_Montant()
	 * @model
	 * @generated
	 */
	double getMontant();

	/**
	 * Sets the value of the '{@link pizzeria.Commande#getMontant <em>Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Montant</em>' attribute.
	 * @see #getMontant()
	 * @generated
	 */
	void setMontant(double value);

	/**
	 * Returns the value of the '<em><b>Pizza</b></em>' reference list.
	 * The list contents are of type {@link pizzeria.Pizza}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pizza</em>' reference list.
	 * @see pizzeria.PizzeriaPackage#getCommande_Pizza()
	 * @model
	 * @generated
	 */
	EList<Pizza> getPizza();

	/**
	 * Returns the value of the '<em><b>Livreur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pizzeria.Livreur#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Livreur</em>' reference.
	 * @see #setLivreur(Livreur)
	 * @see pizzeria.PizzeriaPackage#getCommande_Livreur()
	 * @see pizzeria.Livreur#getCommande
	 * @model opposite="commande"
	 * @generated
	 */
	Livreur getLivreur();

	/**
	 * Sets the value of the '{@link pizzeria.Commande#getLivreur <em>Livreur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Livreur</em>' reference.
	 * @see #getLivreur()
	 * @generated
	 */
	void setLivreur(Livreur value);

	/**
	 * Returns the value of the '<em><b>Livrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Livrable</em>' attribute.
	 * @see #setLivrable(boolean)
	 * @see pizzeria.PizzeriaPackage#getCommande_Livrable()
	 * @model
	 * @generated
	 */
	boolean isLivrable();

	/**
	 * Sets the value of the '{@link pizzeria.Commande#isLivrable <em>Livrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Livrable</em>' attribute.
	 * @see #isLivrable()
	 * @generated
	 */
	void setLivrable(boolean value);

	/**
	 * Returns the value of the '<em><b>Caissier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pizzeria.Caissier#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caissier</em>' reference.
	 * @see #setCaissier(Caissier)
	 * @see pizzeria.PizzeriaPackage#getCommande_Caissier()
	 * @see pizzeria.Caissier#getCommande
	 * @model opposite="commande"
	 * @generated
	 */
	Caissier getCaissier();

	/**
	 * Sets the value of the '{@link pizzeria.Commande#getCaissier <em>Caissier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caissier</em>' reference.
	 * @see #getCaissier()
	 * @generated
	 */
	void setCaissier(Caissier value);

} // Commande
