/**
 */
package pizzeria;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.Vehicule#getImattriculation <em>Imattriculation</em>}</li>
 *   <li>{@link pizzeria.Vehicule#getNiveauEssence <em>Niveau Essence</em>}</li>
 *   <li>{@link pizzeria.Vehicule#isEstFonctionnel <em>Est Fonctionnel</em>}</li>
 *   <li>{@link pizzeria.Vehicule#getLivreur <em>Livreur</em>}</li>
 * </ul>
 *
 * @see pizzeria.PizzeriaPackage#getVehicule()
 * @model abstract="true"
 * @generated
 */
public interface Vehicule extends EObject {
	/**
	 * Returns the value of the '<em><b>Imattriculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imattriculation</em>' attribute.
	 * @see #setImattriculation(String)
	 * @see pizzeria.PizzeriaPackage#getVehicule_Imattriculation()
	 * @model
	 * @generated
	 */
	String getImattriculation();

	/**
	 * Sets the value of the '{@link pizzeria.Vehicule#getImattriculation <em>Imattriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imattriculation</em>' attribute.
	 * @see #getImattriculation()
	 * @generated
	 */
	void setImattriculation(String value);

	/**
	 * Returns the value of the '<em><b>Niveau Essence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Essence</em>' attribute.
	 * @see #setNiveauEssence(double)
	 * @see pizzeria.PizzeriaPackage#getVehicule_NiveauEssence()
	 * @model
	 * @generated
	 */
	double getNiveauEssence();

	/**
	 * Sets the value of the '{@link pizzeria.Vehicule#getNiveauEssence <em>Niveau Essence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Essence</em>' attribute.
	 * @see #getNiveauEssence()
	 * @generated
	 */
	void setNiveauEssence(double value);

	/**
	 * Returns the value of the '<em><b>Est Fonctionnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Fonctionnel</em>' attribute.
	 * @see #setEstFonctionnel(boolean)
	 * @see pizzeria.PizzeriaPackage#getVehicule_EstFonctionnel()
	 * @model
	 * @generated
	 */
	boolean isEstFonctionnel();

	/**
	 * Sets the value of the '{@link pizzeria.Vehicule#isEstFonctionnel <em>Est Fonctionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Fonctionnel</em>' attribute.
	 * @see #isEstFonctionnel()
	 * @generated
	 */
	void setEstFonctionnel(boolean value);

	/**
	 * Returns the value of the '<em><b>Livreur</b></em>' reference list.
	 * The list contents are of type {@link pizzeria.Livreur}.
	 * It is bidirectional and its opposite is '{@link pizzeria.Livreur#getVehicule <em>Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Livreur</em>' reference list.
	 * @see pizzeria.PizzeriaPackage#getVehicule_Livreur()
	 * @see pizzeria.Livreur#getVehicule
	 * @model opposite="vehicule"
	 * @generated
	 */
	EList<Livreur> getLivreur();

} // Vehicule
