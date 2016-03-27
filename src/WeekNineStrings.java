// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week Nine - Strings category
// of the menu

import java.util.ArrayList;
import java.util.Scanner;

public class WeekNineStrings {
  public static void findLengthOfAString(Scanner scanner) {
    // Strings 1 - Length of a String
    // Asks the user to input a string and then tells them the length of the
    // string
    System.out.println("This program will ask you to enter a string, and then"
        + " it will tell you the length of that string.");
    System.out.println("Please enter a string: ");
    scanner.nextLine();
    String string = scanner.nextLine();
    int length = string.length();
    System.out.println("The length of the string is: " + length + "characters"
        + ".");
  }

  public static void findLongestWord(Scanner scanner) {
    // Strings 2 - Longest Word
    // Asks the user to enter a sentence and then tells them the longest word
    // in the sentence
    System.out.println("This program will ask you to enter a sentence, and"
        + " then it will tell you the longest word in that sentence.");
    System.out.println("Please enter a sentence:");
    scanner.nextLine();
    String string = scanner.nextLine();
    String longestWord = "";
    String[] stringArray = string.split(" ");
    for(String testString : stringArray) {
      if(longestWord.length() < testString.length()) {
        longestWord = testString;
      }
    }
    System.out.println("The longest word in the sentence is: " + longestWord);
  }

  public static void checkPalindrome(Scanner scanner){
    // Strings 3 - Palindrome Check
    // Asks the user to enter a string and then checks if it is a palindrome
    System.out.println("This program will ask you to enter a string, and then" +
        " it will tell you if that string is a palindrome or not.");
    System.out.print("Please enter a string: ");
    scanner.nextLine();
    String line = scanner.nextLine();
    StringBuilder temp = new StringBuilder(line);
    String reversed = temp.reverse().toString();
    if (line.equals(reversed)){
      System.out.println("The entered string is a palindrome.");
    } else {
      System.out.println("The entered string is not a palindrome.");
    }
  }

  public static void removeVowels(Scanner scanner) {
    // String 4 - Remove Vowels
    // Asks the user for a string, and then removes all the vowels
    System.out.println("This program will ask you to enter a string, and then"
        + " it will remove all the vowels from the string and print it back"
        + " out");
    System.out.println("Please enter a string:");
    scanner.nextLine();
    String string = scanner.nextLine();
    char[] initialArray = string.toCharArray();
    ArrayList<Character> tempArrayList = new ArrayList<>();
    for(int i = 0; i < initialArray.length; i++) {
      tempArrayList.add(initialArray[i]);
    }
    boolean noVowels = false;
    while(!noVowels) {
      for (int i = 0; i < tempArrayList.size(); i++) {
        if (tempArrayList.get(i) == 'a') {
          tempArrayList.remove(i);
        } else if (tempArrayList.get(i) == 'e') {
          tempArrayList.remove(i);
        } else if (tempArrayList.get(i) == 'i') {
          tempArrayList.remove(i);
        } else if (tempArrayList.get(i) == 'o') {
          tempArrayList.remove(i);
        } else if (tempArrayList.get(i) == 'u') {
          tempArrayList.remove(i);
        }
        if (tempArrayList.contains('a')){
          noVowels = false;
        } else if (tempArrayList.contains('e')) {
          noVowels = false;
        } else if (tempArrayList.contains('i')) {
          noVowels = false;
        } else if (tempArrayList.contains('o')) {
          noVowels = false;
        } else if (tempArrayList.contains('u')) {
          noVowels = false;
        } else{
          noVowels = true;
        }
      }
    }
    StringBuilder tempStringBuilder = new StringBuilder(tempArrayList.size());
    for (Character c : tempArrayList) {
      tempStringBuilder.append(c);
    }
    String newString = tempStringBuilder.toString();
    System.out.println("The string without vowels is: " + newString);
  }

  public static void convertUpperToLower(Scanner scanner) {
    // String 5 - Uppercase to Lowercase
    // Asks user to enter a string, converts all of it to lowercase
    System.out.println("This program will ask you to enter a string, and then"
        + " it will convert the entire string to lower case.");
    System.out.println("Please enter an Uppercase string:");
    scanner.nextLine();
    String string = scanner.nextLine();
    string = string.toLowerCase();
    System.out.println(string);
  }

  public static void deleteVowels(ArrayList<Character> list){

  }
}
