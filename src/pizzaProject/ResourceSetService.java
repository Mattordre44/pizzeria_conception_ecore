package pizzaProject;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pizzeria.Pizzeria;
import pizzeria.PizzeriaPackage;

public class ResourceSetService {
	
	private ResourceSet resourceSet;
	
	public ResourceSetService() {
		// Création d'un ResourceSet
		this.resourceSet = new ResourceSetImpl();
		
		// Mapping entre l'extension du fichier du modèle et le format de sérialisation (xmi)
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    	"xmi",
		    new XMIResourceFactoryImpl()
		);
		
		// Enregistrement de notre métamodèle dans la liste des métamodèles connus : Pizzeria
		resourceSet.getPackageRegistry().put(
		    PizzeriaPackage.eNS_URI,
		    PizzeriaPackage.eINSTANCE
		);
	}
	
	public void saveResourceInXmiFile(Pizzeria pizzeriaModel) {
		Resource resource = resourceSet.createResource(URI.createFileURI("modele.xmi"));
		resource.getContents().add(pizzeriaModel);
	
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch(IOException e) {
			System.out.println("erreur durant la sauvegarde du modèle : " + e.getMessage());
		}
	}
	
	public Resource getResourceOfXmiFile() {
		return resourceSet.getResource(URI.createFileURI("modele.xmi"), false);
	}
}
