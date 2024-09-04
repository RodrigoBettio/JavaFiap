package exercicios_aula07;
import java.util.Iterator;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double soma = 0;
		
		for(int i = 1; i <=10; i ++ ) {
			System.out.println("Digite um número para somar:");
			double numero = scanner.nextDouble();
			soma += numero;
		}
		System.out.printf("A soma de todos os números eh: %.2f",soma);
	}

}
