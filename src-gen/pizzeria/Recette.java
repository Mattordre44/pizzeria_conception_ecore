/**
 */
package pizzeria;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Recette#getDuree <em>Duree</em>}</li>
 *   <li>{@link pizzeria.Recette#getIngredient <em>Ingredient</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getRecette()
 * @model
 * @generated
 */
public interface Recette extends EObject {
	/**
	 * Returns the value of the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' attribute.
	 * @see #setDuree(String)
	 * @see pizzeria.PizzeriaPackage#getRecette_Duree()
	 * @model
	 * @generated
	 */
	String getDuree();

	/**
	 * Sets the value of the '{@link pizzeria.Recette#getDuree <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' attribute.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(String value);

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' reference list.
	 * The list contents are of type {@link pizzeria.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient</em>' reference list.
	 * @see pizzeria.PizzeriaPackage#getRecette_Ingredient()
	 * @model required="true"
	 * @generated
	 */
	EList<Ingredient> getIngredient();

} // Recette
