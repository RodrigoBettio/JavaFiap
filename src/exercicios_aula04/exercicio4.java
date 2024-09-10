package exercicios_aula04;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade e seu nome respectivamente");
		double idade = scanner.nextDouble();
		String nome = scanner.nextLine();

		System.out.printf("Olá, %s. Você tem %d anos", nome, idade);

	}
}
