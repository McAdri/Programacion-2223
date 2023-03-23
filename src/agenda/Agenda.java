package agenda;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contacto> contactos;
	private int tamanyoMAX = 10;
	
	public Agenda() {
		contactos = new ArrayList<>();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	public void agregarContacto(Contacto contacto) {
		if(!agendaLlena() && !existeContacto(contacto))
			contactos.add(contacto);
	}
	
	public boolean eliminarContacto(Contacto contacto) {
		//SI quisiesemos saber si se ha borrado o no el contacto
		return contactos.remove(contacto);
	}
	
	public boolean agendaLlena() {
		if(contactos.size()<tamanyoMAX) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean existeContacto(Contacto contacto) {
		if(contactos.contains(contacto)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public Contacto buscarContacto(String nombre) {
		if(existeContacto(new Contacto(nombre))) {
			return contactos.get(contactos.indexOf(new Contacto(nombre)));
		} else {
			return null;
		}
	}
	
	public Contacto buscarContactoNumero(String telefono) {
		int pos;
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getNumero().equals(telefono))
				return contactos.get(i);
				
		}
		
		return null;
	}
	
	public int cuantosHuecos() {
		return tamanyoMAX - contactos.size();
	}
	
	public String nombreMasLargo() {
		String nombre = "";
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getNombre().length() > nombre.length())
				nombre = contactos.get(i).getNombre();
		}
		
		return nombre;
	}
	
	// METODO SOLO PARA EXPLICACION
	public int tamanyo() {
		return contactos.size();
	}
}
