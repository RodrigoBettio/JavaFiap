package exercicios_aula05;
import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de anos que você tem: ");
		int ano = scanner.nextInt();
		
		System.out.println("Digite o número de meses que você tem: ");
		int meses = scanner.nextInt();
		
		System.out.println("Digite o número de dias que você tem: ");
		int dias = scanner.nextInt();
		
		int totalAno = ano * 365;
		int totalMes = meses * 30;
		int totalDias = totalAno + totalMes + dias;
		
		System.out.println("O total de dias é de:" + totalDias);
		
	
	}
}
