package lista_strings;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite uma data no formato (DD/MM/AAAA): ");
		String data = input.nextLine();
		
		String partesData[] = data.split("/");
		
		String mes = digitarMesPorExtenso(data);
		
		System.out.println("Você nasceu em " + partesData[0] + " de " + mes + " de " + partesData[2]);
		
		input.close();
	}

	static String digitarMesPorExtenso(String data) {
		
		String partesData[] = data.split("/");
		String mes = "";
		
		switch (partesData[1]) {
		
			case "01": {
			
				mes = "janeiro";
				
			break;
			
			}
			
			case "02": {
				
				mes = "fevereiro";
				
			break;
			
			}
			
			case "03": {
				
				mes = "março";
				
			break;
			
			}
			
			case "04": {
				
				mes = "abril";
				
			break;
			
			}
			
			case "05": {
				
				mes = "maio";
				
			break;
			
			}
			
			case "06": {
				
				mes = "junho";
				
			break;
			
			}
			
			case "07": {
				
				mes = "julho";
				
			break;
			
			}
			
			case "08": {
				
				mes = "agosto";
				
			break;
			
			}
			
			case "09": {
				
				mes = "setembro";
				
			break;
			
			}
			
			case "10": {
				
				mes = "outubro";
				
			break;
			
			}
			
			case "11": {
				
				mes = "novembro";
				
			break;
			
			}
			
			case "12": {
				
				mes = "dezembro";
				
			break;
			
			}

		}
		
		return mes;
	}

}
