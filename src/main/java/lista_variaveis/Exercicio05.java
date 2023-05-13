package lista_variaveis;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um numero de valor Inteiro: ");
		int numero = teclado.nextInt();
			if (numero <= 0) {
				System.out.println("Por favor, digite um número válido");
				
			} else {
				System.out.println("Você digitou o valor: " + (numero));
				System.out.println("O número seguinte é: " + (++numero));
				System.out.println("O número antecessor é: " + (numero - 2));
			}
	
	teclado.close();
	
	}

}
