package ejercicio04;

public class Perro extends AnimalDomestico{

	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public boolean hacerCaso() {
		
		boolean caso= false;

		if (Math.random()<=0.9) {
			
			caso=true;
		}
		
		return caso;
	}

	@Override
	public void hacerRuido() {
		
		System.out.println("Guau");
		
	}
	
	public void sacarPaseo () {
		
		System.out.println("Sale de paseo.");
	}

}
