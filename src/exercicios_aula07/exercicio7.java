package exercicios_aula07;
import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para contagem
        int alunosAcimaDaMedia = 0;
        int alunosAbaixoDaMedia = 0;

        // Recebe o número de alunos
        System.out.println("Quantos alunos são na turma?");
        int totalAlunos = scanner.nextInt();
        
        // Recebe a média da turma
        System.out.println("Qual é a média da turma?");
        double mediaTurma = scanner.nextDouble();

        // Processa as notas de cada aluno
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Coloque a nota do aluno " + i + ": ");
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