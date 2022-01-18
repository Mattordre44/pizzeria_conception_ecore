/**
 */
package pizzeria;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pizzeria.PizzeriaPackage
 * @generated
 */
public interface PizzeriaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PizzeriaFactory eINSTANCE = pizzeria.impl.PizzeriaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pizzeria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pizzeria</em>'.
	 * @generated
	 */
	Pizzeria createPizzeria();

	/**
	 * Returns a new object of class '<em>Pizzaiolo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pizzaiolo</em>'.
	 * @generated
	 */
	Pizzaiolo createPizzaiolo();

	/**
	 * Returns a new object of class '<em>Livreur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Livreur</em>'.
	 * @generated
	 */
	Livreur createLivreur();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	Manager createManager();

	/**
	 * Returns a new object of class '<em>Voiture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voiture</em>'.
	 * @generated
	 */
	Voiture createVoiture();

	/**
	 * Returns a new object of class '<em>Scooter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scooter</em>'.
	 * @generated
	 */
	Scooter createScooter();

	/**
	 * Returns a new object of class '<em>Pizza</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pizza</em>'.
	 * @generated
	 */
	Pizza createPizza();

	/**
	 * Returns a new object of class '<em>Recette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recette</em>'.
	 * @generated
	 */
	Recette createRecette();

	/**
	 * Returns a new object of class '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingredient</em>'.
	 * @generated
	 */
	Ingredient createIngredient();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Caissier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caissier</em>'.
	 * @generated
	 */
	Caissier createCaissier();

	/**
	 * Returns a new object of class '<em>Commande</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commande</em>'.
	 * @generated
	 */
	Commande createCommande();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PizzeriaPackage getPizzeriaPackage();

} //PizzeriaFactory
