public class Light {
	boolean etat = false; // La lampe est éteinte
	int AdjustBrightness =0; // Par défaut l'intensité de la lampe est de 0 ce qui signifie que la lampe est éteinte
	
	public void Light_on() {
		//Méthode pour allumer la lampe
		etat = true;
		System.out.println("La lampe est allumée");
	}
	
	public void Light_off() {
	    //Méthode pour éteindre la lumière
	    etat = false;
	    System.out.println("La lampe est éteinte");
	}
	
	public void AdjustBrightness(int brightness) {
		//Méthode pour régler l'intensité de la lampe
		if (brightness >= 1 && brightness <= 10) {
			AdjustBrightness = brightness;
			System.out.println("L'intensité de la lumière de la lampe est maintenant: " + AdjustBrightness);
		} else {
			System.out.println("L'intensité donnée est invalide. Elle doit être entre 1 et 10.");
		}
	}
	
	public int getBrightness() {
		// Méthode pour récupérer l'intensité de la lampe maintenant
		return this.AdjustBrightness;
	}
}
