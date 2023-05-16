package lista_array_e_matrizes_extra;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int predioGrande =0;
		
		double andares[] = new double [11];
		
		for (int i = 1; i < andares.length; i++) {
			
			System.out.print("Informe a quantidade de andares do " + i + "ª prédio: ");
			andares[i] = input.nextInt();
			
			if (andares[i] > 10) {
				
				predioGrande += +1;
				
			}
			
		}
		
		System.out.println("No total existem " + predioGrande + " prédios com mais de 10 andares");
		
	input.close();	
	}

}
