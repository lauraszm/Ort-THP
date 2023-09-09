package ej23;

import java.util.Scanner;
public class ej23 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.println("Ingrese un numero entero");
		n = Integer.parseInt(input.nextLine());
		
		for (var i = 1; i <= 10; i++) {
			System.out.println(i*n);
		}
		input.close();
	}

}
