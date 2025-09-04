package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class FactorizerTest {

    @Test
    void itReturnsAnEmptyListForZero() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
    }

    @Test
    void itReturnsAnEmptyListForOne() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
    }

    @Test
    void itReturnsPrimeFactorsForCompositeNumbers() {
        Factorizer factorizer = new Factorizer();
        assertEquals(List.of(3, 3), factorizer.primeFactors(9));
        assertEquals(List.of(2, 5), factorizer.primeFactors(10));
        assertEquals(List.of(2, 2, 2, 3, 3, 5), factorizer.primeFactors(360));
    }

    @Test
    void itReturnsPrimeFactorsForPrimes() {
        Factorizer factorizer = new Factorizer();
        assertEquals(List.of(2), factorizer.primeFactors(2));
        assertEquals(List.of(5), factorizer.primeFactors(5));
        assertEquals(List.of(97), factorizer.primeFactors(97));
    }

    @Test
    void itHandlesNegativeNumbersAsEmpty() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(-7));
    }
}
