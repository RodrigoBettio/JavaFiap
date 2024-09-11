package exercicios_aula8;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um texto abaixo:");
		String texto = scanner.nextLine();

		int quantidadeMaiusculo = 0;
		int quantidadeMinusculo = 0;
		int quantidadeNumeros = 0;
		int quantidadeEspacos = 0;

		for (char caractere : texto.toCharArray()) {
			if (Character.isUpperCase(caractere)) {
				quantidadeMaiusculo++;
			} else if (Character.isLowerCase(caractere)) {
				quantidadeMinusculo++;
			} else if (Character.isDigit(caractere)) {
				quantidadeNumeros++;
			} else if (Character.isWhitespace(caractere)) {
				quantidadeEspacos++;
			}
		}

		System.out.printf("A quantidade de letras maiusculas digitadas é de: %d\n", quantidadeMaiusculo);
		System.out.printf("A quantidade de letras minusculas digitadas é de: %d\n", quantidadeMinusculo);
		System.out.printf("A quantidade de numeros digitados é de: %d\n", quantidadeNumeros);
		System.out.printf("A quantidade de espaços em branco é de: %d\n", quantidadeEspacos);
	}
}
