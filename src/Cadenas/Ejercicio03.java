package Cadenas;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "hola clase que tal";
		
		String nuevaCadena = cadena.replace(" ", ""), cadenaCani= "",ascii = "";
		int contadorVocales = 0;
		
		System.out.println(cadena.indexOf("a"));
		System.out.println(cadena.lastIndexOf("a"));
		
		
		
		
		
		
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i) != ' ') {
				nuevaCadena += cadena.charAt(i);
			}
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' 
					|| cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' 
					|| cadena.charAt(i) == 'u') {
				contadorVocales++;
			}
			if(i%2 == 0) {
				cadenaCani += Character.toUpperCase(cadena.charAt(i));
			}else {
				cadenaCani += Character.toLowerCase(cadena.charAt(i));
			}
			ascii += (int) cadena.charAt(i);
		}
		
		System.out.println("Sin espacios " + nuevaCadena);
		System.out.println("Hay " + contadorVocales + " vocales");
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toUpperCase().charAt(0) 
				+ cadena.toLowerCase().substring(1));
		System.out.println(cadenaCani);
		int primera = cadena.indexOf("a");
		int ultima = cadena.lastIndexOf("a");
		System.out.println(cadena.substring(primera+1,ultima));
		int primerEspacio = cadena.indexOf(" ");
		int ultimoEspacio = cadena.lastIndexOf(" ");
		String cambio = cadena.substring(ultimoEspacio+1) 
				+ cadena.substring(primerEspacio,ultimoEspacio+1) 
				+ cadena.substring(0,primerEspacio);
		System.out.println(cambio);
		
		int codigo = 'a';
		System.out.println(ascii);
		for(int i='A';i<='Z';i++) {
			System.out.println((char) i);
		}
	}

}
