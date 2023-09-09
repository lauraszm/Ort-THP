package ej37;

import java.util.Scanner;

public class ej37 {
	
	public static final Scanner input = new Scanner(System.in);
	
	public static final int CANT_SUELDOS = 12;
	public static final int MINIMO_SUELDO = 0;
	
	public static void main(String[] args) {
		
		int contMeses = 1;
		double salario = 0, acumSalario = 0;
		
		
		System.out.println("Ingrese su sueldo del mes " + contMeses);
		salario = Double.parseDouble(input.nextLine());
		
		while (contMeses < CANT_SUELDOS && salario >= MINIMO_SUELDO) {
			acumSalario += salario;
			contMeses++;
			System.out.println("Ingrese su sueldo del mes " + contMeses);
			salario = Double.parseDouble(input.nextLine());
			
			if (contMeses == CANT_SUELDOS) {
				acumSalario += salario;
			}
		}
		if (acumSalario > 0) {
			System.out.println("El total del anio es " + acumSalario);
		} else  {
			System.out.println("Este anio no se cobro nada");
		}
		input.close();

	}

}
