import java.util.ArrayList;

public abstract class TurnOnLightCommand implements Command {
	private ArrayList<Light> lights;
	
	// Constructeur qui contient la liste des lampes en paramètres
	public TurnOnLightCommand(ArrayList<Light> Lights) {
		this.lights = Lights; // Utilisez le paramètre ici
	} 

	@Override
	public void execute() {
		// Méthode pour chaque lampe de la liste
		for (Light light : this.lights) {
			light.Light_on();
		}

	}
	
	@Override
	public void undo() {
		// Méthode pour annuler l'action qui vient de se produire et revenir à l'action précédente
			for (Light light : this.lights) {
				light.Light_off();
			}
	}
}
