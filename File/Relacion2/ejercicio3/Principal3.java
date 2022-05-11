package ejercicio3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal3 {

//	Mostrar por pantalla el contenido del fichero de texto datos.txt . El proceso consiste en 
//	leer un carácter del fichero y mostrarlo por pantalla. Este proceso se repite hasta que 
//	no queden más caracteres que leer en el fichero, es decir, hasta que se alcance el final 
//	del fichero. En este caso el método read() devuelve -1.

	public static void main(String[] args) {

		File archivo = new File("/home/amarrui2808/Escritorio/ficheros/datos.txt");

		try (FileReader fr = new FileReader(archivo)) {

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
