// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 4 - Methods
// category of the menu

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.3
 * @since   
 */
public class WeekFourMethods {
  
  /**
   * Asks the user for the radius of a circle, then prints the area.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void calculateAreaOfACircle(Scanner scanner) {
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

  /**
   * Asks the user for a string, then prints that string with all lower case
   * characters.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void convertUppercaseToLowercase(Scanner scanner) {
    System.out.println("This program will ask you to enter a string, and then"
        + " it will convert all the uppercase letters to lowercase letters");
    System.out.println("Please enter a string: ");
    scanner.nextLine();
    String input = scanner.nextLine();
    System.out.println("The lowercase version of the string: "
        + input.toLowerCase());
    System.out.println("");
  }

  /**
   * Asks the user for 2 int values and then prints whether the second int is a
   * multiple of the first int or not.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void checkIfMultiple(Scanner scanner) {
    System.out.println("This program will ask you to enter 2 integers, it"
        + " will then check to see if the second integer is a multiple of the"
        + " first integer");
    System.out.println("Please enter the first integer: ");
    int num1 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        num1 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the second integer: ");
    int num2 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        num2 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    if (num2 % num1 == 0) {
      System.out.println("True, the second integer is a multiple of the first"
          + " integer");
    } else {
      System.out.println("False, the second integer is not a multiple of the"
          + " first integer");
    }
    System.out.println("");
  }

  /**
   * Asks the user for an int and then prints the square of that number.
   * 
   * @param scanner  a Scanner object for user input
   */
  public static void calculateSquare(Scanner scanner) {
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
