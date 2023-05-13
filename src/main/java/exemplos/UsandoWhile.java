package exemplos;

import java.util.Scanner;

public class UsandoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		int alunos = input.nextInt();
		
		int contador =0;
		
		while (contador < alunos) {
			
			System.out.print("Informe seu nome: ");
			String nome = input.nextLine();
			
			System.out.print("Digite sua primeira nota: ");
			double nota1 = input.nextDouble();
			
			System.out.print("Digite sua segunda nota: ");
			double nota2 = input.nextDouble();
			
			double media = (nota1 + nota2) /2;
			
			System.out.println("A média do aluno " + nome + " é : " + media);
			
			contador++;
			input.nextLine();
		}
		
		
	input.close();
	}

}
