package ejercicio04;

public abstract class AnimalDomestico implements Animal{
	
	protected String nombre;
	
	protected String raza;
	
	protected double peso;
	
	protected String color;
	
	public void vacunar() {
		
	}
	
	
	
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	public abstract boolean hacerCaso();

	@Override
	public void comer() {
		
		System.out.println("Come");
	
	}

	@Override
	public void dormir() {
		
		System.out.println("Duerme");
		
	}

	public abstract void  hacerRuido();

}
