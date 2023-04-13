package herencia2;

public abstract class Jefe extends Trabajador{

	private boolean cumple;
	private int bonus;
	
	public Jefe(String nombre, float sueldo, boolean cumple, int bonus) {
		super(nombre,sueldo);
		this.cumple = cumple;
		this.bonus = bonus;
	}

	public boolean isCumple() {
		return cumple;
	}

	public void setCumple(boolean cumple) {
		this.cumple = cumple;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public float cobrar() {
		if(cumple) {
			return getSueldo() * (100 + bonus) / 100;
		} else {
			return getSueldo();
		}
		
	}
}
