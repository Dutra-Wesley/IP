package lista_repeticao_extra;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String resposta;
		String modeloMaisEconomico = "";
		double perfomanceAeronave =0;
		
		do {
			
			System.out.print("Informe o modelo da aeronave: ");
			String modelo = input.nextLine();
			
			System.out.print("Informe a distância percorrida (em Km): ");
			double distancia = input.nextDouble();
			
			System.out.print("Informe o combustível gasto (em litros): ");
			double litro = input.nextDouble();
			
			System.out.print("Deseja informar outra aeronave? SIM OU NÃO: ");
			resposta = input.next();
			
			input.nextLine();
			
			double consumoPorLitro = distancia / litro;
			
			
			if (consumoPorLitro > perfomanceAeronave) {
				
				modeloMaisEconomico = modelo;
				perfomanceAeronave = consumoPorLitro;
				
			}
			
		} while (resposta.equalsIgnoreCase("SIM"));
		
		System.out.println("O modelo mis econômico é: " + modeloMaisEconomico);
		System.out.println("O consumo total foi: " + perfomanceAeronave + " litros");
		
		
		
	input.close();
	}

}
