package exercicios_aula8;

import java.util.Scanner;
import java.time.LocalTime;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Olá, qual é o seu nome?");
		String nome = scanner.nextLine();

		LocalTime horaAtual = LocalTime.now();
		int hora = horaAtual.getHour();

		if (hora >= 18) {
			System.out.printf("Boa noite %s", nome);
		} else if (hora >= 12) {

			System.out.printf("Boa tarde %s", nome);
		} else {
			System.out.printf("Bom dia %s ", nome);
		}

	}
}
