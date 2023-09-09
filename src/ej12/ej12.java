package ej12;

import java.util.Scanner;
public class ej12 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2;
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero");
		num2 = Integer.parseInt(input.nextLine());
		
		if(num1 > num2) {
			System.out.println("El numero 1 es mayor " + num1);
		} else if (num1 < num2) {				
			System.out.println("El numero 2 es mayor " + num2);
		} else {
			System.out.println("los numeros son iguales");
		}
		input.close();

	}
}
