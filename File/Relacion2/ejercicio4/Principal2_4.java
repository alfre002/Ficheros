package ejercicio4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal2_4 {

//	Crea un fichero de texto con el nombre y contenido que tu quieras. Ahora crea una aplicación 
//	que lea este fichero de texto carácter a carácter y muestre su contenido por pantalla sin 
//	espacios. Por ejemplo, si un fichero tiene el siguiente texto “Esto es una prueba”, deberá 
//	mostrar “Estoesunaprueba”.

	public static void main(String[] args) {

		File archivo = new File("/home/amarrui2808/Escritorio/ficheros/pruebas.txt");

		try (FileWriter fw = new FileWriter(archivo, true); FileReader fr = new FileReader(archivo)) {

			// meto contenido en el archivo
//			fw.write("Daniel es el rey del movimiento gay");

			// leemos el archivo
			int valor = fr.read();
			while (valor != -1) {
				if((char) valor != ' ') {
				System.out.print((char) valor);
				}
				valor = fr.read();
				
			}

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

}
