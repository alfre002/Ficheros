package ejercicio1;
import java.io.File;
import java.io.IOException;

/*Crea un objeto File ruta asociado al directorio C:/ficheros y un objeto File f asociado al fichero
datos.txt que se encuentra en ese directorio.
Si el fichero no existe se crea y si el directorio no existe se crea y a continuaci�n se crea el
fichero. Si el fichero existe muestra el tama�o del mismo.*/

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ruta=new File("E:/ficheros");
		File f=new File ("E:/ficheros/datos.txt");
		
		//Si no esxiste la carpeta lo creo
		
		if(!ruta.exists()){
			ruta.mkdir();
							
		}
		
		//Si no exites el archivo lo creo
		if(!f.exists()) {
			try {
				f.createNewFile();
				System.out.println("El archivo "+f.getName()+" ha sido creado con �xito. ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("No ha sido posible crear el archivo"+f.getName());
			}
			
			
		}

	}

}
