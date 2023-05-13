package lista_repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro entre 1 e 10: ");
		int valor = input.nextInt();
		
		while (valor <= 0 || valor > 10) {
			
			System.out.print("Por favor, digite um valor válido: ");
			valor = input.nextInt();
			
		}
		
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			
			System.out.println(valor * tabuada);
			
		}
	
		
	input.close();
	}

}
