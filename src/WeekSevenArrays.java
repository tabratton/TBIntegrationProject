// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 7 - Arrays category
// of the menu

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.3
 * @since   2016-03-21
 */
public class WeekSevenArrays {
  
  /**
   * Asks the user for 5 int values, places them in an array and then prints
   * all of the even values.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void printEvenNumbersOnly(Scanner scanner) {
    System.out.println("This program will ask you to input five integers, and"
        + " then it will print out all of the even numbers that you entered.");
    System.out.println("Please enter five integers: ");
    int[] arr = new int[5];
    boolean evensEntered = false;
    for (int i = 0; i < 5; i++) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        try {
          arr[i] = scanner.nextInt();
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    for (int i = 0; i < 5; i++) {
      if (arr[i] % 2 == 0) {
        System.out.println(arr[i]);
        evensEntered = true;
      }
    }
    if (!evensEntered) {
      System.out.println("Even number not found in array.");
    }
    System.out.println("");
  }

  /**
   * Asks the user for 10 int values, places them in an array, then prints the
   * smallest int and its position in the array.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void locateSmallestInArray(Scanner scanner) {
    int[] anArray = new int[10];
    int minPos = 0;
    System.out.println("This program will ask you to enter 10 integers, and"
        + " then it will tell you which integer was the smallest and where it"
        + " is positioned in the array.");
    System.out.println("Please enter 10 integers for the array: ");
    for (int i = 0; i < 10; i++) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        try {
          anArray[i] = scanner.nextInt();
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    for (int i = 0; i < 10; i++) {
      if (anArray[i] < anArray[minPos]) {
        minPos = i;
      }
    }
    System.out.print("The array is: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(anArray[i] + " ");
    }
    System.out.println();
    System.out.println("The smallest number is: " + anArray[minPos]);
    System.out.println("Its location is at index: " + minPos);
    System.out.println("");
  }

  /**
   * Asks the user for 10 int values, places them in an array, then prints the
   * sum of all the int values.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void findSumOfIntegersInArray(Scanner scanner) {
    int[] anArray = new int[10];
    System.out.println("This program will ask you to enter ten integers, it"
        + " will then tell you what the sum of the integers you entered is.");
    System.out.println("Please enter ten integers for the array: ");
    for (int i = 0; i < 10; i++) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        try {
          anArray[i] = scanner.nextInt();
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    int sumOfIntegers = 0;
    for (int i = 0; i < 10; i++) {
      sumOfIntegers += anArray[i];
    }
    System.out.println("The product of the sum of the integers in the array"
        + " is :" + sumOfIntegers);
    System.out.println("");
  }

  /**
   * Asks the user for a string and then prints the reverse of that string.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void reverseAString(Scanner scanner) {
    System.out.println("This program will ask you to enter a string, it will"
        + " then reverse the string using an array and print the reversed"
        + " string.");
    System.out.print("Please enter a string: ");
    String enteredString = scanner.next();
    char[] str = enteredString.toCharArray();
    char[] reversedArray = new char[str.length];
    int reversedCount = 0;
    for (int i = str.length - 1; i >= 0; i--) {
      reversedArray[reversedCount] = str[i];
      reversedCount++;
    }
    System.out.println(reversedArray);
    System.out.println("");
  }

  /**
   * Asks the user for 10 int values, places them in a 2D array, asks the
   * user for an int to find, then searches the array and prints its location.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void searchTwoDimensionalArray(Scanner scanner) {
    int[][] twoDimensionalArray = new int[5][2];
    System.out.println("This program will ask you to enter ten integers,"
        + " and will enter those integers into a two-dimensional array,"
        + " then it will ask you to enter an integer so it can search the"
        + " array for that integer and tell you its position.");
    System.out.println("Please enter ten integers: ");
    for (int i = 0; i < twoDimensionalArray.length; i++) {
      for (int j = 0; j < twoDimensionalArray[i].length; j++) {
        boolean goodUserInput = false;
        while (!goodUserInput) {
          try {
            twoDimensionalArray[i][j] = scanner.nextInt();
            goodUserInput = true;
          } catch (InputMismatchException ex) {
            System.out.println("You have to enter an integer");
            scanner.nextLine();
            System.out.println("");
          }
        }
      }
    }
    System.out.println("");
    System.out.println("Please enter an integer to search the array for: ");
    boolean goodUserInput = false;
    int intToSearch = 0;
    while (!goodUserInput) {
      try {
        intToSearch = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int row = 0;
    int col = 0;
    boolean searchingForInt = true;
    boolean foundInt = false;
    while (searchingForInt) {
      col = 0;
      while (searchingForInt) {
        if (col >= twoDimensionalArray[row].length) {
          searchingForInt = false;
        } else if (twoDimensionalArray[row][col] == intToSearch) {
          foundInt = true;
          searchingForInt = false;
        }
        col++;
      }
      if (foundInt) {
        searchingForInt = false;
      } else if (row >= twoDimensionalArray.length) {
        searchingForInt = false;
      } else {
        searchingForInt = true;
      }
      row++;
    }
    System.out.println("");
    System.out.println("The location of the integer is: Row " + (row - 1)
        + ", Column " + (col - 1));
    System.out.println("");
  }
}
