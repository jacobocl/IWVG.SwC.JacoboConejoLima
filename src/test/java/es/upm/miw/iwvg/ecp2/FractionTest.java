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

}
