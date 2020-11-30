package view;

import model.PrimeiraCasa;
import model.SegundaCasa;
import model.TerceiraCasa;

public class Cliente {

	public static void main(String[] args) {
		System.out.println("PRIMEIRA CASA");
		PrimeiraCasa pc = new PrimeiraCasa();
		pc.construcaoBasica();
		
		System.out.println("SEGUNDA CASA");
		SegundaCasa sc = new SegundaCasa();
		sc.construcaoBasica();
		
		System.out.println("TERCEIRA CASA");
		TerceiraCasa tc = new TerceiraCasa();
		tc.construcaoBasica();

	}

}
