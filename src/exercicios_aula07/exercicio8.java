package exercicios_aula07;
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;
        int resultado = 0;
        

        do { 

            System.out.print("Digite o número para somarmos:");
            num = scanner.nextInt();
            
        } while (num <= 0);

        for(int i = 1; i <= num; i ++){

            resultado += i ;
        }

        System.out.printf("A soma de 1 até %d eh: %d", num, resultado);
        //Usuario digita um numero
        //Conferir se o número é positivo
        //Somar todos os números de 0 a n

    }
    
}
