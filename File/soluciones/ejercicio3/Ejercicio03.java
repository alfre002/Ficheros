package ejercicio3;
/*Crea un programa que muestre el contenido de un directorio o carpeta. Se deben mostrar los
nombres de los archivos y los directorios que contiene en orden alfab�tico.*/

import java.io.File;
import java.util.Arrays;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		//Primero creo una estructura de carpeta y archivos en mi unidad E:
		
		File f=new File("E:/ficheros");
		
		String[] nombres =f.list();
		
		for(String n:nombres) {
			System.out.println(n);
		}
		
		//Para ordenar uso arrays.sort()
		
		Arrays.sort(nombres);
		
		for(String n:nombres) {
			System.out.println(n);
		}
		
		
		
		
		
		
	}

}
