package exercicios_aula06;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite suas 4 notas");
		
		double nota1 = scanner.nextDouble();
		double nota2 = scanner.nextDouble();
		double nota3 = scanner.nextDouble();
		double nota4 = scanner.nextDouble();
		
		double notaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Sua nota foi de: %.2f ", notaFinal);
		if (notaFinal >= 7) {
			System.out.println("Você foi aprovado");
		}else if (notaFinal >= 5) {
			System.out.println("Você está em recuperação");
		}else {
			System.out.println("Você foi aprovado");
		}
	}
}
