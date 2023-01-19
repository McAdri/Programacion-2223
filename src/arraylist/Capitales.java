package arraylist;

import java.util.HashMap;
import java.util.Scanner;

public class Capitales {
	private static String pedirCapital(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.println(texto);
		return sc.nextLine();
	}
	public static void main(String[] args) {
		byte aciertos = 0;
		HashMap<String, String> paises = new HashMap<String, String>();
		paises.put("España", "Madrid");
		paises.put("Italia", "Roma");
		paises.put("Inglaterra", "Londres");
		paises.put("Alemania", "Berlin");
		paises.put("Noruega", "Oslo");
		paises.put("Nigeria", "Abuya");
		for (String pais : paises.keySet()) {
			String capital = pedirCapital("¿Cuál es la capital de "  + pais + "?");
			if (capital.equalsIgnoreCase(paises.get(pais))) {
				aciertos++;
			}
		}
		System.out.println("Has acertado" + aciertos + " capitales, que corresponde al"
				+ " " + ((aciertos*100)/paises.size()) + "% de aciertos.");
	}

}
