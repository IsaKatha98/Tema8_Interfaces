package ejercicio02;

public class Futbolista implements Comparable{
	
	protected int numCamiseta;
	
	protected String nombre;
	
	protected int edad;
	
	protected int numGoles;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {

		if (numCamiseta>0) {
			this.numCamiseta = numCamiseta;
		}
	
		if (nombre!=null&&nombre!="") {
			this.nombre = nombre;
		}
		
		if (edad>0) {
			this.edad = edad;
		}
	
		if (numGoles>0) {
			this.numGoles = numGoles;
		}

	}
	
	public String toString() {
		
		String res;
		
		res= "Número de la camiseta: "+ numCamiseta+ "; \n"+ "Nombre del jugador: "+nombre+";\n"+"Edad: "+edad
				+" años;\n"+"Número de goles marcados: "+numGoles+"; \n";
		
		return res;
	}

	@Override
	/**
	 * Método que compara dos objetos en base al número de camiseta y el nombre.
	 * 
	 * @return igual
	 */
	public boolean equals(Object o) {
		
		boolean igual= false;
		
		//Se castea el objeto.
		Futbolista jug= (Futbolista) o;
		
		//Hacemos la comparación.
		if (this.numCamiseta==jug.numCamiseta&&this.nombre.equalsIgnoreCase(jug.nombre)) {
			
			igual=true;
		}
		
		return igual;
	}

	@Override
	/**
	 * 
	 */
	public int compareTo(Object o) {
		
		int res;
		
		//Se castea el objeto.
		Futbolista jug= (Futbolista) o;
				
		res=this.numCamiseta-jug.numCamiseta;
		
		if (res==0) {
			
			res=this.nombre.compareToIgnoreCase(jug.nombre);
		}
		
		return res;
	}

}

