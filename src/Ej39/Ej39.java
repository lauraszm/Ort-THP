package Ej39;

import java.util.Scanner;

public class Ej39 {
	
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int jugadores, puntaje, distancia, contCentro = 0, mayorPuntaje = 0;
		String nombreJugador, jugadorMayor = "";
		
		do {
			System.out.println("Ingrese la cantidad de jugadores (minimo 2)");
			jugadores = Integer.parseInt(input.nextLine());
		} while (jugadores < 2);
		
		for (int i = 0; i<jugadores; i++) {
			System.out.println("Ingrese el nombre del jugador");
			nombreJugador = input.nextLine();
			puntaje = 0;
			
			for (int j = 0; j < 3; j++) {
				do {
					System.out.println("Ingrese la distancia al centro del tiro numero " + (j+1));
					distancia = Integer.parseInt(input.nextLine());
				} while (distancia < 0);
				
				if (distancia == 0) {
					puntaje += 500;
					contCentro++;
				} else if (distancia > 0 && distancia <=10) {
					puntaje+=250;
				} else if(distancia > 10 && distancia <=50) {
					puntaje +=100;
				} else {
					System.out.println("fuera del tablero");
				}
			}
			
			if (puntaje > mayorPuntaje) {
				mayorPuntaje = puntaje;
				jugadorMayor = nombreJugador;
			}
		}
		
		if (mayorPuntaje > 0) {
			System.out.println("Ganador: " + jugadorMayor + " con el puntaje " + mayorPuntaje);
			if (contCentro > 0) {
				System.out.println("Cantidad de tiros al centro: " + contCentro);
			} else {
				System.out.println("No hubo tiros al centro");
			}
		} else {
			System.out.println("Nadie hizo puntos");
		}
		
		input.close();

	}

}
