package pizzeria;

public class Pizza {

	private TipoPizza tipoPizza;
	private Size size;
	private Estado estado;
	private boolean extra;
	//PRECIO
	private int cantidad;
	
	public Pizza(TipoPizza tipoPizza,Size size,boolean extra) {
		this.tipoPizza = tipoPizza;
		this.size = size;
		estado = Estado.Pedido;
		this.extra = extra;
		cantidad = 1;
	}
	
	public Pizza(TipoPizza tipoPizza,Size size,boolean extra,int cantidad) {
		this.tipoPizza = tipoPizza;
		this.size = size;
		estado = Estado.Pedido;
		this.extra = extra;
		this.cantidad = cantidad;
	}
	
	public TipoPizza getTipoPizza() {
		return tipoPizza;
	}

	public void setTipoPizza(TipoPizza tipoPizza) {
		this.tipoPizza = tipoPizza;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean isExtra() {
		return extra;
	}

	public void setExtra(boolean extra) {
		this.extra = extra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float calcularPrecio() {
		float precio = calcularPrecioTipo() + calcularPrecioSize();
		if(extra)
			precio += 1.5;
		return precio;
	}
	
	private float calcularPrecioTipo() {
		float precio = 0;
		
		switch (tipoPizza) {
			case Barbacoa: 
				precio = 12;
			break;
			case CuatroQuesos,Margarita,Carbonara:
				precio = 9;
			break;
			case Vegetal:
				precio = 10;
			break;
		}
		
		return precio;
	}
	
	private float calcularPrecioSize() {
		float precio = 0;
		
		switch(size) {
			case Medium:
				precio += 2;
			break;
			case Familiar:
				precio +=4;
			break;
		}
		
		return precio;
	}
	
	public void siguienteEstado() {
		if(estado.ordinal() < Estado.values().length-1) {
			estado = Estado.values()[estado.ordinal()+1];
		}		
	}
	
	public String ganancias() {
		if(estado == Estado.Entregada) {
			return cantidad + "*" + calcularPrecio() +"=" + cantidad*calcularPrecio();
		}
		else {
			return "Aun no han sido repartidas";
		}
	}

	public String toString() {
		return "Pizza [tipoPizza=" + tipoPizza + ", size=" + size + ", estado=" + estado + ", extra=" + extra
				+ ", cantidad=" + cantidad + "]";
	}
	
	
}
