package lista_condicionais_extra;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um ano: ");
		int ano = input.nextInt();
		
		if (ano %4 == 0) {
			
			if (ano %100 == 0) {
				
				if (ano %400 == 0) {
					
					System.out.println("É um ano bissexto!");
					
				}
				
			} else {
				
				System.out.println("É um ano bissexto!");
				
			} 
			
		} 
		
		System.out.println("Não é um ano bissexto!");
		
	input.close();
	}

}
