package tareaestructuras;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author InnoVausuario
 */
public class Problema1 {
    public static void main(String[] args) {
        String archivoDeudas = "Deudas.txt";
        String archivoActualizado = "Actualizacion.txt";

        System.out.println("Contenido del archivo Deudas.txt");
       mostrarArchivo(archivoDeudas);

        actualizarDeudas(archivoDeudas, archivoActualizado);

        System.out.println("\nContenido actualizado de Actualizacion.txt:");
        mostrarArchivo(archivoActualizado);
    }

    public static void actualizarDeudas(String inputFilePath, String outputFilePath) {
        try (BufferedReader leer = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter escribir = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = leer.readLine()) != null) {
                String updatedLine = line.replace("Central de Riesgo", "Liberado");
                escribir.write(updatedLine);
                escribir.newLine();
            }

            System.out.println("\nSe actualizo el archivo correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarArchivo(String filePath) {
        try (BufferedReader leer = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = leer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//*Alisson Condoy