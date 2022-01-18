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
 *   <li>{@link pizzeria.Livreur#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getLivreur()
 * @model
 * @generated
 */
public interface Livreur extends Employe {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link pizzeria.Client}.
	 * It is bidirectional and its opposite is '{@link pizzeria.Client#getLivreur <em>Livreur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see pizzeria.PizzeriaPackage#getLivreur_Client()
	 * @see pizzeria.Client#getLivreur
	 * @model opposite="livreur"
	 * @generated
	 */
	EList<Client> getClient();

} // Livreur
