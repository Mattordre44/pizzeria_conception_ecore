/**
 */
package pizzeria;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Manager#getEmploye <em>Employe</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends Employe {
	/**
	 * Returns the value of the '<em><b>Employe</b></em>' reference list.
	 * The list contents are of type {@link pizzeria.Employe}.
	 * It is bidirectional and its opposite is '{@link pizzeria.Employe#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employe</em>' reference list.
	 * @see pizzeria.PizzeriaPackage#getManager_Employe()
	 * @see pizzeria.Employe#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<Employe> getEmploye();

} // Manager
