package arrays;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Reyes
		
		int reyes = 9;
		String[] nombres = {"Carlos","Felipe","Carlos","Felipe","Carlos","Felipe","Ordoño","Juan","Juan Carlitros"};
		
		String nombresUnicos = "";
		
		for(int i=0;i<nombres.length;i++) {
			if(!nombresUnicos.contains(nombres[i])) {
				nombresUnicos += nombres[i] + "-";
			}
		}
		
		//System.out.println(nombresUnicos);
		
		String[] unicos = nombresUnicos.split("-");
		for(int i=0;i<unicos.length;i++) {
			int contador = 1;
			String buscar = unicos[i];
			for(int j=0;j<nombres.length;j++) {
				if(buscar.equals(nombres[j])) {
					nombres[j] = nombres[j] + " " + contador;
					
					contador++;
				}
			}
		}
		
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}
		

	}

}
