package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("martes.txt"));
		
		bw.write("BBDD\n");
		bw.write("LM\n");
		bw.write("FOL\n");
		bw.write("Programacion\n");
		
		bw.close();
	}

}
