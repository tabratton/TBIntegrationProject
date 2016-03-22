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

  public static void locateLargestInArray(Scanner scanner) {
    // Arrays 2 - Locate Largest Number In An Array
    // Finds the largest user entered number and then prints what it is and
    // its position in the array
    int[] a = new int[10];
    int maxPos = 0;
    System.out.println("This program will ask you to enter 10 integers, and"
        + " then it will tell you which integer was the largest and where it"
        + " is positioned in the array.");
    System.out.println("Please enter 10 integers for the array: ");
    for (int i = 0; i < 10; i++) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        try {
          a[i] = scanner.nextInt();
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    for (int i = 0; i < 10; i++) {
      if (a[i] > a[maxPos]) {
        maxPos = i;
      }
    }
    System.out.print("The array is: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
    System.out.println("The largest number is: " + a[maxPos]);
    System.out.println("Its location is at index: " + maxPos);
    System.out.println("");
  }

  public static void findProductOfGreatestAndSmallest(Scanner scanner) {
    // Arrays 3 - Product of Greatest and Smallest
    // Finds the product of the largest and smallest user entered values
    int a[];
    a = new int[10];
    System.out.println("This program will ask you to enter ten integers, it"
        + " will then tell you what the product of the greatest and smallest"
        + " integers you entered is.");
    System.out.println("Please enter ten integers for the array: ");
    for (int i = 0; i < 10; i++) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        try {
          a[i] = scanner.nextInt();
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    int maxPos = 0;
    for (int i = 0; i < 10; i++) {
      if (a[i] > a[maxPos]) {
        maxPos = i;
      }
    }
    int minPos = maxPos;
    for (int i = 0; i < 10; i++) {
      if (a[minPos] > a[i]) {
        minPos = i;
      }
    }
    System.out.println("The product of the greatest and smallest"
        + " integers in the array is :" + (a[maxPos] * a[minPos]));
    System.out.println("");
  }

  public static void reverseAString(Scanner scanner) {
    // Arrays 4 - Reverse a String
    // Takes a user input string and reverse it using an array then prints it
    System.out.println("This program will ask you to enter a string, it will"
        + " then reverse the string using an array and print the reversed"
        + " string.");
    System.out.print("Please enter a string: ");
    String s = scanner.next();
    char[] str = s.toCharArray();
    char[] reversedArray = new char[str.length];
    int reversedCount = 0;
    for (int i = str.length - 1; i >= 0; i--) {
      reversedArray[reversedCount] = str[i];
      reversedCount++;
    }
    System.out.println(reversedArray);
    System.out.println("");
  }

  public static void swapElements(Scanner scanner) {
    // Arrays 5 - Swapping Elements
    // Takes 5 elements in an array and puts them in a new array, swapped
    // with the elements to their right.
    System.out.println("This program will ask you to enter five integers,"
        + " will then use two arrays to swap the integers with the ones on"
        + " their right and then print out the new array of integers.");
    System.out.println("Please enter five integers: ");
    int[] input = new int[5];
    int[] swapped = new int[5];
    for (int i = 0; i < 5; i++) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        try {
          input[i] = scanner.nextInt();
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    for (int i = 0; i < input.length; i++) {
      if (i == (input.length - 1)) {
        swapped[i] = input[i];
      } else if (i % 2 == 0) {
        swapped[i] = input[i + 1];
      } else {
        swapped[i] = input[i - 1];
      }
    }
    for (int i = 0; i < input.length; i++) {
      System.out.println(swapped[i]);
    }
    System.out.println("");
  }
}
