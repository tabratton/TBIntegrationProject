// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 5 - Loops category
// of the menu

import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-03-03
 */
public class WeekFiveLoops {
  
  /**
   * Asks the user to enter an int and then prints the sum of all prime digits
   * of that int.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void findSumOfPrimeDigits(Scanner scanner) {
    System.out.println("This program will ask you to enter an integer, and then it will tell you"
        + " the sum of all of the prime digits in that number");
    String str = "";
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.print("Please enter an integer: ");
        scanner.nextLine();
        str = scanner.nextLine();
        Integer.parseInt(str);
        goodUserInput = true;
      } catch (Exception ex) {
        System.out.println("You have to enter an integer.");
      }
    }
    int primeSum = 0;
    for (int i = 0; i < str.length(); i++) {
      char characterNumber = str.charAt(i);
      int number = Character.getNumericValue(characterNumber);
      int primeCounter = 2;
      boolean isPrime = true;
      while (primeCounter <= number / 2) {
        if (number % primeCounter == 0) {
          isPrime = false;
        }
        primeCounter++;
      }
      if (number == 1) {
        isPrime = false;
      }
      if (isPrime) {
        primeSum += number;
      }
    }
    System.out.printf("The sum of the prime digits is: %d%n", primeSum);
    System.out.println("");
  }

  /**
   * Asks he user to enter a character, then prints the number of times that
   * character appears in a string they enter.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void findNumberOfACharacter(Scanner scanner) {
    System.out.println("This program will ask you to enter a character to count, and then tell"
        + " you how many times that character appears in a string that you type");
    scanner.nextLine();
    String initialString = "";
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the character you would like to count: ");
        initialString = scanner.nextLine();
        if (initialString.length() > 1) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (Exception ex) {
        System.out.println("You have to enter one character");
        scanner.nextLine();
        System.out.println("");
      }
    }
    char desiredCharacter = initialString.charAt(0);
    System.out.print("Please enter a string: ");
    String str = scanner.nextLine();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      if (character == desiredCharacter) {
        count += 1;
      }
    }
    System.out.printf("The number of %c's in the string is: %d%n", desiredCharacter, count);
    System.out.println("");
  }

  /**
   * Asks the user for the width and height of a box, then prints a box with
   * those dimensions made of # characters.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void printBoxOfPounds(Scanner scanner) {
    System.out.println("This program will ask you to enter the height and width of a box, and"
        + " then it will print a box of # characters with that height and width");
    System.out.print("Please enter the height: ");
    int height = CheckInput.checkInt(scanner);
    System.out.print("Please enter the width: ");
    int width = CheckInput.checkInt(scanner);
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("#");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  /**
   * Asks the user for 5 int values and then prints the sum of those values.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void findSumOfFiveNumbers(Scanner scanner) {
    System.out.println("This program will ask you how many integers you want to add, then it will"
        + " ask you to put in those integers, and then it will tell you the sum of those integers");
    System.out.println("Please enter the number of integers you would like to add: ");
    int total = 0;
    int number;
    int numberOfIntegers = CheckInput.checkInt(scanner);
    for (int i = 0; i < numberOfIntegers; i++) {
      System.out.println("Please enter an integer: ");
      number = CheckInput.checkInt(scanner);
      total += number;
    }
    System.out.printf("The total of the 5 numbers is: %d%n", total);
    System.out.println("");
  }

  /**
   * Asks the user for a string and then prints the reverse of that string.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void reverseString(Scanner scanner) {
    System.out.println("This program will ask you to enter a string, and then it will print out"
        + " the reverse of that string");
    StringBuffer buf = new StringBuffer();
    System.out.println("Please enter a string: ");
    scanner.nextLine();
    String string = scanner.nextLine();
    for (int i = string.length() - 1; i >= 0; i--) {
      buf.append(string.charAt(i));
    }
    String reversedString = buf.toString();
    System.out.printf("The reversed string is: %s%n", reversedString);
    System.out.println("");
  }
}
