package lista_array_e_matrizes_extra;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String nomePais = "";
		String paisMaisMedalhas = "";
		int maisMedalhas =0;
		
		int medalhas[] = new int [11];
		
		for (int i = 1; i < medalhas.length; i++) {
		
			System.out.print("Informe o nome do País: ");
			nomePais = input.nextLine();
			
			System.out.print("Informe a quantidade de medalhas desse país: ");
			medalhas[i] = input.nextInt();
			
			input.nextLine();
			
			if (medalhas[i] > maisMedalhas) {
				
				maisMedalhas = medalhas[i];
				paisMaisMedalhas = nomePais;
				
			}
			
		}
		
		System.out.println("O país com mais medalhas é: " + paisMaisMedalhas + "\nCom um total de " + maisMedalhas + " medalhas");
		
	input.close();	
	}

}
