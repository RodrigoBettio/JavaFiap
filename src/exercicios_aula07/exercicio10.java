package exercicios_aula07;

public class exercicio10 {
	public static void main(String[] args) {
		double numero;
		int i;
		boolean trueFalse;

		for (i = 2; i <= 2000; i++) {
			numero = Math.sqrt(i);

			trueFalse = verificadorNumeroPrimo(numero, i);

			if (trueFalse == true) {
				System.out.printf("%d eh primo\n", i);
			} else {
				System.out.printf("%d não eh primo\n", i);
			}
		}
	}

	public static boolean verificadorNumeroPrimo(double numero, int i) {

		// Numero == raiz

		for (int j = 2; j <= numero; j++) { // Percorrendo de 2 até a raiz do número
			if (i % j == 0) { // Se numero dividido pela sua raiz, der resto 0, retorna falso
				return false;
			}

		}

		return true;
	}
}
