package unid0;

public class IngresoDatos {
    public static void main(String[] args) {
            int N=4;
            double A=6.7;
            char C='H';
        System.out.println("Valor de N: " + N);
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de C: " + C);
        System.out.println(N + " + " + A + " = " + (N+A));
        System.out.println(A + " - " + N + " = " + (A-N));
        System.out.println("Valor numérico del carácter " + C + " = " + Character.getNumericValue(C));

    }
}
