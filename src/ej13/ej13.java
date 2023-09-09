package ej13;

import java.util.Scanner;

public class ej13 {
	static Scanner input = new Scanner(System.in);
	public static void main (String[] args) {
		int num1,num2,num3;
		System.out.println("Ingrese numero 1");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese numero 2");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese numero 3");
		num3 = Integer.parseInt(input.nextLine());
		if(num1 == num2 && num2 == num3) {
			System.out.println("Los numeros son iguales " + num1);
		} else if(num1>num2 && num1 > num3) {
			System.out.println("el numero mayor es el num1 " + num1);
		} else if (num2 > num3) {
			System.out.println("el numero mayor es el num2 " + num2);
		} else {
			System.out.println("el numero mayor es el num3 " + num3);
		}
	}
}
