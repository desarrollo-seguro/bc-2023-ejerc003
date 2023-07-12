package es.cic.ejerc002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora cut;
	
	

	@BeforeEach
	void setUp() throws Exception {
		this.cut = new Calculadora();
	}

	@Test
	void testSumar() {
		cut.sumar(5.6);
		cut.sumar(3.2456);
		
		double resultado = cut.getResultado();
		assertEquals(8.8456, resultado, 0.000001);
	}

	@Test
	void testRestar() {
		Calculadora cut = new Calculadora();
		
		cut.restar(-3.4);
		cut.restar(3.2);

		double resultado = cut.getResultado();
		assertEquals(0.2, resultado, 0.000001);
	}

	@Test
	void testMultiplicar() {
		Calculadora cut = new Calculadora();
		cut.sumar(1.5);
		cut.multiplicar(3.2);
		
		double resultado = cut.getResultado();
		assertEquals(4.8, resultado, 0.000001);
	}

	@Test
	void testDividir() {
		Calculadora cut = new Calculadora();
		cut.sumar(1.5);
		cut.dividir(3.2);
		
		double resultado = cut.getResultado();
		assertEquals(4.8, resultado, 0.000001);
	}

}
