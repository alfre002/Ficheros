package ejercicio4;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class Principal4 {

//	Modifica el programa anterior para que el programa muestre el contenido de un directorio o
//	carpeta y si hay algún directorio, que muestre también los archivos que estén dentro de ese
//	directorio. Se deben mostrar los nombres de los archivos y los directorios que contiene en
//	orden alfabético.

	public static void main(String[] args) {

		File ruta = new File("/home/amarrui2808/Escritorio/ficheros");
		
		File[] lista = ruta.listFiles();

		// ordenar
		Arrays.sort(lista);

		// mostrar
		System.out.println("El contenido del directorio ficheros es:");
		for (File f2 : lista) {
			if(f2.isDirectory()) {
				System.out.println("\nExiste una carpeta:");
				System.out.println(f2);
				
				File[] archivosDentro = f2.listFiles();
				Arrays.sort(archivosDentro);
				
				for (File f3 : archivosDentro) {
					System.out.println("\nArchivos de la carpeta:");
					System.out.println("\t" + f3);
				}
			} else {
				System.out.println(f2);
			}
		}
		

	}

}

