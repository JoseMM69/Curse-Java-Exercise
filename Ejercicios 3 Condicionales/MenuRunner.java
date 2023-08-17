package condicionales_if_switch;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingress el primer numero: ");
		int num1 = scanner.nextInt();
		System.out.println("El numero que ingresaste es: " + num1);
		System.out.print("Ingress el segundo numero: ");
		int num2 = scanner.nextInt();
		System.out.println("El numero que ingresaste es: " + num2);

		System.out.println("1-Add");
		System.out.println("2-Substract");
		System.out.println("3-Divide");
		System.out.println("4-Multiply");

		System.out.println("Ingress su opcion para el menu del 1-4: ");
		int choice = scanner.nextInt();

		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);

		// operacionesIfMenu(num1, num2, choice);
		operacionesSwitchMenu(num1, num2, choice);
	}

	public static void operacionesIfMenu(int num1, int num2, int choice) {

		if (choice == 1) {
			int result = num1 + num2;
			System.out.println("La suma es: " + result);
		} else if (choice == 2) {
			int result = num1 - num2;
			System.out.println("La resta es: " + result);
		} else if (choice == 3) {
			int result = num1 / num2;
			System.out.println("La division es: " + result);
		} else if (choice == 4) {
			int result = num1 * num2;
			System.out.println("La multiplicacion es: " + result);
		} else {
			System.out.println("Opcion Invalida");
		}
	}

	public static void operacionesSwitchMenu(int num1, int num2, int choice) {

		switch (choice) {
		case 1:
			System.out.println("la suma es: " + (num1 + num2));
			break;
		case 2:
			System.out.println("la resta es: " + (num1 - num2));
			break;
		case 3:
			System.out.println("la division es: " + (num1 / num2));
			break;
		case 4:
			System.out.println("la multiplicacion es: " + (num1 * num2));
			break;
		default:
			System.out.println("Valor no valido");
			break;
		}
		
	}

}
