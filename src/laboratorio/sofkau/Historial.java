package laboratorio.sofkau;


import java.io.*;
import java.util.Scanner;


public class Historial extends Game {
    static File archivo;// Para manipular al archivo, static hace referencia a constante
    FileWriter escribir;//Para escribir en el archivo
    PrintWriter linea;//Para escribir en el archivo

    public void guardarPlayer(String player, int premio) {
        //archivo = new File("usuarios.txt");//Preparando al archivo
        //if (archivo.exists()) {
        try {
            File archivo = new File("texto.txt");
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write("Nombre: ");
            escribir.write(player);
            escribir.write(" , Puntaje: ");
            escribir.write(String.valueOf(premio));
            escribir.write("\r\n");
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }

      }

    public void leerHistorial() throws FileNotFoundException {
        try {
            File doc = new File("texto.txt");
            Scanner obj = new Scanner(doc);

            while (obj.hasNextLine())
                System.out.println(obj.nextLine());
        } catch (Exception e) {
            System.out.println("No hay archivo");
        }
    }
}