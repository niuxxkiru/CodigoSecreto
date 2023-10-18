package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

public class descifradoDeCodigo {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
//		1- ingresar codigo

		System.out.println("Ingrese los numeritos(String)");
		String codigoIngresado = teclado.next();
		System.out.println("\nUsted ingreso este codigo: " + codigoIngresado);

//		2- leer cada digito uno x uno con un bucle 	
//		65-90 MAYUSC--------97-122 MIN
//		iteracion cada dos char y cuando sea >99 iteracion cada 3 char
		for (int i = 0; i < codigoIngresado.length(); i += 2) {
			if ((i + 1) < codigoIngresado.length()) {
				String codigoDeADosChar = codigoIngresado.substring(i, i + 2);
				System.out.println("parte del codigo: "+codigoDeADosChar);
			}else {
				String codigoDeAUnChar= codigoIngresado.substring(i, i+1);
				System.out.println("parte del codigo de a uno: "+codigoDeAUnChar);
			}
		}
		
		System.out.println("Probando");

	}

}
