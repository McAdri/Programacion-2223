package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("numeros.txt"));
		String linea = "";
		int total = 0;
		while(linea != null) {
			
			linea = br.readLine();
			if(linea != null)
				total += Integer.parseInt(linea);
		}
		
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("total.txt"));
		
		bw.write(Integer.toString(total));
		
		bw.close();
		
	}

}
