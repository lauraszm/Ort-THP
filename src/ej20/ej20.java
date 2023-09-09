package ej20;
import java.util.Scanner;

public class ej20 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		char operacion;
		int num1, num2, resultado;
		final char SUMA = '+', RESTA = '-', MULTIPLICACION = '*', DIVISION = '/';
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese numero 2");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la operacion a realizar");
		operacion = input.nextLine().charAt(0);
		
		//switch compara casos de igualdad
		//no compara mayor, menor, etc
		switch (operacion) {
			case SUMA:
				resultado = num1 + num2;
				System.out.println("suma " + resultado);
				break;
			case RESTA:
				resultado = num1-num2;
				System.out.println("resta " + resultado);
				break;
			case MULTIPLICACION:
				resultado = num1 * num2;
				System.out.println("multiplicacion " + resultado);
				break;
			case DIVISION:
				if(num2 !=0) {
					resultado = num1/num2;
					System.out.println("division " + resultado);
				} else {
					System.out.println("No se puede dividir por 0");
				}
				break;
			default:
				System.out.println("Ingrese una operacion valida");
				break;
		}
		
		input.close();
		
	}

}
