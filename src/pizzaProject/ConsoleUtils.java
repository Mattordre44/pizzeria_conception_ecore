package pizzaProject;

import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import pizzeria.Caissier;
import pizzeria.Commande;
import pizzeria.Employe;
import pizzeria.Ingredient;
import pizzeria.Livreur;
import pizzeria.Pizzaiolo;
import pizzeria.Recette;
import pizzeria.Vehicule;

public class ConsoleUtils {
	
	public static int readNextIntInConsole() {
		return new Scanner(System.in).nextInt();
	}
	
	public static String readNextLineInConsole() {
		return new Scanner(System.in).nextLine();
	}
	
	public static double readNextDoubleInConsole() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static boolean readNextBooleanInConsole() {
		return new Scanner(System.in).nextBoolean();
	}
	
	public static void displayHomeMenuChoices() {
		System.out.println("Bienvenue dans le système de gestion d'une pizzeria");
		System.out.println("1 - créer une nouvelle pizzeria");
		System.out.println("2 - charger une pizzeria");
		System.out.println("3 - quitter l'application");
	}
	
	public static void displayManagingChoices() {
		System.out.println("Que voulez-vous faire ?");
		System.out.println("------------ EMPLOYES ------------");
		System.out.println("11 - Créer un employe");
		System.out.println("12 - Supprimer un employe");
		System.out.println("13 - Afficher les employes");
		System.out.println("------------ VEHICULES ------------");
		System.out.println("21 - Créer un vehicule");
		System.out.println("22 - Supprimer un vehicule");
		System.out.println("23 - Afficher les vehicules");
		System.out.println("------------ COMMANDES ------------");
		System.out.println("31 - Créer une commande");
		System.out.println("32 - Supprimer une commande");
		System.out.println("33 - Afficher les commandes");
		System.out.println("------------ RECETTES ------------");
		System.out.println("41 - Créer une recette");
		System.out.println("42 - Supprimer une recette");
		System.out.println("43 - Afficher les recettes");
		System.out.println("------------ INGREDIENTS ------------");
		System.out.println("51 - Créer un ingrédient");
		System.out.println("52 - Supprimer un ingrédient");
		System.out.println("53 - Afficher les ingrédients");
		System.out.println("0 - Quitter l'application");
	}
	
	public static void displayChoicesCreateEmployees() {
		System.out.println("\nQuel type d'employé voulez-vous créer ?");
		System.out.println("1 - manager");
		System.out.println("2 - pizzaiolo");
		System.out.println("3 - caissier");
		System.out.println("4 - livreur (par défaut)");
	}
	
	public static void displayEmployees(EList<Employe> employees) {
		System.out.println("\nIl y a " + employees.size() + " employés :");
		int index = 1;
		for(Employe employe: employees) {
			System.out.println(index + ") " + employe.getPrenom() + " " + employe.getNom() + " : " + employe.getSalaire() + " € -> " + PizzeriaService.getEmployeJob(employe));
			index ++;
		}
		System.out.print("\n");
	}
	
	public static void displayLivreurs(List<Livreur> livreurs) {
		System.out.println("\nIl y a " + livreurs.size() + " livreurs :");
		int index = 1;
		for(Employe livreur: livreurs) {
			System.out.println(index + ") " + livreur.getPrenom() + " " + livreur.getNom() + " : " + livreur.getSalaire() + " € -> " + "livreur");
			index ++;
		}
		System.out.print("\n");
	}
	
	public static void displayCaissiers(List<Caissier> caissiers) {
		System.out.println("\nIl y a " + caissiers.size() + " caissiers :");
		int index = 1;
		for(Employe caissier: caissiers) {
			System.out.println(index + ") " + caissier.getPrenom() + " " + caissier.getNom() + " : " + caissier.getSalaire() + " € -> " + "caissier");
			index ++;
		}
		System.out.print("\n");
	}
	
	public static void displayChoicesCreateVehicules() {
		System.out.println("\nQuel type de véhicule voulez-vous créer ?");
		System.out.println("1 - voiture");
		System.out.println("2 - scooter (par défaut)");
	}
	
	public static void displayVehicules(EList<Vehicule> vehicules) {
		System.out.println("\nIl y a " + vehicules.size() + " véhicules :");
		int index = 1;
		for(Vehicule vehicule: vehicules) {
			System.out.println(index + ") " + vehicule.getNiveauEssence() + "L " + vehicule.getImattriculation() + " est fonctionnel : " + vehicule.isEstFonctionnel() + " -> " + PizzeriaService.getVehiculeType(vehicule));
			index ++;
		}
		System.out.print("\n");
	}
	
	public static void displayCommandes(EList<Commande> commandes) {
		System.out.println("\nIl y a " + commandes.size() + " commandes :");
		int index = 1;
		for(Commande commande: commandes) {
			System.out.println(index + ") " + commande.getMontant() + " €, " + commande.getPizza().size() + " pizza / client : " + commande.getClient().getPrenom() + " " + commande.getClient().getNom());
			index ++;
		}
		System.out.print("\n");
	}
	
	public static void displayRecettes(EList<Recette> recettes) {
		System.out.println("\nIl y a " + recettes.size() + " recettes :");
		int index = 1;
		for(Recette recette: recettes) {
			System.out.println(index + ") " + recette.getDuree() + " min avec " + recette.getIngredient().size() + " ingrédients");
			index ++;
		}
		System.out.print("\n");
	}
	
	public static void displayIngredients(EList<Ingredient> ingredients) {
		System.out.println("\nIl y a " + ingredients.size() + " ingredients :");
		int index = 1;
		for(Ingredient ingredient: ingredients) {
			System.out.println(index + ") " + ingredient.getNom());
			index ++;
		}
		System.out.print("\n");
	}

	public static void displayPizzaiolos(List<Pizzaiolo> pizzaiolos) {
		System.out.println("\nIl y a " + pizzaiolos.size() + " pizzaiolos :");
		int index = 1;
		for(Employe pizzaiolo: pizzaiolos) {
			System.out.println(index + ") " + pizzaiolo.getPrenom() + " " + pizzaiolo.getNom() + " : " + pizzaiolo.getSalaire() + " €");
			index ++;
		}
		System.out.print("\n");
	}
}
