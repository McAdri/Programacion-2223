package metodos;

import java.util.Scanner;

public class Ejercicio03 {
	
	private static float velocidadKmH(int distancia, int tiempo) {
		float velocidad = (distancia / 1000) / (tiempo / 60);
		return velocidad;
	}

	private static float velocidadMS(int distancia, int tiempo) {
		float velocidad = distancia / (tiempo * 60);
		return velocidad;
	}
	
	private static void transporte(int distancia, int tiempo) {
		float velocidad = velocidadKmH(distancia, tiempo);
		if(velocidad < 100) {
			System.out.println("VAs en coche");
			consumo(distancia);
		} else if(velocidad < 300) {
			System.out.println("VAs en tren");
		} else {
			System.out.println("VAs en avion");
		}
		
	}
	
	private static void consumo(int distancia) {
		float consumo = (distancia/1000) /100 * (float) 5.1732;
		
		System.out.println(consumo);
	}
	
	private static float tiempo(int distancia, float velocidad) {
		return distancia / velocidad;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.print("Introduce distancia: ");
		int distancia = teclado.nextInt();
		System.out.print("Introduce tiempo: ");
		int tiempo = teclado.nextInt();
		float velocidad = velocidadKmH(distancia, tiempo);
		System.out.println(velocidad);
		System.out.println(velocidadMS(distancia, tiempo));
		transporte(distancia, tiempo);
		
		System.out.print("DIme cuanto has recorrido mas:");
		int distancia2 = teclado.nextInt();
		System.out.println(tiempo(distancia2, velocidad));
	}

}
