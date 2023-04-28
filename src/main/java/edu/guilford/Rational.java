package edu.guilford;

import java.util.Random;

public class Rational {
    // Declaare and instantiate the Random class
    Random rand = new Random();

    // integer attributes
    private int numerator;
    private int denominator;

    // constructor with no arguments that sets the numerator to 0 and the denominator to 1

    // public Rational() {
    //     numerator = 0;
    //     denominator = 1;
      
    // }
    // constructor with no arguments that generates a rational number with a random numerator and denominator
    // in the range [-100, 100] and uses a while loop that ensures that the denominator is not 0
        
    public Rational() {
        while (denominator == 0) {
            numerator = rand.nextInt(201) - 100;
            denominator = rand.nextInt(201) - 100;
        }
    

    }




    // Add the toString method that displays the Rational object in a nice format

    public String toString() {
        return numerator + "/" + denominator;
    }

    // Constructor with two arguments and uses them to initialize the numerator and denominator

    public Rational(int num, int den) {
        numerator = num;
        denominator = den;
    // make a codr that print out a warning message if the 
    // the constructor with the parameter attempts to generate a rational number with a 0 denominator
        if (denominator == 0) {
            System.out.println("Warning: Denominator is 0");
        }
       
    }

    // Write a method called negate that reverses the sign of the rational number

    public void negate() {
    // The negate method should be a "void" method becasue the object itself is being changed and there 
    // is no return values  
        numerator = -numerator;

    }

    // Write a method called invert that inverts the number by swapping the numerator and denominator

    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    // Write a method called toDouble that returns the value of the Rational object as a double
    
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Write a method that finds the GCD of the numerator and denominator

    public int gcd(int num, int den) {
        if (den == 0) {
            return num;
        } else {
            return gcd(den, (num % den));
    
        }
    
    
    }

    // Write a method called reduces that reduces the Rational number to its lowest terms 

    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    // Write a method called add that takes a Rational object as an argument and adds it to the current Rational object
    // and returns the result as a new Rational object

    public Rational add(Rational r) {
        int newNum = (numerator * r.denominator) + (r.numerator * denominator);
        int newDen = denominator * r.denominator;
        Rational result = new Rational(newNum, newDen);
        result.reduce();
        return result;
    }


    
    



}
