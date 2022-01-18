/**
 */
package pizzeria;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caissier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Caissier#getCommande <em>Commande</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getCaissier()
 * @model
 * @generated
 */
public interface Caissier extends Employe {

	/**
	 * Returns the value of the '<em><b>Commande</b></em>' reference list.
	 * The list contents are of type {@link pizzeria.Commande}.
	 * It is bidirectional and its opposite is '{@link pizzeria.Commande#getCaissier <em>Caissier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commande</em>' reference list.
	 * @see pizzeria.PizzeriaPackage#getCaissier_Commande()
	 * @see pizzeria.Commande#getCaissier
	 * @model opposite="caissier"
	 * @generated
	 */
	EList<Commande> getCommande();
} // Caissier
