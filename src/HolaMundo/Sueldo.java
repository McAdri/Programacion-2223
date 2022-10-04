package HolaMundo;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioHoraNormal = 10;
		double precioExtra1 = 13;
		double precioExtra2 = 17.5;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("DIme cuantas horas has trabajado: ");
		byte horas = teclado.nextByte();
		
		double sueldo = 0;
		if(horas <= 40) {
			sueldo = horas * precioHoraNormal;
		} else if(horas < 46) {
			sueldo = (horas - 40) * precioExtra1 + 40 * precioHoraNormal;
		} else {
			sueldo = (horas - 45) * precioExtra2 + (40*precioHoraNormal + 5*precioExtra1); 
		}
		
		sueldo *= 4;
		
		System.out.println("El sueldo bruto mensuale es "+ sueldo);
		
		byte irpf;
		if(sueldo < 1000) {
			irpf = 5;
		} else if(sueldo < 1300) {
			irpf = 7;
		} else if(sueldo < 1700) {
			irpf = 10;
		}else {
			irpf = 15;
		}
		
		System.out.println("EL irpf es de " + irpf);
		double sueldoNeto = sueldo * (100 - irpf) / 100;
		System.out.println("El sueldo neto es " + sueldoNeto);
		System.out.println("Lo pagado por irpf es " + (sueldo - sueldoNeto));
	}

}
