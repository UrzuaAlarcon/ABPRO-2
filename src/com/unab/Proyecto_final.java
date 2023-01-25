package com.unab;

import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto_final {
	


 	//Variables Cliente
 	static String rut = "";
 	static String nombre = "";
 	static String direccion = "";
 	static String comuna = "";
 	static String telefono = "";

 	//Variables Capacitacion
 	static String diaCapacitacion = "";
 	static String horaCapacitacion = "";
 	static String lugarCapacitacion = "";
 	static String duracionCapacitacion = "";
 	static String cantidadAsistentes = "";

 	//ArrayList de ArrayLists que contiene los asistentes y sus datos 	
 	static ArrayList<ArrayList<String>> asistentes = new ArrayList<ArrayList<String>>();	

 	//Valiables Asistente
 	static String nombreAsistente = "";
 	static int [] edadAsistente = new int [1];

 	//Contadores de estadisticas	
 	static int asistentesMenoresDe25 = 0;
     static int asistentesEntre26y35 = 0;
     static int asistentesMayoresDe35 = 0;

 	static Scanner sc = new Scanner(System.in);

 	public static void main(String[] args) {

 		ingresaCliente();
 		ingresaCapacitacion();
 		ingresaAsistentes();		
 	}

 	public static void ingresaCliente() {
 		System.out.println("Bienvenido al sistema de registro de clientes");
 		System.out.println("Por favor ingrese su Rut (sin puntos ni guion) en caso de registrarse como persona natural o");
         System.out.println("el Rut de su empresa: ");
           rut = sc.nextLine();
           while (!rut.matches("[0-9]{6,9}")) {
         	  System.out.println("Rut invalido, intente nuevamente");
         	    rut = sc.nextLine();
        	    } 

         System.out.println("Ingrese su nombre o el nombre de su empresa: ");
           nombre = sc.nextLine();
           while (nombre == ("")) {
         	  System.out.println("Campo obligatorio");
         	  System.out.println("Ingrese su nombre o el nombre de su empresa: ");
         	  nombre = sc.nextLine();
           }
         System.out.println("Ingrese la direccion correspondiente: ");
           direccion = sc.nextLine();
           while (direccion == "") {
         	  System.out.println("Campo oblgatorio");
         	  System.out.println("Ingrese la direccion correspondiente: ");
         	  direccion = sc.nextLine();
           }
         System.out.println("Ingrese la comuna correspondiente al domicilio indicado anteriormente ");
           comuna = sc.nextLine();
           while (comuna == "") {
         	  System.out.println("Campo oblgatorio");
         	  System.out.println("Ingrese la comuna correspondiente al domicilio indicado anteriormente ");
         	  comuna = sc.nextLine();
           }
         System.out.println("Ingrese telefono de contacto [569XXXXXXXX]");
           telefono = sc.nextLine();
           while (!telefono.matches("[0-9]{11}")) {
         	  System.out.println("Telefono invalido, intente nuevamente");
         	    telefono = sc.nextLine();    
        	    }        
 	}

 	public static void ingresaCapacitacion() {
 		System.out.println("Que dia se realizara la capacitacion: ");
 		diaCapacitacion = sc.nextLine();
 		while (diaCapacitacion.equals("")) {
 			System.out.println("[Error] Campo obligatorio. ");
 			System.out.println("Que dia se realizara la capacitacion: ");
 			diaCapacitacion = sc.nextLine();
 		}

 		System.out.println("A que hora se realizara la capacitacion: ");
 		horaCapacitacion = sc.nextLine();
 		while (horaCapacitacion.equals("")) {
 			System.out.println("[Error] Campo obligatorio. ");
 			System.out.println("A que hora se realizara la capacitacion: ");
 			horaCapacitacion = sc.nextLine();
 		}

 		System.out.println("En que lugar se realizara la capacitacion: ");
 		lugarCapacitacion = sc.nextLine();
 		while (lugarCapacitacion.equals("")) {
 			System.out.println("[Error] Campo obligatorio. ");
 			System.out.println("En que lugar se realizara la capacitacion: ");
 			lugarCapacitacion = sc.nextLine();
 		}

 		System.out.println("Cual sera la duracion de la capacitacion: ");
 		duracionCapacitacion = sc.nextLine();
 		while (duracionCapacitacion.equals("")) {
 			System.out.println("[Error] Campo obligatorio. ");
 			System.out.println("Cual sera la duracion de la capacitacion: ");
 			duracionCapacitacion = sc.nextLine();
 		}

 		System.out.println("Cuantos seran los asistentes: ");
 		cantidadAsistentes = sc.nextLine();
 		while (cantidadAsistentes.equals("")) {
 			System.out.println("[Error] Campo obligatorio. ");
 			System.out.println("Cuantos seran los asistentes: ");
 			cantidadAsistentes = sc.nextLine();
 		}
 	}

 	public static void ingresaAsistentes(){
 		for (int i = 0; i < Integer.valueOf(cantidadAsistentes); i++) {
 		    asistentes.add(new ArrayList<String>());
 		    for (int j = 0; j < 1; j++) {

 		    	System.out.println("Ingrese nombre del asistente " + (i+1) + ": ");
 		    	nombreAsistente = sc.nextLine();
 		    	System.out.println("Ingrese edad del asistente " + (i+1) + ": ");
 		    	nombreAsistente = sc.nextLine();

 		        asistentes.get(i).add(nombreAsistente);
 		        asistentes.get(i).add(Integer.toString(edadAsistente));		        
 		    }
 		}
 		for (int i = 0; i < edadAsistente.length; i++) {
 			if (edadAsistente[i] == target) { 
 				asistentesMenoresDe25++
 			
 			
 		}
 		
 		}
 		
 		/**Mostrar por pantalla: datos de la empresa los datos de la capacitación misma, 
	    y la cantidad de personas menores a 25 años, entre 26 y 35 años y mayores a 35 años.
		*/
		
 		
		//datos de la empresa
		 System.out.println("Datos Empresa cliente");
	        System.out.println(" ");
			System.out.println("RUT: " + rut);
			System.out.println("Nombre: " + nombre);
			System.out.println("Direccion: " + direccion);
			System.out.println("Comuna: " + comuna);
			System.out.println("Telefono" + telefono);
	
		
		//datos capacitacion Capacitación: día, hora, lugar, duración y cantidad de asistentes.
		
			System.out.println("Datos de la capacitacion solicitada");
	        System.out.println(" ");
			System.out.println("Fecha: " + diaCapacitacion);
			System.out.println("Hora: " + horaCapacitacion);
			System.out.println("Lugar del evento: " + lugarCapacitacion);
			System.out.println("Duracion: " + duracionCapacitacion);
			System.out.println("Numero de participantes" + cantidadAsistentes);
			System.out.println(" ");
		//estadistica 25>, (26<=, 35>=), >35; 
			System.out.println("Estadistica de edades");
			System.out.println(" ");
			System.out.println("Participantes menores de 25: " + asistentesMenoresDe25);
			System.out.println("Participantes entre 26 y 35: " + asistentesEntre26y35);
			System.out.println("Participantes mayores de 35: " + asistentesMayoresDe35);
 		
 	}

 	
 	
 	
}
