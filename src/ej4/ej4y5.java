package ej4;

import java.util.Scanner;


public class ej4y5 {
	static Scanner input = new Scanner(System.in); //variable global, constante
	public static void main(String[] args) {

	/*
	//ej3
	int num;
	System.out.println("Ingrese un numero entero");
	num = Integer.parseInt(input.nextLine());
	System.out.println(num + "*5 = " + num*5);
	System.out.println(num + "/2 = " + (double)num/2);
	*/
	/*
	//ej4
	int horas;
	double valorHora;
	System.out.println("Ingrese el valor de la hora");
	valorHora = input.nextDouble();
	input.nextLine();
	System.out.println("Ingrese la cantidad de horas trabajadas por dia");
	horas = Integer.parseInt(input.nextLine());
	System.out.println("El salario semanal es " + valorHora * horas * 5.5);
	 */
	
	//ej5
	int num1,num2,numAux;
	System.out.println("Ingrese el primer numero entero");
	num1 = Integer.parseInt(input.nextLine());
	System.out.println("Ingrese el segundo numero entero");
	num2 = Integer.parseInt(input.nextLine());
	System.out.println("Num1: " + num1 + ", Num2: " + num2);
	numAux = num1;
	num1 = num2;
	num2 = numAux;
	System.out.println("Cruzados - Num1: " + num1 + ", Num2: " + num2);
	
	
	
	input.close();

	}
}