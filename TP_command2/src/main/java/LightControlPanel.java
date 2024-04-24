
import java.util.ArrayList;

@SuppressWarnings("unused")
public class LightControlPanel {
	static ArrayList<Light> lights = new ArrayList<>();
	static String add_light = "Une lampe a été ajoutée";
	static String remove_light = "Une lampe a été supprimée";
	static String manip_light = "L'état de la lampe a été modifié";
	
	public static void add_light() {
		//Méthode pour ajouter d'une lampe dans la liste Lights
		lights.add(new Light());
		System.out.println("Une lampe a été ajoutée");
	}
	
	public static void remove_light() {
		//Méthode pour supprimer une lampe dans la liste Lights
		if (!lights.isEmpty()) {
			lights.remove(lights.size() - 1);
			System.out.println("Une lampe a été supprimée");
		} else {
			System.out.println("Il n'y a pas de lampe à supprimer");
		}
	}
	
	public static void manip_light(int index) {
	    // Méthode pour changer l'état d'une seule lampe dans la liste Lights
	    if (index >= 0 && index < lights.size()) {
	        Light light = lights.get(index);
	        if (light.etat) {
	            light.Light_off();
	        } else {
	            light.Light_on();
	        }
	        System.out.println("L'état de la lampe " + (index + 1) + " a été modifié");
	    } else {
	        System.out.println("L'index donné est invalide");
	    }
	}

}
