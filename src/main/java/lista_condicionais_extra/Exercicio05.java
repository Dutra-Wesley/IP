package lista_condicionais_extra;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor do saque: ");
		int saque = input.nextInt();
		
		if (saque >=10 && saque <= 1000) {
			
			if (saque >= 100) {
				
				int nota100 = saque /100;
				saque = saque - (nota100*100); //saque = saque % 100;
				System.out.println("Notas de R$100,00: " + nota100);
				
			}
			
			if (saque >= 50) {
				
				int nota50 = saque /50;
				saque = saque - (nota50*50);
				System.out.println("Notas de R$50,00: " + nota50);
				
			}
			
			if (saque >= 10) {
				
				int nota10 = saque /10;
				saque = saque - (nota10*10);
				System.out.println("Notas de R$10,00: " + nota10);
				
			}
			
			if (saque >= 5) {
				
				int nota5 = saque /5;
				saque = saque - (nota5*5);
				System.out.println("Notas de R$5,00: " + nota5);
				
			}
			
			if (saque >= 1) {
				
				int nota1 = saque /1;
				saque = saque - (nota1*1);
				System.out.println("Notas de R$1,00: " + nota1);
				
			}
			
		} else {
			
			System.out.println("Valor fora do limite de R$10,00 à R$1000,00");
			
		}
		
		
	input.close();
	}

}
