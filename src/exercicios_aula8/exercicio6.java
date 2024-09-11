package exercicios_aula8;

import java.util.Random;

public class exercicio6 {
	public static void main(String[] args) {

		int pares = 0;
		int impares = 0;
		int primos = 0;
		boolean trueFalse;

		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			int num = rand.nextInt(0, 101);

			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}

			trueFalse = verificadorNumeroPrimo(num);

			if (trueFalse == true) {
				primos++;
			}
		}
		
		System.out.printf("A quantidade de números pares foi de: %d \n", pares);
		System.out.printf("A quantidade de números impares foi de: %d \n", impares);
		System.out.printf("A quantidade de números primos foi de: %d \n", primos);
		
	}

	public static boolean verificadorNumeroPrimo(int num) {

		for (int i = 3; i <= Math.sqrt(num); i ++) {
			if (num % i == 0) {
				return false;
			}

		}

		return true;
	}
}
