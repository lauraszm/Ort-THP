package Ej35;

import java.util.Scanner;

public class ej35 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String nombre, masJoven;
		int edad, minEdad = Integer.MAX_VALUE;
		
		System.out.println("Ingrese el nombre - Incluya un asterisco para salir");
		nombre = input.nextLine();
		masJoven = nombre;
		while (!nombre.contains("*")) {
			System.out.println("Ingrese la edad de" + nombre);
			edad = Integer.parseInt(input.nextLine());
			if(edad < minEdad) {
				minEdad = edad;
				masJoven = nombre;
				}
			System.out.println("Ingrese el nombre - Incluya un asterisco para salir");
			nombre = input.nextLine();

		};
		if (!masJoven.contains("*")) {			
			System.out.println("La persona mas joven es " + masJoven);
		} else {
			System.out.println("No se ingresaron datos");
		}
		
		input.close();

	}

}
