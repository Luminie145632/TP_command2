
public class TestLightControl {
	public static void main(String[] args) {
        // Ajout d'une lampe
		LightControlPanel.add_light();
        
        // Vérification si la lampe a bien été ajoutée
        if (LightControlPanel.lights.size() != 1) {
            System.out.println("Erreur : une lumière aurait dû être ajoutée");
        }
        
        // Allumage de la lampe
        Light light = LightControlPanel.lights.get(0);
        light.Light_on();
        
        // Vérification de si la lampe est bien allumée
        if (!light.etat) {
            System.out.println("Erreur : la lumière aurait dû être allumée");
        }
        
        // Réglage de l'intensité de la lampe
        light.AdjustBrightness(5);
        
        // Vérification de l'intensité de la lampe
        if (light.getBrightness() != 5) {
            System.out.println("Erreur : l'intensité de la lumière aurait dû être réglée à 5");
        }
        
        // La lampe est éteinte
        light.Light_off();
        
        // Vérification de si la lampe est bien éteinte
        if (light.etat) {
            System.out.println("Erreur : la lumière aurait dû être éteinte");
        }
    }

}
