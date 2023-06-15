package lista_strings;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = input.nextLine();
		
		String fraseDividida[] = frase.split(" ");
		
		int contadorPalavras = 0;
		
		for (int i = 0; i < fraseDividida.length; i++) {
			
			contadorPalavras++;
			
		}
		
		System.out.println("Você digitou " + contadorPalavras + " palavras");
		
		input.close();
	}

}
