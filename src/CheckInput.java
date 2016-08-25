import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-08-25
 */
public class CheckInput {

  /**
   * Checks user input int values to make sure they are actually int values.
   *
   * @param scanner a Scanner object for user input
   * @return        returns the integer that the user entered
   */
  public static int checkInt(Scanner scanner) {
    boolean goodUserInput = false;
    int userInput = 0;
    while (!goodUserInput) {
      try {
        userInput = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
      }
    }
    return userInput;
  }

  /**
   * Checks user input double values to make sure they are actually double values.
   *
   * @param scanner a Scanner object for user input
   * @return        returns the double that the user entered
   */
  public static double checkDouble(Scanner scanner) {
    boolean goodUserInput = false;
    double userInput = 0;
    while (!goodUserInput) {
      try {
        userInput = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    return userInput;
  }

  /**
   * Checks to make sure an int is in the range for a menu choice.
   *
   * @param scanner a Scanner object for user input
   * @param input   the user input number
   * @param min     the minimum value for the menu
   * @param max     the maximum value for the menu
   * @return        boolean value that says whether the input was good or not
   */
  public static boolean checkInputRange(Scanner scanner, int input, int min, int max) {
    boolean goodInput;
    if (input < min || input > max) {
      System.out.println("You did not enter a valid menu number");
      scanner.nextLine();
      System.out.println("");
      goodInput = false;
    } else {
      goodInput = true;
    }
    return goodInput;
  }

  /**
   * Checks to see if a given number is positive or not.
   *
   * @param scanner a Scanner object for user input/handling the scanner queue
   * @param input   the number to be checked
   * @return        true for positive, false for negative
   */
  public static boolean checkIfPositive(Scanner scanner, int input) {
    boolean isPositive;
    if (input < 0) {
      System.out.println("You cannot enter a negative number");
      scanner.nextLine();
      System.out.println("");
      isPositive = false;
    } else {
      isPositive = true;
    }
    return isPositive;
  }
}
