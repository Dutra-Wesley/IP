package lista_array_e_matrizes_extra;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double totalTempoCorrida =0;
		double atletaMaisRapido =0;
		double atletaMaisDevagar =Double.POSITIVE_INFINITY;
		
		double tempoCorrida[] = new double [11];
		
		for (int i = 1; i < tempoCorrida.length; i++) {
			
			System.out.print("Informe o tempo de corrida do " + i + "º atleta: ");
			tempoCorrida[i] = input.nextDouble();
			
			totalTempoCorrida += tempoCorrida[i];
			
			if (tempoCorrida[i] < atletaMaisDevagar) {
				
				atletaMaisDevagar = tempoCorrida[i];
				
			}
			
			if (tempoCorrida[i] > atletaMaisRapido) {
				
				atletaMaisRapido = tempoCorrida[i];
				
			}
			
		}
		
		double mediaCorrida = totalTempoCorrida / 10;
		
		double diferencaTempoMaisDevagar = mediaCorrida - atletaMaisDevagar;
		double diferencaTempoMaisRapido = atletaMaisRapido - mediaCorrida;
		
		System.out.println("O tempo médio dos atletas é: " + mediaCorrida);
		System.out.println("A diferença de tempo do mais devagar para o tempo médio é: " + diferencaTempoMaisDevagar);
		System.out.println("A difrença de tempo do mais rápido para o tempo médio é: " + diferencaTempoMaisRapido);
		
	input.close();
	}

}
