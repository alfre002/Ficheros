package ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal1 {

//	Realiza un programa que lea texto por teclado y lo escribe en un fichero de texto llamado 
//	datos.txt. El proceso consiste en leer una línea de texto por teclado y escribirla en el 
//	fichero. Este proceso se repite hasta que se introduce por teclado la cadena FIN. La cadena 
//	FIN que indica el final de lectura no se debe escribir en el fichero.

	public static void main(String[] args) {

		try {

			Scanner s = new Scanner(System.in);

			File archivo = new File("/home/amarrui2808/Escritorio/ficheros/datos.txt");

			FileWriter fw = new FileWriter(archivo);
			FileReader fr = new FileReader(archivo);

			String texto = null;

			do {

				System.out.println("Introduzca una línea de texto, escriba fin para finalizar");
				texto = s.nextLine();
				if (!texto.toUpperCase().equals("FIN")) {
					fw.write("\n" + texto);
				}

			} while (!texto.toUpperCase().equals("FIN"));
			fw.close();

			// leemos el archivo
			int valor = fr.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = fr.read();
			}
			fr.close();

		} catch (

		IOException e) {
			System.out.println("Error: " + e);
		}
	}
}
