package ej8;
import java.util.Scanner;



public class ej8 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		int num1,num2,suma,resta,multi;
		double division;
		System.out.println("Ingrese un numero natural");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero natural");
		num2 = Integer.parseInt(input.nextLine());
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		division = (double)num1 / (double)num2;
		System.out.println("Suma: " + suma + " / Resta: " + resta + " / Multiplicacion: " + multi + " / Division: " + division);
		
	}
}
