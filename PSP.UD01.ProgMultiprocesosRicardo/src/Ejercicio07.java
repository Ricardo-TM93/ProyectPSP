import java.io.IOException;

/*
 * Crea una clase Java cuyo m�todo main lance la aplicaci�n de Firefox
haciendo uso de ProcessBuilder y pas�ndole una URL como par�metro.
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		// Runtime Nos lo ahorramos y comemos con papas gracias al ProcessBuilder
				// --> Runtime rt = Runtime.getRuntime();
		// En linux String comandoLinux = "firefox";
		String comandoWindows = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		
		String comando = comandoWindows;
		
		try {
			ProcessBuilder procesobuilder = new ProcessBuilder(comando, "iescristobaldemonroy.es");
			procesobuilder.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
 * la JDK ofrece una nueva forma de creaci�n y
ejecuci�n de procesos mediante la clase ProcessBuilder. Cada instancia
gestionar� una colecci�n de atributos del proceso:

Comando (command()): List de String con nombre de comando [y
argumentos]

Entorno (environment()): Variables de entorno.

Directorio de trabajo del proceso en curso.

Flujos de entrada y de salida.

Flujo de error.

Nos ofrecer� m�todos tambi�n para redirigir de manera directa los flujos de
entrada, salida y error al destino que le indiquemos.

*/
 

