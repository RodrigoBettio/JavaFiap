package exercicios_aula06;
import java.util.Scanner;

public class exercicio9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tipo no qual se identifica:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        int tipoCliente = scanner.nextInt();
        
        System.out.print("Digite o consumo em kWh: ");
        double consumo = scanner.nextDouble();
        
        double valorKWh = 0;

        switch (tipoCliente) {
            case 1:
                valorKWh = 0.60; 
                break;
            case 2:
                valorKWh = 0.48; 
                break;
            case 3:
                valorKWh = 1.29; 
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
        }
        
        double valorConta = consumo * valorKWh;
        System.out.printf("O valor da conta de luz é: R$ %.2f%n", valorConta);
        
    }
}
