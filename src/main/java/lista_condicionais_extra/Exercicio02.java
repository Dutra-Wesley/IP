package lista_condicionais_extra;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe seu salário bruto: ");
		double salarioBruto = input.nextDouble();
		
		double salarioInss = salarioBruto * 0.90;
		
		double salarioImposto = 0;
		
		if (salarioInss < 1000) {
			
			salarioImposto = salarioInss * 0.95;
			
		} else if (salarioInss > 1000 && salarioInss < 3000) {
			
			salarioImposto = salarioInss * 0.90;
			
		}  else if (salarioInss > 3000) {
			
			salarioImposto = salarioInss * 0.80;
			
		}
		
		System.out.println("Seu salário líquido foi: R$" + salarioImposto);
		
	input.close();
	}

}
