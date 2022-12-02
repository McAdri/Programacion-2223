package arrays;

public class Ejercicio04 {

	private static boolean esAcertado(char[] usuario, String palabra) {
		return false;
	}
	
	public static void main(String[] args) {
		// Ahorcado
		String palabra = "cacahuetes";
		char[] adivina = new char[palabra.length()];
		
		for(int i=0;i<adivina.length;i++) {
			adivina[i] = '_';
		}
		
		int intentos = 0;
		
		while(intentos<5 && !esAcertado(adivina, palabra)) {
			
			//Pedir letra
			char letra = 'a';
			boolean encontrado = false;
			for(int i=0;i<palabra.length();i++) {
				if(palabra.charAt(i) == letra) {
					adivina[i] = letra;
					encontrado = true;
				}
			}
			if(!encontrado)
				intentos++;
		}
		
		for(int i=0;i<adivina.length;i++) {
			System.out.print(adivina[i] + " ");
		}
	}

}
