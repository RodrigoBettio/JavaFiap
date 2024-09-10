package exercicios_aula05;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		final double TAXA_DOLAR = 0.18;
		final double TAXA_EURO = 0.16;
		final double TAXA_PESO_ARG = 168.99;
		final double TAXA_LIBRA = 0.13;
		final double TAXA_IENE = 25.75;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor em Reais: ");
		double valorReais = scanner.nextDouble();

		double valorDolar = valorReais * TAXA_DOLAR;
		double valorEuro = valorReais * TAXA_EURO;
		double valorPesoArg = valorReais * TAXA_PESO_ARG;
		double valorLibra = valorReais * TAXA_LIBRA;
		double valorIene = valorReais * TAXA_IENE;

		System.out.printf("Valor em Real: %.2f BRL%n", valorReais);
		System.out.printf("Valor em Dólar: %.2f USD%n", valorDolar);
		System.out.printf("Valor em Euro: %.2f EUR%n", valorEuro);
		System.out.printf("Valor em Peso Argentino: %.2f ARS%n", valorPesoArg);
		System.out.printf("Valor em Libra Esterlina: %.2f GBP%n", valorLibra);
		System.out.printf("Valor em Iene Japonês: %.2f JPY%n", valorIene);

	}

}
