package coche;

public class Coche {

	private int velocidad;
	private int kilometros;
	private String marca;
	private String modelo;
	private int cv;
	private int kilometrosRevision;
	private boolean arrancado;
	
	public Coche(String marca,String modelo,int cv) {
		velocidad = 0;
		kilometros = 0;
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		kilometrosRevision = 30000;
		arrancado = false;
	}
	
	public Coche(String marca,String modelo,int cv,int kilometros,int kilometrosRevision) {
		velocidad = 0;
		this.kilometros = kilometros;
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.kilometrosRevision = kilometrosRevision;
		arrancado = false;
	}
	
	
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getKilometrosRevision() {
		return kilometrosRevision;
	}

	public void setKilometrosRevision(int kilometrosRevision) {
		this.kilometrosRevision = kilometrosRevision;
	}

	public boolean isArrancado() {
		return arrancado;
	}

	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}

	public String arrancar() {
		if(!arrancado) {
			arrancado = true;
			return "Pique is on fire";
		} else {
			return "Shakira odia a la suegra";
		}
	}
	
	public boolean parar() {
		if(arrancado) {
			arrancado = false;
			return true;
		}else {
			return false;
		}
	}
	
	public void acelerar(int velocidad) {
		if(arrancado && velocidad>0) {
			this.velocidad += velocidad;
		}
	}
	
	public void frenar(int velocidad) {
		if(arrancado && this.velocidad>=velocidad) {
			this.velocidad -= velocidad;
		}
	}
	
	public float potenciaKW() {
		return cv * 0.7457f;
	}
	
	public float velocidadMS() {
		return velocidad /3.6f;
	}
	
	public int moverse(int minutos) {
		float desplazamiento = (float) velocidad / 60 * minutos;
		kilometros += desplazamiento;
		kilometrosRevision -= desplazamiento;
		return (int) desplazamiento;
	}
	
	public void pasarRevision() {
		kilometrosRevision = 30000;
	}

	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + ", kilometros=" + kilometros + ", marca=" + marca + ", modelo="
				+ modelo + ", cv=" + cv + ", kilometrosRevision=" + kilometrosRevision + ", arrancado=" + arrancado
				+ "]";
	}
	
	
	
}
