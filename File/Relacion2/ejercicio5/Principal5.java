package ejercicio5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Principal5 {

//	Crea una aplicación donde pidamos la ruta de un fichero por teclado y un texto que queramos a
//	escribir en el fichero. Deberás mostrar por pantalla el mismo texto pero variando entre mayúsculas
//	y minúsculas, es decir, si escribo “Bienvenido” deberá devolver “bIENVENIDO”. Si se escribe
//	cualquier otro carácter, se quedara tal y como se escribió.
//
//	Deberás crear un método para escribir en el fichero el texto introducido y otro para mostrar el
//	contenido en mayúsculas.

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce la ruta de un fichero");
		String ruta = "";
		ruta = s.nextLine();

		File archivo = new File(ruta);

		try (FileWriter fw = new FileWriter(archivo, true); FileReader fr = new FileReader(archivo)) {

			System.out.println("Introduce el texto que quieras introducir");
			String texto = s.nextLine();
			// meto contenido en el archivo
			fw.write(texto);

			// leemos el archivo
			int valor = fr.read();
			while (valor != -1) {
				if(Character.isUpperCase(valor)) {
					System.out.print(Character.toLowerCase((char)valor));
				} else if(Character.isLowerCase(valor)) {
					System.out.print(Character.toUpperCase((char)valor));
				} else {
					System.out.print((char) valor);
				}
				
				valor = fr.read();

			}

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}

}
