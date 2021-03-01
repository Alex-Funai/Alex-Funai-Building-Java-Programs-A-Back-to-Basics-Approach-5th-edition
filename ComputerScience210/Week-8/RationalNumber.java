// CS210 Assignment #8 "Rational Numbers"
// Alexander Funai

/*  This program contains methods for operating different math functions
 *  between two fractions objects constructed. Calling the functions below
 *  in RationalNumberMain to output results for confirmation.
 */

package com.company;


public class RationalNumber {

    private int numerator;          // the Numerator.
    private int denominator;        // the Denominator.

    public RationalNumber(int numerator, int denominator) {

        if ( denominator == 0 ) {
            throw new ArithmeticException("Invalid: denominator is zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public String toString() {
        String result;
        if (this.numerator == 0) {
            result = "0";
        } if (denominator == 1) {
            result = numerator + "";
        } else result = numerator + "/" + denominator;

        return result;
    }

    // Method to add
    public RationalNumber add (RationalNumber other) {
        int commonNumerator = (this.numerator * other.denominator) + (this.denominator * other.getNumerator());
        int commonDenominator = this.denominator * other.getDenominator();
        RationalNumber result = new RationalNumber(commonNumerator, commonDenominator);
        return result;
    }

    // Method to subtract
    public RationalNumber subtract(RationalNumber other) {
        int commonNumerator = (this.numerator * other.denominator) - (this.denominator * other.getNumerator());
        int commonDenominator = this.denominator * other.getDenominator();
        RationalNumber result = new RationalNumber(commonNumerator, commonDenominator);
        return result;
    }

    // Method to multiply
    public RationalNumber multiply(RationalNumber other) {
        int commonNumerator = (this.numerator * other.numerator);
        int commonDenominator = (this.denominator * other.denominator);
        RationalNumber result = new RationalNumber(commonNumerator, commonDenominator);
        return result;
    }

    // Method to divide
    public RationalNumber divide(RationalNumber other) {
        int commonNumerator = (this.numerator * other.denominator);
        int commonDenominator = (this.denominator * other.numerator);
        RationalNumber result = new RationalNumber(commonNumerator, commonDenominator);
        return result;
    }
}
