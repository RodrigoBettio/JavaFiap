package exercicios_aula07;
import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int alunosAcimaDaMedia = 0;
        int alunosAbaixoDaMedia = 0;

        System.out.println("Quantos alunos são na turma?");
        int totalAlunos = scanner.nextInt();
        
        System.out.println("Qual é a média da turma?");
        double mediaTurma = scanner.nextDouble();

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.printf("Coloque a nota do aluno %d:", i );
            double notaAluno = scanner.nextDouble();
            
            if (notaAluno >= mediaTurma) {
                alunosAcimaDaMedia++;
            } else {
                alunosAbaixoDaMedia++;
            }
        }
        System.out.printf("Alunos com nota superior a média: %d%n", alunosAcimaDaMedia);
        System.out.printf("Alunos com nota inferior a média: %d%n", alunosAbaixoDaMedia);
        
	
}
}