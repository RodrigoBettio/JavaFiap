package exercicios_aula06;
public class exercicio7 {
    public static void main(String[] args) {

        final int a = 5;
        final int b = 7;
        final int c = 4;
        final int d = 8; 

        boolean A = (a <= b) && (b<d);
        boolean B = (a == b) || (c!=b);
        boolean C = ( d > a ) && (c>=b );
        boolean D = (a <= b) || (c <= d);
        boolean E = ((b > c) || (c < a)) && (d <= b);

        System.out.println("Questão A." + A);
        System.out.println("Questão B." + B);
        System.out.println("Questão C." + C);
        System.out.println("Questão D." + D);
        System.out.println("Questão E." + E);

    }
    
}
