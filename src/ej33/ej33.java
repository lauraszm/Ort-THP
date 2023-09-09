package ej33;
import java.util.Scanner;

public class ej33 {
	public static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
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
		
		num = pedirDato();
		while (num !=CORTE) {
			max = chequearMax(num, max);
			min = chequearMin(num, min);
			num = pedirDato();
		}
		
		
		input.close();

	}
	
	public static int pedirDato() {
		int num;
		System.out.println("Ingrese un numero, 0 para salir");
		num = Integer.parseInt(input.nextLine());
		return num;
	}
	
	public static int chequearMax(int num, int maximo) {
		int max;
		if (num > maximo) {
			max = num;
		} else {
			max = maximo;
		}
		return max;
		
	}
	
	public static int chequearMin (int num, int minimo) {
		int min;
		if (num < minimo) {
			min = num;
		} else {
			min = minimo;
		}
		return min;
	}

}
