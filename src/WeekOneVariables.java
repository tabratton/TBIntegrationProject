// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 1 - Variables category
// of the menu

import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-03-03
 */
public class WeekOneVariables {
  
  /**
   * Asks the user for an int value and prints if it is even or odd.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void checkIfEvenOrOdd(Scanner scanner) {
    System.out.println("This program will ask you for a number, and will then tell you if it is"
        + " even or odd");
    System.out.println("Please enter an integer: ");
    int userInput = CheckInput.checkInt(scanner);
    if (userInput % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    System.out.println("");
  }

  /**
   * Asks the user for 2 int values and then prints the product of them.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void multiplyTwoNumbers(Scanner scanner) {
    System.out.println("The following program will ask you to give it two numbers, which it will"
        + " then multiply them and tell you the product");
    System.out.println("Please enter the 1st integer: ");
    int number1 = CheckInput.checkInt(scanner);
    System.out.println("Please enter the 2nd integer: ");
    int number2 = CheckInput.checkInt(scanner);
    System.out.println("The product of the two numbers is: " + (number1 * number2));
    System.out.println("");
  }

  /**
   * Asks the user for some information and then prints comments about it.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void takeAgeNameSalary(Scanner scanner) {
    System.out.println("This program will ask you for some basic information about yourself and"
        + " then respond to you with small comments on it");
    System.out.println("Please enter your name: ");
    scanner.nextLine();
    String name = scanner.nextLine();
    System.out.println("Hi " + name + "! How old are you?");
    int age = CheckInput.checkInt(scanner);
    System.out.println("So you're " + age + " eh? That's not old at all!");
    System.out.println("How much do you make " + name + "?");
    double salary = CheckInput.checkDouble(scanner);
    System.out.println(salary + "! I hope that's per hour and not per year!");
    System.out.println("");
  }

  /**
   * Asks the user for an int value and then prints if it is prime or not.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void checkIfPrime(Scanner scanner) {
    System.out.println("This program will ask for you to give it a number, and it will then tell"
        + " you if that number is a prime number or not");
    System.out.println("Please enter an integer: ");
    int primeNumberInput = CheckInput.checkInt(scanner);
    boolean isPrime = true;
    // This while loop checks to see if the given number is evenly divisible by any number
    // greater than 2 and less than the square root of the original number. If it is, then the
    // number is not a prime.
    if (primeNumberInput == 1) {
      isPrime = false;
    } else if (primeNumberInput == 2) {
      isPrime = true;
    } else if (primeNumberInput % 2 == 0) {
      isPrime = false;
    } else {
      for (int loopCounter = 3; loopCounter <= Math.sqrt(primeNumberInput) + 1; loopCounter += 2) {
        if (primeNumberInput % loopCounter == 0) {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime) {
      System.out.println(primeNumberInput + " a prime number");
    } else if (!isPrime) {
      System.out.println(primeNumberInput + " is not a prime number");
    }
    System.out.println("");
  }

  /**
   * Asks the user for the side lengths of a triangle, then prints the area of
   * the triangle.
   * 
   * <p>Rewritten from a programmr exercise to take user input instead of
   * displaying the area of a few predetermined triangles.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void askForTriangleSides(Scanner scanner) {
    System.out.println("This program takes the side lengths of a triangle and uses Heron's"
        + " formula to calculate the area, which it then prints to the console.");
    System.out.println("Please enter the length of the first side");
    double side1 = CheckInput.checkDouble(scanner);
    System.out.println("Please enter the length of the second side");
    double side2 = CheckInput.checkDouble(scanner);
    System.out.println("Please enter the length of the third side");
    double side3 = CheckInput.checkDouble(scanner);
    double triangleArea = calculateTriangleArea(side1, side2, side3);
    System.out.printf("A triangle with sides %f, %f, and %f an area of: %f%n", side1, side2,
        side3, triangleArea);
    System.out.println("");
  }

  /**
   * Calculates the area of a triangle with 3 given sides using Heron's Formula.
   * 
   * @param side1 the length of the first side
   * @param side2 the length of the second side
   * @param side3 the length of the third side
   * @return      the area of the triangle created from the 3 side lengths
   */
  public static double calculateTriangleArea(double side1, double side2, double side3) {
    double heronS = (side1 + side2 + side3) / 2;
    return Math.pow((heronS * (heronS - side1) * (heronS - side2) * (heronS - side3)), 0.5);
  }
}
