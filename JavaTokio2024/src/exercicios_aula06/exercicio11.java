package exercicios_aula06;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o código do estado de origem (1 a 5): ");
        int codigoEstado = scanner.nextInt();
        
        System.out.print("Digite o peso da carga (em toneladas): ");
        double pesoToneladas = scanner.nextDouble();

        System.out.println("Digite o código da carga (10 a 40): ");
        int codigoCarga = scanner.nextInt();

        double pesoQuilos = pesoToneladas * 1000;
        
        double precoCarga = 0;
        if (codigoCarga >= 10 && codigoCarga <= 20) {
            precoCarga = pesoQuilos * 100;
        } else if (codigoCarga >= 21 && codigoCarga <= 30) {
            precoCarga = pesoQuilos * 250;
        } else if (codigoCarga >= 31 && codigoCarga <= 40) {
            precoCarga = pesoQuilos * 340;
        } else {
            System.out.println("Código de carga inválido.");
        }
        
        double imposto = 0;
        switch (codigoEstado) {
            case 1:
                imposto = precoCarga * 0.35;
                break;
            case 2:
                imposto = precoCarga * 0.25;
                break;
            case 3:
                imposto = precoCarga * 0.15;
                break;
            case 4:
                imposto = precoCarga * 0.05;
                break;
            case 5:
                imposto = precoCarga * 0.00;
                break;
            default:
                System.out.println("Código do estado inválido.");
        }
        
        double valorTotal = precoCarga + imposto;

        System.out.printf("Peso da carga em quilos: %.2f kg%n", pesoQuilos);
        System.out.printf("Preço da carga: R$ %.2f%n", precoCarga);
        System.out.printf("Valor do imposto: R$ %.2f%n", imposto);
        System.out.printf("Valor total transportado: R$ %.2f%n", valorTotal);
        
    }
    
}
