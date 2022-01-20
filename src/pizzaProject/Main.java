package pizzaProject;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pizzeria.Caissier;
import pizzeria.Client;
import pizzeria.Commande;
import pizzeria.Ingredient;
import pizzeria.Livreur;
import pizzeria.Manager;
import pizzeria.Pizza;
import pizzeria.Pizzaiolo;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaFactory;
import pizzeria.PizzeriaPackage;
import pizzeria.Recette;
import pizzeria.Scooter;
import pizzeria.Voiture;

public class Main {
	
	public static int readNextIntInConsole() {
		return new Scanner(System.in).nextInt();
	}
	
	public static String readNextLineInConsole() {
		return new Scanner(System.in).nextLine();
	}
	
	public static void main(String[] args) {
		
		ResourceSetService resourceSetService = new ResourceSetService();
		
		ConsoleUtils.displayHomeMenuChoices();
		switch(readNextIntInConsole()) {
			case 1: 
				System.out.println("Cr�ation d'une pizzeria");
				Pizzeria newPizzeriaModel = PizzeriaFactory.eINSTANCE.createPizzeria();
				System.out.print("Quel nom pour votre pizzeria : ");
				newPizzeriaModel.setNom(readNextLineInConsole());
				newPizzeriaModel.setDateDeCreation(new Date());
				System.out.print("A quelle adresse se situe votre pizzeria : ");
				newPizzeriaModel.setAdresse(readNextLineInConsole());
				resourceSetService.saveResourceInXmiFile(newPizzeriaModel);
				break;
			case 2: 
				System.out.println("Chargement d'une pizzeria");
				Resource resourceSet = resourceSetService.getResourceOfXmiFile();
				Pizzeria pizzeriaModel = (Pizzeria) resourceSet.getContents().get(0);
				
				break;
			case 3: 
				System.out.println("quitter");
				System.exit(0);
				break;
				
		}		
		
		/*ResourceSet rs = getResourceSet();
		
		Resource resource = rs.createResource(URI.createFileURI("modele.xmi"));
				
		Pizzeria racineModele = PizzeriaFactory.eINSTANCE.createPizzeria();
		racineModele.setNom("A casa di Vito : Pizza & co");
		racineModele.setDateDeCreation(new Date());
		racineModele.setAdresse("22 via de la mozzarella, NAPOLI");
		
		Voiture voiture = PizzeriaFactory.eINSTANCE.createVoiture();
		voiture.setEstFonctionnel(true);
		voiture.setImattriculation("123-ABC-456");
		voiture.setNiveauEssence(32.0);
		
		Scooter scooter = PizzeriaFactory.eINSTANCE.createScooter();
		scooter.setEstFonctionnel(true);
		scooter.setImattriculation("456-CBA-789");
		scooter.setNiveauEssence(12.0);
		
		Manager manager = PizzeriaFactory.eINSTANCE.createManager();
		manager.setNom("Vito");
		manager.setPrenom("Mario");
		manager.setDateDeNaissance(new Date());
		manager.setSalaire(5000.0);
		
		Pizzaiolo pizzaiolo = PizzeriaFactory.eINSTANCE.createPizzaiolo();
		pizzaiolo.setManager(manager);
		pizzaiolo.setNom("Carpio");
		pizzaiolo.setPrenom("Julio");
		pizzaiolo.setSalaire(1300.0);
		pizzaiolo.setDateDeNaissance(new Date());	
		
		
		Caissier caissier = PizzeriaFactory.eINSTANCE.createCaissier();
		caissier.setPrenom("Gabin");
		caissier.setNom("Raapoto");
		caissier.setDateDeNaissance(new Date());
		caissier.setSalaire(1350.0);
		caissier.setManager(manager);
		
		Livreur livreur = PizzeriaFactory.eINSTANCE.createLivreur();
		livreur.setPrenom("Antonin");
		livreur.setNom("Maystre");
		livreur.setDateDeNaissance(new Date());
		livreur.setManager(manager);
		livreur.setSalaire(1400.0);
		voiture.setLivreur(livreur);
		
		Client client = PizzeriaFactory.eINSTANCE.createClient();
		client.setPrenom("Matteo");
		client.setNom("Ordrenneau");
		client.setAdresse("4 rue du calvaire");
		client.setNumeroDeTelephone("06.65.35.13.01");
		
		Ingredient sauceTomate = PizzeriaFactory.eINSTANCE.createIngredient();
		sauceTomate.setNom("sauce Tomate");
		
		Ingredient mozzarella = PizzeriaFactory.eINSTANCE.createIngredient();
		mozzarella.setNom("mozzarella");
		
		Ingredient roquette = PizzeriaFactory.eINSTANCE.createIngredient();
		roquette.setNom("roquette");
		
		Ingredient jambon = PizzeriaFactory.eINSTANCE.createIngredient();
		jambon.setNom("jambon");
		
		Ingredient gorgonzola = PizzeriaFactory.eINSTANCE.createIngredient();
		gorgonzola.setNom("gorgonzola");
		
		Recette recette1 = PizzeriaFactory.eINSTANCE.createRecette();	
		recette1.setDuree("12 min");
		recette1.getIngredient().add(sauceTomate);
		recette1.getIngredient().add(roquette);
		recette1.getIngredient().add(mozzarella);
		
		Recette recette2 = PizzeriaFactory.eINSTANCE.createRecette();
		recette1.setDuree("11 min");
		recette2.getIngredient().add(sauceTomate);
		recette2.getIngredient().add(jambon);
		recette2.getIngredient().add(gorgonzola);
		
		Recette recette3 = PizzeriaFactory.eINSTANCE.createRecette();
		recette1.setDuree("2 min");
		recette3.getIngredient().add(jambon);
		
		Pizza pizza1 = PizzeriaFactory.eINSTANCE.createPizza();
		pizza1.setPateMoelleuse(false);
		pizza1.getRecette().add(recette1);
		pizza1.getRecette().add(recette3);
		pizzaiolo.getPizza().add(pizza1);

		Pizza pizza2 = PizzeriaFactory.eINSTANCE.createPizza();
		pizza2.setPateMoelleuse(true);
		pizza2.getRecette().add(recette2);
		pizzaiolo.getPizza().add(pizza2);
		
		Commande commande = PizzeriaFactory.eINSTANCE.createCommande();
		commande.setDate(new Date());
		commande.setLivrable(true);
		commande.setMontant(15.00);
		commande.getPizza().add(pizza1);
		commande.setLivreur(livreur);
		
		client.getCommande().add(commande);
				
		racineModele.getVehicule().add(voiture);
		racineModele.getVehicule().add(scooter);
		racineModele.getEmploye().add(pizzaiolo);
		racineModele.getEmploye().add(manager);
		racineModele.getEmploye().add(caissier);
		racineModele.getClient().add(client);

		
		resource.getContents().add(racineModele);

		try {
		    resource.save(Collections.EMPTY_MAP);
		}
		catch (IOException e) {
		    System.out.println("erreur durant la sauvegarde du mod�le : " + e.getMessage());
		}
		
	}
	
	private static ResourceSet getResourceSet() {
		// Cr�ation d'un ResourceSet
		ResourceSet rs = new ResourceSetImpl();

		// Mapping entre l'extension du fichier du mod�le et le format de s�rialisation (xmi)
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    "xmi",
		    new XMIResourceFactoryImpl()
		);
		// Enregistrement de notre m�tamod�le dans la liste des m�tamod�les connus
		rs.getPackageRegistry().put(
		    PizzeriaPackage.eNS_URI,
		    PizzeriaPackage.eINSTANCE
		);
		return rs;*/
	}

}
	

