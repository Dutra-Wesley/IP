package lista_strings;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma frase (sem acentuação): ");
		String frase = input.nextLine();

		char fraseDividida[] = new char [frase.length()];
		fraseDividida = frase.toCharArray();
		
		System.out.println("A frase: " + frase + ", possui: ");
		
		contarVogais(fraseDividida);
		
		input.close();
	}

	static void contarVogais(char[] FraseDividida) {
		
		int vogalA = 0;
		int vogalE = 0;
		int vogalI = 0;
		int vogalO = 0;
		int vogalU = 0;
		
		for (int i = 0; i < FraseDividida.length; i++) {
			
			if (FraseDividida[i] == 'a' || FraseDividida[i] == 'A') {
				
				vogalA++;
				
			}
			
			if (FraseDividida[i] == 'e' || FraseDividida[i] == 'E') {
				
				vogalE++;
				
			}

			if (FraseDividida[i] == 'i' || FraseDividida[i] == 'I') {
				
				vogalI++;
				
			}
			
			if (FraseDividida[i] == 'o' || FraseDividida[i] == 'O') {
				
				vogalO++;
				
			}
			
			if (FraseDividida[i] == 'u' || FraseDividida[i] == 'U') {
				
				vogalU++;
				
			}
			
		}
		
		System.out.println("Vogais A: " + vogalA);
		System.out.println("Vogais E: " + vogalE);
		System.out.println("Vogais I: " + vogalI);
		System.out.println("Vogais O: " + vogalO);
		System.out.println("Vogais U: " + vogalU);
		
	}

}
