package herencia2;

public class Junior extends Trabajador{

	public Junior(String nombre, float sueldo) {
		super(nombre,sueldo);
		setCategoria("Junior");
	}
	
	@Override
	public String reunirse() {
		return "No voy";
	}
	
	@Override
	public String trabajar() {
		return "<p> Hola caracola</p>";
	}
	
	
}
