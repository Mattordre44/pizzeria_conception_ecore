/**
 */
package pizzeria;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Livreur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Livreur#getCommande <em>Commande</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getLivreur()
 * @model
 * @generated
 */
public interface Livreur extends Employe {
	/**
	 * Returns the value of the '<em><b>Commande</b></em>' reference list.
	 * The list contents are of type {@link pizzeria.Commande}.
	 * It is bidirectional and its opposite is '{@link pizzeria.Commande#getLivreur <em>Livreur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commande</em>' reference list.
	 * @see pizzeria.PizzeriaPackage#getLivreur_Commande()
	 * @see pizzeria.Commande#getLivreur
	 * @model opposite="livreur"
	 * @generated
	 */
	EList<Commande> getCommande();

} // Livreur
