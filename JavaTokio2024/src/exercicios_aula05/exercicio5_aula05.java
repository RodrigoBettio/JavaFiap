package exercicios_aula05;
import java.util.Scanner;

public class exercicio5_aula05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Nota 1:");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a Nota 2:");
		double nota2 = scanner.nextDouble();
		
		double notaFinal = ((nota1*4) + (nota2*6))/10;
		
		System.out.printf("Sua nota final é: "+ notaFinal);
		
	}
}
