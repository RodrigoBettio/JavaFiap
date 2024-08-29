package exercicios_aula06;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do número 1:");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite o valor do número 2:");
		double n2 = scanner.nextDouble();
		
		System.out.println("Digite o valor da operação que você deseja fazer? (+, -, *, /)");
		scanner.nextLine();
		String caracter = scanner.nextLine();
		
		switch (caracter) {
		case "/": 
			
			double divisao = n1/n2;
			System.out.printf("A divisao entre %.2f e %.2f é: %.2f",n1, n2, divisao);
			break;
		
		case "*":
			double multiplicacao = n1*n2;
			System.out.printf("A multiplicacão de %.2f e %.2f é: %.2f",n1, n2, multiplicacao);
			break;
			
		case "+": 
			double soma = n1+n2;
			System.out.printf("A soma entre %.2f e %.2f é: %.2f", n1, n2, soma);
			break;
			
		case "-": 
			double subtracao = n1-n2;
			System.out.printf("A subtracao entre %.2f e %.2f é: %.2f", n1, n2, subtracao);
			break;
			
		default:
			System.out.println("Digite um caracter correspondente");
		}
	}
}
