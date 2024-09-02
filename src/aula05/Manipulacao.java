package aula05;

import java.util.Scanner;

public class Manipulacao {
	public static void main(String[] args) {
		
		double salario = 1416.30;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salario +salario);
		System.out.println(salarioStr + salarioStr);
		
		System.out.println(" ");
		
		String idade = "26";
		int idadeInteiro = Integer.parseInt(idade);
		
		System.out.println(idadeInteiro);
		System.out.println(" ");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o preco do produto:");
		String preco = scanner.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
	}
}
