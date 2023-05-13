package lista_repeticao_extra;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double totalChuva = 0;
		
		for (int i = 0; i < 7; i++) {
			
			System.out.print("Informe a quantidade de chuva (em milímetro) do dia: ");
			double qteChuva = input.nextDouble();
			
			totalChuva += qteChuva;
			
		}
		
		double mediaChuva = totalChuva / 7;
		
		if (mediaChuva < 30) {
			
			System.out.println("Tempo seco");
			
		}
		
		if (mediaChuva >=30 && mediaChuva <= 70) {
			
			System.out.println("Tempo normal");
			
		}
		
		if (mediaChuva > 70) {
			
			System.out.println("Tempo chuvoso");
			
		}

	input.close();
	}

}
