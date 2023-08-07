package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class exercicio {

	public static void main(String[] args) {
		
		double[] notasSamanta = new double[3];
		notasSamanta[0] = 7.9;
		notasSamanta[1] = 9.0;
		notasSamanta[2] = 7.1;
		double total = 0;
							
		System.out.println("--- Samanta ---");
		
		for (int i = 0; i < notasSamanta.length; i++) {
			total += notasSamanta[i];
			System.out.println("Nota " + (i + 1) + " :" + notasSamanta[i]);
		}
		
				
		System.out.println("Total: " + total);
		System.out.println("Média: " + total / notasSamanta.length);
		
		double[] notasCarol = {7.9, 5.9, 10.0 };
		
		System.out.println("\n --- Carol ---");
		
		for (int i = 0; i < notasCarol.length; i++) {
			total += notasCarol[i];
			System.out.println("Nota " + (i + 1) + " :" + notasCarol[i]);
		}		
		
		System.out.println("Total: " + total);
		System.out.println("Média: " + total / notasCarol.length);
		
	}
}
