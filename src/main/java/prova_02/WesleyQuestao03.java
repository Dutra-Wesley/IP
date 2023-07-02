package prova_02;

import java.util.Scanner;

public class WesleyQuestao03 {

	public static void main(String[] args) {
		
		double estimativasPrevisao[] = preencherArrayEstimativas();
		classificarEstimativas(estimativasPrevisao);

	}

	static void classificarEstimativas(double[] estimativasPrevisao) {
		
		for (int i = 0; i < estimativasPrevisao.length; i++) {
			
			if (estimativasPrevisao[i] < 20) {
				
				System.out.println("A previs�o do dia " + (i+1) + " � Ensolarado");
				
			} else if (estimativasPrevisao[i] >= 20 && estimativasPrevisao[i] <= 50) {
				
				System.out.println("A previs�o do dia " + (i+1) + " � Nublado");
				
			} else if (estimativasPrevisao[i] > 50) {
				
				System.out.println("A previs�o do dia " + (i+1) + " � Chuvoso");
				
			}
			
		}
		
	}

	static double[] preencherArrayEstimativas() {
		
		Scanner input = new Scanner(System.in);
		
		double estimativasPrevisao[] = new double [10];
		
		for (int i = 0; i < estimativasPrevisao.length; i++) {
			
			System.out.print("Informe a " + (i+1) + "� estimativa: ");
			estimativasPrevisao[i] = input.nextDouble();
			
		}
		
		input.close();
		return estimativasPrevisao;
	}

}
