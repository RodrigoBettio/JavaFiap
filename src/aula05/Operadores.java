package aula05;

public class Operadores {
	public static void main(String[] args) {
		float num1 = 5f;
		float num2 = 2f;
		
		System.out.println(num1);
		System.out.println(num2);
		
		float soma = num1 + num2;
		System.out.println("Soma: "+soma);
		
		float subtracao = num1 - num2;
		System.out.println("sub: " + subtracao) ;
		
		
		float multiplicacao = num1 * num2;
		System.out.println("Multi " + multiplicacao);
		
		float divisao = num1 / num2;
		System.out.println("Div: " + divisao);
		
		float restDiv = num1 % num2;
		System.out.println("Resto: " + restDiv);
		
		//Operadores Unários
		
		int numero = 15;
		System.out.println(" ");
		
		System.out.println(numero ++);
		System.out.println(numero);
		System.out.println(++numero);
		
		System.out.println(numero+1);
		System.out.println(numero);
		
		numero --;
		System.out.println(numero);
		
		//Operadores de Atribuição
		
		int number = 5;
		System.out.println("");
		System.out.println(number);
		
		number+= 7;
		System.out.println();
		
		number /= 2;
		System.out.println();
		
				
	}

}
