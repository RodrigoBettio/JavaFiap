package exercicios_aula06;
import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int anoAtual = 2024;

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade < 16) {
            System.out.println("Voto proibido este ano.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório este ano.");
        } else {
            System.out.println("Seu voto é opcional este ano.");
        }
		
	}
}
