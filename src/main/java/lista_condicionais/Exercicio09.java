package lista_condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat("00.00");
		
		double valorMorango = 0;
		double valorMaca = 0;
		
		System.out.print("Quantos kilos de morango você comprou? : ");
		double kgMorango = input.nextDouble();
		
		System.out.print("Quantos kilos de maca você comprou? : ");
		double kgMaca = input.nextDouble();
		
		if (kgMorango <= 5) {
			
			valorMorango = 2.50 * kgMorango;
			
		} else {
			
			valorMorango = 2.20 * kgMorango;
			
		}
		
		if (kgMaca <= 5) {
			
			valorMaca = 1.80 * kgMaca;
			
		} else {
			
			valorMaca = 1.50 * kgMaca;
			
		}
		
		double kgTotal = kgMorango + kgMaca;
		double valorTotal = valorMorango + valorMaca;
				
		if (kgTotal > 8 || valorTotal > 25) {
			
			valorTotal = valorTotal  * 0.90;
			
		}
		
		System.out.println("O valor total da sua compra foi: R$" + formatador.format(valorTotal));
		
		
	input.close();
	}

}
