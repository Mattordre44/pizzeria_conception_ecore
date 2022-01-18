/**
 */
package pizzeria.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pizzeria.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pizzeria.PizzeriaPackage
 * @generated
 */
public class PizzeriaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PizzeriaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PizzeriaSwitch() {
		if (modelPackage == null) {
			modelPackage = PizzeriaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PizzeriaPackage.EMPLOYE: {
			Employe employe = (Employe) theEObject;
			T result = caseEmploye(employe);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.PIZZERIA: {
			Pizzeria pizzeria = (Pizzeria) theEObject;
			T result = casePizzeria(pizzeria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.VEHICULE: {
			Vehicule vehicule = (Vehicule) theEObject;
			T result = caseVehicule(vehicule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.PIZZAIOLO: {
			Pizzaiolo pizzaiolo = (Pizzaiolo) theEObject;
			T result = casePizzaiolo(pizzaiolo);
			if (result == null)
				result = caseEmploye(pizzaiolo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.LIVREUR: {
			Livreur livreur = (Livreur) theEObject;
			T result = caseLivreur(livreur);
			if (result == null)
				result = caseEmploye(livreur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.MANAGER: {
			Manager manager = (Manager) theEObject;
			T result = caseManager(manager);
			if (result == null)
				result = caseEmploye(manager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.VOITURE: {
			Voiture voiture = (Voiture) theEObject;
			T result = caseVoiture(voiture);
			if (result == null)
				result = caseVehicule(voiture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.SCOOTER: {
			Scooter scooter = (Scooter) theEObject;
			T result = caseScooter(scooter);
			if (result == null)
				result = caseVehicule(scooter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.PIZZA: {
			Pizza pizza = (Pizza) theEObject;
			T result = casePizza(pizza);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.RECETTE: {
			Recette recette = (Recette) theEObject;
			T result = caseRecette(recette);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.INGREDIENT: {
			Ingredient ingredient = (Ingredient) theEObject;
			T result = caseIngredient(ingredient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.CLIENT: {
			Client client = (Client) theEObject;
			T result = caseClient(client);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PizzeriaPackage.CAISSIER: {
			Caissier caissier = (Caissier) theEObject;
			T result = caseCaissier(caissier);
			if (result == null)
				result = caseEmploye(caissier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmploye(Employe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pizzeria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pizzeria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePizzeria(Pizzeria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicule(Vehicule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pizzaiolo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pizzaiolo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePizzaiolo(Pizzaiolo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livreur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livreur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivreur(Livreur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManager(Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voiture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voiture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoiture(Voiture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scooter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scooter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScooter(Scooter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pizza</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pizza</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePizza(Pizza object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecette(Recette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIngredient(Ingredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caissier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caissier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaissier(Caissier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PizzeriaSwitch
