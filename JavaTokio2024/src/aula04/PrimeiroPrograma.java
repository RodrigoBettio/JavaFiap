package aula04;
import java.util.Scanner;
public class PrimeiroPrograma {

	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		int idade = 25, data;
		
		System.out.print("Digite o seu nome: ");
		System.out.print(scanner.nextLine());
		
		final int IDADE = 18;
		
		System.out.println(IDADE);
		
		scanner.close();
	}
}
