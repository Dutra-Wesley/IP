package lista_metodos;

public class Exercicio07 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 100; i++) {
			
			System.out.println("---------------");
			if (verificarPrimo(i)) {
				
				System.out.println(i + " é primo");
				
			} else {
				
				System.out.println(i + " não é primo");
				
			}
			
		}
		
	}

	static boolean verificarPrimo (int i) {
		
		if (i == 0 || i == 1) {
			
			return false;
			
		}
		
		for (int j = 2; j < i; j++) {
			
			if (i %j == 0) {
				
				return false;
				
			}
			
		}
		
		return true;
	}
	
}
