// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 6 - Exception Handling
// category of the menu

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.3
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
    System.out.println("This program will ask you to enter an ID number that"
        + " is 10 digits long.  If you do not enter a number or if it is"
        + " not 10 digits, then an exception will be thrown and caught and"
        + " you will be told what was wrong.");
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
    System.out.println("This program will ask you to enter a number that is a"
        + " multiple of 5.");
    System.out.println("If you do not enter a multiple of 5 or if you enter"
        + " 5, an exception is thrown and caught that will then tell you that"
        + " you entered a bad number.");
    int userInput = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter a multiple of 5: ");
        userInput = scanner.nextInt();
        if (userInput == 5) {
          throw new Exception();
        } else if (userInput % 5 == 0 || userInput % 2 == 0) {
          System.out.println("Correct. " + userInput + " is a multiple of 5.");
          goodUserInput = true;
        } else {
          throw new Exception();
        }
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("Incorrect. " + userInput + " is not a multiple of 5"
            + ".");
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
    System.out.println("This program will ask you to enter the x and y values"
        + " of two points, and then it will tell you the slope of the line"
        + " between those points.");
    System.out.println("If your points create a vertical line, an exception"
        + " is caught and it tells you that the slope is undefined");
    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the x coordinate of the current"
            + " point: ");
        x1 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the y coordinate of the current"
            + " point: ");
        y1 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the x coordinate of the target"
            + " point: ");
        x2 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the y coordinate of the target"
            + " point: ");
        y2 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    try {
      double slope = ((y2 - y1) / (x2 - x1));
      System.out.println("The slope of the line is " + slope);
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
    System.out.println("This program will ask you to enter a height in feet"
        + " and inches.  If you enter invalid values, the program will catch"
        + " an exception and tell you what you did wrong.");
    int feet = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter height in feet: ");
        feet = scanner.nextInt();
        if (feet < 0) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You cannot enter a negative number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int inches = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("and any remaining height in inches: ");
        inches = scanner.nextInt();
        if (inches < 0) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You cannot enter a negative number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double result = height(feet, inches);
    System.out.println("The result is: " + result + " cm");
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
