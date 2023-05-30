package lista_metodos;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe a idade do nadador: ");
		int idadeNadador = input.nextInt();
		categoria(idadeNadador);
		
		input.close();
	}

	static void categoria(int idadeNadador) {

		if (idadeNadador <= 10) {

			System.out.println("Categoria Mirim");
		}

		if (idadeNadador > 10 && idadeNadador <= 14) {

			System.out.println("Categoria Infantil");
		}

		if (idadeNadador > 14 && idadeNadador <= 19) {

			System.out.println("Categoria Juvenil");
		}

		if (idadeNadador > 19) {

			System.out.println("Categoria Adulto");
		}

	}

}
