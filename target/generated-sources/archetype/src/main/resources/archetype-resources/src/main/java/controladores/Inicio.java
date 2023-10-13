#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package controladores;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import servicios.ImplConexion;
import servicios.ImplCrud;
import servicios.InterfazConexion;
import servicios.InterfazCrud;
import util.metodosExternos;
/**
 * Clase principal de la aplicación ivp
 */
public class Inicio {
	/**
	 * Método de acceso a la aplicación de consola
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazConexion cpi = new ImplConexion();
		InterfazCrud crud = new ImplCrud();
		metodosExternos util = new metodosExternos();
		

		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			util.mostrarMenu(); // mostramos menu
			opcion = sc.nextLine().charAt(0) - '0';
			// control de errores
			while (opcion < 0 || opcion > 4) {

				System.out.println("${symbol_escape}n${symbol_escape}t${symbol_escape}t${symbol_escape}t**ERROR**");
				System.out.print("${symbol_escape}t${symbol_escape}tIntroduce una opcion: ");
				opcion = sc.nextLine().charAt(0) - '0';
			}
			System.out.flush();
			switch (opcion) {

			case 1:
				try {
					Connection conexion = cpi.generaConexion();
					

					if (conexion != null) {
						
						//Cerramos la conexion despues de llamar a la funcion
						conexion.close();
							
						
					}

				} catch (Exception e) {
					System.out.println("[ERROR-Main] Se ha producido un error al ejecutar la aplicación: " + e);
				}
				break;
			case 2:
				try {
					Connection conexion = cpi.generaConexion();

					if (conexion != null) {
						//Cerramos la conexion despues de llamar a la funcion
						conexion.close();
					}

				} catch (Exception e) {
					System.out.println("[ERROR-Main] Se ha producido un error al ejecutar la aplicación: " + e);
				}
				break;
			case 3:
				try {
					Connection conexion = cpi.generaConexion();

					if (conexion != null) {
						//Cerramos la conexion despues de llamar a la funcion
						conexion.close();
					}

				} catch (Exception e) {
					System.out.println("[ERROR-Main] Se ha producido un error al ejecutar la aplicación: " + e);
				}
				break;
			case 4:
				try {
					Connection conexion = cpi.generaConexion();

					if (conexion != null) {
						//Cerramos la conexion despues de llamar a la funcion
						conexion.close();

					}

				} catch (Exception e) {
					System.out.println("[ERROR-Main] Se ha producido un error al ejecutar la aplicación: " + e);
				}
				break;

			}
			if (opcion != 0) {
				System.out.print("${symbol_escape}n${symbol_escape}n${symbol_escape}tPulsa una tecla para volver al menú... ");
				sc.nextLine();
				System.out.flush();
			}

		} while (opcion != 0);
		System.out.println("${symbol_escape}n${symbol_escape}tSaliendo de la aplicacion  ${symbol_escape}n${symbol_escape}tPulse cualquier tecla para cerrar el programa");
		sc.nextLine();
	}
}


