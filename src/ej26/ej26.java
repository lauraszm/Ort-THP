package ej26;
import java.util.Scanner;
public class ej26 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		System.out.println("Ingrese un numero entero");
		n = Integer.parseInt(input.nextLine());
		for (var i =3; i <= n*3; i+=3) {
			if (i % 5 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		input.close();
	}

}
