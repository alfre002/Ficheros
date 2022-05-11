package ejercicio3_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal3_1 {

	static Scanner ent = new Scanner(System.in);
	static Scanner st = new Scanner(System.in);
	static File archivo = new File("/home/amarrui2808/Escritorio/ficheros/perfe.txt");

	public static void main(String[] args) {

		menu();

		int opcion;
		do {
			System.out.println("\nIntroduzca una opción.");
			opcion = ent.nextInt();
			switch (opcion) {
			case 1:
				crearFichero();
				break;
			case 2:
				leerFichero();
				break;
			}
		} while (opcion != 3);

	}

	public static void leerFichero() {
		System.out.println("Mostrar fichero de texto.");
		try (FileReader fr = new FileReader(archivo)) {
			int valor = fr.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = fr.read();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public static void crearFichero() {
		System.out.println("\nCrear fichero de texto.");
		try (FileWriter fw = new FileWriter(archivo);) {
//			archivo.createNewFile();
			System.out.println("Nombre:");
			String nombre = st.nextLine();
			fw.write(nombre);
			System.out.println("Apellidos:");
			String apellidos = st.nextLine();
			fw.write("\n" + apellidos);
			System.out.println("Ciudad de Nacimiento:");
			String ciudad = st.nextLine();
			fw.write("\n" + ciudad);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void menu() {
		System.out.println("MENÚ PRINCIPAL");
		System.out.println("1. Creación fichero de texto");
		System.out.println("2. Mostrar fichero de texto");
		System.out.println("3. Salir");
	}

}

