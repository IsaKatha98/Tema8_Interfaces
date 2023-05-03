package ejercicio03;

/**
 * Clase Polideportivo que crea el objeto Polideportivo y lo manipula.
 * Implementa las interfaces InstalacionDeportiva y Edificio.
 * 
 * @author ikloerzer
 *
 */
public class Polideportivo implements InstalacionDeportiva, Edificio {

	/**
	 * Atributo de tipo String que guarda el nombre de la instalación.
	 */
	protected String nombre;

	/**
	 * Atributo de tipo double que guarda la superficie de una instalación.
	 */
	protected double superficie;

	/**
	 * Constructor de Polideportivo. La superficie se la asigna la función
	 * getSuperficieEdificio. Se comprueba que el nombre que nos pasan por parámetro
	 * no sea ni null ni sea una cadena vacía.
	 * 
	 * @param nombre String que se pasa desde el main
	 */
	public Polideportivo(String nombre) {

		if (nombre != null && nombre != "") {
			this.nombre = nombre;
		}

		this.superficie = getSuperficieEdificio();
	}

	/**
	 * Método toString de Polideportivo.
	 * 
	 * @return res devuelve un mensaje tipo
	 */
	public String toString() {

		String res = "";

		res = "Nombre: " + this.nombre + " ;\n" + "Superficie de la instalación: " + getSuperficieEdificio()
				+ " km^2; \n";

		return res;
	}

	/**
	 * Método que asigna la superficie de un edificio dependiendo del tipo de
	 * instalación que sea.
	 * 
	 * @return superficie asignada según el tipo
	 */
	@Override
	public double getSuperficieEdificio() {

		// LLamamos a la función del getTipoInstalación.
		int tipo = getTipoDeInstalacion();

		switch (tipo) {

		case 1 -> {
			superficie = 500;
		}

		case 2 -> {
			superficie = 30;
		}

		case 3 -> {
			superficie = 50;
		}
		}

		return superficie;
	}

	/**
	 * Método que asigna un número entero dependiendo del nombre de la instalación.
	 * 
	 * @return tipoInstalación número de instalación
	 */
	@Override
	public int getTipoDeInstalacion() {

		int tipoInstalacion = 0;

		if (this.nombre.equalsIgnoreCase("piscina")) {

			tipoInstalacion = 1;

		} else if (this.nombre.equalsIgnoreCase("aula de pilates")) {

			tipoInstalacion = 2;

		} else if (this.nombre.equalsIgnoreCase("sala de spinning")) {

			tipoInstalacion = 3;
		}

		return tipoInstalacion;
	}

}
