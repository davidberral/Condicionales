import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el a�o: ");
		int a�o = entrada.nextInt();
		
		if ( (a�o%4)== 0)  {
			if ((a�o%100 == 0) && (a�o%400 != 400))
				System.out.println("El a�o no es bisiesto");
		} else {
			
			if (a�o%4 != 4)
				System.out.println("El a�o no es bisiesto");
		
				System.out.println("El a�o es bisiesto");
		}
	}

}
