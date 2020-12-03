import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Crea una clase Java cuyo método main lance un proceso que liste los
ficheros del directorio actual y los guarde en un fichero de texto.
 */
public class Ejercicio03 {

	public static void main(String[] args) {
	
		Runtime rt = Runtime.getRuntime();

		//String comandoListar = "ls --help";
		String comandoWindows = "CMD /C DIR";
		
		String comandoListar = comandoWindows;
		Process proceso = null;

		try {
			proceso = rt.exec(comandoListar);

			InputStream is = proceso.getInputStream();
			// devuelve entrada de flujo de bytes
			BufferedReader filtroLectura = new BufferedReader(new InputStreamReader(is));

			BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("salidaComando.txt"));
			String linea;

			while ((linea = filtroLectura.readLine()) != null) {
				filtroEscritura.write(linea);
				filtroEscritura.newLine();
			}
			filtroLectura.close();
			filtroEscritura.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}


/* El modo de catch visto en clase
 * try {
			proceso = rt.exec(comandoListar);

			InputStream is = proceso.getInputStream();
			// devuelve entrada de flujo de bytes
			BufferedReader filtroLectura = new BufferedReader(new InputStreamReader(is));

			BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("salidaComando.txt"));
			String linea;

			while ((linea = filtroLectura.readLine()) != null) {
				filtroEscritura.write(linea);
				filtroEscritura.newLine();
			}
 * } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				BufferedReader.close();
				BufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 */
 

