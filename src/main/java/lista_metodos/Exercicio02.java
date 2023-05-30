package lista_metodos;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a quantidade de pontos do aluno: ");
		int pontosAluno = input.nextInt();
		conceito(pontosAluno);
		
		input.close();
	}

	static void conceito(int pontosAluno) {

		if (pontosAluno <= 60) {

			System.out.println("Insatisfatório");
		}

		if (pontosAluno > 60 && pontosAluno <= 75) {

			System.out.println("Satisfatório");
		}

		if (pontosAluno > 75 && pontosAluno <= 90) {

			System.out.println("Bom");
		}

		if (pontosAluno > 90) {

			System.out.println("Ótimo");
		}

	}

}