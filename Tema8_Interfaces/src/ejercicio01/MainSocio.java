package ejercicio01;

import java.util.Arrays;

public class MainSocio {

	public static void main(String[] args) {
		
		Socio soc1= new Socio (1, "Lola", 29);
		
		Socio soc2= new Socio (1, "Pedro", 30);
		
		System.out.println(soc1.compareTo(soc2));
		
		
	
		Socio[] club= new Socio[5];
		
		club[0]= new Socio (1, "Pepe", 20);
		club[1]= new Socio (2, "María", 23);
		club[2]= new Socio (4, "Ana", 34);
		club[3]= new Socio (3, "Luis", 24);
		club[4]= new Socio (5, "Paco", 25);
		
		System.out.println(Arrays.toString(club));
	}
	


}
