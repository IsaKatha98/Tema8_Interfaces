package ejercicio01;

public class Socio implements Comparable {
	
	protected int id;
	
	protected String nombre;
	
	protected int edad;

	public Socio(int id, String nombre, int edad) {
		
		//Comprobaciones
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String toString () {
		
		String res="";
		
		res="Id: "+id+" ;\n"+
			"Nombre: "+nombre+" ;\n"+
			"Edad: "+edad+ " años; \n";
		
		return res;
		
	}
	
	@Override
	public int compareTo(Object o) {
		
		Socio soc=(Socio) o;
		
		int res= this.id -soc.id;
		
		return res;
	}

}
