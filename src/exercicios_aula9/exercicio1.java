package exercicios_aula9;

public class exercicio1 {
	public static void main(String[] args) {

		int[] v = {2, 0, 3, 9};
		v[v[2]] = v[v[1]]; // v[3] v[0]
		for (int i: v){
		System.out.print(i);
		}
		
		// O resultado é 2032
	}
}
