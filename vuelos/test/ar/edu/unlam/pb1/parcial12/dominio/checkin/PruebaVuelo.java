package ar.edu.unlam.pb1.parcial2.dominio.checkin;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaVuelo {

	@Test
	public void testAgregaUnPasajeroAUnVuelo() {
		//Preparacion
		Vuelo vuelo1 = new Vuelo("EPA", "BRC", 4);
		Pasajero pasajero1 = new Pasajero(222, "Pedro", "Perez");
		
		//Ejecucion
		
		Boolean agrego= vuelo1.agregarPasajero(pasajero1);
		
		//verificacion
		assertTrue(agrego);
	}

	@Test
	public void testQueNoPermitaAgregarMasPasajeroDeLoPermitidoAUnVuelo(){
		
		//preparacion
		Vuelo vuelo= new Vuelo("Eze", "igr", 3);
		Pasajero pasajero1= new Pasajero(333, "Jose", "Martinez");
		Pasajero pasajero2= new Pasajero(555, "Carlos", "Pascal");
		Pasajero pasajero3= new Pasajero(777, "Alex", "Fabrega");
		Pasajero pasajero4= new Pasajero(999, "Mario", "Umberto");
		
		//ejecucion
		vuelo.agregarPasajero(pasajero1);
		vuelo.agregarPasajero(pasajero2);
		assertTrue(vuelo.agregarPasajero(pasajero3));
		
		//verificacion
		assertFalse(vuelo.agregarPasajero(pasajero4));
	}
	@Test
	public void testQuePermitaBuscarAlPasajeroConSuDniEnElVuelo(){
		
		
		Vuelo vuelo = new Vuelo("Eze", "Mendoza", 1);
		Pasajero pasajero1 = new Pasajero(555, "Jose", "Martinez");
		
		
		vuelo.agregarPasajero(pasajero1);		
		
		
		assertEquals(pasajero1.getDni(), pasajero1.getDni());
	}
}
