package exercicios_aula04;
import java.util.Scanner;

public class exercicio3_aula04 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o seu nome: ");
	String nome = scanner.nextLine();
	
	System.out.printf("Olá, %s", nome);
	}
}
