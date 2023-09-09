package ej27;
import java.util.Scanner;

public class ej27 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad, acum = 0, cantMay18 =0;
		double promedio;
		final int cantidadEdades = 5;
		
		for(int i = 0; i < cantidadEdades; i++) {
			System.out.println("Ingrese la edad " + (i+1));
			edad = Integer.parseInt(input.nextLine());
			acum += edad;
			if (edad > 18 && edad % 2 == 1) {
				cantMay18++;
			}
		}
		
		promedio = (double) acum / cantidadEdades;
		
		System.out.println("Promedio edades " + promedio);
		System.out.println("Impares mayores de 18: " + cantMay18);
		
		
		input.close();
	}

}
