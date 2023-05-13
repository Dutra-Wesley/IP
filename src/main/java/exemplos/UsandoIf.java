package exemplos;

import java.util.Scanner;

public class UsandoIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int numero = input.nextInt();
		
		if (numero > 0) {
			System.out.println("O número digitado é: " + numero);
		} 
		
		System.out.println("Fim do programa.");
		
	input.close();
	}

}
