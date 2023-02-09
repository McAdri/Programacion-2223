package entradas;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entrada> entradas = new ArrayList<>();
		
		entradas.add(new Entrada(TipoGrada.Pista));
		entradas.add(new Entrada(TipoGrada.GradaBaja,500));
		entradas.add(new Entrada(TipoGrada.GradaAlta));
		
		entradas.get(0).vender(150);
		entradas.get(1).vender(300);
		entradas.get(2).vender(2200);
		
		entradas.get(0).vender(50);
		entradas.get(2).vender(5000);
		
		for(int i=0;i<entradas.size();i++) {
			System.out.println(entradas.get(i).ganancias());
		}
	}

}
