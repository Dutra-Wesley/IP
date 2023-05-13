package lista_condicionais;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("A = Álcool");
		System.out.println("G = Gasolina");
		System.out.print("Informe qual o tipo de abastecimento: ");
		String tipo = input.nextLine().toUpperCase();
		
		System.out.print("Informe quantos litros abasteceu: ");
		double litros = input.nextDouble();
		
		switch (tipo) {
		
		case "A":
			
			if (litros <= 20) {
				
				System.out.println("Seu abastecimento total foi de: R$" + (litros * 6.20 * 0.97));
				
			} else {
			
				System.out.println("Seu abastecimento total foi de: R$" + (litros * 6.20 * 0.95));
			
			}
			
			break;
		
		case "G":
			
			if (litros <= 20) {
				
				System.out.println("Seu abastecimento total foi de: R$" + (litros * 6.90 * 0.96));
			
			} else {
				
				System.out.println("Seu abastecimento total foi de: R$" + (litros * 6.90 * 0.94));
				
			}
			
			break;
			
			
		default:
			
			System.out.println("Opção Inválida");
			
			break;
				
		}
		
	input.close();
	}

}
