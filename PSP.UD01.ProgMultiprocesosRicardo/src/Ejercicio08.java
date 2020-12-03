
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * 1) Crea una clase Java cuyo método main:

1.1)Cree un objeto ProcessBuilder a través del cual consultar las
variables de entorno.

1.1) Cree un segundo objeto ProcessBuilder para lanzar un proceso que
muestre la ayuda del sistema para el comando ls (ls --help). Antes de
lanzarlo, deben listarse los argumentos de la llamada.
 */
public class Ejercicio08 {

	public static void main(String[] args) {

		// 1.1. Cree un objeto ProcessBuilder a través del cual consultar las variables
		// de entorno.

		// Entorno (environment()): Variables de entorno.
		// el environment seria para consultar variables d entrno

		ProcessBuilder pbE = new ProcessBuilder();
		Map<String, String> variables = pbE.environment();
		System.out.println(variables);

		/*
		 * 1.2 Cree un segundo objeto ProcessBuilder para lanzar un proceso que muestre
		 * la ayuda del sistema para el comando ls (ls --help). Antes de lanzarlo, deben
		 * listarse los argumentos de la llamada.
		 */
		List<String> listCommand = new ArrayList<String>();

		// Comando (command()): List de String con nombre de comando [ y argumentos]

		/*
		 * -- Para linux 
		 * listCommand.add("ls"); 
		 * listCommand.add("--help");
		 */

		// -- Para windows
		listCommand.add("CMD");
		listCommand.add("/C");
		listCommand.add("DIRR");

		// CREa ProcessBulder
		ProcessBuilder procesoBuilder = new ProcessBuilder(listCommand);
		System.out.println(procesoBuilder.command());// command devuelve un list string con nombre y argumentos
		try {
			procesoBuilder.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
