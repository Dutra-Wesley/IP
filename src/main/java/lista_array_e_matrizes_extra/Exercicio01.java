package lista_array_e_matrizes_extra;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int apartamentoGrande =0;
		int totalQuartos =0;
		
		int quartos [] = new int [11];
		
		for (int i = 1; i < quartos.length; i++) {
			
			System.out.print("Informe a quantidade de quartos do " + i + "º apartamento: ");
			quartos[i] = input.nextInt();
			
			totalQuartos += quartos[i];
			
			if (quartos[i] == 3) {
				
				apartamentoGrande += +1;
				
			}
			
		}
		
		System.out.println("O total de quartos é: " + totalQuartos);
		System.out.println("No total existem " + apartamentoGrande + " com mais de 3 quartos");
		
	input.close();
	}

}
