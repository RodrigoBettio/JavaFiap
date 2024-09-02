package exercicios_aula06;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;


public class exercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado A: ");
		double lado1 = scanner.nextDouble();
		
		System.out.println("Digite o valor do lado B:");
		double lado2 = scanner.nextDouble();
		
		System.out.println("Digite o valor do lado C");
		double lado3 = scanner.nextDouble();
		
		List<Double> lados = Arrays.asList(lado1, lado2, lado3);
		
		// Ordena o array em ordem crescente
        Collections.sort(lados, Collections.reverseOrder()); //Reverse Order usa um comparator e salva a lista ao contrário
		System.out.println(lados);
        double ladoA = lados.get(0);
        double ladoB = lados.get(1);
        double ladoC = lados.get(2);
        
        if (ladoA >= (ladoB + ladoC)) {
            System.out.println("Não forma um triângulo");
        } else if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Formará um Triângulo Equilátero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("Formará um Triângulo Isósceles");
        } else {
            // Verifica o tipo de triângulo baseado nos ângulos
            if (ladoA * ladoA == ladoB * ladoB + ladoC * ladoC) {
                System.out.println("Formará um Triângulo Retângulo");
            } else if (ladoA * ladoA > ladoB * ladoB + ladoC * ladoC) {
                System.out.println("Formará um Triângulo Obtusângulo");
            } else {
                System.out.println("Formará um Triângulo Acutângulo");
            }
        }

}
}