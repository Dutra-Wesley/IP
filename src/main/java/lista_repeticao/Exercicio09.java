package lista_repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		int numero =0;
		double total =0;
		int maior =0;
		int menor =0;
		
		System.out.print("Quantos números você quer informar?: ");
		int numeroInformado = input.nextInt();
		
		for (int i = 1; i <= numeroInformado; i++) {
		
			System.out.print("Informe um número: ");
			numero = input.nextInt();
			
			if (numero > maior) {
				
				maior = numero;
				
			}
			
			if (numero < menor || i == 1) {
				
				menor = numero;
				
			}
			
			total += + numero;
			
		}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("A média dos números lidos é: " + formatador.format(total / numeroInformado));
		
	input.close();
	}

}
