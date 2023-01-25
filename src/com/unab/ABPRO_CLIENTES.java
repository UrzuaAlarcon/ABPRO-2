/**
 * 
 */
package com.unab;

import java.util.Scanner;

/**
 * @author vespertino
 *
 */
public class ABPRO_CLIENTES {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**capacitaciones para todos los clientes (empresas). 
		Registro cliente del RUT del cliente, su nombre, dirección, comuna y número de teléfono. 
		Capacitación: día, hora, lugar, duración y cantidad de asistentes.
	    Asistentes: el nombre y edad de los asistentes. 
	    Mostrar por pantalla: datos de la empresa los datos de la capacitación misma, 
	    y la cantidad de personas menores a 25 años, entre 26 y 35 años y mayores a 35 años.
		*/
		String rut;
		String nombre;
		String direccion;
		String comuna;
		String telefono;
		
	    Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenido al sistema de registro de clientes");
		System.out.println("Por favor ingrese su Rut (sin puntos ni guion) en caso de registrarse como persona natural o");
        System.out.println("el Rut de su empresa: ");
          rut = entrada.nextLine();
          while (!rut.matches("[0-9]{6,9}")) {
        	  System.out.println("Rut invalido, intente nuevamente");
        	    rut = entrada.nextLine();
       	    } 
          
        System.out.println("Ingrese su nombre o el nombre de su empresa: ");
          nombre = entrada.nextLine();
          while (nombre == ("")) {
        	  System.out.println("Campo obligatorio");
        	  System.out.println("Ingrese su nombre o el nombre de su empresa: ");
        	  nombre = entrada.nextLine();
          }
        System.out.println("Ingrese la direccion correspondiente: ");
          direccion = entrada.nextLine();
          while (direccion == "") {
        	  System.out.println("Campo oblgatorio");
        	  System.out.println("Ingrese la direccion correspondiente: ");
        	  direccion = entrada.nextLine();
          }
        System.out.println("Ingrese la comuna correspondiente al domicilio indicado anteriormente ");
          comuna = entrada.nextLine();
          while (comuna == "") {
        	  System.out.println("Campo oblgatorio");
        	  System.out.println("Ingrese la comuna correspondiente al domicilio indicado anteriormente ");
        	  comuna = entrada.nextLine();
          }
        System.out.println("Ingrese telefono de contacto [569XXXXXXXX]");
          telefono = entrada.nextLine();
          while (!telefono.matches("[0-9]{11}")) {
        	  System.out.println("Telefono invalido, intente nuevamente");
        	    telefono = entrada.nextLine();    
       	    }
        entrada.close();
        
	}

}
