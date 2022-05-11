package ejercicio2_5.Relacion02Ficheros.src;

/*Crea una aplicación donde pidamos la ruta de un fichero por teclado y un texto que queramos a
escribir en el fichero. Deberás mostrar por pantalla el mismo texto pero variando entre mayúsculas
y minúsculas, es decir, si escribo “Bienvenido” deberá devolver “bIENVENIDO”. Si se escribe
cualquier otro carácter, se quedara tal y como se escribió.

Deberás crear un método para escribir en el fichero el texto introducido y otro para mostrar el
contenido en mayúsculas.*/

import java.io.*;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String localizacion = "";

		System.out.println("Introduce la localización del fichero");
		localizacion = s.nextLine();
		escribirFichero(localizacion);
		leerFichero(localizacion);

		s.close();

	}

	// método para escribir en el fichero

	public static void escribirFichero(String localizacion) {
		Scanner s = new Scanner(System.in);
		String frase = "";
		try {

			// escribir en el fichero

			FileWriter escribir = new FileWriter(localizacion);
			System.out.println("Introduce la frase ");
			frase = s.nextLine();
			// introduzco la frase en el fichero
			escribir.write(frase);
			// guardo los cambios hecho para poder leer posteriormente sin tener que cerrar
			// el programa
			escribir.flush();
			s.close();
			escribir.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al escribir en el fichero");
		}

	}

	// método para leer del fichero

	public static void leerFichero(String localizacion) {

		try {
			FileReader leer = new FileReader(localizacion);
			int c = 0;
			while (c != -1) {

				c = leer.read();
				char letra = (char) c;
				if (c != -1) {

					if (Character.isUpperCase(letra)) {
						System.out.print(Character.toLowerCase(letra));

					} else {
						System.out.print(Character.toUpperCase(letra));

					}
				}
			} // fin del while
			leer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al leer el fichero");
		}

	}

}
