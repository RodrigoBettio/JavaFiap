package exercicios_aula06;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os 2 números para verificar se são múltiplos");
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if(n1%n2 == 0) {
			System.out.println("Eles são múltiplos");
		}else {
			System.out.println("Eles não são múltiplos");
		}
		
	}
}
