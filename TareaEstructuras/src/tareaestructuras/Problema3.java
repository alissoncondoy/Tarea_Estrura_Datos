package tareaestructuras;

public class Problema3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Arreglo B para almacenar los factoriales
        long[] B = new long[A.length];

        // Calcular y almacenar los factoriales
        for (int i = 0; i < A.length; i++) {
            B[i] = factorial(A[i]);
        }

        // Imprimir los factoriales calculados
        System.out.println("Factoriales:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Factorial de " + A[i] + ": " + B[i]);
        }
    }

    // Función recursiva para calcular el factorial de un número
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
//*Alisson Condoy
    

