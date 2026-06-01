/**
 *  Java program to demonstrate reflection.
 */

package com.myreflection;

import java.lang.reflect.Constructor;

/**
 *  Main class.
 */
public class Main {

    // Constructor.
    public Main() {

        // Printing to the console.
        System.out.println("Hello 0.");

    }

    // Constructor.
    public Main(int i) {

        // Printing to the console.
        System.out.println("Hello 1.");

    }

    // Constructor.
    public Main(int i, int j) {

        // Printing to the console.
        System.out.println("Hello 2.");

    }

    // JVM entry point.
    public static void main(String[] args) {

        try {

            // Creating string with class address.
            String className = "com.myreflection.Main";

            // Creating instance of a class Main.
            Class testClass = Class.forName(className);

            // Getting all the constructors of the class Main.
            Constructor[] constructors = testClass.getConstructors();

            // Getting the particular constructor with int argument.
            Constructor c1 = testClass.getConstructor(new Class[]{int .class});

            // Creating an object of Main class.
            Main main = (Main)c1.newInstance(2); // Output: Hello 1.

            // Getting the particular constructor with 2 int argument.
            Constructor c2 = testClass.getConstructor(new Class[]{int .class, int .class});

            // Creating an object of Main class.
            Main main1 = (Main)c2.newInstance(2, 1); // Output: Hello 2.

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}