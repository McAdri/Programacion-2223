package bucleWhile;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cuadrado vacio
				int alto = 4;int ancho = 6;
				for(int i=0;i<alto;i++) {
					for(int j=0;j<ancho;j++) {
						if(i == 0 || j == 0  || j == ancho-1 || i == alto-1)
							System.out.print("*");
						else System.out.print(" ");
					}
					System.out.println();
				}
	}

}
