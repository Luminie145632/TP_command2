import java.util.ArrayList;

public abstract class TurnOffLightCommand implements Command{
	private ArrayList<Light> lights;
	
	// Constructeur qui contient la liste des lampes en paramètres
	public TurnOffLightCommand(ArrayList<Light> Lights) {
		this.lights = Lights; 
	}

	@Override
	public void execute() {
		// Méthode qui éteint toute les lampes après sont exécution
		for (Light light : this.lights) {
			light.Light_off();
		}
	}
	
	@Override
	public void undo() {
		// Méthode pour annuler l'action qui vient de se produire et revenir à l'action précédente dans le cas actuel, la méthode rallume la lampe
		for (Light light : this.lights) {
			light.Light_on();
		}
		
	}
}
