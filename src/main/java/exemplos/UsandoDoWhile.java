package exemplos;

import java.util.Scanner;

public class UsandoDoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int contador =0;
		
		do {
			
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
		
		} while (contador < 2);
		
		
	input.close();
	}

}
