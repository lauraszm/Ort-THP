package ej19;
import java.util.Scanner;
public class ej19 {
	
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		boolean esDeUnSoloDigito,esImpar,estaEnAmbosGrupos,noEstaEnNingunGrupo;
		
		System.out.println("Ingrese un numero entero");
		num = Integer.parseInt(input.nextLine());
		
		esImpar = num % 2 != 0;
		esDeUnSoloDigito = num >= -9 && num <10;
		estaEnAmbosGrupos = esImpar && esDeUnSoloDigito;
		noEstaEnNingunGrupo = !esImpar && !esDeUnSoloDigito;
		
		System.out.println("El numero ingresado es " + num);
		System.out.println("Es impar: " + esImpar);
		System.out.println("Es de un solo digito: " + esDeUnSoloDigito);
		System.out.println("Esta en ambos grupos: " + estaEnAmbosGrupos);
		System.out.println("No esta en ningun grupo: " + noEstaEnNingunGrupo);
		input.close();
	}
}
