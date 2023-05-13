package lista_condicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Infome o nome do aluno: ");
		String aluno = input.next();
		
		System.out.print("Informe a primeira nota do/a aluno/a " + aluno + ": ");
		double nota1 = input.nextDouble();
		
		System.out.print("Informe a segunda nota do/a aluno/a " + aluno + ": ");
		double nota2 = input.nextDouble();
		
		double mediaFinal = (nota1 + nota2) /2;
		
		if (mediaFinal < 7) {
			
			System.out.println("A média do aluno " + aluno + " foi " + mediaFinal);
			System.out.println("---------REPROVADO-----------");
			
		} else if (mediaFinal >= 7) {
			
			System.out.println("A média do aluno " + aluno + " foi " + mediaFinal);
			System.out.println("---------APROVADO------------");
		}
		
	input.close();
	}

}
