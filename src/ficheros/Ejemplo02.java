package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("numeros.txt"));
		for(int i=1;i<=50;i++) {
			bw.write(i + "\n");
		}
		bw.close();
	}

}
