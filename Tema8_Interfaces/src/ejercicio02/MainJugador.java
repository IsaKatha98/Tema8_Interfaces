package ejercicio02;

import java.util.Arrays;

public class MainJugador {

	public static void main(String[] args) {
		
		//Nos creamos un array de tipo Futbolista.
		Futbolista[] jug= new Futbolista[5];
		
		//Creamos los objetos.
		jug[0]=new Futbolista (1, "Ana", 17, 9);
		jug[1]=new Futbolista (2, "María", 16, 3);
		jug[2]=new Futbolista (3, "Luisa", 18, 2);
		jug[3]=new Futbolista (3, "Carmen", 17, 1);
		jug[4]=new Futbolista (2, "Elena", 16, 2);

		//Ordenamos el array.
		Arrays.sort(jug);
		
		//Imprimimos el array.
		System.out.println(Arrays.deepToString(jug));
	}

}
