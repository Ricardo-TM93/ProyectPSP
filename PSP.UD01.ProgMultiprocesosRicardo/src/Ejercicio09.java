import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Realizar una clase Java cuyo método main cree un ProcessBuilder con un
List de String realizando un listado del directorio src.

Las salidas estándar y de error deben ser redirigidas a un fichero cuyo
nombre sea salida_ejercicio9.txt y log_ejercicio9.txt respectivamente.

Además, por pantalla debe indicarnos un mensaje sobre qué fichero
consultar en función de si la ejecución del proceso ha sido o no errónea.
 */
public class Ejercicio09 {
	public static void main(String[] args) {

		List<String> listCommand = new ArrayList<String>();// command devuelve un list string con listado directorio

		/*
		 * -- Para linux listCommand.add("ls"); listCommand.add("--help");
		 */

		// -- Para windows
		listCommand.add("CMD");
		listCommand.add("/C");
		listCommand.add("DIRR");

		Process processo = null;

		int resultado = -1;
		// Si el proceso finaliza, el resultado del proceso es un int,
		// que dara 0 si esta todo Ok, o 1 si esta mal.

		ProcessBuilder procesoBuilder = new ProcessBuilder(listCommand);

		// Proceso me escribe los errores en un archivo y la salida en otro fichero
		procesoBuilder.redirectError(new File("log_ejercicio9.txt"));
		procesoBuilder.redirectOutput(new File("salida_ejercicio9.txt"));

		try {
			processo = procesoBuilder.start();

			// Wait for.. Stop untill process end y luego recoge el valor devuelto.

			resultado = processo.waitFor();

			System.out.println("El comando " + listCommand + " ha resultado " + resultado);

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		if (resultado == 0) { // Esta ok
			System.out.println("Si ok, consulta el fichero salida");
		} else { // Esta mal
			System.out.println("Si error, consulta el fichero log");
		}

	}

}

/*
 * 1.7, java nos ofrece la posibilidad de redirigir los flujos gestionados por
 * la clase ProcessBuilder de manera automática:
 * 
 * redirectOutput();
 * 
 * redirectError();
 */
