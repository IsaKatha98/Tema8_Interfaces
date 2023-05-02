package ejercicio03;

public class Polideportivo implements InstalacionDeportiva, Edificio{
	
	protected String nombre;
	
	protected double superficie;

	public Polideportivo(String nombre, double superficie) {

		this.nombre = nombre;
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		
		
		return superficie;
	}

	@Override
	public int getTipoDeInstalacion() {
		
		int tipoInstalacion=0;
		
		if (this.nombre.equalsIgnoreCase("polideportivo")) {
			
			tipoInstalacion=1;
		
		} else if (this.nombre.equalsIgnoreCase("oficina")) {
			
			tipoInstalacion=2;
		}
		
		return tipoInstalacion;
	}

}
