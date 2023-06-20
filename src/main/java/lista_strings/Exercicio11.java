package lista_strings;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe uma data no padrão dd/mm/yyyy: ");
		String data = input.nextLine();
		
		String partesData[] = data.split("/");
		String mes = "";
		
		switch (partesData[1]) {
		case "1":
			
			break;

		default:
			break;
		}
		
		
		input.close();
	}

}
