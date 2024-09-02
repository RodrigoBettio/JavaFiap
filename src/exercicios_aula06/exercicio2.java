package exercicios_aula06;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o valor do primeiro número:");
		float n1 = scanner.nextFloat();
		
		System.out.println("Insira o valor do segundo número:");
		float n2 = scanner.nextFloat();
		
		if (n1 > n2 ) {
			System.out.printf("O %.2f é o número maior", n1);
		} else if (n1 < n2 ) {
				System.out.printf("O %.2f é o número maior", n2);
		} else {
			System.out.println("Os números são iguais");
		}
		
	}
	
}
