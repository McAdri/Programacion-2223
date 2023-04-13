package herencia2;

public class Manager extends Jefe{

	public Manager(String nombre, float sueldo, boolean cumple) {
		super(nombre,sueldo,cumple,5);
		
	}
	
	@Override
	public String trabajar() {
		return "EStoy planificando";
	}
}
