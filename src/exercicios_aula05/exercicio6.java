package exercicios_aula05;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escreva o nome da peça1");
		String peca1 = scanner.nextLine();

		System.out.println("Escreva a quantidade possuída da sua peça");
		int quantidadePeca1 = scanner.nextInt();

		System.out.println("Escreva o preço da peça unitária");
		double precoPeca1 = scanner.nextDouble();

		System.out.println("Escreva o nome da peça2");
		scanner.nextLine();
		String peca2 = scanner.nextLine();

		System.out.println("Escreva a quantidade possuída da sua peça");
		int quantidadePeca2 = scanner.nextInt();

		System.out.println("Escreva o preço da peça unitária");
		double precoPeca2 = scanner.nextDouble();

		System.out.printf("O preço total do item %s é de: %d ", peca1, (quantidadePeca1 * precoPeca1));
		System.out.printf("O preço total do item %s é de: %d ", peca2, (quantidadePeca2 * precoPeca2));

	}
}
