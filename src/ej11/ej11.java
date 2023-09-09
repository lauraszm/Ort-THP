package ej11;

import java.util.Scanner;
public class ej11 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num,resto;
		System.out.println("Ingrese un numero");
		num = Integer.parseInt(input.nextLine());
		resto = num % 2;
		if (resto == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("numero impar");
		}
		input.close();
	}

}
