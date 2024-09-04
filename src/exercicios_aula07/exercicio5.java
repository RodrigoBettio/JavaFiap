package exercicios_aula07;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double novoNumero = 0;
		
		for(int i = 1; i <=12; i ++ ) {
			System.out.println("Digite um número, ao final, mostraremos qual o maior deles:");
			double numero = scanner.nextDouble();
			
			if (numero > novoNumero) {
				novoNumero = numero;
			}
		}
		System.out.printf("O maior número digitado eh: %.2f",novoNumero);
	}

}
