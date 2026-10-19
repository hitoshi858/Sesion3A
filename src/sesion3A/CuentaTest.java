package sesion3A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	Cuenta c;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c = new Cuenta();
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
	void testIngresar() {
		c.ingresar(500)
		assertEquals(500, c.getSaldo());
	}
	
	@Test
	void testRetiar() {
		fail("Not yet implemented");
	}

}
