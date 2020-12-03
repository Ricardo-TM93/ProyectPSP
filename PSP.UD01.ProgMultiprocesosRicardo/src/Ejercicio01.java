import java.io.IOException;

/*
 * Crea una clase Java cuyo m�todo main lance la aplicaci�n de Firefox.
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
Runtime: Clase que nos ofrece una abstracci�n acerca del entorno de
ejecuci�n en el que se est� produciendo el entorno de ejecuci�n.

static Runtime getRuntime(): Devuelve una referencia al objeto
Runtime asociado a la aplicaci�n java en curso.

Process exec (String comando): Ejecuta la orden especificada en un
proceso separado devolviendo una referencia al mismo.

throws SecurityException: Imposibilidad de subprocesos.

throws IOException: Error E/S.

throws NullPointerException: Comando nulo.

throws IllegalArgumentException: Comando vac�o.
*/