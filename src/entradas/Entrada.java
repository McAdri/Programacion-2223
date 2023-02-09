package entradas;

public class Entrada {

	private TipoGrada tipo;
	private float precio;
	private int cantidad;
	private int vendidas;
	
	public Entrada(TipoGrada tipo) {
		this.tipo = tipo;
		establecerPrecio();
		establecerCantidad();
		this.vendidas = 0;
	}
	
	public Entrada(TipoGrada tipo,int cantidad) {
		this.tipo = tipo;
		establecerPrecio();
		this.cantidad = cantidad;
		this.vendidas = 0;
	}
	
	
	
	public TipoGrada getTipo() {
		return tipo;
	}

	public void setTipo(TipoGrada tipo) {
		this.tipo = tipo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getVendidas() {
		return vendidas;
	}

	public void setVendidas(int vendidas) {
		this.vendidas = vendidas;
	}

	private void establecerPrecio() {
		switch (tipo) {
			//PISTA
			case Pista: 
				precio = 50;				
			break;
			//BAJA
			case GradaBaja:
				precio = 45;
			break;
			//ALTA
			case GradaAlta:
				precio = 35;
			break;
		}
	}
	
	private void establecerCantidad() {
		switch (tipo) {
			//PISTA
			case Pista: 
				cantidad = 2000;				
			break;
			//BAJA
			case GradaBaja:
				cantidad = 1500;
			break;
			//ALTA
			case GradaAlta:
				cantidad = 3000;
			break;
		}
	}
	
	public void vender(int cantidadVendidas) {
		if(cantidad - vendidas >= cantidadVendidas) {
			vendidas += cantidadVendidas;
		}
	}
	
	public String ganancias() {
		return tipo + ": vendidas= " + vendidas + " - Has recaudado " + vendidas*precio + "€";
	}

	@Override
	public String toString() {
		return "Entrada [tipo=" + tipo + ", precio=" + precio + ", cantidad=" + cantidad + ", vendidas=" + vendidas
				+ "]";
	}
	
	
}
