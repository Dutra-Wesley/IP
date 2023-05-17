package prova_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WesleyQuestao04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		String resposta;
		double conta =0;
		int totalCliente = 0;
		double totalConta =0;
		double maiorConta =0;
		double menorConta =Double.POSITIVE_INFINITY;
		
		do {
			
			System.out.print("Informe o valor total pago da conta: ");
			conta = input.nextDouble();
			
			input.nextLine();
			
			System.out.print("Deseja informar outro cliente, SIM OU N�O: ");
			resposta = input.nextLine();
			
			totalCliente += +1;
			totalConta += conta;
			
			if (conta < menorConta) {
				
				menorConta = conta;
				
			}
			
			
			if (conta > maiorConta) {
				
				maiorConta = conta;
				
			}
			
			
		} while (resposta.equalsIgnoreCase("SIM"));
		
		System.out.println("O total de clientes atendido na noite foi: " + totalCliente);
		System.out.println("A m�dia das contas pagas �: R$" + formatador.format(totalConta / totalCliente));
		System.out.println("A maior conta paga da noite �: R$" + maiorConta);
		System.out.println("A menor conta paga da noite �: R$" + menorConta);
		
	input.close();
	}

}
