package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double somaNotas =0;
		int alunoAcimaMedia =0;
		
		double notas[] = new double [11];
		
		for (int i = 1; i < notas.length; i++) {
			
			System.out.print("Informe a " + i + "ª nota: ");
			notas[i] = input.nextDouble();
			
			somaNotas += notas[i];
			
		}
		
		double mediaTurma = somaNotas / 10;
		
		for (int i = 1; i < notas.length; i++) {
			
			if (notas[i] > mediaTurma) {
				
				alunoAcimaMedia += +1;
				
			}
			
		}
		
		System.out.println("A média da turma foi: " + mediaTurma);
		System.out.print("Ao todo, ficaram acima da média " + alunoAcimaMedia + " alunos");
		
	input.close();
	}

}
