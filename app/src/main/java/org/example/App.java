package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
        Factorizer f = new Factorizer();

        // Demo run like the example in the prompt
        System.out.println(f.primeFactors(0));   // []
        System.out.println(f.primeFactors(1));   // []
        System.out.println(f.primeFactors(9));   // [3, 3]
        System.out.println(f.primeFactors(10));  // [2, 5]

        // Optional interactive mode
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to factor (or non-int to exit): ");
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            ArrayList<Integer> result = f.primeFactors(n);
            System.out.println(result);
            System.out.print("Enter an integer to factor (or non-int to exit): ");
        }
        sc.close();
    }
}
