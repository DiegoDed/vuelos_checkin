package ar.edu.unlam.pb1.parcial2.dominio.checkin;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaPasajero {

	@Test
	public void verificarQueSeCreeUnPasajero() {
	
		//preparación de los datos
		String nombre="Pedro";
		String apellido="Perez";
		Integer dni= 222;
		
		//Ejecutar los métodos
		Pasajero miPasajero = new Pasajero(dni, nombre, apellido);
		
		//Verificación de los datos, los assert es una sobrecarga de metodos
		assertEquals(222, miPasajero.getDni());
		
	}

	@Test
	public void test2() {
		
	}
}
