package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numeroRepetido = 0;
		
		int numeros[] = new int [11];
		
		for (int i = 1; i < numeros.length; i++) {
			
			System.out.print("Informe o " + i + "º número: ");
			numeros[i] = input.nextInt();
			
		}
		
		System.out.print("Informe um outro número: ");
		int novoNumero = input.nextInt();
		
		
		for (int i = 1; i < numeros.length; i++) {
			
			if (novoNumero == numeros[i]) {
				
				numeroRepetido += +1;
				
			}
			
		}
		
		System.out.println("Esse número se repete " + numeroRepetido + " vezes");
		
	input.close();	
	}

}
