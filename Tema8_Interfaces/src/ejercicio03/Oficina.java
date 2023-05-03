package ejercicio03;

/**
 * Clase Oficina que crea el objeto Oficina y lo manipula.
 * Implementa la interfaz Edificio.
 * 
 * @author ikloerzer
 *
 */
public class Oficina implements Edificio{
	
	/**
	 * sexo sexo sexo sexo sexo aaaaaaaaaaaaaaaaaaaaa
	 */
	protected int numOficinas;
	
	protected double superficieOficina;

	public Oficina() {
		
	}

	
	public Oficina(int numOficinas, double superficieOficina) {

		if (numOficinas>0) {
			this.numOficinas = numOficinas;
		}
		
		if (superficieOficina>0) {
			this.superficieOficina = superficieOficina;
		}
		
	}
	
	
public String toString() {
		
		String res="";
		
		res="Número de oficinas: "+this.numOficinas+" ;\n"+
				"Superficie del edificio: "+getSuperficieEdificio()+" km^2; \n";
		
		return res;
	}

	

	@Override
	public double getSuperficieEdificio() {
	
		double superficieEdificio;
		
		superficieEdificio=numOficinas*superficieOficina;
		
		return superficieEdificio;	
		
	}
	

}
