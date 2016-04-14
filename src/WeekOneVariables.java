// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 1 - Variables category
// of the menu

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekOneVariables {
  public static void checkIfEvenOrOdd(final Scanner scanner) {
    // Variables 1 - Even or Odd
    // Takes one number from the user and then prints if it is even or odd
    // Creates a new scanner object to accept input
    System.out.println("This program will ask you for a number, and will then"
        + " tell you if it is even or odd");
    boolean goodUserInput = false;
    int userInput = 0;
    System.out.println("Please enter an integer: ");
    while (!goodUserInput) {
      try {
        userInput = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    if (userInput % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    System.out.println("");
  }

  public static void multiplyTwoNumbers(final Scanner scanner) {
    // Variables 2 - Multiply Any Two Numbers
    // Takes two numbers from the user, multiplies them, and then prints the
    // product
    System.out.println("The following program will ask you to give it two"
        + " numbers, which it will then multiply them and tell you the"
        + " product");
    System.out.println("Please enter the 1st integer: ");
    int userInputNumber1 = 0;
    int userInputNumber2 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        userInputNumber1 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }

    System.out.println("Please enter the 2nd integer: ");
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        userInputNumber2 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int product = userInputNumber1 * userInputNumber2;
    System.out.println("The product of the two numbers is: " + product);
    System.out.println("");
  }

  public static void takeAgeNameSalary(final Scanner scanner) {
    // Variables 3 - Age, Name, Salary
    // Takes input from the user and then prints it back with comments on the
    // input
    System.out.println("This program will ask you for some basic information"
        + " about yourself and then respond to you with small comments on"
        + " it");
    System.out.println("Please enter your name: ");
    scanner.nextLine();
    String name = scanner.nextLine();
    System.out.println("Hi " + name + "! How old are you?");
    int age = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        age = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("So you're " + age + " eh? That's not old at all!");
    System.out.println("How much do you make " + name + "?");
    double salary = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        salary = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println(salary + "! I hope that's per hour and not per year!");
    System.out.println("");
  }

  public static void checkIfPrime(final Scanner scanner) {
    // Variables 4 - Prime Number Checker
    // Takes a number from the user and then checks if it is prime
    System.out.println("This program will ask for you to give it a number,"
        + " and it will then tell you if that number is a prime number or"
        + " not");
    System.out.println("Please enter an integer: ");
    int primeNumberInput = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        primeNumberInput = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    boolean isPrime = true;
    // This while loop checks to see if the given number is evenly divisible
    // by any number greater than 2 and less than half of the original number
    // If it is, then the number is not a prime.
    for (int loopCounter = 2; loopCounter <= primeNumberInput
        / 2; loopCounter++) {
      if (primeNumberInput % loopCounter == 0) {
        isPrime = false;
      }
    }
    if (primeNumberInput == 1) {
      System.out.println(primeNumberInput + " is not a prime number");
    } else if (!isPrime) {
      System.out.println(primeNumberInput + " is not a prime number");
    } else {
      System.out.println(primeNumberInput + " is a prime number");
    }
    System.out.println("");
  }

  public static void askForTriangleSides(final Scanner scanner) {
    // Variables 5 - Area of a Triangle
    // Rewritten from programmr exercise to take user input instead of
    // displaying the area of predetermined triangles
    System.out.println("This program takes the side lengths of a triangle and"
        + " uses Heron's formula to calculate the area, which it then"
        + " prints to the console.");
    System.out.println("Please enter the length of the first side");
    double side1 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        side1 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the length of the second side");
    double side2 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        side2 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the length of the third side");
    double side3 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        side3 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double triangleArea = calculateTriangleArea(side1, side2, side3);
    System.out.println("A triangle with sides " + side1 + ", " + side2 + ", "
        + " and " + side3 + " has an area of: " + triangleArea);
    System.out.println("");
  }

  public static double calculateTriangleArea(final double side1,
      final double side2, final double side3) {
    // Takes the three side lengths of a triangle as parameters
    // Uses Heron's formula to calculate the area of a triangle from its side
    // lengths
    double heronS = (side1 + side2 + side3) / 2;
    return Math.pow((heronS * (heronS - side1) * (heronS - side2) * (heronS - side3)), 0.5);
  }

}
