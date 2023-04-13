package herencia2;

public class Trabajador {

	private String nombre;
	private float sueldo;
	private String categoria;
		
	public Trabajador(String nombre, float sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String reunirse() {
		return "YA voy";
	}
	
	public String trabajar() {
		return "";
	}
	
	public float cobrar() {
		return sueldo;
	}
}
