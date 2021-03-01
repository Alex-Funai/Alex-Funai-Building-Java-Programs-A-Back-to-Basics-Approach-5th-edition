// CS210 Assignment #8 "Rational Number" Main
// Alexander K Funai

package com.company;


public class RationalNumberMain {

    public static void main (String [] args) {

        // Initializing local fractions.
        RationalNumber r1 = new RationalNumber(3, 5);
        RationalNumber r2 = new RationalNumber(-1, 5);

        // Validating toString() method.
        System.out.println(r1.toString());
        System.out.println(r2.toString());

        // Validating GET Numerator/Denominator() method(s).
        System.out.println(r1.getNumerator());
        System.out.println(r2.getNumerator());
        System.out.println(r1.getDenominator());
        System.out.println(r2.getDenominator());

        // Validating ADD() method.
        System.out.println(r1.add(r2));
        // System.out.println(r2.add(r1));

        // Validating SUBTRACT() method.
        System.out.println(r1.subtract(r2));
        System.out.println(r2.subtract(r1));

        // Validating the MULTIPLY() method.
        System.out.println(r1.multiply(r2));
        System.out.println(r2.multiply(r1));

        // Validating the DIVIDE() method.
        System.out.println(r1.divide(r2));      // -3
        System.out.println(r2.divide(r1));      // -1/3

    }
}
