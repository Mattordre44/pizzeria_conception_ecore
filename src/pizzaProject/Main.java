package pizzaProject;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pizzeria.Pizzeria;
import pizzeria.PizzeriaPackage;
import pizzeria.PizzeriaFactory;


public class Main {
	public static void main(String[] args) {
		ResourceSet rs = getResourceSet();
		
		Resource resource = rs.createResource(URI.createFileURI("modele.xmi"));
				
		Pizzeria racineModele = PizzeriaFactory.eINSTANCE.createPizzeria();
		racineModele.setNom("A casa di Vito : Pizza & co");
		racineModele.setDateDeCreation(new Date());
		racineModele.setAdresse("22 via de la mozzarella, NAPOLI");

		try {
		    resource.save(Collections.EMPTY_MAP);
		}
		catch (IOException e) {
		    System.out.println("erreur durant la sauvegarde du modèle : " + e.getMessage());
		}
		
	}
	
	private static ResourceSet getResourceSet() {
		// Création d'un ResourceSet
		ResourceSet rs = new ResourceSetImpl();

		// Mapping entre l'extension du fichier du modèle et le format de sérialisation (xmi)
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    "xmi",
		    new XMIResourceFactoryImpl()
		);
		// Enregistrement de notre métamodèle dans la liste des métamodèles connus
		rs.getPackageRegistry().put(
		    PizzeriaPackage.eNS_URI,
		    PizzeriaPackage.eINSTANCE
		);
		return rs;
	}

}
	

