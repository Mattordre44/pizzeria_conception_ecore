package pizzaProject;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;

import org.eclipse.emf.ecore.resource.Resource;

import pizzeria.Ingredient;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaFactory;

public class Main {
	
	public static void setUpPizzeriaIngredients(Pizzeria pizzeriaModel) {
		Ingredient jambon = PizzeriaFactory.eINSTANCE.createIngredient();
		jambon.setNom("jambon");
		pizzeriaModel.getIngredient().add(jambon);
		Ingredient sauceTomate = PizzeriaFactory.eINSTANCE.createIngredient();
		sauceTomate.setNom("sauceTomate");
		pizzeriaModel.getIngredient().add(sauceTomate);
		Ingredient mozzarella = PizzeriaFactory.eINSTANCE.createIngredient();
		mozzarella.setNom("mozzarella");
		pizzeriaModel.getIngredient().add(mozzarella);
		Ingredient roquette = PizzeriaFactory.eINSTANCE.createIngredient();
		roquette.setNom("roquette");
		pizzeriaModel.getIngredient().add(roquette);
		Ingredient gorgonzola = PizzeriaFactory.eINSTANCE.createIngredient();
		gorgonzola.setNom("gorgonzola");
		pizzeriaModel.getIngredient().add(gorgonzola);
	}
	
	public static void managePizzeria(Pizzeria pizzeriaModel) {
		PizzeriaService pizzeriaService = new PizzeriaService(pizzeriaModel);
		boolean close = false;
		while(!close) {
			ConsoleUtils.displayManagingChoices();
			switch(ConsoleUtils.readNextIntInConsole()) {
			case 11:
				pizzeriaService.createEmploye();
				break;
			case 12:
				pizzeriaService.deleteEmploye();
				break;
			case 13: 
				pizzeriaService.listEmployees();
				break;
			case 21:
				pizzeriaService.createVehicule();
				break;
			case 22:
				pizzeriaService.deleteVehicule();
				break;
			case 23: 
				pizzeriaService.listVehicules();
				break;
			case 31:
				pizzeriaService.createCommande();
				break;
			case 32:
				pizzeriaService.deleteCommande();
				break;
			case 33: 
				pizzeriaService.listCommandes();
				break;
			case 41:
				pizzeriaService.createRecette();
				break;
			case 42:
				pizzeriaService.deleteRecette();
				break;
			case 43: 
				pizzeriaService.listRecettes();
				break;		
			case 0:
				System.out.println("\nFermeture de l'application");
				close = true;
				break;	
			}
		}
	}
	
	public static void main(String[] args) {
		ResourceSetService resourceSetService = new ResourceSetService();
		ConsoleUtils.displayHomeMenuChoices();
		switch(ConsoleUtils.readNextIntInConsole()) {
			case 1: 
				System.out.println("\nCréation d'une pizzeria");
				Pizzeria newPizzeriaModel = PizzeriaFactory.eINSTANCE.createPizzeria();
				System.out.print("\nQuel nom pour votre pizzeria : ");
				newPizzeriaModel.setNom(ConsoleUtils.readNextLineInConsole());
				newPizzeriaModel.setDateDeCreation(new Date());
				System.out.print("\nA quelle adresse se situe votre pizzeria : ");
				newPizzeriaModel.setAdresse(ConsoleUtils.readNextLineInConsole());
				setUpPizzeriaIngredients(newPizzeriaModel);
				managePizzeria(newPizzeriaModel);
				resourceSetService.saveResourceInXmiFile(newPizzeriaModel);
				break;
			case 2: 
				System.out.println("\nChargement d'une pizzeria\n");
				Resource resourceSet = resourceSetService.getResourceOfXmiFile();
				Pizzeria pizzeriaModel = (Pizzeria)(resourceSet.getContents().get(0));
				managePizzeria(pizzeriaModel);
				try {
					resourceSet.save(Collections.EMPTY_MAP);
				} catch(IOException e) {
					System.out.println("erreur durant la sauvegarde du modèle : " + e.getMessage());
				}
				break;
			case 3: 
				System.out.println("quitter");
				System.exit(0);
				break;
				
		}		
	}
}
	

