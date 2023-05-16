package lista_array_e_matrizes_extra;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double totalArea =0;
		int casaAbaixoMedia =0;
		
		double areaConstruida[] = new double [11];
		
		for (int i = 1; i < areaConstruida.length; i++) {
			
			System.out.print("Informe o tamanho da área construída da " + i + "ª casa: ");
			areaConstruida[i] = input.nextInt();
			
			totalArea += areaConstruida[i];
			
		}
		
		double mediaArea = totalArea / 10;
		
		for (int i = 1; i < areaConstruida.length; i++) {
			
			if (areaConstruida[i] < mediaArea) {
				
				casaAbaixoMedia += +1;
				
			}
			
		}
		
		System.out.println("A quantida de casas que estão abaixo da média são: " + casaAbaixoMedia);
		
	input.close();
	}

}
