// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 7 - Arrays category
// of the menu

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekSevenArrays {
  public static void printEvenNumbersOnly(Scanner scanner) {
    // Arrays 1 - Even numbers only
    // Creates an array of five integers, then prints out only the even
    // integers in the array
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

  public static void locateSmallestInArray(Scanner scanner) {
    // Arrays 2 - Locate Smallest Number In An Array
    // Finds the smallest user entered number and then prints what it is and
    // its position in the array
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

  public static void findSumOfIntegersInArray(Scanner scanner) {
    // Arrays 3 - Sum of Integers in an Array
    // Finds the sum of the integers entered in the array
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

  public static void reverseAString(Scanner scanner) {
    // Arrays 4 - Reverse a String
    // Takes a user input string and reverse it using an array then prints it
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

  public static void searchTwoDimensionalArray(Scanner scanner) {
    // Arrays 5 - Search 2D Array
    // Asks the user to
    int[][] twoDimensionalArray = new int[5][2];
    System.out.println("This program will ask you to enter ten integers,"
        + " and will enter those integers into a two-dimensional array,"
        + " search it and display the position of the largest integer in the"
        + " array");
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
    int row = 0;
    int col = 0;
    int largest = 0;
    for (int i = 0; i < twoDimensionalArray.length; i++) {
      for (int j = 0; j < twoDimensionalArray[i].length; j++) {
        if (largest < twoDimensionalArray[i][j]) {
          largest = twoDimensionalArray[i][j];
          row = i;
          col = j;
        }
      }
    }
    System.out.println("The largest integer is: " + largest);
    System.out.println("The location of the largest integer is: Row " + row
        + ", Column " + col);
    System.out.println("");
  }
}
