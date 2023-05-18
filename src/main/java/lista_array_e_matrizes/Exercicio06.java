package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double menorTemp =Double.POSITIVE_INFINITY;
		double maiorTemp =0;
		double totalTempAno =0;
		int mediaMenorAnual =0;
		
		double temperaturas[] = new double [13];
		
		for (int i = 1; i < temperaturas.length; i++) {
			
			System.out.print("Informe a temperatura do " + i + "º mês: ");
			temperaturas[i] = input.nextDouble();
			
			totalTempAno += temperaturas[i];
			
			if (temperaturas[i] < menorTemp) {
				
				menorTemp = temperaturas[i];
				
			}
			
			if (temperaturas[i] > maiorTemp) {
				
				maiorTemp = temperaturas[i];
				
			}
			
		}
		
		double mediaTempAno = totalTempAno / 12;
		
		for (int i = 1; i < temperaturas.length; i++) {
			
			if (mediaTempAno > temperaturas[i]) {
				
				mediaMenorAnual += +1;
				
			}
			
		}
		
		System.out.println("A menor temperatura do ano foi: " + menorTemp + "ºC");
		System.out.println("A maior temperatura do ano foi: " + maiorTemp + "ºC");
		System.out.println("A média da temperatura do ano foi: " + mediaTempAno + "ºC");
		System.out.println("No total, tiveram " + mediaMenorAnual + " meses em que a temperatura ficou menor que a temperatura média anual");
		
	input.close();
	}

}
