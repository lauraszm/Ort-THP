package ej14;

import java.util.Scanner;

public class ej14 {

	public static final Scanner input = new Scanner(System.in);
	//definir constantes
	public static final int EDAD_MINIMA = 6;
	public static final double ALTURA_MINIMA = 1.50;
	public static void main(String[] args) {
		
		//defino variables
		String nombre;
		int edad;
		double altura;
		boolean puedeEntrar;
		
		//pido datos
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su altura");
		altura = Double.parseDouble(input.nextLine());
		
		//evaluamos datos
		/*if(edad > EDAD_MINIMA && altura > ALTURA_MINIMA) {
			puedeEntrar = true;
		}*/
		puedeEntrar = edad > EDAD_MINIMA && altura > ALTURA_MINIMA;
		
		//muestro el resultado x pantalla
		if(puedeEntrar) {
			System.out.println(nombre + " Puede entrar al juego");
		} else {
			System.out.println(nombre + " No puede entrar al juego");
		}
		
		input.close();
	}

}
