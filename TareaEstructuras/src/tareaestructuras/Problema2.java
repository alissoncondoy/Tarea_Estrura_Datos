package tareaestructuras;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pacientes:");
        int cantidadPacientes = scanner.nextInt();
        scanner.nextLine(); 

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("HistorialMedico.txt"))) {
            for (int i = 0; i < cantidadPacientes; i++) {
                System.out.println("Ingrese la información del paciente " + (i + 1) + ":");

                System.out.print("Cédula de identidad: ");
                String cedula = scanner.nextLine();
                escritor.write("Cédula de identidad: " + cedula);
                escritor.newLine();

                System.out.print("Apellidos Completos: ");
                String apellidos = scanner.nextLine();
                escritor.write("Apellidos Completos: " + apellidos);
                escritor.newLine();

                System.out.print("Nombres Completos: ");
                String nombres = scanner.nextLine();
                escritor.write("Nombres Completos: " + nombres);
                escritor.newLine();

                System.out.print("Fecha de nacimiento: ");
                String fechaNacimiento = scanner.nextLine();
                escritor.write("Fecha de nacimiento: " + fechaNacimiento);
                escritor.newLine();

                System.out.print("Estatura en metros: ");
                double estatura = scanner.nextDouble();
                scanner.nextLine(); 
                escritor.write("Estatura: " + estatura);
                escritor.newLine();

                System.out.print("Peso: ");
                double peso = scanner.nextDouble();
                scanner.nextLine(); 
                escritor.write("Peso: " + peso);
                escritor.newLine();

                System.out.print("Alergias: ");
                String alergias = scanner.nextLine();
                escritor.write("Alergias: " + alergias);
                escritor.newLine();

                escritor.newLine(); 
            }
            System.out.println("Se ha guardado la información en el archivo HistorialMedico.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
//*Alisson Condoy