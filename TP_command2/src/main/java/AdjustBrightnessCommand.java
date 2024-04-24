import java.util.ArrayList;

public abstract class AdjustBrightnessCommand implements Command{
	private ArrayList<Light> lights; // Liste pour stocker les lampes
	private int brightness;
	private ArrayList<Integer> previousBrightness; // Liste pour stocker les valeurs précédantes des luminosités des lampes
	
	// Constructeur qui contient la liste des lampes et le niveau de leurs luminosité
	public AdjustBrightnessCommand(ArrayList<Light> Lights, int brightness) {
		this.lights = Lights; // Utilisez le paramètre ici
		this.brightness = brightness;
		this.previousBrightness = new ArrayList<Integer>();
		for (Light light : this.lights) {
			this.previousBrightness.add(light.getBrightness());
		}
	}

	@Override
	public void execute() {
		// Méthode permettant de parcourir chaque lampe de la liste Lights
		for (Light light : this.lights) {
			light.AdjustBrightness(this.brightness);
		}
		
	}
	
	@Override
	public void undo() {
		// Méthode pour revenir à la valeur d'intensité précédente
		for (int i = 0; i < this.lights.size(); i++) {
			this.lights.get(i).AdjustBrightness(this.previousBrightness.get(i));
		}
			
	}
	
}
