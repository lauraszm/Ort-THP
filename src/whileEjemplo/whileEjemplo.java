package whileEjemplo;
import java.util.Scanner;

public class whileEjemplo {
	public static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int cant;
		/*System.out.println("Ingrese un numero");
		cant = Integer.parseInt(input.nextLine());
		while (cant < 0) {
			System.out.println("ERROR: Ingrese la cantidad");
			cant = Integer.parseInt(input.nextLine());
		}
		
		System.out.println("El numero quedo validado: " + cant);*/
		
		do {
			System.out.println("Ingrese un numero");
			cant = Integer.parseInt(input.nextLine());
		} while (cant < 0);
		System.out.println("El numero quedo validado: " + cant);

		input.close();

	}
	
}
