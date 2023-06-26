package treinando_prova;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		double notasPerformance[] = preencherMatriz();
		double mediaNotas = calcularMedia(notasPerformance);
		int notasAcimaMedia = somarNotasAcimaMedia(notasPerformance, mediaNotas);
		
		System.out.println("A média total das notas obtidas foi: " + mediaNotas);
		System.out.println("No total " + notasAcimaMedia + " notas ficaram acima da média!");
		
	}

	static int somarNotasAcimaMedia(double[] notasPerformance, double mediaNotas) {
		
		int notasAcimaMedia = 0;
		
		for (int i = 0; i < notasPerformance.length; i++) {
			
			if (notasPerformance[i] > mediaNotas) {
				
				notasAcimaMedia++;
				
			}
			
		}
		
		return notasAcimaMedia;
	}

	static double calcularMedia(double[] notasPerformance) {
		
		double totalNotas = 0;
		
		for (int i = 0; i < notasPerformance.length; i++) {
			
			totalNotas += notasPerformance[i];
			
		}
		
		double MediaNotas = totalNotas / notasPerformance.length;
		
		return MediaNotas;
	}

	static double[] preencherMatriz() {
		
		Scanner input = new Scanner(System.in);
		
		double notasPerformance[] = new double [10];
		
		for (int i = 0; i < notasPerformance.length; i++) {
			
			System.out.print("Informe a " + (i+1) + "ª nota obtida no teste de performance: ");
			notasPerformance[i] = input.nextDouble();
			
		}
		
		input.close();
		return notasPerformance;
	}

}
