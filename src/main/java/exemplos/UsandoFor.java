package exemplos;

import java.util.Scanner;

public class UsandoFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int contador =0; contador < 2; contador++) {
			
			System.out.print("Informe seu nome: ");
			String nome = input.nextLine();
			
			System.out.print("Digite sua primeira nota: ");
			double nota1 = input.nextDouble();
			
			System.out.print("Digite sua segunda nota: ");
			double nota2 = input.nextDouble();
			
			double media = (nota1 + nota2) /2;
			
			System.out.println("A média do aluno " + nome + " é : " + media);
			
			
		
			input.nextLine();
		}
		
	input.close();
		

	}

}
