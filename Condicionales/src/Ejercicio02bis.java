import java.util.Scanner;

public class Ejercicio02bis {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
				
			System.out.println("Introduce un n�mero: ");
			float num1 = teclado.nextFloat();
				
			System.out.println("Introduce un n�mero: ");
			float num2 = teclado.nextFloat();
				
			System.out.println("Introduce un n�mero: ");
			float num3 = teclado.nextFloat();
			
			if ((num1>num2)&&(num1>num3)) {
				System.out.println("el mayor es "+num1);
			} else if ((num2>num1)&&(num2>num3)) {
				System.out.println("el mayor es "+num2);
			} else {
				System.out.println("el mayor es "+num3);
			}
			
			if (num1>num2) {
				if (num1>num3) {
					System.out.println("el mayor es "+num1);
				} else {
					System.out.println("el mayor es "+num3);
				}
			} else {
				if (num2>num3) {
					System.out.println("el mayor es "+num2);
				} else {
					System.out.println("el mayor es "+num3);
				}
			}
	}

}
