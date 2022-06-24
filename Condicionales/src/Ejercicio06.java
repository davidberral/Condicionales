import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Calculadora");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("Introduce una opción (1-4): ");
		int opcion = entrada.nextInt();
		double res = 0;
		
		switch (opcion) {
		case 1: res = num1+num2;
				break;
		case 2: res = num1-num2;
				break;
		case 3: res = num1*num2;
				break;
		case 4: res = num1/num2;
				break;
		default: System.out.println("Opcion incorrecta. Debe elegir una opcion entre 1 y 4");
		}
		
		if (opcion>=1 && opcion<=4) {
		System.out.println("El resultado es "+res);
		}
		
	}

}
