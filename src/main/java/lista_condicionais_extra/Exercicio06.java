package lista_condicionais_extra;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("VOCÊ JÁ TRABALHOU COM A VÍTIMA? 1-SIM OU 0-NÃO: ");
		int resposta1 = input.nextInt();
		
		System.out.println("VOCÊ TELEFONOU PARA A VÍTIMA? 1-SIM OU 0-NÃO: ");
		int resposta2 = input.nextInt();
		
		System.out.println("VOCÊ MORA PRÓXIMA A VÍTIMA? 1-SIM OU 0-NÃO: ");
		int resposta3 = input.nextInt();
		
		System.out.println("VOCÊ DEVIA DINHEIRO A VÍTIMA? 1-SIM OU 0-NÃO: ");
		int resposta4 = input.nextInt();
		
		System.out.println("VOCÊ ESTEVE NO LOCAL DO CRIME? 1-SIM OU 0-NÃO: ");
		int resposta5 = input.nextInt();
		
		int respostaTotal = resposta1 + resposta2 + resposta3 + resposta4 + resposta5;
		
		if (respostaTotal == 0 || respostaTotal == 1) {
			
			System.out.println("Inocente");
			
		}
		
		if (respostaTotal == 2) {
			
			System.out.println("Suspeita");
			
		}
		
		if (respostaTotal == 3 || respostaTotal == 4) {
			
			System.out.println("Cúmplice");
			
		}
		
		if (respostaTotal == 5) {
			
			System.out.println("Assassino");
			
		}
		
	
	input.close();
	}

}
