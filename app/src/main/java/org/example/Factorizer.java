package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (n == null || n <= 1) {
            return factors;
        }

        // Pull out factors of 2
        while ((n & 1) == 0) { // same as n % 2 == 0
            factors.add(2);
            n /= 2;
        }

        // Pull out odd factors up to sqrt(n)
        for (int f = 3; (long) f * f <= n; f += 2) {
            while (n % f == 0) {
                factors.add(f);
                n /= f;
            }
        }

        // If leftover > 1, it’s prime
        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }
}
