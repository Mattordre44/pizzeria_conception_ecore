/**
 */
package pizzeria;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pizzeria.PizzeriaFactory
 * @model kind="package"
 * @generated
 */
public interface PizzeriaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pizzeria";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pizzeria";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pizzeria";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PizzeriaPackage eINSTANCE = pizzeria.impl.PizzeriaPackageImpl.init();

	/**
	 * The meta object id for the '{@link pizzeria.impl.EmployeImpl <em>Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.EmployeImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getEmploye()
	 * @generated
	 */
	int EMPLOYE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__SALAIRE = 2;

	/**
	 * The feature id for the '<em><b>Date De Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__DATE_DE_NAISSANCE = 3;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__MANAGER = 4;

	/**
	 * The number of structural features of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.PizzeriaImpl <em>Pizzeria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.PizzeriaImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getPizzeria()
	 * @generated
	 */
	int PIZZERIA = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__ADRESSE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__NOM = 1;

	/**
	 * The feature id for the '<em><b>Date De Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__DATE_DE_CREATION = 2;

	/**
	 * The feature id for the '<em><b>Vehicule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__VEHICULE = 3;

	/**
	 * The feature id for the '<em><b>Employe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__EMPLOYE = 4;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__CLIENT = 5;

	/**
	 * The number of structural features of the '<em>Pizzeria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pizzeria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.VehiculeImpl <em>Vehicule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.VehiculeImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getVehicule()
	 * @generated
	 */
	int VEHICULE = 2;

	/**
	 * The feature id for the '<em><b>Imattriculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULE__IMATTRICULATION = 0;

	/**
	 * The feature id for the '<em><b>Niveau Essence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULE__NIVEAU_ESSENCE = 1;

	/**
	 * The feature id for the '<em><b>Est Fonctionnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULE__EST_FONCTIONNEL = 2;

	/**
	 * The feature id for the '<em><b>Livreur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULE__LIVREUR = 3;

	/**
	 * The number of structural features of the '<em>Vehicule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vehicule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.PizzaioloImpl <em>Pizzaiolo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.PizzaioloImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getPizzaiolo()
	 * @generated
	 */
	int PIZZAIOLO = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZAIOLO__NOM = EMPLOYE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZAIOLO__PRENOM = EMPLOYE__PRENOM;

	/**
	 * The feature id for the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZAIOLO__SALAIRE = EMPLOYE__SALAIRE;

	/**
	 * The feature id for the '<em><b>Date De Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZAIOLO__DATE_DE_NAISSANCE = EMPLOYE__DATE_DE_NAISSANCE;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZAIOLO__MANAGER = EMPLOYE__MANAGER;

	/**
	 * The feature id for the '<em><b>Pizza</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZAIOLO__PIZZA = EMPLOYE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pizzaiolo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZAIOLO_FEATURE_COUNT = EMPLOYE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pizzaiolo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZAIOLO_OPERATION_COUNT = EMPLOYE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.LivreurImpl <em>Livreur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.LivreurImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getLivreur()
	 * @generated
	 */
	int LIVREUR = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVREUR__NOM = EMPLOYE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVREUR__PRENOM = EMPLOYE__PRENOM;

	/**
	 * The feature id for the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVREUR__SALAIRE = EMPLOYE__SALAIRE;

	/**
	 * The feature id for the '<em><b>Date De Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVREUR__DATE_DE_NAISSANCE = EMPLOYE__DATE_DE_NAISSANCE;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVREUR__MANAGER = EMPLOYE__MANAGER;

	/**
	 * The feature id for the '<em><b>Commande</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVREUR__COMMANDE = EMPLOYE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Livreur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVREUR_FEATURE_COUNT = EMPLOYE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Livreur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVREUR_OPERATION_COUNT = EMPLOYE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.ManagerImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NOM = EMPLOYE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__PRENOM = EMPLOYE__PRENOM;

	/**
	 * The feature id for the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SALAIRE = EMPLOYE__SALAIRE;

	/**
	 * The feature id for the '<em><b>Date De Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__DATE_DE_NAISSANCE = EMPLOYE__DATE_DE_NAISSANCE;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__MANAGER = EMPLOYE__MANAGER;

	/**
	 * The feature id for the '<em><b>Employe</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__EMPLOYE = EMPLOYE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = EMPLOYE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = EMPLOYE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.VoitureImpl <em>Voiture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.VoitureImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getVoiture()
	 * @generated
	 */
	int VOITURE = 6;

	/**
	 * The feature id for the '<em><b>Imattriculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__IMATTRICULATION = VEHICULE__IMATTRICULATION;

	/**
	 * The feature id for the '<em><b>Niveau Essence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__NIVEAU_ESSENCE = VEHICULE__NIVEAU_ESSENCE;

	/**
	 * The feature id for the '<em><b>Est Fonctionnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__EST_FONCTIONNEL = VEHICULE__EST_FONCTIONNEL;

	/**
	 * The feature id for the '<em><b>Livreur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__LIVREUR = VEHICULE__LIVREUR;

	/**
	 * The number of structural features of the '<em>Voiture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE_FEATURE_COUNT = VEHICULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Voiture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE_OPERATION_COUNT = VEHICULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.ScooterImpl <em>Scooter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.ScooterImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getScooter()
	 * @generated
	 */
	int SCOOTER = 7;

	/**
	 * The feature id for the '<em><b>Imattriculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOOTER__IMATTRICULATION = VEHICULE__IMATTRICULATION;

	/**
	 * The feature id for the '<em><b>Niveau Essence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOOTER__NIVEAU_ESSENCE = VEHICULE__NIVEAU_ESSENCE;

	/**
	 * The feature id for the '<em><b>Est Fonctionnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOOTER__EST_FONCTIONNEL = VEHICULE__EST_FONCTIONNEL;

	/**
	 * The feature id for the '<em><b>Livreur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOOTER__LIVREUR = VEHICULE__LIVREUR;

	/**
	 * The number of structural features of the '<em>Scooter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOOTER_FEATURE_COUNT = VEHICULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scooter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOOTER_OPERATION_COUNT = VEHICULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.PizzaImpl <em>Pizza</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.PizzaImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getPizza()
	 * @generated
	 */
	int PIZZA = 8;

	/**
	 * The feature id for the '<em><b>Pate Moelleuse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA__PATE_MOELLEUSE = 0;

	/**
	 * The feature id for the '<em><b>Recette</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA__RECETTE = 1;

	/**
	 * The number of structural features of the '<em>Pizza</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pizza</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.RecetteImpl <em>Recette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.RecetteImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getRecette()
	 * @generated
	 */
	int RECETTE = 9;

	/**
	 * The feature id for the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__DUREE = 0;

	/**
	 * The feature id for the '<em><b>Ingredient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__INGREDIENT = 1;

	/**
	 * The number of structural features of the '<em>Recette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Recette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.IngredientImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NOM = 0;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.ClientImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 11;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Numero De Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NUMERO_DE_TELEPHONE = 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ADRESSE = 3;

	/**
	 * The feature id for the '<em><b>Commande</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__COMMANDE = 4;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.CaissierImpl <em>Caissier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.CaissierImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getCaissier()
	 * @generated
	 */
	int CAISSIER = 12;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAISSIER__NOM = EMPLOYE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAISSIER__PRENOM = EMPLOYE__PRENOM;

	/**
	 * The feature id for the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAISSIER__SALAIRE = EMPLOYE__SALAIRE;

	/**
	 * The feature id for the '<em><b>Date De Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAISSIER__DATE_DE_NAISSANCE = EMPLOYE__DATE_DE_NAISSANCE;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAISSIER__MANAGER = EMPLOYE__MANAGER;

	/**
	 * The feature id for the '<em><b>Commande</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAISSIER__COMMANDE = EMPLOYE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Caissier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAISSIER_FEATURE_COUNT = EMPLOYE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Caissier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAISSIER_OPERATION_COUNT = EMPLOYE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pizzeria.impl.CommandeImpl <em>Commande</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pizzeria.impl.CommandeImpl
	 * @see pizzeria.impl.PizzeriaPackageImpl#getCommande()
	 * @generated
	 */
	int COMMANDE = 13;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Montant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__MONTANT = 1;

	/**
	 * The feature id for the '<em><b>Pizza</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__PIZZA = 2;

	/**
	 * The feature id for the '<em><b>Livreur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__LIVREUR = 3;

	/**
	 * The feature id for the '<em><b>Livrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__LIVRABLE = 4;

	/**
	 * The feature id for the '<em><b>Caissier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__CAISSIER = 5;

	/**
	 * The number of structural features of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pizzeria.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe</em>'.
	 * @see pizzeria.Employe
	 * @generated
	 */
	EClass getEmploye();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Employe#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see pizzeria.Employe#getNom()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Nom();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Employe#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see pizzeria.Employe#getPrenom()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Employe#getSalaire <em>Salaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salaire</em>'.
	 * @see pizzeria.Employe#getSalaire()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Salaire();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Employe#getDateDeNaissance <em>Date De Naissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date De Naissance</em>'.
	 * @see pizzeria.Employe#getDateDeNaissance()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_DateDeNaissance();

	/**
	 * Returns the meta object for the reference '{@link pizzeria.Employe#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see pizzeria.Employe#getManager()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Manager();

	/**
	 * Returns the meta object for class '{@link pizzeria.Pizzeria <em>Pizzeria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pizzeria</em>'.
	 * @see pizzeria.Pizzeria
	 * @generated
	 */
	EClass getPizzeria();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Pizzeria#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see pizzeria.Pizzeria#getAdresse()
	 * @see #getPizzeria()
	 * @generated
	 */
	EAttribute getPizzeria_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Pizzeria#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see pizzeria.Pizzeria#getNom()
	 * @see #getPizzeria()
	 * @generated
	 */
	EAttribute getPizzeria_Nom();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Pizzeria#getDateDeCreation <em>Date De Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date De Creation</em>'.
	 * @see pizzeria.Pizzeria#getDateDeCreation()
	 * @see #getPizzeria()
	 * @generated
	 */
	EAttribute getPizzeria_DateDeCreation();

	/**
	 * Returns the meta object for the containment reference list '{@link pizzeria.Pizzeria#getVehicule <em>Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicule</em>'.
	 * @see pizzeria.Pizzeria#getVehicule()
	 * @see #getPizzeria()
	 * @generated
	 */
	EReference getPizzeria_Vehicule();

	/**
	 * Returns the meta object for the containment reference list '{@link pizzeria.Pizzeria#getEmploye <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employe</em>'.
	 * @see pizzeria.Pizzeria#getEmploye()
	 * @see #getPizzeria()
	 * @generated
	 */
	EReference getPizzeria_Employe();

	/**
	 * Returns the meta object for the containment reference list '{@link pizzeria.Pizzeria#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Client</em>'.
	 * @see pizzeria.Pizzeria#getClient()
	 * @see #getPizzeria()
	 * @generated
	 */
	EReference getPizzeria_Client();

	/**
	 * Returns the meta object for class '{@link pizzeria.Vehicule <em>Vehicule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicule</em>'.
	 * @see pizzeria.Vehicule
	 * @generated
	 */
	EClass getVehicule();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Vehicule#getImattriculation <em>Imattriculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imattriculation</em>'.
	 * @see pizzeria.Vehicule#getImattriculation()
	 * @see #getVehicule()
	 * @generated
	 */
	EAttribute getVehicule_Imattriculation();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Vehicule#getNiveauEssence <em>Niveau Essence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau Essence</em>'.
	 * @see pizzeria.Vehicule#getNiveauEssence()
	 * @see #getVehicule()
	 * @generated
	 */
	EAttribute getVehicule_NiveauEssence();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Vehicule#isEstFonctionnel <em>Est Fonctionnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Fonctionnel</em>'.
	 * @see pizzeria.Vehicule#isEstFonctionnel()
	 * @see #getVehicule()
	 * @generated
	 */
	EAttribute getVehicule_EstFonctionnel();

	/**
	 * Returns the meta object for the containment reference '{@link pizzeria.Vehicule#getLivreur <em>Livreur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Livreur</em>'.
	 * @see pizzeria.Vehicule#getLivreur()
	 * @see #getVehicule()
	 * @generated
	 */
	EReference getVehicule_Livreur();

	/**
	 * Returns the meta object for class '{@link pizzeria.Pizzaiolo <em>Pizzaiolo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pizzaiolo</em>'.
	 * @see pizzeria.Pizzaiolo
	 * @generated
	 */
	EClass getPizzaiolo();

	/**
	 * Returns the meta object for the containment reference list '{@link pizzeria.Pizzaiolo#getPizza <em>Pizza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pizza</em>'.
	 * @see pizzeria.Pizzaiolo#getPizza()
	 * @see #getPizzaiolo()
	 * @generated
	 */
	EReference getPizzaiolo_Pizza();

	/**
	 * Returns the meta object for class '{@link pizzeria.Livreur <em>Livreur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livreur</em>'.
	 * @see pizzeria.Livreur
	 * @generated
	 */
	EClass getLivreur();

	/**
	 * Returns the meta object for the reference list '{@link pizzeria.Livreur#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commande</em>'.
	 * @see pizzeria.Livreur#getCommande()
	 * @see #getLivreur()
	 * @generated
	 */
	EReference getLivreur_Commande();

	/**
	 * Returns the meta object for class '{@link pizzeria.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see pizzeria.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the reference list '{@link pizzeria.Manager#getEmploye <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employe</em>'.
	 * @see pizzeria.Manager#getEmploye()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Employe();

	/**
	 * Returns the meta object for class '{@link pizzeria.Voiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voiture</em>'.
	 * @see pizzeria.Voiture
	 * @generated
	 */
	EClass getVoiture();

	/**
	 * Returns the meta object for class '{@link pizzeria.Scooter <em>Scooter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scooter</em>'.
	 * @see pizzeria.Scooter
	 * @generated
	 */
	EClass getScooter();

	/**
	 * Returns the meta object for class '{@link pizzeria.Pizza <em>Pizza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pizza</em>'.
	 * @see pizzeria.Pizza
	 * @generated
	 */
	EClass getPizza();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Pizza#isPateMoelleuse <em>Pate Moelleuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pate Moelleuse</em>'.
	 * @see pizzeria.Pizza#isPateMoelleuse()
	 * @see #getPizza()
	 * @generated
	 */
	EAttribute getPizza_PateMoelleuse();

	/**
	 * Returns the meta object for the containment reference list '{@link pizzeria.Pizza#getRecette <em>Recette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recette</em>'.
	 * @see pizzeria.Pizza#getRecette()
	 * @see #getPizza()
	 * @generated
	 */
	EReference getPizza_Recette();

	/**
	 * Returns the meta object for class '{@link pizzeria.Recette <em>Recette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recette</em>'.
	 * @see pizzeria.Recette
	 * @generated
	 */
	EClass getRecette();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Recette#getDuree <em>Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree</em>'.
	 * @see pizzeria.Recette#getDuree()
	 * @see #getRecette()
	 * @generated
	 */
	EAttribute getRecette_Duree();

	/**
	 * Returns the meta object for the containment reference list '{@link pizzeria.Recette#getIngredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredient</em>'.
	 * @see pizzeria.Recette#getIngredient()
	 * @see #getRecette()
	 * @generated
	 */
	EReference getRecette_Ingredient();

	/**
	 * Returns the meta object for class '{@link pizzeria.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see pizzeria.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Ingredient#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see pizzeria.Ingredient#getNom()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Nom();

	/**
	 * Returns the meta object for class '{@link pizzeria.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see pizzeria.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Client#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see pizzeria.Client#getNom()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Nom();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Client#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see pizzeria.Client#getPrenom()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Client#getNumeroDeTelephone <em>Numero De Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero De Telephone</em>'.
	 * @see pizzeria.Client#getNumeroDeTelephone()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_NumeroDeTelephone();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Client#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see pizzeria.Client#getAdresse()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Adresse();

	/**
	 * Returns the meta object for the containment reference list '{@link pizzeria.Client#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commande</em>'.
	 * @see pizzeria.Client#getCommande()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Commande();

	/**
	 * Returns the meta object for class '{@link pizzeria.Caissier <em>Caissier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caissier</em>'.
	 * @see pizzeria.Caissier
	 * @generated
	 */
	EClass getCaissier();

	/**
	 * Returns the meta object for the reference list '{@link pizzeria.Caissier#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commande</em>'.
	 * @see pizzeria.Caissier#getCommande()
	 * @see #getCaissier()
	 * @generated
	 */
	EReference getCaissier_Commande();

	/**
	 * Returns the meta object for class '{@link pizzeria.Commande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commande</em>'.
	 * @see pizzeria.Commande
	 * @generated
	 */
	EClass getCommande();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Commande#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see pizzeria.Commande#getDate()
	 * @see #getCommande()
	 * @generated
	 */
	EAttribute getCommande_Date();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Commande#getMontant <em>Montant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Montant</em>'.
	 * @see pizzeria.Commande#getMontant()
	 * @see #getCommande()
	 * @generated
	 */
	EAttribute getCommande_Montant();

	/**
	 * Returns the meta object for the reference list '{@link pizzeria.Commande#getPizza <em>Pizza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pizza</em>'.
	 * @see pizzeria.Commande#getPizza()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_Pizza();

	/**
	 * Returns the meta object for the reference '{@link pizzeria.Commande#getLivreur <em>Livreur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Livreur</em>'.
	 * @see pizzeria.Commande#getLivreur()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_Livreur();

	/**
	 * Returns the meta object for the attribute '{@link pizzeria.Commande#isLivrable <em>Livrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Livrable</em>'.
	 * @see pizzeria.Commande#isLivrable()
	 * @see #getCommande()
	 * @generated
	 */
	EAttribute getCommande_Livrable();

	/**
	 * Returns the meta object for the reference '{@link pizzeria.Commande#getCaissier <em>Caissier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caissier</em>'.
	 * @see pizzeria.Commande#getCaissier()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_Caissier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PizzeriaFactory getPizzeriaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pizzeria.impl.EmployeImpl <em>Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.EmployeImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getEmploye()
		 * @generated
		 */
		EClass EMPLOYE = eINSTANCE.getEmploye();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__NOM = eINSTANCE.getEmploye_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__PRENOM = eINSTANCE.getEmploye_Prenom();

		/**
		 * The meta object literal for the '<em><b>Salaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__SALAIRE = eINSTANCE.getEmploye_Salaire();

		/**
		 * The meta object literal for the '<em><b>Date De Naissance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__DATE_DE_NAISSANCE = eINSTANCE.getEmploye_DateDeNaissance();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__MANAGER = eINSTANCE.getEmploye_Manager();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.PizzeriaImpl <em>Pizzeria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.PizzeriaImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getPizzeria()
		 * @generated
		 */
		EClass PIZZERIA = eINSTANCE.getPizzeria();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIZZERIA__ADRESSE = eINSTANCE.getPizzeria_Adresse();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIZZERIA__NOM = eINSTANCE.getPizzeria_Nom();

		/**
		 * The meta object literal for the '<em><b>Date De Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIZZERIA__DATE_DE_CREATION = eINSTANCE.getPizzeria_DateDeCreation();

		/**
		 * The meta object literal for the '<em><b>Vehicule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZERIA__VEHICULE = eINSTANCE.getPizzeria_Vehicule();

		/**
		 * The meta object literal for the '<em><b>Employe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZERIA__EMPLOYE = eINSTANCE.getPizzeria_Employe();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZERIA__CLIENT = eINSTANCE.getPizzeria_Client();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.VehiculeImpl <em>Vehicule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.VehiculeImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getVehicule()
		 * @generated
		 */
		EClass VEHICULE = eINSTANCE.getVehicule();

		/**
		 * The meta object literal for the '<em><b>Imattriculation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULE__IMATTRICULATION = eINSTANCE.getVehicule_Imattriculation();

		/**
		 * The meta object literal for the '<em><b>Niveau Essence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULE__NIVEAU_ESSENCE = eINSTANCE.getVehicule_NiveauEssence();

		/**
		 * The meta object literal for the '<em><b>Est Fonctionnel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULE__EST_FONCTIONNEL = eINSTANCE.getVehicule_EstFonctionnel();

		/**
		 * The meta object literal for the '<em><b>Livreur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICULE__LIVREUR = eINSTANCE.getVehicule_Livreur();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.PizzaioloImpl <em>Pizzaiolo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.PizzaioloImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getPizzaiolo()
		 * @generated
		 */
		EClass PIZZAIOLO = eINSTANCE.getPizzaiolo();

		/**
		 * The meta object literal for the '<em><b>Pizza</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZAIOLO__PIZZA = eINSTANCE.getPizzaiolo_Pizza();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.LivreurImpl <em>Livreur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.LivreurImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getLivreur()
		 * @generated
		 */
		EClass LIVREUR = eINSTANCE.getLivreur();

		/**
		 * The meta object literal for the '<em><b>Commande</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVREUR__COMMANDE = eINSTANCE.getLivreur_Commande();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.ManagerImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Employe</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__EMPLOYE = eINSTANCE.getManager_Employe();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.VoitureImpl <em>Voiture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.VoitureImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getVoiture()
		 * @generated
		 */
		EClass VOITURE = eINSTANCE.getVoiture();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.ScooterImpl <em>Scooter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.ScooterImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getScooter()
		 * @generated
		 */
		EClass SCOOTER = eINSTANCE.getScooter();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.PizzaImpl <em>Pizza</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.PizzaImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getPizza()
		 * @generated
		 */
		EClass PIZZA = eINSTANCE.getPizza();

		/**
		 * The meta object literal for the '<em><b>Pate Moelleuse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIZZA__PATE_MOELLEUSE = eINSTANCE.getPizza_PateMoelleuse();

		/**
		 * The meta object literal for the '<em><b>Recette</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZA__RECETTE = eINSTANCE.getPizza_Recette();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.RecetteImpl <em>Recette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.RecetteImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getRecette()
		 * @generated
		 */
		EClass RECETTE = eINSTANCE.getRecette();

		/**
		 * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECETTE__DUREE = eINSTANCE.getRecette_Duree();

		/**
		 * The meta object literal for the '<em><b>Ingredient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETTE__INGREDIENT = eINSTANCE.getRecette_Ingredient();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.IngredientImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NOM = eINSTANCE.getIngredient_Nom();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.ClientImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NOM = eINSTANCE.getClient_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__PRENOM = eINSTANCE.getClient_Prenom();

		/**
		 * The meta object literal for the '<em><b>Numero De Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NUMERO_DE_TELEPHONE = eINSTANCE.getClient_NumeroDeTelephone();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__ADRESSE = eINSTANCE.getClient_Adresse();

		/**
		 * The meta object literal for the '<em><b>Commande</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__COMMANDE = eINSTANCE.getClient_Commande();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.CaissierImpl <em>Caissier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.CaissierImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getCaissier()
		 * @generated
		 */
		EClass CAISSIER = eINSTANCE.getCaissier();

		/**
		 * The meta object literal for the '<em><b>Commande</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAISSIER__COMMANDE = eINSTANCE.getCaissier_Commande();

		/**
		 * The meta object literal for the '{@link pizzeria.impl.CommandeImpl <em>Commande</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pizzeria.impl.CommandeImpl
		 * @see pizzeria.impl.PizzeriaPackageImpl#getCommande()
		 * @generated
		 */
		EClass COMMANDE = eINSTANCE.getCommande();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMANDE__DATE = eINSTANCE.getCommande_Date();

		/**
		 * The meta object literal for the '<em><b>Montant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMANDE__MONTANT = eINSTANCE.getCommande_Montant();

		/**
		 * The meta object literal for the '<em><b>Pizza</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__PIZZA = eINSTANCE.getCommande_Pizza();

		/**
		 * The meta object literal for the '<em><b>Livreur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__LIVREUR = eINSTANCE.getCommande_Livreur();

		/**
		 * The meta object literal for the '<em><b>Livrable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMANDE__LIVRABLE = eINSTANCE.getCommande_Livrable();

		/**
		 * The meta object literal for the '<em><b>Caissier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__CAISSIER = eINSTANCE.getCommande_Caissier();

	}

} //PizzeriaPackage
