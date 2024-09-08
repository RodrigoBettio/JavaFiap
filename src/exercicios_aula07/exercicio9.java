package exercicios_aula07;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do { 

            System.out.print("Digite o número para exibirmos seus divisores:");
            num = scanner.nextInt();
            
        } while (num <= 0);

        System.out.printf("Divisores de %d sao: \n", num);

        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }

        }
    }
}
