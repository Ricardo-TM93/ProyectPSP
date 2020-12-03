import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Crea una clase Java cuyo método main lance un proceso que liste los
   ficheros del directorio actual y los pinte por pantalla.
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Runtime rt= Runtime.getRuntime();
	
		//Para linux
		//String comandoLinux = "ls -help";
		String comandoWindows = "CMD /C DIR";
		
		String comandoListar = comandoWindows;
		
		Process proceso= null;
		
		try {
			proceso= rt.exec(comandoListar);
			
			InputStream is= proceso.getInputStream();
			//devuelve entrada de flujo de bytes
			BufferedReader filtroLectura= new BufferedReader(new InputStreamReader(is));
			//el filtro de lectura
			
			String linea;
			
			while((linea=filtroLectura.readLine())!=null) {
				System.out.println(linea);
			}
		}catch(IOException e) {
			System.out.println("Error al ejecutar"+e.getMessage());
		}
	}
}

/*
 * Process: Clase encapsula a un proceso del SO y ofrece herramientas
para su gestión:

InputStream getInputStream(): Devuelve una referencia a un flujo con
la salida producida por el comando.

int waitFor(): Para la ejecución del hilo en curso hasta la finalización
del proceso lanzado, obteniendo su valor de retorno. Si éste es igual a
0, la ejecución ha finalizado sin errores.

InputStream getErrorStream(): Devuelve una referencia a un flujo con
la salida producida por el error del comando.

*/
