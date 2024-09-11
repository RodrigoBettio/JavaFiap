package exercicios_aula8;


public class exercicio5 {
	public static void main(String[] args) {
		int min = 5;
		int max = 50;
		double total = 0;
		
		for (int i = 0; i < 10; i ++) {
		double num = min + Math.random() * (max - min);
		
		total += num;
		
		}
		
		System.out.println(total);
	}
}
