package exercicios_aula05;
import java.util.Scanner;

public class desafio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Digite a idade em dias: ");
	    
	    int totalDias = scanner.nextInt();
	    int anos = totalDias / 365;
	    int diasRestantes = totalDias % 365;
	    int meses = diasRestantes / 30;
	    int dias = diasRestantes % 30;
	
	    System.out.println("Isso corresponde a: ");
	    System.out.println(anos + " ano(s)");
	    System.out.println(meses + " mes(es)");
	    System.out.println(dias + " dia(s)");
	
	}
}
