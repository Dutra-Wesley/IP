package lista_repeticao_extra;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double menorAltura =0;
		int somaIdade =0;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Informe a idade do jogador: ");
			int idade = input.nextInt();
			
			somaIdade += idade;
			
			System.out.print("Informe a altura do jogador: ");
			double altura = input.nextDouble();
			
			if (altura < menorAltura || i == 0) {
				
				menorAltura = altura;
				
			}
			
		}
		
		System.out.println("A média de idade entre os jogadores é: " + somaIdade / 5 + " anos");
		System.out.println("O menor jogador do time tem: " + menorAltura);
		
		
	input.close();
	}

}
