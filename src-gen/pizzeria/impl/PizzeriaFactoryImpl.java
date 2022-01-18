/**
 */
package pizzeria.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pizzeria.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PizzeriaFactoryImpl extends EFactoryImpl implements PizzeriaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PizzeriaFactory init() {
		try {
			PizzeriaFactory thePizzeriaFactory = (PizzeriaFactory)EPackage.Registry.INSTANCE.getEFactory(PizzeriaPackage.eNS_URI);
			if (thePizzeriaFactory != null) {
				return thePizzeriaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PizzeriaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PizzeriaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PizzeriaPackage.PIZZERIA: return createPizzeria();
			case PizzeriaPackage.PIZZAIOLO: return createPizzaiolo();
			case PizzeriaPackage.LIVREUR: return createLivreur();
			case PizzeriaPackage.MANAGER: return createManager();
			case PizzeriaPackage.VOITURE: return createVoiture();
			case PizzeriaPackage.SCOOTER: return createScooter();
			case PizzeriaPackage.PIZZA: return createPizza();
			case PizzeriaPackage.RECETTE: return createRecette();
			case PizzeriaPackage.INGREDIENT: return createIngredient();
			case PizzeriaPackage.CLIENT: return createClient();
			case PizzeriaPackage.CAISSIER: return createCaissier();
			case PizzeriaPackage.COMMANDE: return createCommande();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pizzeria createPizzeria() {
		PizzeriaImpl pizzeria = new PizzeriaImpl();
		return pizzeria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pizzaiolo createPizzaiolo() {
		PizzaioloImpl pizzaiolo = new PizzaioloImpl();
		return pizzaiolo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livreur createLivreur() {
		LivreurImpl livreur = new LivreurImpl();
		return livreur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture createVoiture() {
		VoitureImpl voiture = new VoitureImpl();
		return voiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scooter createScooter() {
		ScooterImpl scooter = new ScooterImpl();
		return scooter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pizza createPizza() {
		PizzaImpl pizza = new PizzaImpl();
		return pizza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recette createRecette() {
		RecetteImpl recette = new RecetteImpl();
		return recette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient createIngredient() {
		IngredientImpl ingredient = new IngredientImpl();
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caissier createCaissier() {
		CaissierImpl caissier = new CaissierImpl();
		return caissier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commande createCommande() {
		CommandeImpl commande = new CommandeImpl();
		return commande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PizzeriaPackage getPizzeriaPackage() {
		return (PizzeriaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PizzeriaPackage getPackage() {
		return PizzeriaPackage.eINSTANCE;
	}

} //PizzeriaFactoryImpl
