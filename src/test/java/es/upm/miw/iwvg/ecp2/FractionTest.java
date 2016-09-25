package es.upm.miw.iwvg.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(4, 5);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(4, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.8, fraction.decimal(), 10e-2);
    }

    @Test
    public void testGetNumerator() {
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(5, fraction.getDenominator());
    }
    
    @Test
    public void testDivide() {
        Fraction f1 = new Fraction (1,2);
        Fraction f2 = new Fraction (3,4);
        assertEquals(0.666666, f1.divide(f2),10e-6);
    }

    @Test
    public void testMultiplicar() {
        Fraction f1 = new Fraction (1,2);
        Fraction f2 = new Fraction (3,4);
        assertEquals(0.375, f1.multiplicar(f2),10e-5);
    }
    
    @Test
    public void testsmaller() {
        Fraction f1 = new Fraction (1,2);
        assertTrue(fraction.smaller(f1));
       
       
    }
}
