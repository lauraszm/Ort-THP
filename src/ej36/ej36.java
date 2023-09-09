package ej36;

import java.util.Scanner;

public class ej36 {

	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double promedio;
		int num,cont = 0, acum = 0;
		do {
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
			cont++;
			acum+=num;
			promedio = acum/cont;
		} while(promedio < 20);
		
		System.out.println("Cantidad de valores leidos: " + cont);
		input.close();
	}

}
