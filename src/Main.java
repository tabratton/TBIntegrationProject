// Created by Tyler Bratton - Integration project that demonstrates the
// skills I learned in COP 2006
// Some code for exercises taken from programmr.com

import java.util.Scanner;

/**
 * @author Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since 2016-01-22
 */
public class Main {

  private static final int MIN_MENU_CHOICE = 1;
  private static final int MAX_MENU_CHOICE = 11;

  /**
   * The main method for the program. Runs the main menu system
   *
   * @param args Takes any command line arguments. None currently supported
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {   // Loops the choosing of a category
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the category of programs you would like to run from the"
            + " list below by entering the number in front of its name: ");
        System.out.println("1. Explanations and Demonstrations and simple things");
        System.out.println("2. Variables Exercises");
        System.out.println("3. Operators Exercises");
        System.out.println("4. Arithmetic Exercises");
        System.out.println("5. Flow Control Exercises");
        System.out.println("6. Methods Exercises");
        System.out.println("7. Loops Exercises");
        System.out.println("8. Exception Handling Exercises");
        System.out.println("9. Array Exercises");
        System.out.println("10. Collections Exercises");
        System.out.println("11. Strings Exercises");
        userChoice = CheckInput.checkInt(scanner);
        if (userChoice < MIN_MENU_CHOICE || userChoice > MAX_MENU_CHOICE) {
          System.out.println("You did not enter a valid menu number");
          scanner.nextLine();
        } else {
          goodUserInput = true;
        }
        System.out.println("");
      }
      switch (userChoice) {
        case 1:
          // Explanations, Demonstrations, and simple things
          Menus.weekZeroMenu(scanner);
          break;
        case 2:
          // Week 1 - Variable Exercises
          Menus.weekOneMenu(scanner);
          break;
        case 3:
          // Week 2 - Operators Exercises
          Menus.weekTwoOperatorsMenu(scanner);
          break;
        case 4:
          // Week 2 The Sequel - Arithmetic Exercises
          Menus.weekTwoArithmeticMenu(scanner);
          break;
        case 5:
          // Week 3 - Flow Control Exercises
          Menus.weekThreeMenu(scanner);
          break;
        case 6:
          // Week 4 - Methods Exercises
          Menus.weekFourMenu(scanner);
          break;
        case 7:
          // Week 5 - Loops Exercises
          Menus.weekFiveMenu(scanner);
          break;
        case 8:
          // Week 6 - Exception Handling Exercises
          Menus.weekSixMenu(scanner);
          break;
        case 9:
          // Week 7 - Arrays
          Menus.weekSevenMenu(scanner);
          break;
        case 10:
          // Week 8 - Collections
          Menus.weekEightMenu(scanner);
          break;
        case 11:
          // Week 9 - Strings
          Menus.weekNineMenu(scanner);
          break;
        default:
          break;
      }
      // Call to the runAgainInput method with a scanner object and
      // int value as arguments.
      loopRunning = runAgainInput(scanner, 0);
    }
    System.out.println("The program has exited by user choice.");
  }

  // This method header declares the runAgainInput method and specifies
  // that objects created from the Scanner class and ints are the necessary
  // parameters of this method.

  /**
   * Asks the user if they would like to choose another program or category
   *
   * @param scanner An object of type Scanner to take user input
   * @param menu    When menu == 0, the "category" question is asked. When
   *                menu != 0, the "different program" question is asked.
   * @return Returns a boolean value to determine if the menu loop will
   *         keep running
   */
  public static boolean runAgainInput(Scanner scanner, int menu) {
    boolean validInput = false;
    boolean isLoopRunning = true;
    while (!validInput) {
      askMenuQuestion(menu);
      int userChoice = CheckInput.checkInt(scanner);
      if (userChoice < 0 || userChoice > 1) {
        System.out.println("You did not enter 0 or 1");
        scanner.nextLine();
        System.out.println("");
      } else {
        validInput = true;
      }
      if (userChoice == 0) {
        isLoopRunning = false;
      } else {
        isLoopRunning = true;
      }
      System.out.println("");
    }
    return isLoopRunning;
  }

  private static void askMenuQuestion(int menu) {
    if (menu == 0) {
      System.out.println("Would you like to choose a program to run from"
          + " a different category?");
      System.out.println("Enter 0 for No, or 1 for Yes");
    } else {
      System.out.println("Would you like to choose a different program to run from this category?");
      System.out.println("Enter 0 for No, or 1 for Yes");
    }
  }
}

