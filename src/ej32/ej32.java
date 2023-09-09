package ej32;
import java.util.Scanner;

public class ej32 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int nota;
		do {
			System.out.println("Ingrese la nota");
			nota = Integer.parseInt(input.nextLine());
		} while (nota !=2 && (nota < 4 || nota > 10));
		System.out.println("nota valida: " + nota);
		input.close();
	}

}
