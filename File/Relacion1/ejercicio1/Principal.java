package ejercicio1;

import java.io.File;
import java.io.IOException;

public class Principal {
	
//	Crea un objeto File ruta asociado al directorio C:/ficheros y un objeto File f asociado al fichero
//	datos.txt que se encuentra en ese directorio.
//	Si el fichero no existe se crea y si el directorio no existe se crea y a continuación se crea el
//	fichero. Si el fichero existe muestra el tamaño del mismo.

	public static void main(String[] args) {
		
		
		
		// crear objetos File
		File ruta = new File("/home/amarrui2808/Escritorio/ficheros");
		File f = new File("/home/amarrui2808/Escritorio/ficheros/datos.txt");
		
		
		if(f.exists()) {
			System.out.println("El tamaño del fichero es " + f.length());
		} else {
			System.out.println("El fichero no existe, se va a crear.");
			if(ruta.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("El directorio no existe, se va a crear.");
				ruta.mkdir();
			}
			
		}
	}

}
