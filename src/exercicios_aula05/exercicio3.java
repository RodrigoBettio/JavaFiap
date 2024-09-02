package exercicios_aula05;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu gênero [M] para masculino, [F] para feminino, [O] para outro, [N] para não responder: ");
        char genero = scanner.next().charAt(0);
        
        System.out.println("Olá, " + nome + "! Você escolheu a seguinte opção de gênero: " + genero);
        
        scanner.close();
    }
}