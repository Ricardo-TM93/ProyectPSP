
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

		List<String> lCdmLinux = new ArrayList<String>();
		lCmdLinux.add("/bin/bash");
		lCmdLinux.add("-c");
		lCmdLinux.add("echo $MI_NOMBRE");
		
		
		
		
		List<String> lCmdWindows = new ArrayList<String>();
		lCmdWindows.add("/bin/bash");
		lCmdWindows.add("-c");
		lCmdWindows.add("echo $MI_NOMBRE");
		
		
	}

}
