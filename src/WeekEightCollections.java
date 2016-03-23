// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 8 - Collections
// category of the menu

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class WeekEightCollections {
  public static void copyArrayLists(Scanner scanner) {
    // Collections 1 - Copying ArrayLists
    // Takes ten input integers into an ArrayList, copies it to a new one,
    // and replaces the last element with -7
    System.out.println("This program will ask you to enter ten integers, it"
        + " will put them into an ArrayList, copy the ArrayList into a new"
        + " ArrayList, replace the last integer with -7, and then prints both"
        + " ArrayLists");
    System.out.print("Please enter ten integers: ");
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        try {
          a1.add(scanner.nextInt());
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    ArrayList<Integer> a2 = new ArrayList<Integer>();
    a2.addAll(a1);
    a1.set((a1.size() - 1), -7);
    System.out.println("ArrayList 1: " + a1);
    System.out.println("ArrayList 2: " + a2);
    System.out.println("");
  }

  public static void locateLargestValue(Scanner scanner) {
    // Collections 2 - Locating Largest Value in ArrayList
    // Takes user specified number of integers, puts them in an ArrayList,
    // finds the largest value and prints it and its index location
    ArrayList<Integer> al = new ArrayList<Integer>();
    System.out.println("This program will ask you to enter the number of"
        + " integers you would like to enter, and then to etner that many"
        + " integers.  After that, it will use an ArrayList to find the"
        + " largest number you entered, tell you what it is, and tell you the"
        + " location of that number in the ArrayList.");
    System.out.println("Enter the number of integers that will be inserted: ");
    int size = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        size = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Enter some integers to insert to the ArrayList: ");
    while (size-- > 0) {
      goodUserInput = false;
      while (!goodUserInput) {
        try {
          al.add(scanner.nextInt());
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    int max = al.get(0);
    int maxIndex = 0;
    for (int i = 1; i < al.size(); i++) {
      if (al.get(i) > max) {
        max = al.get(i);
        maxIndex = i;
      }
    }
    System.out.println("The largest value is " + max + "; which is at index "
        + maxIndex);
    System.out.println("");
  }

  public static void findLongestString(Scanner scanner) {
    // Collections 3 - Longest String
    // Takes five strings and finds the longest one, prints it back out
    ArrayList<String> al = new ArrayList<String>();
    System.out.println("This program will ask you to enter five strings, it"
        + " will then use an ArrayList to find the longest string and tell"
        + " you which one was the longest.");
    System.out.println("Please enter five strings to store in the ArrayList: ");
    for (int i = 0; i < 5; i++) {
      al.add(scanner.nextLine());
    }
    int max = findMaxLength(al);
    System.out.println("Length of the longest string in the ArrayList: " + max);
    System.out.println("");
  }

  public static void useStack(Scanner scanner) {
    // Collections 4 - Stack
    // Takes three integers, pushes them to a stack while printing the
    // current stack, removes the last one from the stack
    System.out.println("This program will ask you to enter three integers,"
        + " then it will push each one to a stack and show you the stack"
        + " after the number is added to it, then it will remove the last one"
        + " and show you the final stack");
    System.out.println("Please enter the 1st integer: ");
    int num1 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        num1 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the 2nd integer: ");
    int num2 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        num2 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the 3rd integer: ");
    int num3 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        num3 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    Stack st = new Stack();
    System.out.println(st);
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

  public static void findLargestValueInArrayList(Scanner scanner) {
    // Collections 5 - Largest Value in ArrayList
    // Takes user specified number of integers and finds the largest one
    ArrayList<Integer> al = new ArrayList<Integer>();
    System.out.println("This program will ask you how many integers you would"
        + " like to enter, then for you to enter that many integers.  It will"
        + " then find the largest integer that you entered and tell you what"
        + " it is.");
    System.out.println("Please enter the number of integers that will be"
        + " inserted: ");
    int size = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        size = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter " + size + " integers to insert into"
        + " the ArrayList: ");
    while (size-- > 0) {
      goodUserInput = false;
      while (!goodUserInput) {
        try {
          al.add(scanner.nextInt());
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    int max = al.get(0);
    for (Integer values : al) {
      if (values > max) {
        max = values;
      }
    }
    System.out.println("The largest value is: " + max);
    System.out.println("");
  }

  public static int findMaxLength(ArrayList<String> list) {
    // Finds which string in an ArrayList is the longest
    int max;
    if (list.size() == 0) {
      max = 0;
    } else {
      max = list.get(0).length();
      for (int i = 0; i < list.size(); i++) {
        if (list.get(i).length() > max) {
          max = list.get(i).length();
        }
      }
    }
    return max;
  }
}
