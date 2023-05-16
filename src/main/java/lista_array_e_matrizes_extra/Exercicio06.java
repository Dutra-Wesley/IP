package lista_array_e_matrizes_extra;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double totalAltura =0;
		
		double alturaSalto[] = new double [11];
		
		for (int i = 1; i < alturaSalto.length; i++) {
			
			System.out.print("Informe a altura do salto do " + i + "º atleta: ");
			alturaSalto[i] = input.nextInt();
			
			totalAltura += alturaSalto[i];
			
		}
		
		double mediaAltura = totalAltura / 10;
	
		System.out.println("Os competidores que ficaram a baixo da média são: ");
		
		for (int i = 1; i < alturaSalto.length; i++) {
			
			if (alturaSalto[i] < mediaAltura) {
				
				System.out.println(i + "º competidor com uma altura de: " + alturaSalto[i] + " metros");
				
			}
			
		}
		
	input.close();
	}

}
