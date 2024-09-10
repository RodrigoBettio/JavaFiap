package exercicios_aula05;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número entre 0 e 999: ");

		int numero = scanner.nextInt();
		if (numero < 0 || numero > 999) {
			System.out.println("Número fora do intervalo permitido. Por favor, digite um número entre 0 e 999.");
			return;
		}

		int centena = (numero / 100) * 100;
		int dezena = ((numero % 100) / 10) * 10;
		int unidade = numero % 10;

		System.out.println("Centena = " + centena);
		System.out.println("Dezena = " + dezena);
		System.out.println("Unidade = " + unidade);
	}
}
