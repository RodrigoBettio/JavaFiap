package exercicios_aula07;
import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nota = 0;
		int maior = 0;
		
		System.out.println("Quantos alunos são na turma?");
		int alunos = scanner.nextInt();
		
		System.out.println("Qual é a média da turma?");
		int media = scanner.nextInt();
		
		
		
		for (int i = 1; i<= alunos; i++) {
			System.out.println("Coloque a nota: ");
			nota = scanner.nextInt();
			
			if (nota >= media) {
				maior ++;
			}
			
		}
		System.out.printf("A quantidade de alunos que estão na média são: %d", maior);
	}
	
}
