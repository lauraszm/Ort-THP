package ej17;
import java.util.Scanner;

public class ej17 {
	public static final Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int edad;
		char genero;
		boolean puedeJubilarse = false;
		
		System.out.println("Ingrese su edad, entre 0 y 120");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el genero (M / F)");
		genero = input.nextLine().charAt(0);
		
		if((genero == 'F' && edad >=60) || (genero == 'M' && edad >= 65)) {
			puedeJubilarse = true;
		}
		if (puedeJubilarse) {
			System.out.println("Usted esta en condiciones de jubilarse");
		} else {
			System.out.println("Usted no esta en edad de jubilarse");
		}

	}

}
