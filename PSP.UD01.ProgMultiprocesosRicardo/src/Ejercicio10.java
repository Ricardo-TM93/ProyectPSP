import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * Crea una clase java cuyo método main añada la variable de entorno MI_NOMBRE
con vuestro nombre de pila. A continuación ha de obtener del sistema el
contenido de la variable y pintarlo por pantalla:

la interfaz Map ofrece el método put. Las variables de entorno pertenecen
localmente a cada proceso.

el proceso que muestra el contenido de una variable de entorno es:

echo $[nombre_variable]

Por la naturaleza del proceso necesitaréis un intérprete para poder ejecutarlo,
para ello la pista es usar la siguiente lista de cadenas:
 */

public class Ejercicio10 {

	public static void main(String[] args) {

		/* Cod. Jesus. */

		List<String> lCmdLinux = new ArrayList<String>();
		lCmdLinux.add("/bin/bash");
		lCmdLinux.add("-c");
		lCmdLinux.add("echo $MI_NOMBRE");

		List<String> lCmdWin = new ArrayList<String>();
		lCmdWin.add("CMD");
		lCmdWin.add("/C");
		lCmdWin.add("echo");
		lCmdWin.add("%MI_NOMBRE%");

		List<String> lCommand = null;

		if (System.getProperty("os.name").contains("Windows")) {
			lCommand = lCmdWin;
		} else {
			lCommand = lCmdLinux;
		}

		ProcessBuilder pb = new ProcessBuilder(lCommand);

		/*
		 * interfaz Map ofrece el método put. Las variables de entorno pertenecen
		 * localmente a cada proceso.
		 */
		Map<String, String> variableEnvironment = pb.environment();
		variableEnvironment.put("MI_NOMBRE", "JESUS");
		// Put para basicamente pintar nombre (variable) x pantalla, como explica arriba ^ ^ ^ ^ ^

		pb.inheritIO();

		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
