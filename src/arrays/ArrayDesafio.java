package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDesafio {
	
	public static void main(String[] args) {
		
		Scanner scannerInt = new Scanner(System.in);
		Scanner scannerDouble = new Scanner(System.in);
		
		System.out.print("De quantas notas você quer saber a média?");
		
		int qtd = scannerInt.nextInt();
				
		double[] notas = new double[qtd];
		
		double total = 0;
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite a nota: ");
			notas[i] = scannerDouble.nextDouble();
			total += notas[i];
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
		
		double media = total / qtd;
		
		System.out.println("Média: " + media);
		
	}
}
