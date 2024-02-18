package basics.javabasics;

import abc.Sample;
import basics.advancedtopics.ExceptionHandling;

/**
 * Operators are used to perform operations on variables...
 * Shortcut - ARLAIC
 * A - Arithmetic Operator
 * R - Relational Operator
 * L - Logical Operator
 * A - Assignment Operator
 * I - Increment/Decrement Operator
 * C - Conditional Operator
 */
public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operator --> +, -, %, /, *
        System.out.println(5 * 4 / 5 + 16 + 5 * 5);

        // Relational Operator --> >=, <=, >, <, ==

        // Logical Operator --> &&, ||, !

        // Assigment Operator --> =

        // Increment/Decrement Operator
        /*int a = 10;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(--a);*/

        // Conditional Operator --> Ternary Operator...
        int a = 10, b = 20;

        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        String result = (a == b) ? "Equal":"Not Equal";
        System.out.println(result);

        System.out.println("The value of try catch : " + Constructors.exceptionHandlingCount);
        System.out.println("The value of sample class : " + Sample.SampleValue);
    }
}