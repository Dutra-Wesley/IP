package lista_metodos;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double ladosTriangulo[] = new double [3];
		
		// INFORMAR LADOS TRIÂNGULO
		for (int i = 0; i < ladosTriangulo.length; i++) {
			
			System.out.print("Informe os lados do triângulo: ");
			ladosTriangulo[i] = input.nextDouble();
			
		}
		
		boolean triangulo = verificarTriangulo(ladosTriangulo);
		
		if (triangulo) {
			
			verificarTipoTriangulo(ladosTriangulo);
			
		} else {
			
			System.out.println("Não é um triângulo!");
			
		}
		
		input.close();
	}

	static boolean verificarTriangulo (double ladosTriangulo[]) {
		
		// VERIFICAR LADOS TRIÂNGULO
		if (ladosTriangulo[0] < ladosTriangulo[1] + ladosTriangulo[2]) {
			
			if (ladosTriangulo[1] < ladosTriangulo[2] + ladosTriangulo[0]) {
				
				if (ladosTriangulo[2] < ladosTriangulo[1] + ladosTriangulo[0]) {
					
					return true;
				}
				
			}
			
		}
		
		return false;
	}
	
	static void verificarTipoTriangulo (double ladosTriangulo[]) {
		
		// VERIFICAR TIPO TRIÂNGULO
		if (ladosTriangulo[0] == ladosTriangulo[1] && ladosTriangulo[0] == ladosTriangulo[2]) {
			
			System.out.println("É um Triângulo Equilátero!");
			
		} else if (ladosTriangulo[0] != ladosTriangulo[1] && ladosTriangulo[0] != ladosTriangulo[2] && ladosTriangulo[1] != ladosTriangulo[2]) {
			
			System.out.println("É um Triângulo Escaleno!");
			
		} else {
			
			System.out.println("É um Triângulo Isoscéles!");
			
		}
		
	}
	
}
