package lista_strings;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = input.nextLine();
		
		System.out.print("Agora digite uma palavra: ");
		String palavra = input.nextLine();
		
		String fraseDividida[] = frase.split(" ");
		
		int contadorPalavrasRepetidas = 0;
		
		for (int i = 0; i < fraseDividida.length; i++) {
			
			if (fraseDividida[i].equals(palavra)) {
				
				contadorPalavrasRepetidas++;
				
			}
			
		}
		
		System.out.println("A frase que você digitou foi: " + frase);
		System.out.println("A palavra que você digitou foi: " + palavra);
		System.out.println("A palavra aparece " + contadorPalavrasRepetidas + " vezes");
		
		input.close();
	}

}
