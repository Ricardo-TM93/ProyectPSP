

/*
 * Crea una clase Java cuyo m�todo main lance un comando que provoque
errores y pinta por pantalla el valor devuelto por el error.
 * 
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		//String comandoLinux = "lsss --help";
		String comandoWindows = "CMD /C DIRRR";
		
		String comando = comandoWindows;
		
		Process proceso = null;		
		try {
			proceso = rt.exec(comando);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int valor;
		
		try {
			valor = proceso.waitFor();
			
			System.out.println("El comando " + comando + " ha resultado " + valor);	
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}

/*
 * Process: Clase encapsula a un proceso del SO y ofrece herramientas
para su gesti�n:

InputStream getInputStream(): Devuelve una referencia a un flujo con
la salida producida por el comando.

int waitFor(): Para la ejecuci�n del hilo en curso hasta la finalizaci�n
del proceso lanzado, obteniendo su valor de retorno. Si �ste es igual a
0, la ejecuci�n ha finalizado sin errores.

InputStream getErrorStream(): Devuelve una referencia a un flujo con
la salida producida por el error del comando.
 */
