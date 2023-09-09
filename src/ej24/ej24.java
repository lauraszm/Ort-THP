package ej24;
import java.util.Scanner;

public class ej24 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2;
		do {			
			System.out.println("Ingrese un numero entero");
			num1 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese otro numero entero");
			num2 = Integer.parseInt(input.nextLine());
		} while (num2 < num1);
		
		for (var i = num1+1; i < num2; i++) {
			System.out.println("excluyendo puntas " + i);
		}
		for (var i = num1; i <= num2; i++) {
			System.out.println("incluyendo puntas " + i);
		}
	}

}
