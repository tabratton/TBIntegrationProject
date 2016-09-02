// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week Nine - Strings category
// of the menu

import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-03-23
 */
public class WeekNineStrings {
  
  /**
   * Asks the user for a string and then prints the length of the string.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void findLengthOfAString(Scanner scanner) {
    System.out.println("This program will ask you to enter a string, and then it will tell you"
        + " the length of that string.");
    System.out.println("Please enter a string: ");
    scanner.nextLine();
    String string = scanner.nextLine();
    int length = string.length();
    System.out.printf("The length of the string is: %d characters.%n", length);
    System.out.println("");
  }

  /**
   * Asks he user to enter a sentence and then prints the longest word in the
   * sentence.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void findLongestWord(Scanner scanner) {
    System.out.println("This program will ask you to enter a sentence, and then it will tell you"
        + " the longest word in that sentence.");
    System.out.println("Please enter a sentence:");
    scanner.nextLine();
    String string = scanner.nextLine();
    String longestWord = "";
    String[] stringArray = string.split(" ");
    for (String testString : stringArray) {
      if (longestWord.length() < testString.length()) {
        longestWord = testString;
      }
    }
    System.out.printf("The longest word in the sentence is: %s%n", longestWord);
    System.out.println("");
  }

  /**
   * Asks the user to enter a string and then prints if it is a palindrome or
   * not.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void checkPalindrome(Scanner scanner) {
    System.out.println("This program will ask you to enter a string, and then it will tell you if"
        + " that string is a palindrome or not.");
    System.out.print("Please enter a string: ");
    scanner.nextLine();
    String line = scanner.nextLine();
    StringBuilder temp = new StringBuilder(line);
    String reversed = temp.reverse().toString();
    if (line.equals(reversed)) {
      System.out.println("The entered string is a palindrome.");
    } else {
      System.out.println("The entered string is not a palindrome.");
    }
    System.out.println("");
  }

  /**
   * Asks the user for a string and then prints that string with all vowels
   * removed.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void removeVowels(Scanner scanner) {
    System.out.println("This program will ask you to enter a string, and then it will remove all"
        + " the vowels from the string and print it back out");
    System.out.println("Please enter a string: ");
    scanner.nextLine();
    String string = scanner.nextLine();
    StringBuilder temp = new StringBuilder(string);
    for (int i = temp.length() - 1; 0 <= i; i--) {
      switch (temp.charAt(i)) {
        case 'a':
          temp.deleteCharAt(i);
          break;
        case 'e':
          temp.deleteCharAt(i);
          break;
        case 'i':
          temp.deleteCharAt(i);
          break;
        case 'o':
          temp.deleteCharAt(i);
          break;
        case 'u':
          temp.deleteCharAt(i);
          break;
        default:
          break;
      }
    }
    String newString = temp.toString();
    System.out.println("The string without vowels is: " + newString);
    System.out.println("");
  }

  /**
   * Asks the user or a string and then prints it with all lower case
   * characters.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void convertUpperToLower(Scanner scanner) {
    System.out.println("This program will ask you to enter a string, and then it will convert the"
        + " entire string to lower case.");
    System.out.println("Please enter an uppercase string:");
    scanner.nextLine();
    String string = scanner.nextLine();
    string = string.toLowerCase();
    System.out.println(string);
    System.out.println("");
  }
}
