package ej29;
import java.util.Scanner;
public class ej29 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int nota;
		do {
			System.out.println("Ingrese la nota");
			nota = Integer.parseInt(input.nextLine());
		} while (nota < 0 || nota> 11);
		
		input.close();
	}

}
