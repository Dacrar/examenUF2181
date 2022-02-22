package libs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionesTests {

	private static Funciones funciones;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		funciones = new Funciones();
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Iniciando test ...");
	}

	@Test
	void devuelveCentralTest() {
		assertEquals(5, funciones.devuelveCentral(5, 1, 7));
		assertEquals(4, funciones.devuelveCentral(-1, 4, 20));
		assertEquals(-4, funciones.devuelveCentral(-1, -10, -4));
		assertNotEquals(1, funciones.devuelveCentral(1, 2, 3));
		assertEquals(1, funciones.devuelveCentral(1, 1, 1)); 
	}
	
	@Test
	void esBisiestoTest() {
		
		assertTrue(funciones.esBisiesto(2000));
		assertFalse(funciones.esBisiesto(1999));
		assertTrue(funciones.esBisiesto(2152));
		assertFalse(funciones.esBisiesto(1015));
		
		
		
	}
	
	@Test
	void esCapicuaTest() {
		int v[]= {1,2,3,2,1};
		int v2[]= {1,2,3,4,5};
		int v3[]= {1,2,1};
		int v4[]= {2,4};
		assertTrue(funciones.esCapicua(v));
		assertFalse(funciones.esCapicua(v2));
		assertTrue(funciones.esCapicua(v3));
		assertFalse(funciones.esCapicua(v4));
	}
	
	@Test
	void sumaVectoresTest() {
	int v[]= {1,3,5};
	int v2[]= {2,4,6};
	int v3[]= {2,2};
	int vsuma[]= {3,7,11};
	assertArrayEquals(vsuma, funciones.suma_vectores(v, v2));
	assertThrows(ArithmeticException.class, ()-> funciones.suma_vectores(v, v3));
	}
	
}
