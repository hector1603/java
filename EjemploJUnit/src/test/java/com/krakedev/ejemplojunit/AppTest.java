package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest extends TestBase {

    @Test void shouldAnswerWithTrue() {
        assertTrue( true );
    }
    
    @Test
    public void testSumar() {
    	Calculadora c = new Calculadora();
    	int resultado = c.sumar(5, 10);
    	assertTrue(resultado == 17);
    }
    
    @Test
    public void testRestar() {
    	Calculadora c = new Calculadora();
    	int resultado = c.restar(12, 8);
    	assertTrue(resultado == 4);
    }

}
