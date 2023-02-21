package baraja;

public class Carta implements Comparable<Carta>{

	private Numero numero;
	private Palo palo;
	private int id;
	
	public Carta(Numero numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
		id = numero.ordinal() + palo.ordinal()*10;
	}
	public Numero getNumero() {
		return numero;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	public Palo getPalo() {
		return palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public int compareTo(Carta carta) {
		/*
		if(id < carta.getId()) {
			return -1;
		}else if(id == carta.getId()) {
			return 0;
		} else {
			return 1;
		}
		
		*/
		return (id < carta.getId() ? 1 : 
			(id == carta.getId() ? 0 : -1));
	}
	
	public boolean equals(Object o) {
		if(numero == ((Carta) o).numero && palo == ((Carta) o).palo) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}
	
	
}
