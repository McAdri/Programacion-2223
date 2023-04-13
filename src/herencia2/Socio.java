package herencia2;

public class Socio extends Jefe{

	public Socio(String nombre, float sueldo, boolean cumple) {
		super(nombre,sueldo,cumple,10);
		
	}
	
	@Override
	public String trabajar() {
		return "EStoy en el bar";
	}
}
