import java.io.IOException;

/*
 * Crea una clase Java cuyo método main lance la aplicación de Firefox.
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Runtime rt = Runtime.getRuntime();
			
			// String comandoLinux = "firefox iescristobaldemonroy.es";
			
			String comandoWindows = "C:\\Program Files\\Mozilla Firefox\\firefox.exe iescristobaldemonroy.es";
			
			String comando = comandoWindows;

			try {
				rt.exec(comando);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}


/*
Runtime: Clase que nos ofrece una abstracción acerca del entorno de
ejecución en el que se está produciendo el entorno de ejecución.

static Runtime getRuntime(): Devuelve una referencia al objeto
Runtime asociado a la aplicación java en curso.

Process exec (String comando): Ejecuta la orden especificada en un
proceso separado devolviendo una referencia al mismo.

throws SecurityException: Imposibilidad de subprocesos.

throws IOException: Error E/S.

throws NullPointerException: Comando nulo.

throws IllegalArgumentException: Comando vacío.
*/