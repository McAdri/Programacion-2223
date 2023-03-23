package agenda;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Como comparar cadenas de texto
		String cad1 = "aaab";
		String cad2 = "aaac";
		String cad3 = "aaaa";
		String cad4 = "aaab";
		String cad5 = "aaaA";
		String cad6 = "aaae";
		
		System.out.println(cad1.compareTo(cad2));
		System.out.println(cad1.compareTo(cad4));
		System.out.println(cad1.compareTo(cad3));
		System.out.println(cad1.compareTo(cad5));
		System.out.println(cad1.compareTo(cad6));
		
		System.out.println("EMPIEZA AGENDA");
		
		Agenda agenda = new Agenda();
		
		Contacto contacto = new Contacto("DIablo", "666");
		
		// NO se debe hacer asi
		agenda.getContactos().add(contacto);
		
		System.out.println(agenda.tamanyo());
		
		Contacto contacto2 = new Contacto("ANgel", "111");
		
		agenda.agregarContacto(contacto2);
		System.out.println(agenda.tamanyo());
		
		System.out.println(agenda.buscarContacto("PEPE"));
		
		
		// BUSCAR por numero telefono de forma NOOOOOOOO recomendable
		
		ArrayList<Contacto> contactos = agenda.getContactos();
		boolean existe = false;
		for(Contacto contactoBucle:contactos) {
			if(contactoBucle.getNumero().equals("111"))
				existe = true;
		}
		
		System.out.println(existe);
		
		System.out.println(agenda.buscarContactoNumero("666"));
		
		
		ArrayList<Agenda> agendas = new ArrayList<>();
		agendas.add(new Agenda());
		agendas.add(new Agenda());
		//Nombre mas largo
		String nombre = "";
		for(int j=0;j<agendas.size();j++) {
			ArrayList<Contacto> contactos2 = agendas.get(j).getContactos();
			if(nombre.length() == agendas.get(j).nombreMasLargo().length())
			 nombre = "";
		}
		
	}

}
