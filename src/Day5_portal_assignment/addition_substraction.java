//1. Create a package com.math.operations and write a class to perform addition and subtraction.
package Day5_portal_assignment;
import java.util.Scanner;
class MathOperations {
    public double addition(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
    public double subtraction(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
}
public class addition_substraction {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first number: ");
        double numA = input.nextDouble();
        System.out.print("Enter second number: ");
        double numB = input.nextDouble();
        MathOperations calculator = new MathOperations();
        double addResult = calculator.addition(numA, numB);
        double subResult = calculator.subtraction(numA, numB);
        System.out.println("Addition Result: " + addResult);
        System.out.println("Subtraction Result: " + subResult);
        input.close();
    }
}