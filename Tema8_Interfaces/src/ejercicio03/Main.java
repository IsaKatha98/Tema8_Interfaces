package ejercicio03;

public class Main {
	
	public static void main(String[] args) {
		
		//Nos creamos los arrays necesarios.
		Polideportivo[] poli= new Polideportivo[3];
		
		poli[0]= new Polideportivo ("piscina" );
		poli[1]= new Polideportivo ("aula de pilates");
		poli[2]= new Polideportivo ("sala de spinning");
		
		Oficina[] ofi= new Oficina[2];
		
		ofi[0]= new Oficina (6, 100);
		ofi[1]= new Oficina (20, 15);
		
		
		//Mostramos los datos
		for (Polideportivo p: poli) {
			
			System.out.println(p);
		}
		
		for (Oficina o:ofi) {
			
			System.out.println(o);
		}
	
	}

}
