package exercicios_aula06;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o seu salário: ");
        double salario = scanner.nextDouble();

        if (salario <= 280){
            double salarioTotal = salario * 1.2;
            System.out.printf("Seu salário é de: %f", salarioTotal);
        } else if(salario <= 700){
            double salarioTotal = salario * 1.15;
            System.out.printf("Seu salário é de: %f", salarioTotal);
            
        } else if(salario <= 1500){
            double salarioTotal = salario * 1.10;
            System.out.printf("Seu salário é de: %f", salarioTotal);
        }else if(salario > 1500){
            double salarioTotal = salario * 1.05;
            System.out.printf("Seu salário é de: %f", salarioTotal);
        }
        

    }

 
    
}
