package com.unab;

public class Imprimir_pantalla {

	public static void main (String [] args ) {
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
		//estadistica 25>, (26<=, 35>=), >35; 
			System.out.println("Estadistica de edades");
			System.out.println("Participantes menores de 25: " + asistentesMenoresDe25);
			System.out.println("Participantes entre 26 y 35: " + asistentesEntre26y35);
			System.out.println("Participantes mayores de 35: ");
			
	}
	
	
	
}
