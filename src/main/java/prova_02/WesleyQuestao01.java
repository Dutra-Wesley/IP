package prova_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WesleyQuestao01 {

	public static void main(String[] args) {
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double temperaturasDoAno[] = preencherArrayTemperaturas();
		double mediaTemperaturaAnual = calcularMediaTemperatura(temperaturasDoAno);
		int totalTemperaturasAbaixoMedia = identificarTemperaturasAbaixoMedia(temperaturasDoAno, mediaTemperaturaAnual);
		
		System.out.println("A m�dia anual das temperaturas do ano foi: " + formatador.format(mediaTemperaturaAnual) + "�C");
		System.out.println("No total tiveram " + totalTemperaturasAbaixoMedia + " meses que ficaram abaixo da m�dia anual!");
		
	}

	static int identificarTemperaturasAbaixoMedia(double[] temperaturas, double mediaTemperaturaAnual) {
		
		int totalTeperaturasAbaixoMedia = 0;
		
		for (int i = 0; i < temperaturas.length; i++) {
			
			if (temperaturas[i] < mediaTemperaturaAnual) {
				
				totalTeperaturasAbaixoMedia++;
				
			}
			
		}
		
		return totalTeperaturasAbaixoMedia;
	}

	static double calcularMediaTemperatura(double[] temperaturas) {
		
		double totalTemperaturas = 0;
		
		for (int i = 0; i < temperaturas.length; i++) {
			
			totalTemperaturas += temperaturas[i];
			
		}
		
		double mediaTemperaturas = totalTemperaturas / temperaturas.length;
		
		
		return mediaTemperaturas;
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
