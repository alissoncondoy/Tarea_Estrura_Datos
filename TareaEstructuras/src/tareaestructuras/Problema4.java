package tareaestructuras;

public class Problema4 {
    public static void main(String[] args) {
        int n = 10; // Número de elementos de la serie de Fibonacci a calcular
        int[] fibonacciArray = new int[n];

        
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }

        // Imprimir la serie de Fibonacci y sus posiciones en columnas separadas por tabulaciones
        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print("" + fibonacciArray[i] + "\t|");
        }
        System.out.println(); // Salto de línea

        for (int i = 0; i < n; i++) {
            System.out.print("" + i + "\t|");
        }
    }

    // Función recursiva para calcular el número de Fibonacci en la posición n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
//*Alisson Condoy




    

