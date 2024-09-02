package exercicios_aula06;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Digite o número:");
		int numero = scanner.nextInt();
		
		if (numero == 0 ) {
		System.out.println("0 não é par, nem ímpar");	
		} else if (numero % 2 == 0 ){
			System.out.println("O seu número é par");
		} else {
			System.out.println("O número é impar");
		}
		
		
	}
}
	 
		
