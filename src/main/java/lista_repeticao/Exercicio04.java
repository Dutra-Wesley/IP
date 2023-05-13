package lista_repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero =0;
		double soma =0;
		
		for (int contador = 1; contador <= 10; contador++) {
			
			System.out.print("Informe um número: ");
			numero = input.nextInt();
			
			soma += + numero;
		}
		
		System.out.println(soma / 10);
		
	input.close();
	}

}
