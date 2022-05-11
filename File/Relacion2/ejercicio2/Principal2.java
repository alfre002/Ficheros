package ejercicio2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal2 {

//	Realiza un programa que lea por teclado líneas de texto y las añade al final del ficheros 
//	datos.txt. Para resolverlo modificar el programa anterior para que añada texto al fichero 
//	datos.txt, es decir, al volver a ejecutar el programa el contenido anterior del fichero 
//	no se pierde y el contenido nuevo se añade al final.

	public static void main(String[] args) {

		File archivo = new File("/home/amarrui2808/Escritorio/ficheros/datos.txt");

		try (FileWriter fw = new FileWriter(archivo, true); FileReader fr = new FileReader(archivo)) {

			Scanner s = new Scanner(System.in);

			String texto = null;

			do {

				System.out.println("Introduzca una línea de texto, escriba fin para finalizar");
				texto = s.nextLine();
				if (!texto.toUpperCase().equals("FIN")) {
					fw.write("\n" + texto);

				}

			} while (!texto.toUpperCase().equals("FIN"));
			fw.flush();
			// leemos el archivo
			int valor = fr.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = fr.read();
			}
		} catch (

		IOException e) {
			System.out.println("Error: " + e);
		}

	}

}
