package ej38;

import java.util.Scanner;

public class Ej38 {
	public static final Scanner input = new Scanner(System.in);
	public static final String USUARIO = "admin";
	public static final String PASS = "123456";
	public static final int MAXIMO_INTENTOS = 3;
	public static void main(String[] args) {
		
		String usuarioIngresado, passIngresada;
		boolean accesoConcedido = false;
		int contadorIntentos = 0;
		
		do {
			System.out.println("Ingrese usuario");
			usuarioIngresado = input.nextLine();
			System.out.println("Ingrese la contrasenia");
			passIngresada = input.nextLine();
			
			if(usuarioIngresado.equals(USUARIO) && passIngresada.equals(PASS)) {
				accesoConcedido = true;
				System.out.println("Acceso concedido " + accesoConcedido);
			} else {
				contadorIntentos++;
				System.out.println("Acceso concedido " + accesoConcedido + ". Intentos restantes: " + (MAXIMO_INTENTOS - contadorIntentos));
				if (contadorIntentos == 3) {
					System.out.println("Se ha bloqueado la cuenta");
				}
			}
			
		} while (contadorIntentos < 3 && !accesoConcedido);
		
		input.close();
	}

}
