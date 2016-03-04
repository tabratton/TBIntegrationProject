// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 4 - Methods
// category of the menu

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekFourMethods {
  public static void calculateAreaOfACircle(final Scanner scanner) {
    // Methods 1 - Area of a Circle
    // Asks the user for the radius of a circle, then calculates the area
    System.out.println("This program will ask you to enter the radius of a"
        + " circle, and then it will tell the area of that circle");
    System.out.print("Please enter the radius: ");
    double radius = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        radius = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double area = radius * radius * 3.14;
    System.out.println("The area of the circle is: " + area);
    System.out.println("");
  }

  public static void convertUppercaseToLowercase(final Scanner scanner) {
    // Methods 2 - Convert Upper Case to Lower Case
    // Asks the user for a string, and converts all upper case letters to
    // lower case
    System.out.println("This program will ask you to enter a string, and then"
        + " it will convert all the uppercase letters to lowercase letters");
    System.out.println("Please enter a string: ");
    scanner.nextLine();
    String input = scanner.nextLine();
    System.out.println("The lowercase version of the string: "
        + input.toLowerCase());
    System.out.println("");
  }

  public static void checkIfMultiple(final Scanner scanner) {
    // Methods 3 - Check if a number is a multiple
    // Asks the user for 2 numbers and checks if the second number is a
    // multiple of the first number
    System.out.println("This program will ask you to enter 2 integers, it"
        + " will then check to see if the second integer is a multiple of the"
        + " first integer");
    System.out.println("Please enter the first integer: ");
    int x = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        x = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the second integer: ");
    int y = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        y = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    if (y % x == 0) {
      System.out.println("True, the second integer is a multiple of the first"
          + " integer");
    } else {
      System.out.println("False, the second integer is not a multiple of the"
          + " first integer");
    }
    System.out.println("");
  }

  public static void calculateSquare(final Scanner scanner) {
    // Methods 4 - Calculate Square
    // Asks the user for a number and then prints that number squared
    System.out.println("This program will ask you to enter a number, and then"
        + " it will tell you the square of that number");
    System.out.print("Please enter a number: ");
    double number = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        number = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double answer = Math.sqrt(number);
    System.out.println("The square of " + number + " is: " + answer);
    System.out.println("");
  }
}
