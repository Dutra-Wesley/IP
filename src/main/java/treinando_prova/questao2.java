package treinando_prova;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor que você possui: ");
		double valorCliente = input.nextDouble();
		
		calcularCustoBeneficio(valorCliente);
		
		input.close();
	}

	static void calcularCustoBeneficio(double valorCliente) {
		
		if (valorCliente < 2000) {
			
			System.out.println("Sua placa indicada é uma RTX 2070");
			
		} else if (valorCliente >= 2000 && valorCliente <= 5000 ) {
			
			System.out.println("Sua placa indicada é uma RTX 3060");
			
		} else if (valorCliente > 5000) {
			
			System.out.println("Sua placa indicada é uma RTX 3080");
			
		}
		
	}

}
