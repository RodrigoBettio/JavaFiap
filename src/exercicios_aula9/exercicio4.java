package exercicios_aula9;
import java.util.Scanner;

public class exercicio4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = scanner.nextInt();

        
        double[] notas = new double[n];
        double soma = 0.0;


        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; 
        }

        // Calcula a média dos alunos
        double media = soma / n;
        System.out.printf("A média da turma é: %.2f\n", media);

        int acimaMedia = 0;
        int abaixoMedia = 0;
        int igualMedia = 0;

        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            } else {
                igualMedia++;
            }
        }

        // Exibição dos resultados
        System.out.println("Número de notas acima da média: " + acimaMedia);
        System.out.println("Número de notas abaixo da média: " + abaixoMedia);
        System.out.println("Número de notas iguais à média: " + igualMedia);

        scanner.close();
    }
    
}
