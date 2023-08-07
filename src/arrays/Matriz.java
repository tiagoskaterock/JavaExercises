package arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
	
		Scanner entradaInt = new Scanner(System.in);
		Scanner entradaDouble = new Scanner(System.in);
		
		System.out.println("Quantos alunos");
		int alunoQtd = entradaInt.nextInt();
		
		System.out.println("QUantas notas");
		int notasQtd = entradaInt.nextInt();
		
		double[][] turmaNotas = new double[alunoQtd][notasQtd];
		
		for (int i = 0; i < turmaNotas.length; i++) {

			for (int j = 0; j < turmaNotas[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				turmaNotas[i][j] = entradaDouble.nextDouble();
			}
		}
		
		System.out.println("--- Alunos ---");
		
		double turmaTotal = 0;
		
		for (int i = 0; i < turmaNotas.length; i++) {
			System.out.println("Aluno " + ( i + 1) + ": ");
			double total = 0;
			
			for (int j = 0; j < turmaNotas[i].length; j++) {				
				System.out.println("Nota " + ( j + 1) + ": " + turmaNotas[i][j]);
				total += turmaNotas[i][j];					
			}
			
			turmaTotal += total;
			double media = total / notasQtd;
			
			System.out.println("Total: " + total);			
			System.out.println("Média: " + media);			
			System.out.println(media > 6 ? "Aprovado" : "Reprovado");
			System.out.println("--- ---\n");
		}	
		
		System.out.println("--- Turma ---");		
		System.out.println("Total da turma: " + turmaTotal);
		System.out.println("Média da turma: " + (turmaTotal / (alunoQtd * notasQtd)));
		
		entradaInt.close();
	}
}
