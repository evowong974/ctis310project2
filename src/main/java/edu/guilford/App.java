package edu.guilford;

public class App 
{
    public static void main( String[] args )
    {
        Rational r1 = new Rational();
        
        // Testing the first constructor and the toString method with the first Rational object 

        System.out.println("Rational class method test:");

        System.out.println("\n" + "Testing out toString method with Rational object 1: " + r1.toString());

        // Make a declaration with the second Rational object
        Rational r2 = new Rational(3, 6);

        System.out.println("\n" + "The second rational number: 3/6");

        // Flip the sign of the second Rational object
        r2.negate();

        // Print out the second Rational object using the new negate method
        System.out.println("\n" + "Testing out negate method: " + r2.toString());

        // Invert the second Rational object
        r2.invert();

        // Print out the second Rational object using the new invert method
        System.out.println("\n" + "Testing out invert method: " + r2.toString());

        // Print out the second Rational object using the new toDouble method
        System.out.println("\n" + "Testing out toDouble method: " + r2.toDouble());

        // Print out the GCD using the new gcd method:
        System.out.println("\n" + "Testing out gcd method: " + r2.gcd(3, 6));

        // Get the reduced form of the rational number using the new reduce method:
        r2.reduce();

        // Print out the reduced form of the rational number using the new reduce method:
        System.out.println("\n" + "Testing out reduce method: " + r2.toString());

        // add the two rational numbers together using the new add method:
        System.out.println("\n" + "Testing addition of rational numbers: ");

        System.out.println("\n" + "Input: " + r1.toString() + " + " + r2.toString()
        + "\n" + "Expected Output: " + r1.add(r2).toString());

        System.out.println("\n" + "Program Output: ");
        
        System.out.println("The sum of " + r1.toString()
        + " and " + r2.toString() + " is " + r1.add(r2).toString() + ".");


    }
}
