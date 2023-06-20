package lista_strings;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe alguns números inteiros: ");
		String numero = input.nextLine();
		String numerosPorExtenso[] = new String[numero.length()];

		for (int i = 0; i < numero.length(); i++) {

			switch (numero.charAt(i)) {
			case '0': {

				numerosPorExtenso[i] = "Zero";
				break;
			}
			
			case '1': {

				numerosPorExtenso[i] = "Um";
				break;
				
			}

			case '2': {

				numerosPorExtenso[i] = "Dois";
				break;
				
			}
			
			case '3': {

				numerosPorExtenso[i] = "Três";
				break;
				
			}
			
			case '4': {

				numerosPorExtenso[i] = "Quatro";
				break;
				
			}
			
			case '5': {

				numerosPorExtenso[i] = "Cinco";
				break;
				
			}
			
			case '6': {

				numerosPorExtenso[i] = "Seis";
				break;
				
			}
			
			case '7': {

				numerosPorExtenso[i] = "Sete";
				break;
				
			}
			
			case '8': {

				numerosPorExtenso[i] = "Oito";
				break;
				
			}
			
			case '9': {

				numerosPorExtenso[i] = "Nove";
				break;
				
			}

			}

		}
		
		for (int i = 0; i < numerosPorExtenso.length; i++) {
			
			if (i == numerosPorExtenso.length -1) {
				
				System.out.print(numerosPorExtenso[i] +  ".");
			} else {
				if (i == 0) {
					
					System.out.print(numerosPorExtenso[i] + ", ");
					
				} else {
					
					System.out.print(numerosPorExtenso[i].toLowerCase() + ", ");
					
				}
				
			}
			
		}
	
		input.close();
	}

}
