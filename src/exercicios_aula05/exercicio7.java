package exercicios_aula05;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do produto: R$ ");
		double valorProduto = scanner.nextDouble();

		System.out.print("Digite o valor pago: R$ ");
		double valorPago = scanner.nextDouble();

		if (valorPago < valorProduto) {
			System.out.println("Valor pago é insuficiente para o valor do produto.");
		} else {
			double troco = valorPago - valorProduto;

			System.out.printf("Troco a ser pago: R$ %.2f%n", troco);
		}

		scanner.close();
	}
}
