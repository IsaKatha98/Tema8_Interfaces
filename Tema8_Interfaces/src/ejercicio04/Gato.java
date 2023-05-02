package ejercicio04;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public boolean hacerCaso() {
		
		boolean caso= false;
		
		if (Math.random()<=0.05) {
			
			caso=true;
		}
		
		return caso;
	}

	@Override
	public void hacerRuido() {
		
		System.out.println("Miau");
		
	}
	
	public void toserBolaPelo() {
		
		System.out.println("Tose una bola de pelo.");
	}
	
	

}
