package lista_condicionais_extra;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		double peso = input.nextDouble();
		
		System.out.print("Informe sua altura: ");
		double altura = input.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			
			System.out.println("Abaixo do peso");
			
		} else if (imc > 18.5 && imc < 24.9) {
			
			System.out.println("Normal");
			
		} else if (imc > 25 && imc < 29.9) {
			
			System.out.println("Sobrepeso");
			
		} else if (imc > 30 && imc < 34.9) {
			
			System.out.println("Obesidade - Grau I");
			
		} else if (imc > 35 && imc < 39.9) {
			
			System.out.println("Obesidade - Grau II");
			
		} else if (imc >= 40.0) {
			
			System.out.println("Obesidade - Grau III");
			
		}
		
	input.close();
	}

}
