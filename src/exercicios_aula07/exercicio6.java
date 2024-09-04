package exercicios_aula07;
import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Exibir todos os valores pares entre 2 e o número que o usuário digitar
		System.out.println("Digite um número:");
		int numero = scanner.nextInt();
		
		for (int i = 2; i <= numero; i+=2) {
			System.out.println(i);
		}
		
	}
}
