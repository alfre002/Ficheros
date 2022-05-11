package ejercicio4;

/*Modifica el programa anterior para que el programa muestre el contenido de un directorio o
carpeta y si hay alg�n directorio, que muestre tambi�n los archivos que est�n dentro de ese
directorio. Se deben mostrar los nombres de los archivos y los directorios que contiene en
orden alfab�tico.*/

import java.io.File;
import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:/ficheros");

		File[] archivos = f.listFiles();
		Arrays.sort(archivos);

		for (File f2 : archivos) {
			if (f2.isDirectory()) {
				System.out.print("Carpeta:");
				System.out.println(f2);

				File[] archivosDentro = f2.listFiles();
				Arrays.sort(archivosDentro);
				for (File f3 : archivosDentro)
					System.out.println("\t" + f3);

			} else {
				System.out.println(f2);

			}

		}
	}

}
