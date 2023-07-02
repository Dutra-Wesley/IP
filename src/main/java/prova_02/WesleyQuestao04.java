package prova_02;

import java.util.Scanner;

public class WesleyQuestao04 {

	public static void main(String[] args) {
		
		double temperaturasDoAno[] = preencherArrayTemperaturas();
		double menorTemperatura = identificarMenorTemperatura(temperaturasDoAno);
		double maiorTemperatura = identificarMaiorTemperatura(temperaturasDoAno);
		
		System.out.println("A menor temperatura do ano foi: " + menorTemperatura + "�C");
		System.out.println("E a maior temperatura do ano foi: " + maiorTemperatura + "�C");

	}

	static double identificarMaiorTemperatura(double[] temperaturasDoAno) {
		
		double maiorTemperatura = temperaturasDoAno[0];
		
		for (int i = 0; i < temperaturasDoAno.length; i++) {
			
			if (temperaturasDoAno[i] > maiorTemperatura) {
				
				maiorTemperatura = temperaturasDoAno[i];
				
			}
			
		}
		
		return maiorTemperatura;
	}

	static double identificarMenorTemperatura(double[] temperaturasDoAno) {
		
		double menorTemperatura = temperaturasDoAno[0];
		
		for (int i = 0; i < temperaturasDoAno.length; i++) {
			
			if (temperaturasDoAno[i] < menorTemperatura) {
				
				menorTemperatura = temperaturasDoAno[i];
				
			}
			
		}
		
		return menorTemperatura;
	}

	static double[] preencherArrayTemperaturas() {
		
		Scanner input = new Scanner (System.in);
		
		double temperaturasDoAno[] = new double [12];
		
		for (int i = 0; i < temperaturasDoAno.length; i++) {
			
			System.out.print("Informe a temperatura do " + (i+1) + "� m�s do ano: ");
			temperaturasDoAno[i] = input.nextDouble();
			
		}
		
		input.close();
		return temperaturasDoAno;
	}

}
