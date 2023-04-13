package herencia2;

public class Senior extends Trabajador{

	public Senior(String nombre, float sueldo) {
		super(nombre,sueldo);
	}
	
	
	
	@Override
	public String trabajar() {
		return "<h1> Hola caracola</h1>";
	}
	
	
}
