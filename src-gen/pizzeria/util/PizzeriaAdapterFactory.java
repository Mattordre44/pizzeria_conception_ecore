/**
 */
package pizzeria.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pizzeria.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pizzeria.PizzeriaPackage
 * @generated
 */
public class PizzeriaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PizzeriaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PizzeriaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PizzeriaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PizzeriaSwitch<Adapter> modelSwitch = new PizzeriaSwitch<Adapter>() {
		@Override
		public Adapter caseEmploye(Employe object) {
			return createEmployeAdapter();
		}

		@Override
		public Adapter casePizzeria(Pizzeria object) {
			return createPizzeriaAdapter();
		}

		@Override
		public Adapter caseVehicule(Vehicule object) {
			return createVehiculeAdapter();
		}

		@Override
		public Adapter casePizzaiolo(Pizzaiolo object) {
			return createPizzaioloAdapter();
		}

		@Override
		public Adapter caseLivreur(Livreur object) {
			return createLivreurAdapter();
		}

		@Override
		public Adapter caseManager(Manager object) {
			return createManagerAdapter();
		}

		@Override
		public Adapter caseVoiture(Voiture object) {
			return createVoitureAdapter();
		}

		@Override
		public Adapter caseScooter(Scooter object) {
			return createScooterAdapter();
		}

		@Override
		public Adapter casePizza(Pizza object) {
			return createPizzaAdapter();
		}

		@Override
		public Adapter caseRecette(Recette object) {
			return createRecetteAdapter();
		}

		@Override
		public Adapter caseIngredient(Ingredient object) {
			return createIngredientAdapter();
		}

		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter caseCaissier(Caissier object) {
			return createCaissierAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Employe
	 * @generated
	 */
	public Adapter createEmployeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Pizzeria <em>Pizzeria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Pizzeria
	 * @generated
	 */
	public Adapter createPizzeriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Vehicule <em>Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Vehicule
	 * @generated
	 */
	public Adapter createVehiculeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Pizzaiolo <em>Pizzaiolo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Pizzaiolo
	 * @generated
	 */
	public Adapter createPizzaioloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Livreur <em>Livreur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Livreur
	 * @generated
	 */
	public Adapter createLivreurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Voiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Voiture
	 * @generated
	 */
	public Adapter createVoitureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Scooter <em>Scooter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Scooter
	 * @generated
	 */
	public Adapter createScooterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Pizza <em>Pizza</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Pizza
	 * @generated
	 */
	public Adapter createPizzaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Recette <em>Recette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Recette
	 * @generated
	 */
	public Adapter createRecetteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Ingredient
	 * @generated
	 */
	public Adapter createIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pizzeria.Caissier <em>Caissier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pizzeria.Caissier
	 * @generated
	 */
	public Adapter createCaissierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PizzeriaAdapterFactory
