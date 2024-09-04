package exercicios_aula07;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String saida;
		
		do {
			System.out.println("Olá mundo! ");
			System.out.println("Você deseja exibir a mensagem novamente?");
			saida = scanner.nextLine().toLowerCase();
			
		} while (saida.equals("sim"));
		
		System.out.println("Fim");
		
	}
}


