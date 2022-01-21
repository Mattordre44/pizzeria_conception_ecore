package pizzaProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import pizzeria.Caissier;
import pizzeria.Client;
import pizzeria.Commande;
import pizzeria.Employe;
import pizzeria.Ingredient;
import pizzeria.Livreur;
import pizzeria.Manager;
import pizzeria.Pizza;
import pizzeria.Pizzaiolo;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaFactory;
import pizzeria.Recette;
import pizzeria.Vehicule;
import pizzeria.Voiture;

public class PizzeriaService {
	
	private Pizzeria pizzeriaModel;
	
	public PizzeriaService(Pizzeria pizzeriaModel) {
		this.pizzeriaModel = pizzeriaModel;
	}
	
	public static String getEmployeJob(Employe employe) {
		if(employe instanceof Manager) {
			return "manager";
		} else if(employe instanceof Pizzaiolo) {
			return "pizzaiolo";
		} else if(employe instanceof Caissier) {
			return "caissier";
		} else {
			return "livreur";
		}
	}
	
	public static String getVehiculeType(Vehicule vehicule) {
		if(vehicule instanceof Voiture) {
			return "voiture";
		} else {
			return "scooter";
		}
	}

	public void createEmploye() {
		Employe employe;
		ConsoleUtils.displayChoicesCreateEmployees();
		switch(ConsoleUtils.readNextIntInConsole()) {
			case 1:
				employe = PizzeriaFactory.eINSTANCE.createManager();
				generalEmployeInformation(employe);
				break;
			case 2:
				employe = PizzeriaFactory.eINSTANCE.createPizzaiolo();
				generalEmployeInformation(employe);
				break;
			case 3:
				employe = PizzeriaFactory.eINSTANCE.createCaissier();
				generalEmployeInformation(employe);
				break;
			default:
				employe = PizzeriaFactory.eINSTANCE.createLivreur();
				generalEmployeInformation(employe);
				break;
		}
		
		pizzeriaModel.getEmploye().add(employe);
		System.out.println("\nEmployé ajouté !\n");
	}
	
	public void generalEmployeInformation(Employe employe) {
		System.out.print("\nQuel nom pour votre employe : ");
		employe.setNom(ConsoleUtils.readNextLineInConsole());
		System.out.print("\nQuel prénom pour votre employe : ");
		employe.setPrenom(ConsoleUtils.readNextLineInConsole());
		System.out.print("\nQuel est la date de naissance de votre employe (MM/DD/YYYY) : ");
		employe.setDateDeNaissance(new Date(Date.parse(ConsoleUtils.readNextLineInConsole())));
		System.out.print("\nQuel est le salaire de votre employe : ");
		employe.setSalaire(ConsoleUtils.readNextDoubleInConsole());
		
		if(pizzeriaModel.getEmploye().size() != 0) {
			System.out.println("\nL'employe a t-il un manager (0 si non) ? : ");
			ConsoleUtils.displayEmployees(pizzeriaModel.getEmploye());
			int manager = ConsoleUtils.readNextIntInConsole();
			if(manager != 0) {
				employe.setManager((Manager) pizzeriaModel.getEmploye().get(manager - 1));
			}
		}
	}
	
	public void deleteEmploye() {
		if(pizzeriaModel.getEmploye().size() != 0) {
			System.out.println("\nQuel employé voulez-vous supprimer ?");
			ConsoleUtils.displayEmployees(pizzeriaModel.getEmploye());
			pizzeriaModel.getEmploye().remove(ConsoleUtils.readNextIntInConsole() - 1);
			System.out.println("\nEmployé supprimé\n");
		} else {
			System.out.println("\nIl n'y a aucun employés\n");
		}
	}
	
	public void listEmployees() {
		ConsoleUtils.displayEmployees(pizzeriaModel.getEmploye());
	}
	
	public void createVehicule() {
		Vehicule vehicule;
		ConsoleUtils.displayChoicesCreateVehicules();
		switch(ConsoleUtils.readNextIntInConsole()) {
			case 1:
				vehicule = PizzeriaFactory.eINSTANCE.createVoiture();
				break;
			default:
				vehicule = PizzeriaFactory.eINSTANCE.createScooter();
				break;
		}
		System.out.print("\nQuel immatriculation pour votre véhicule : ");
		vehicule.setImattriculation(ConsoleUtils.readNextLineInConsole());
		System.out.print("\nQuel est le niveau de carburant : ");
		vehicule.setNiveauEssence(ConsoleUtils.readNextDoubleInConsole());
		System.out.print("\nLe véhicule est-il fonctionnel (true / false) : ");
		vehicule.setEstFonctionnel(ConsoleUtils.readNextBooleanInConsole());
		if(pizzeriaModel.getVehicule().size() != 0) {
			System.out.println("\nLe véhicule est-il associé à un livreur (0 si non) ? : ");
			ConsoleUtils.displayVehicules(pizzeriaModel.getVehicule());
			int livreur = ConsoleUtils.readNextIntInConsole();
			if(livreur != 0) {
				vehicule.getLivreur().add((Livreur) pizzeriaModel.getEmploye().get(livreur - 1));
			}
		}
		pizzeriaModel.getVehicule().add(vehicule);
		System.out.println("\nVéhicule ajouté !\n");
	}
	
	public void deleteVehicule() {
		if(pizzeriaModel.getVehicule().size() != 0) {
			System.out.println("\nQuel véhicule voulez-vous supprimer ?");
			ConsoleUtils.displayVehicules(pizzeriaModel.getVehicule());
			pizzeriaModel.getVehicule().remove(ConsoleUtils.readNextIntInConsole() - 1);
			System.out.println("\nVéhicule supprimé\n");
		} else {
			System.out.println("\nIl n'y a aucun véhicules\n");
		}
	}
	
	public void listVehicules() {
		ConsoleUtils.displayVehicules(pizzeriaModel.getVehicule());
	}
	
	public void createCommande() {
		Commande commande = PizzeriaFactory.eINSTANCE.createCommande();
		Client client = PizzeriaFactory.eINSTANCE.createClient();
		
		System.out.print("\nQuel est le prénom du client : ");
		client.setPrenom(ConsoleUtils.readNextLineInConsole());
		System.out.print("\nQuel est le nom du client : ");
		client.setNom(ConsoleUtils.readNextLineInConsole());
		System.out.print("\nQuel est l'adresse du client : ");
		client.setAdresse(ConsoleUtils.readNextLineInConsole());
		System.out.print("\nQuel est le numéro de téléphone du client : ");
		client.setNumeroDeTelephone(ConsoleUtils.readNextLineInConsole());
		commande.setClient(client);
		commande.setDate(new Date());
		System.out.print("\nSur place ou à emporter (true) : ");
		commande.setLivrable(ConsoleUtils.readNextBooleanInConsole());
		
		if(commande.isLivrable()) {
			List<Livreur> livreurs = getLivreurs(pizzeriaModel);
		
			if(livreurs.size() != 0) {
				System.out.println("\nQuel livreur assigner à la commande : ");
				ConsoleUtils.displayLivreurs(livreurs);
				commande.setLivreur((Livreur) livreurs.get(ConsoleUtils.readNextIntInConsole()-1));
			}
		} else {
			List<Caissier> caissiers = getCaissiers(pizzeriaModel);
			
			if(caissiers.size() != 0) {
				System.out.println("\nQuel caissier assigner à la commande : ");
				ConsoleUtils.displayCaissiers(caissiers);
				commande.setCaissier((Caissier) caissiers.get(ConsoleUtils.readNextIntInConsole()-1));
			}
		}
		
		boolean add = true;
		while(add) {
			System.out.println("1) ajouter pizza");
			System.out.println("2) fin de la commande");
			switch(ConsoleUtils.readNextIntInConsole()) {
				case 1:
					Pizza pizza = PizzeriaFactory.eINSTANCE.createPizza();
					System.out.println("\n Assigner la recette : ");
					ConsoleUtils.displayRecettes(pizzeriaModel.getRecette());
					pizza.setRecette(pizzeriaModel.getRecette().get(ConsoleUtils.readNextIntInConsole()-1));
					
					List<Pizzaiolo> pizzaiolos = getPizzaiolos(pizzeriaModel);
					ConsoleUtils.displayPizzaiolos(pizzaiolos);
					
					if(pizzaiolos.size() != 0) {
						System.out.println("\nQuel pizzaiolo assigner à la commande : ");
						ConsoleUtils.displayPizzaiolos(pizzaiolos);
						pizzaiolos.get(ConsoleUtils.readNextIntInConsole()-1).getPizza().add(pizza);
					}
					
					commande.getPizza().add(pizza);
					break;
				default:
					add = false;
					break;
			}
		}
		pizzeriaModel.getCommande().add(commande);
	}
	
	public void deleteCommande() {
		if(pizzeriaModel.getCommande().size() != 0) {
			System.out.println("\nQuel commande voulez-vous supprimer ?");
			ConsoleUtils.displayCommandes(pizzeriaModel.getCommande());
			pizzeriaModel.getCommande().remove(ConsoleUtils.readNextIntInConsole() - 1);
			System.out.println("\nCommande supprimée\n");
		} else {
			System.out.println("\nIl n'y a aucunes commandes\n");
		}
	}
	
	public void listCommandes() {
		ConsoleUtils.displayCommandes(pizzeriaModel.getCommande());
	}
	
	public void createRecette() {
		Recette recette = PizzeriaFactory.eINSTANCE.createRecette();
		System.out.print("\nQuelle est la durée de préparation : \n");
		recette.setDuree(ConsoleUtils.readNextLineInConsole());
		boolean add = true;
		while(add) {
			System.out.println("1) ajouter ingredient");
			System.out.println("2) fin de la recette");
			switch(ConsoleUtils.readNextIntInConsole()) {
				case 1:
					ConsoleUtils.displayIngredients(pizzeriaModel.getIngredient());
					Ingredient selectedIngredient = pizzeriaModel.getIngredient().get(ConsoleUtils.readNextIntInConsole()-1);
					recette.getIngredient().add(selectedIngredient);
					break;
				default:
					add = false;
					break;
			}
		}
		pizzeriaModel.getRecette().add(recette);
	}
	
	public void deleteRecette() {
		if(pizzeriaModel.getRecette().size() != 0) {
			System.out.println("\nQuel recette voulez-vous supprimer ?");
			ConsoleUtils.displayRecettes(pizzeriaModel.getRecette());
			pizzeriaModel.getRecette().remove(ConsoleUtils.readNextIntInConsole() - 1);
			System.out.println("\nRecette supprimée\n");
		} else {
			System.out.println("\nIl n'y a aucunes recettes\n");
		}
	}
	
	public void createIngredient() {
		Ingredient ingredient = PizzeriaFactory.eINSTANCE.createIngredient();
		System.out.print("\nQuelle est le nom de l'ingrédient : ");
		ingredient.setNom(ConsoleUtils.readNextLineInConsole());
		pizzeriaModel.getIngredient().add(ingredient);
	}
	
	public void listRecettes() {
		ConsoleUtils.displayRecettes(pizzeriaModel.getRecette());
	}
	
	public void deleteIngredient() {
		if(pizzeriaModel.getIngredient().size() != 0) {
			System.out.println("\nQuel ingrédient voulez-vous supprimer ?");
			ConsoleUtils.displayIngredients(pizzeriaModel.getIngredient());
			pizzeriaModel.getIngredient().remove(ConsoleUtils.readNextIntInConsole() - 1);
			System.out.println("\nIngrédient supprimée\n");
		} else {
			System.out.println("\nIl n'y a aucuns ingrédients\n");
		}
	}
	
	public void listIngredients() {
		ConsoleUtils.displayIngredients(pizzeriaModel.getIngredient());
	}
	
	
	public List<Livreur> getLivreurs(Pizzeria pizzeriaModel) {
		List<Livreur> livreurs = new ArrayList<>();
		for(Employe employe: pizzeriaModel.getEmploye()) {
			if(employe instanceof Livreur) {
				livreurs.add((Livreur) employe);
			}
		}
		return livreurs;
	}
	
	public List<Caissier> getCaissiers(Pizzeria pizzeriaModel) {
		List<Caissier> caissiers = new ArrayList<>();
		for(Employe employe: pizzeriaModel.getEmploye()) {
			if(employe instanceof Caissier) {
				caissiers.add((Caissier) employe);
			}
		}
		return caissiers;
	}
	
	public List<Pizzaiolo> getPizzaiolos(Pizzeria pizzeriaModel) {
		List<Pizzaiolo> pizzaiolos = new ArrayList<>();
		for(Employe employe: pizzeriaModel.getEmploye()) {
			if(employe instanceof Pizzaiolo) {
				pizzaiolos.add((Pizzaiolo) employe);
			}
		}
		return pizzaiolos;
	}
}