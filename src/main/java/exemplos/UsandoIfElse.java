package exemplos;

import java.util.Scanner;

public class UsandoIfElse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int numero = input.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Seu número é par!");
		} else {
			System.out.println("Seu número é impar!");
		}
		
	input.close();
	}

}
