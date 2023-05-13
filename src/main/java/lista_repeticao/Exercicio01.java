package lista_repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero1 = input.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double numero2 = input.nextDouble();
		
		if (numero2 == 0) {
			
			do {
				
				System.out.println("Valor Inválido");
				System.out.print("Digite novamente o segundo número: ");
				numero2 = input.nextDouble();
				
			} while (numero2 == 0);
		
		}
		
		double divisao = numero1 / numero2;
		
		System.out.println(divisao);
		
	input.close();
	}

}
