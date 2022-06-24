import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el año: ");
		int año = entrada.nextInt();
		
		if ( (año%4)== 0)  {
			if ((año%100 == 0) && (año%400 != 400))
				System.out.println("El año no es bisiesto");
		} else {
			
			if (año%4 != 4)
				System.out.println("El año no es bisiesto");
		
				System.out.println("El año es bisiesto");
		}
	}

}
