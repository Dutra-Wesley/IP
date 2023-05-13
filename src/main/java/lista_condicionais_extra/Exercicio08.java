package lista_condicionais_extra;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a leitura atual do medidor em m³: ");
		double medidorAtual = input.nextDouble();
		
		System.out.print("Informe a leitura do mês passado do medidor em m³: ");
		double medidorPassado = input.nextDouble();
		
		System.out.print("Sua conta é residencial ou predial? 1-Residencial 2-Predial: ");
		int conta = input.nextInt();
		
		double medidorTotal = medidorAtual - medidorPassado;
		
		switch (conta) {
		
		case 1:
			
			if (medidorTotal < 10) {
				
				System.out.println("Seu consumo foi de " + medidorTotal + "m³ e o valor a pagar é de: R$" +((medidorTotal * 1) + 70));
			
				
			} else if (medidorTotal >= 10 && medidorTotal <= 25) {
				
				System.out.println("Seu consumo foi de " + medidorTotal + "m³ e o valor a pagar é de: R$" +((medidorTotal * 2.50) + 70));
				
				
			} else if (medidorTotal > 25) {
				
				System.out.println("Seu consumo foi de " + medidorTotal + "m³ e o valor a pagar é de: R$" +((medidorTotal * 4.25) + 70));
				
			}
			
			
			break;
			
		case 2:
			
			if (medidorTotal < 10) {
				
				System.out.println("Seu consumo foi de " + medidorTotal + "m³ e o valor a pagar é de: R$" +((medidorTotal * 1.30) + 70));
				
				
			} else if (medidorTotal >= 10 && medidorTotal <= 25) {
				
				System.out.println("Seu consumo foi de " + medidorTotal + "m³ e o valor a pagar é de: R$" +((medidorTotal * 2.90) + 70));
				
				
			} else if (medidorTotal > 25) {
				
				System.out.println("Seu consumo foi de " + medidorTotal + "m³ e o valor a pagar é de: R$" +((medidorTotal * 4.50) + 70));
				
			}
			
			break;
			
		default: 
			
			System.out.println("Opção Inválida!");
			break;
		
		}
		
		
	input.close();
	}

}
