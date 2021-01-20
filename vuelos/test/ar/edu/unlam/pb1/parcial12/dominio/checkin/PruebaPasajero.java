package ar.edu.unlam.pb1.parcial2.dominio.checkin;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaPasajero {

	@Test
	public void verificarQueSeCreeUnPasajero() {
	
		//preparaci�n de los datos
		String nombre="Pedro";
		String apellido="Perez";
		Integer dni= 222;
		
		//Ejecutar los m�todos
		Pasajero miPasajero = new Pasajero(dni, nombre, apellido);
		
		//Verificaci�n de los datos, los assert es una sobrecarga de metodos
		assertEquals(222, miPasajero.getDni());
		
	}

	@Test
	public void test2() {
		
	}
}
