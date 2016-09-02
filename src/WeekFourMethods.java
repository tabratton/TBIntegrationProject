// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 4 - Methods
// category of the menu

import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-03-03
 */
public class WeekFourMethods {
  
  /**
   * Asks the user for the radius of a circle, then prints the area.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void calculateAreaOfACircle(Scanner scanner) {
    System.out.println("This program will ask you to enter the radius of a circle, and then it"
        + " will tell the area of that circle");
    System.out.print("Please enter the radius: ");
    double radius = CheckInput.checkDouble(scanner);
    double area = radius * radius * 3.14;
    System.out.printf("The area of the circle is: %f%n", area);
    System.out.println("");
  }

  /**
   * Asks the user for a string, then prints that string with all lower case
   * characters.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void convertUppercaseToLowercase(Scanner scanner) {
    System.out.println("This program will ask you to enter a string, and then it will convert all"
        + " the uppercase letters to lowercase letters");
    System.out.println("Please enter a string: ");
    scanner.nextLine();
    String input = scanner.nextLine();
    System.out.printf("The lowercase version of the string: %s%n", input.toLowerCase());
    System.out.println("");
  }

  /**
   * Asks the user for 2 int values and then prints whether the second int is a
   * multiple of the first int or not.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void checkIfMultiple(Scanner scanner) {
    System.out.println("This program will ask you to enter 2 integers, it will then check to see"
        + " if the second integer is a multiple of the first integer");
    System.out.println("Please enter the first integer: ");
    int num1 = CheckInput.checkInt(scanner);
    System.out.println("Please enter the second integer: ");
    int num2 = CheckInput.checkInt(scanner);
    if (num2 % num1 == 0) {
      System.out.println("True, the second integer is a multiple of the first integer");
    } else {
      System.out.println("False, the second integer is not a multiple of the first integer");
    }
    System.out.println("");
  }

  /**
   * Asks the user for an int and then prints the square of that number.
   * 
   * @param scanner  a Scanner object for user input
   */
  public static void calculateSquare(Scanner scanner) {
    System.out.println("This program will ask you to enter a number, and then it will tell you"
        + " the square of that number");
    System.out.print("Please enter a number: ");
    double number = CheckInput.checkDouble(scanner);
    double answer = Math.sqrt(number);
    System.out.printf("The square of %f is: %f%n", number, answer);
    System.out.println("");
  }
}
