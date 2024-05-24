package tareaestructuras;

public class Problema5 {
    public static void main(String[] args) {
        int n = 10; // Número de elementos y tamaño del arreglo
        int[] primosArray = new int[n];

        // Calcular y almacenar los números primos en el arreglo
        for (int i = 0; i < n; i++) {
            primosArray[i] = encontrarPrimo(i);
        }

        // Imprimir el arreglo de números primos y sus posiciones en columnas separadas por tabulaciones
        System.out.println("Números primos:");
        for (int i = 0; i < n; i++) {
            System.out.print("" + primosArray[i] + "\t|");
        }
        System.out.println(); // Salto de línea

        for (int i = 0; i < n; i++) {
            System.out.print("" + i + "\t|");
        }
    }

    // Función para encontrar el número primo en la posición n
    public static int encontrarPrimo(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;
            if (esPrimo(num)) {
                count++;
            }
        }
        return num;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//Alisson Condoy