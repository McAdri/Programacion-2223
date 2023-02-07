package coche;

import java.util.Scanner;

public class Start {
	
	private static int menu() {
		System.out.print("1. ARrancar \n2. Parar \n3. Moverse \n4. Acelerar\n5. Frenar\n6. Ver kms \n7. Ver potencia en kW\n");
		System.out.print("8. Velocidad m/s\n9. Kms revision\n10. Pasar revision\n 11. SAlir\n");
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Coche miCoche = new Coche("Renault", "Twingo", 75);
		Coche miCoche = new Coche("Ferrari", "LaFerrari", 400, 8000, 22000);
		Coche nuevo = new Coche("Aston Martin", "Bond", 300);
		
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
				case 1: 
					System.out.println(miCoche.arrancar());
				break;
				case 2:
					if(miCoche.parar()) {
						System.out.println("Parada exitosa");
					}else {
						System.out.println("Ya estaba parado");
					}
				break;
				case 3:
					System.out.println("Te has desplazado " + miCoche.moverse(30) + " km1");
				break;
				case 4:
					miCoche.acelerar(30);
				break;
				case 5:
					miCoche.frenar(20);
				break;
				case 6:
					System.out.println("EL coche tiene " + miCoche.getKilometros() + " km");
				break;
				case 7:
					System.out.println(miCoche.potenciaKW() + " kW");
				break;
				case 8:
					System.out.println(miCoche.velocidadMS() + " m/s");
				break;
				case 9:
					System.out.println("Le quedan " + miCoche.getKilometrosRevision() + " km");
				break;
				case 10:
					miCoche.pasarRevision();
				break;
				case 11:
					System.out.println("Adios Shakira");
				break;	
				default:
					System.out.println("ERROR, no existe esa opcion");
				break;
			}
		}while(opcion != 11);
		
		System.out.println(miCoche.toString());
		
	}

}
