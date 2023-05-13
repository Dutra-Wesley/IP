package exercicios;

import java.util.Scanner;

public class Feira {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Quantos quilos de maça você comprou Joana?: ");
		double quiloMaca = teclado.nextDouble();
		
		System.out.println("Qual foi o preço da maça neste dia?: ");
		double precoMaca = teclado.nextDouble();
		
		System.out.println("Quantos quilos de laranja você comprou Joana?:");
		double quiloLaranja = teclado.nextDouble();
		
		System.out.println("Qual foi o preço da Laranha neste dia?: ");
		double precoLaranja = teclado.nextDouble();
		
		System.out.println("Total gasto do dia foi: " + ((quiloMaca * precoMaca) + (quiloLaranja * precoLaranja)));
		
		teclado.close();
		
	}

}
