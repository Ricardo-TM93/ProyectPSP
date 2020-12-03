import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Crea una clase Java cuyo método main lance un comando que provoque
errores y genere un fichero con la descripción del error.
 */
public class Ejercicio06 {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();// Ejecuccion
		// String comandoLinux = "lsss --help";
		String comandoWindows = "CMD /C DIRRR";

		String comandoListar = comandoWindows;

		Process proceso = null;
		try {
			proceso = rt.exec(comandoListar);

		} catch (Exception e) { //El catch va a  recoger el error, luego hacer un try con el bufffer dentro para que haga 
			// un fichero que describa/diga el error
		
			
		
			try (BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("logComando.txt"))) {
				filtroEscritura.write(e.getMessage());
				filtroEscritura.newLine();
			} catch (IOException f) {
				System.out.println(f.getMessage());
			}
		}
	}

}
