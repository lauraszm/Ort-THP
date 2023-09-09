package Modularizacion;

import java.util.Scanner;

public class ModularizacionEjemplo {
	
	public static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num, num1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		final int CORTE = 0;
		
		/*do {
			System.out.println("Ingrese un numero, 0 para salir");
			num = Integer.parseInt(input.nextLine());
			
			if (num < min && num != CORTE) {
				min = num;
			} else if (num > max && num != CORTE) {
				max = num;
			}
			
		} while(num != 0);*/
		
		System.out.println("Ingrese un numero, 0 para salir");
		num = Integer.parseInt(input.nextLine());
		while (num !=0) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		System.out.println("Ingrese un numero, 0 para salir");
		num = Integer.parseInt(input.nextLine());
		}
		
		
		System.out.println("El maximo fue " + max);
		System.out.println("El minimo fue " + min);
		
		mostrarMensajeError("hola");
		
		num1 = ingresarNumeroPositivo();
		
		int edad1, edad2;
		final String MENSAJE_INGRESO = "Ingrese su edad";
		
		edad1 = ingresarNumeroPositivoGenerico(MENSAJE_INGRESO);
		edad2 = ingresarNumeroPositivoGenerico(MENSAJE_INGRESO);
		
		
		input.close();
	}
	
	//procedimiento (no devuelve nada)
	public static void mostrarMensajeError(String mensaje) {
		System.err.println(mensaje);
	}
	
	//funcion con un return - el return lo guardo en una variable en el main
	public static int ingresarNumeroPositivo() {
		int num;
		do {
			System.out.println("Ingrese un numero, 0 para salir");
			num = Integer.parseInt(input.nextLine());
			
		} while(num != 0);
		return num;
	}
	
	//mas generico que lo anterior
	public static int ingresarNumeroPositivoGenerico(String mensaje) {
		int num;
		do {
			System.out.println(mensaje);
			num = Integer.parseInt(input.nextLine());
			
		} while(num >= 0);
		return num;
	}

}
