/**
 */
package pizzeria;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pizzaiolo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Pizzaiolo#getPizza <em>Pizza</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getPizzaiolo()
 * @model
 * @generated
 */
public interface Pizzaiolo extends Employe {
	/**
	 * Returns the value of the '<em><b>Pizza</b></em>' containment reference list.
	 * The list contents are of type {@link pizzeria.Pizza}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pizza</em>' containment reference list.
	 * @see pizzeria.PizzeriaPackage#getPizzaiolo_Pizza()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pizza> getPizza();

} // Pizzaiolo
