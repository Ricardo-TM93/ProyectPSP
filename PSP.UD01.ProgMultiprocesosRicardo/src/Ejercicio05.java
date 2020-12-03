import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
 * Crea una clase Java cuyo método main lance un comando que provoque
errores y pinte por pantalla la descripción del error.
 */
public class Ejercicio05 {
	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();// Ejecuccion
		
		// String comandoLinux = "lsss";

		String comandoWindows = "CMD /C DIRRRR";

		String comandoListar = comandoWindows;

		Process proceso = null;

		try {
			proceso = rt.exec(comandoListar);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		int valor;
		BufferedReader br = null;
		try {
			valor = proceso.waitFor();
			System.out.println("El comando " + comandoListar + " ha resultado " + valor);
			System.out.println("La salida ha sido: ");

			InputStream errStream = proceso.getErrorStream();
			br = new BufferedReader(new InputStreamReader(errStream));

			String linea = "";
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
