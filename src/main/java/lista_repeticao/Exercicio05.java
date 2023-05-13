package lista_repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero =0;
		int negativo =0;
		
		for (int contador = 1; contador <= 10; contador++) {
			
			System.out.print("Informe um número: ");
			numero = input.nextInt();
			
			if (numero < 0 ) {
				
				negativo++;
				
			}
		}
		
		System.out.println(negativo);
		
	input.close();
	}

}
