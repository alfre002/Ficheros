package ejercicio2;

import java.io.File;
import java.util.Scanner;

public class Principal {
	
//	Crea un programa en el que elimines un fichero y otro en que cambies el nombre de un fichero
//	usando la clase File.

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// renombrar fichero
		File f = new File("/home/amarrui2808/Escritorio/ficheros/datos.txt");
		System.out.println("Introduzca el nombre del nuevo fichero");
		String nuevoNombre = s.nextLine();
		File f2 = new File("/home/amarrui2808/Escritorio/ficheros/" + nuevoNombre + ".txt");
		
		
		boolean correcto = f.renameTo(f2);
		
		if(correcto) {
			System.out.println("Se ha renombrado el fichero correctamente");
		} else {
			System.out.println("No se ha podido renombrar el fichero");
		}
		
		// eliminar fichero
		f.delete();
	}

}
