package interfaces.app.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaces.app.interfaces.Vehiculo;

class PatineteTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testArrancar() {
		Patinete p = new Patinete();
		assertFalse(p.isEstaArrancado(), "deberia estar parado");

		p.setEstaArrancado(true);
		assertTrue(p.isEstaArrancado(), "deberia poder arrancarse");
	}

	@Test
	void testAcelerar() throws Exception {
		Patinete p = new Patinete();
		p.acelerar(20);
		assertFalse(p.isEstaArrancado(), "deberia estar parado");
		assertEquals(0, p.getVelocidadActual(), "no deberia haber incrementado la velocidad");

		p.setEstaArrancado(true);
		p.acelerar(20);
		assertEquals(20, p.getVelocidadActual(), "deberia haber incrementado la velocidad");

		p.acelerar(Vehiculo.VEL_MAX_PATINETE);
		assertEquals(Vehiculo.VEL_MAX_PATINETE, p.getVelocidadActual(), "deberia estar a tope");

		p.acelerar(500);
		assertEquals(Vehiculo.VEL_MAX_PATINETE, p.getVelocidadActual(), "deberia estar a tope");
	}

	@Test
	void testFrenar() throws Exception {
		// crear patinete
		Patinete p = new Patinete();

		// arrancar y acelerar hasta 50
		p.setEstaArrancado(true);
		p.acelerar(50);

		// decelerar 40
		p.frenar(10);
		assertEquals(40, p.getVelocidadActual(), "deberia haber reducido la velocidad");

		// decelerar 50
		p.frenar(50);
		assertEquals(0, p.getVelocidadActual(), "deberia haber reducido la velocidad a 0");

	}

	@Test
	void testApagar() throws Exception {
		// creamos patinete
		// arrancar y acelarar
		Patinete p = new Patinete();
		p.setEstaArrancado(true);
		p.acelerar(20);

		// probar arrancar estando en marcha
		try {
			p.apagar();
			fail("deberia haber lanzado Exception");
		} catch (Exception e) {
			assertTrue(true);
		}

		// decelerar hasta cero
		p.frenar(20);

		// probar de nuevo a parar
		try {
			p.apagar();
			assertEquals(0, p.getVelocidadActual());
			assertFalse(p.isEstaArrancado());
		} catch (Exception e) {
			fail("deberia haber lanzado Exception");
		}

	}
}
