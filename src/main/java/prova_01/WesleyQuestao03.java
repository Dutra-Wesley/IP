package prova_01;

import java.util.Scanner;

public class WesleyQuestao03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double menorConta =0;
		double maiorConta =0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Informe o total pago da " + i + "� conta: ");
			double conta = input.nextDouble();
			
			if (conta < menorConta || i == 1) {
				
				menorConta = conta;
				
			}
			
			if (conta > maiorConta) {
				
				maiorConta = conta;
				
			}
				
		}	
		
		System.out.println("A conta mais cara da noite foi: R$" + maiorConta);
		System.out.println("A conta mais barata da noite foi: R$" + menorConta);
		
	input.close();
	}

}
