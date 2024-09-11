package exercicios_aula9;
import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Insira um número:");
		int numero = scanner.nextInt();
		
		double[] listaNum = new double[numero];
		
		if (numero > 0) {
			for(int i = 0; i < numero; i ++) {
				double num = rand.nextDouble(0, Double.MAX_VALUE);
				
				listaNum[i] = num;
			}
			
		}else {
			System.out.println("Esse número não é positivo");
		}
		
		for(double num : listaNum) {
			System.out.println(num);
		}
		
	}

}
