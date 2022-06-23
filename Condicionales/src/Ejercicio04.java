import java.util.Scanner;

/** 4. Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, 
paralelas o secantes. En el caso de que sean secantes, hay que indicar si son 
perpendiculares o no.*/

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("recta 1 ");
		System.out.println("A1: ");
		float a1 = entrada.nextInt();
		System.out.println("B1: ");
		float b1 = entrada.nextInt();
		System.out.println("C1: ");
		float c1 = entrada.nextInt();
		
		System.out.println("recta 2 ");
		System.out.println("A1: ");
		float a2 = entrada.nextInt();
		System.out.println("B1: ");
		float b2 = entrada.nextInt();
		System.out.println("C1: ");
		float c2 = entrada.nextInt();
		
		if ((a1/a2) != (b1/b2)) {
			System.out.println("son secantes");
			if((a1/b1) == (-b2/a2)) {
				System.out.println("son perpendiculares");
			}
		} else {
			System.out.println("son paralelas");
			if ((a1/a2) == (c1/c2)) {
				System.out.println("son coincidentes");
			}
		
		}

	}
}
