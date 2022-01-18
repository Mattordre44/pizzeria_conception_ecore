/**
 */
package pizzeria;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pizza</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Pizza#isPateMoelleuse <em>Pate Moelleuse</em>}</li>
 *   <li>{@link pizzeria.Pizza#getRecette <em>Recette</em>}</li>
 *   <li>{@link pizzeria.Pizza#getLivreur <em>Livreur</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getPizza()
 * @model
 * @generated
 */
public interface Pizza extends EObject {
	/**
	 * Returns the value of the '<em><b>Pate Moelleuse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pate Moelleuse</em>' attribute.
	 * @see #setPateMoelleuse(boolean)
	 * @see pizzeria.PizzeriaPackage#getPizza_PateMoelleuse()
	 * @model
	 * @generated
	 */
	boolean isPateMoelleuse();

	/**
	 * Sets the value of the '{@link pizzeria.Pizza#isPateMoelleuse <em>Pate Moelleuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pate Moelleuse</em>' attribute.
	 * @see #isPateMoelleuse()
	 * @generated
	 */
	void setPateMoelleuse(boolean value);

	/**
	 * Returns the value of the '<em><b>Recette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recette</em>' reference.
	 * @see #setRecette(Recette)
	 * @see pizzeria.PizzeriaPackage#getPizza_Recette()
	 * @model required="true"
	 * @generated
	 */
	Recette getRecette();

	/**
	 * Sets the value of the '{@link pizzeria.Pizza#getRecette <em>Recette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recette</em>' reference.
	 * @see #getRecette()
	 * @generated
	 */
	void setRecette(Recette value);

	/**
	 * Returns the value of the '<em><b>Livreur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Livreur</em>' reference.
	 * @see #setLivreur(Livreur)
	 * @see pizzeria.PizzeriaPackage#getPizza_Livreur()
	 * @model
	 * @generated
	 */
	Livreur getLivreur();

	/**
	 * Sets the value of the '{@link pizzeria.Pizza#getLivreur <em>Livreur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Livreur</em>' reference.
	 * @see #getLivreur()
	 * @generated
	 */
	void setLivreur(Livreur value);

} // Pizza
