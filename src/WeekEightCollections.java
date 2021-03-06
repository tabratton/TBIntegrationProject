// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 8 - Collections
// category of the menu

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-03-21
 */
public class WeekEightCollections {
  
  /**
   * Takes 10 integers from the user, puts them in an ArrayList and then
   * creates a copy of the ArrayList with the last int being replaced with -7,
   * finally prints both ArrayLists.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void copyArrayLists(Scanner scanner) {
    System.out.println("This program will ask you to enter ten integers, it will put them into an"
        + " ArrayList, copy the ArrayList into a new ArrayList, replace the last integer with -7,"
        + " and then prints both ArrayLists");
    System.out.print("Please enter ten integers: ");
    ArrayList<Integer> a1 = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      a1.add(CheckInput.checkInt(scanner));
    }
    ArrayList<Integer> a2 = new ArrayList<>();
    a2.addAll(a1);
    a1.set((a1.size() - 1), -7);
    System.out.println("ArrayList 1: " + a1);
    System.out.println("ArrayList 2: " + a2);
    System.out.println("");
  }

  /**
   * Takes integers from the user, uses an ArrayList to find the largest int
   * and its location, then prints that information to the user.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void locateLargestValue(Scanner scanner) {
    ArrayList<Integer> al = new ArrayList<>();
    System.out.println("This program will ask you to enter the number of integers you would like"
        + " to enter, and then to enter that many integers. After that, it will use an ArrayList"
        + " to find the largest number you entered, tell you what it is, and tell you the "
        + " location of that number in the ArrayList.");
    System.out.println("Enter the number of integers that will be inserted: ");
    int size = CheckInput.checkInt(scanner);
    System.out.println("Enter some integers to insert to the ArrayList: ");
    while (size-- > 0) {
      al.add(CheckInput.checkInt(scanner));
    }
    int max = al.get(0);
    int maxIndex = 0;
    for (int i = 1; i < al.size(); i++) {
      if (al.get(i) > max) {
        max = al.get(i);
        maxIndex = i;
      }
    }
    System.out.printf("The largest value is %d; which is at index %d%n", max, maxIndex);
    System.out.println("");
  }

  /**
   * Takes 5 strings from the user and finds the longest one with an ArrayList,
   * then prints the length of that string to the user.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void findLongestString(Scanner scanner) {
    ArrayList<String> al = new ArrayList<>();
    System.out.println("This program will ask you to enter five strings, it will then use an"
        + " ArrayList to find the longest string and tell you which one was the longest.");
    System.out.println("Please enter five strings to store in the ArrayList: ");
    scanner.nextLine();
    for (int i = 0; i < 5; i++) {
      al.add(scanner.nextLine());
    }
    int max = findMaxLength(al);
    System.out.printf("Length of the longest string in the ArrayList: %s%n", max);
    System.out.println("");
  }

  /**
   * Takes 3 integers from the user and pushes them to a stack and printing the
   * current contents of the stack, then removes the last one.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void useStack(Scanner scanner) {
    System.out.println("This program will ask you to enter three integers, then it will push each"
        + " one to a stack and show you the stack after the number is added to it, then it will"
        + " remove the last one and show you the final stack");
    Stack<Integer> st = new Stack<>();
    System.out.println(st);
    System.out.println("Please enter the 1st integer: ");
    final int num1 = CheckInput.checkInt(scanner);
    System.out.println("Please enter the 2nd integer: ");
    final int num2 = CheckInput.checkInt(scanner);
    System.out.println("Please enter the 3rd integer: ");
    final int num3 = CheckInput.checkInt(scanner);
    st.push(num1);
    System.out.println(st);
    st.push(num2);
    System.out.println(st);
    st.push(num3);
    System.out.println(st);
    st.pop();
    System.out.println(st);
    System.out.println("");
  }

  /**
   * Takes user specified number of int values into an ArrayList, finds the
   * largest one and then tells the user what the largest int was.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void findLargestValueInArrayList(Scanner scanner) {
    ArrayList<Integer> al = new ArrayList<>();
    System.out.println("This program will ask you how many integers you would like to enter, then"
        + " for you to enter that many integers. It will then find the largest integer that you"
        + " entered and tell you what it is.");
    System.out.println("Please enter the number of integers that will be inserted: ");
    int size = CheckInput.checkInt(scanner);
    System.out.printf("Please enter %d integers to insert into the ArrayList:%n", size);
    while (size-- > 0) {
      al.add(CheckInput.checkInt(scanner));
    }
    int max = al.get(0);
    for (Integer values : al) {
      if (values > max) {
        max = values;
      }
    }
    System.out.printf("The largest value is: %d%n", max);
    System.out.println("");
  }

  /**
   * Finds the longest string in an ArrayList.
   * 
   * @param list an ArrayList object of type String
   * @return     the index at which the largest string is located
   */
  public static int findMaxLength(ArrayList<String> list) {
    int max;
    if (list.size() == 0) {
      max = 0;
    } else {
      max = list.get(0).length();
      for (int i = 1; i < list.size(); i++) {
        if (list.get(i).length() > max) {
          max = list.get(i).length();
        }
      }
    }
    return max;
  }
}
