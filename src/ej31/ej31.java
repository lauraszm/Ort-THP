package ej31;
import java.util.Scanner;

public class ej31 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		char continuar;
		
//		System.out.println("Desea continuar? S/N");
//		continuar = input.nextLine().charAt(0);
//		
//		while(Character.toLowerCase(continuar) != 's' && Character.toLowerCase(continuar)!='n') {
//			System.out.println("Desea continuar? S/N");
//			continuar = input.nextLine().charAt(0);
//		}
		
		do {
			System.out.println("Desea continuar? S/N");
			continuar = input.nextLine().charAt(0);
		} while (Character.toLowerCase(continuar) != 's' && Character.toLowerCase(continuar)!='n');
		
		input.close();
	}

}
