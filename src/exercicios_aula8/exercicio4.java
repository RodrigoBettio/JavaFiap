package exercicios_aula8;

public class exercicio4 {
	public static void main(String[] args) {
		double x = Math.sqrt(81);

		double conta = ((5 * x) + (2 * Math.pow(x, 2)) + (Math.cbrt(8) - (Math.PI * x))) / (Math.pow(3, 4) + x);

		System.out.printf("O resultado da expressão é: %f", conta);
	}
}
