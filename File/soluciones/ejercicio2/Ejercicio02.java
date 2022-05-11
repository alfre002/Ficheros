package ejercicio2;
import java.io.*;

/*Crea un programa en el que elimines un fichero y otro en que cambies el nombre de un fichero
usando la clase File.*/

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ----------------------------------------------------------------------------------

		// Primero creo un archivo y luego lo borro. Creo tambien una carpeta para no
		// trabajar directamente en E:

		File r = new File("E:/ficheros");
		r.mkdir();

		File f = new File("E:/ficheros/datos.txt");

		// Creo el archivo

		try {
			f.createNewFile();
			System.out.println("El archivo " + f.getName() + " ha sido creado con �xito. ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" No ha sido posible crear el archivo" + f.getName());
		}

		// Borro el archivo

		if (f.delete()) {

			System.out.println("El archivo " + f.getName() + " ha sido borrado con �xito. ");
		}
		;

		// --------------------------------------------------------------------

		// Creo de nuevo un archivo para cambiarlo de nombre

		try {
			f.createNewFile();
			System.out.println("El archivo " + f.getName() + " ha sido creado con �xito. ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" No ha sido posible crear el archivo" + f.getName());
		}

		// Cambio el nombre del archivo
		// Para ello tenemos que crear otro objeto file con el nuevo nombre
		// Primero introduzco texto en el archivo para ver como cambia
		
		try {
			FileWriter fw = new FileWriter("E:/ficheros/datos.txt");
			fw.write("esto es una prueba");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" No ha sido posible escribir en el archivo");
		}

		File f2 = new File("E:/ficheros/datosNuevo.txt");
		f.renameTo(f2);

		// Pruebo a ver que ha pasado con los punteros

		System.out.println(f.exists()); // El primer puntero y archivo se pierden
		System.out.println(f2.exists());

		// Compruebo que se ha cambiado de nombre

		System.out.println("El archivo datos.txt se llama ahora " + f2.getName());

	}

}
