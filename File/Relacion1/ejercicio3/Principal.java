package ejercicio3;

import java.io.File;
import java.util.Arrays;

public class Principal {

//	Crea un programa que muestre el contenido de un directorio o carpeta. Se deben mostrar los
//	nombres de los archivos y los directorios que contiene en orden alfabético.

	public static void main(String[] args) {

		File ruta = new File("/home/amarrui2808/Escritorio/ficheros");

		String[] lista = ruta.list();

		// ordenar
		Arrays.sort(lista);

		// mostrar
		System.out.println("El contenido del directorio ficheros es:");
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

	}

}
