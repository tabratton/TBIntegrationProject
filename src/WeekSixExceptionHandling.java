// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 6 - Exception Handling
// category of the menu

import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-03-03
 */
public class WeekSixExceptionHandling {
  
  /**
   * Asks the user to enter a 10 digit ID, throws and catches an exception if
   * it is not a number or not 10 digits long.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void idNumberMachine(Scanner scanner) {
    System.out.println("This program will ask you to enter an ID number that is 10 digits long."
        + " If you do not enter a number or if it is not 10 digits, then an exception will be"
        + " thrown and caught and you will be told what was wrong.");
    scanner.nextLine();
    String userInputString;
    long userInputNumber = 0;
    try {
      System.out.println("Enter the ID number:");
      userInputString = scanner.nextLine();
      userInputNumber = Long.parseLong(userInputString);
      if (userInputString.length() > 10 || userInputString.length() < 10) {
        throw new Exception();
      } else {
        System.out.println(userInputNumber + " is a valid ID number");
      }
    } catch (Exception ex) {
      System.out.println(userInputNumber + " is not a valid ID number");
    }
    System.out.println("");
  }

  /**
   * Asks the user for to enter a multiple of 5, throws and catches an
   * exception if it is not a multiple of 5.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void checkIfMultipleOfFive(Scanner scanner) {
    System.out.println("This program will ask you to enter a number that is a multiple of 5.");
    System.out.println("If you do not enter a multiple of 5 or if you enter 5, an exception is"
        + " thrown and caught that will then tell you that you entered a bad number.");
    System.out.println("Please enter a multiple of 5: ");
    boolean goodUserInput = false;
    while (!goodUserInput) {
      int userInput = CheckInput.checkInt(scanner);
      try {
        if (userInput == 5) {
          throw new Exception();
        } else if (userInput % 5 == 0 || userInput % 2 == 0) {
          System.out.printf("%nCorrect. %d is a multiple of 5.", userInput);
          goodUserInput = true;
        } else {
          throw new Exception();
        }
      } catch (Exception ex) {
        System.out.printf("%nIncorrect. %d is not a multiple of 5.", userInput);
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("");
  }

  /**
   * Asks the user for 2 points in (x, y) form, then prints the slope of the
   * line between those points.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void slopePoint(Scanner scanner) {
    System.out.println("This program will ask you to enter the x and y values of two points, and"
        + " then it will tell you the slope of the line between those points.");
    System.out.println("If your points create a vertical line, an exception is caught and it"
        + " tells you that the slope is undefined");
    System.out.println("Please enter the x coordinate of the current point: ");
    double x1 = CheckInput.checkDouble(scanner);
    System.out.println("Please enter the y coordinate of the current point: ");
    double y1 = CheckInput.checkDouble(scanner);
    System.out.println("Please enter the x coordinate of the target point: ");
    double x2 = CheckInput.checkDouble(scanner);
    System.out.println("Please enter the y coordinate of the target point: ");
    double y2 = CheckInput.checkDouble(scanner);
    try {
      double slope = ((y2 - y1) / (x2 - x1));
      System.out.printf("%nThe slope of the line is %f", slope);
    } catch (Exception ex) {
      System.out.println("This is a vertical line, the slope is undefined.");
    }
    System.out.println("");
  }

  /**
   * Asks the user for a height in feet and inches then prints that height in
   * centimeters.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void convertToCentimeters(Scanner scanner) {
    System.out.println("This program will ask you to enter a height in feet and inches. If you"
        + " enter invalid values, the program will catch an exception and tell you what you did"
        + " wrong.");
    System.out.println("Please enter height in feet: ");
    int feet = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      feet = CheckInput.checkInt(scanner);
      goodUserInput = CheckInput.checkIfPositive(scanner, feet);
    }
    System.out.println("and any remaining height in inches: ");
    int inches = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      inches = CheckInput.checkInt(scanner);
      goodUserInput = CheckInput.checkIfPositive(scanner, inches);
    }
    double result = height(feet, inches);
    System.out.printf("%nThe result is: %f cm", result);
    System.out.println("");
  }

  /**
   * Converts feet and inches to centimeters.
   * 
   * @param feet   how long something is in feet
   * @param inches how many extra inches long the something is (if it isn't an
   *               even number of feet)
   * @return       the length converted from feet/inches to centimeters
   */
  public static double height(int feet, int inches) {
    return (feet * 30.48) + (inches * 2.54);
  }
}
