import java.util.Scanner;

/** 1. Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son 
iguales. */

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce otro n�mero: ");
		int num2 = teclado.nextInt();
	
		if (num1==num2) {
			System.out.println("Los n�meros son iguales.");
		}else if (num1<num2) {
				System.out.println("El menor es "+num1+" el mayor es "+num2);
		}else {
				System.out.println("El menor es "+num2+" el mayor es "+num1);
		}

	}
}

