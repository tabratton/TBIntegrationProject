// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 3 - Flow Control
// category of the menu

import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-03-03
 */
public class WeekThreeFlowControl {
  
  /**
   * Asks the user for an int value and prints every number between 1 and the
   * user input that is not a multiple of 3 or 4.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void listNotMultiplesOfThreeOrFour(Scanner scanner) {
    System.out.println("This program will ask you for a number, and then it will list every"
        + " number between 1 and the number you entered that is not a multiple of 3 or 4");
    System.out.println("Please enter an integer: ");
    int noMultiplesOf3Or4 = CheckInput.checkInt(scanner);
    for (int i = 1; i <= noMultiplesOf3Or4; i++) {
      if (i % 3 != 0 || i % 4 != 0) {
        System.out.println(i);
      }
    }
    System.out.println("");
  }

  /**
   * Asks the user for the answer to a question, then prints if they were right
   * or wrong.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void tellRightOrWrong(Scanner scanner) {
    System.out.println("What is 12 + 12?");
    int rightOrWrongInput = CheckInput.checkInt(scanner);
    boolean rightOrWrongAnswer;
    if (rightOrWrongInput == 24) {
      rightOrWrongAnswer = true;
    } else {
      rightOrWrongAnswer = false;
    }
    System.out.println(rightOrWrongAnswer);
    System.out.println("");
  }

  /**
   * Asks the user to enter their weight and then prints their weight on
   * another planet of their choice.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void convertSpaceWeight(Scanner scanner) {
    System.out.println("This program will ask for your current weight, and then tell you your"
        + " weight on another planet of your choice");
    System.out.print("Please enter your current earth weight: ");
    double weight = CheckInput.checkDouble(scanner);
    System.out.println();
    int inputPlanet = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      System.out.println("Please enter the number corresponding to the planet"
          + " you want: ");
      System.out.println("1. Venus");
      System.out.println("2. Mars");
      System.out.println("3. Jupiter");
      System.out.println("4. Saturn");
      System.out.println("5. Uranus");
      System.out.println("6. Neptune");
      inputPlanet = CheckInput.checkInt(scanner);
      goodUserInput = CheckInput.checkInputRange(scanner, inputPlanet, 1, 6);
    }
    double gravityVenus = 0.78;
    double gravityMars = 0.39;
    double gravityJupiter = 2.65;
    double gravitySaturn = 1.17;
    double gravityUranus = 1.05;
    double gravityNeptune = 1.23;
    switch (inputPlanet) {
      case 1:
        weight *= gravityVenus;
        break;
      case 2:
        weight *= gravityMars;
        break;
      case 3:
        weight *= gravityJupiter;
        break;
      case 4:
        weight *= gravitySaturn;
        break;
      case 5:
        weight *= gravityUranus;
        break;
      case 6:
        weight *= gravityNeptune;
        break;
      default:
        break;
    }
    System.out.printf("%nYour weight in pounds on that planet is: %f", weight);
    System.out.println("");
  }

  /**
   * Asks the user for 3 int values, sums every value entered before 13 and
   * prints the sum.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void takeLuckySum(Scanner scanner) {
    System.out.println("This program will ask you for 3 numbers, then it will add them together,"
        + " unless one of them is 13. Then it will add any numbers before 13, but not after it");
    System.out.println("Please enter 3 integers: ");
    int luckySumA = CheckInput.checkInt(scanner);
    int luckySumB = CheckInput.checkInt(scanner);
    int luckySumC = CheckInput.checkInt(scanner);
    int luckySumS = calculateLuckySum(luckySumA, luckySumB, luckySumC);
    System.out.printf("%nLucky sum: %d", luckySumS);
    System.out.println("");
  }

  /**
   * Asks he user to enter 3 int values, then tells them the value of their
   * ticket.
   * 
   * @param scanner a Scanner object for user input
   */
  public static void calculateRedLotteryTicket(Scanner scanner) {
    System.out.println("This program will ask you for 3 integers, and it will then tell you the"
        + " value of your 'ticket' based on those numbers");
    System.out.println("Please enter 3 integers from 0 to 2: ");
    int lotteryA = CheckInput.checkInt(scanner);
    int lotteryB = CheckInput.checkInt(scanner);
    int lotteryC = CheckInput.checkInt(scanner);
    int lotteryS;
    if (lotteryA == 2 && lotteryB == 2 && lotteryC == 2) {
      lotteryS = 10;
    } else if (lotteryA == lotteryB && lotteryB == lotteryC) {
      lotteryS = 5;
    } else if (lotteryA != lotteryB && lotteryA != lotteryC) {
      lotteryS = 1;
    } else {
      lotteryS = 0;
    }
    System.out.printf("%nThe value of your ticket is: %d", lotteryS);
    System.out.println("");
  }

  /**
   * Sums 3 int values, only adds values that appear before 13.
   * 
   * @param num1 the first int value entered
   * @param num2 the second int value entered
   * @param num3 the third int value entered
   * @return     the sum of the int values that appear before 13, also not
   *             including 13 itself
   */
  private static int calculateLuckySum(int num1, int num2, int num3) {
    int sum;
    int magicLuckyThirteen = 13;
    if (num1 == magicLuckyThirteen) {
      sum = 0;
    } else if (num2 == magicLuckyThirteen) {
      sum = num1;
    } else if (num3 == magicLuckyThirteen) {
      sum = num1 + num2;
    } else {
      sum = num1 + num2 + num3;
    }
    return sum;
  }
}
