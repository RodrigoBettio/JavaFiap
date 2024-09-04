package exercicios_aula07;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		int base = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para imprimir a tabuada:");
		int numero = scanner.nextInt();
		
		do {
			//Usuário vezes o número base
			int resultado = numero*base;
			System.out.printf("%d x %d = %d\n", numero, base, resultado);
			base += 1; 
			
		} while(base <=25);
	}
}
