package ej10;

import java.util.Scanner;

public class ej10 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		//ej10
		String socio1,socio2,socio3;
		double capitalSocio1,capitalSocio2,capitalSocio3,totalCapital;
		System.out.println("Ingrese el nombre del socio 1");
		socio1 = input.nextLine();
		System.out.println("Ingrese el capital de " + socio1);
		capitalSocio1 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el nombre del socio 2");
		socio2 = input.nextLine();
		System.out.println("Ingrese el capital de " + socio2);
		capitalSocio2 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el nombre del socio 3");
		socio3 = input.nextLine();
		System.out.println("Ingrese el capital de " + socio3);
		capitalSocio3 = Double.parseDouble(input.nextLine());
		totalCapital = capitalSocio1 + capitalSocio2 + capitalSocio3;
		System.out.println("El total del capital aportado es " + totalCapital);
		System.out.println(socio1 + "aporto " + (capitalSocio1*100/totalCapital));
		System.out.println(socio2 + "aporto " + (capitalSocio2*100/totalCapital));
		System.out.println(socio3 + "aporto " + (capitalSocio3*100/totalCapital));
		
		
		input.close();
	}

}
