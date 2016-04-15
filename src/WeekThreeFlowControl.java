// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 3 - Flow Control
// category of the menu

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekThreeFlowControl {
  public static void listNotMultiplesOfThreeOrFour(final Scanner scanner) {
    // Flow Control 1 - No Multiples of 3 or 4
    // Prints every number between 1 and the input that is not a multiple of
    // 3 or 4
    System.out.println("This program will ask you for a number, and then it"
        + " will list every number between 1 and the number you entered"
        + " that is not a multiple of 3 or 4");
    System.out.println("Please enter an integer: ");
    int noMultiplesOf3Or4 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        noMultiplesOf3Or4 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int loopCounter = 1;
    while (loopCounter <= noMultiplesOf3Or4) {
      if (loopCounter % 3 == 0 || loopCounter % 4 == 0) {
        loopCounter++;
      } else {
        System.out.println(loopCounter);
        loopCounter++;
      }
    }
    System.out.println("");
  }

  public static void tellRightOrWrong(final Scanner scanner) {
    // Flow Control 2 - Right or Wrong
    // Asks the user the answer to an addition question, tells them if
    // they're wrong
    System.out.println("What is 12 + 12?");
    int rightOrWrongInput = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        rightOrWrongInput = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    boolean rightOrWrongAnswer;
    if (rightOrWrongInput == 24) {
      rightOrWrongAnswer = true;
    } else {
      rightOrWrongAnswer = false;
    }
    System.out.println(rightOrWrongAnswer);
    System.out.println("");
  }

  public static void convertSpaceWeight(final Scanner scanner) {
    // Flow Control 3 - Space Boxing
    // This program converts weight on earth to weight on other planets
    System.out.println("This program will ask for your current weight, and"
        + " then tell you your weight on another planet of your choice");
    System.out.print("Please enter your current earth weight: ");
    double weight = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        weight = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println();
    int inputPlanet = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      System.out.println("Please enter the number corresponding to the planet"
          + " you want: ");
      System.out.println("1. Venus");
      System.out.println("2. Mars");
      System.out.println("3. Jupiter");
      System.out.println("4. Saturn");
      System.out.println("5. Uranus");
      System.out.println("6. Neptune");
      try {
        inputPlanet = scanner.nextInt();
        if (inputPlanet < 1 || inputPlanet > 6) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You did not enter a valid menu number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    final double gravityVenus = 0.78;
    final double gravityMars = 0.39;
    final double gravityJupiter = 2.65;
    final double gravitySaturn = 1.17;
    final double gravityUranus = 1.05;
    final double gravityNeptune = 1.23;
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
    System.out.println("Your weight in pounds on that planet is: " + weight);
    System.out.println("");
  }

  public static void takeLuckySum(final Scanner scanner) {
    // Flow Control 4 - Lucky Sum
    // Adds numbers together, but a number is 13, it is not added, and any
    // numbers after it are not added either
    System.out.println("This program will ask you for 3 numbers, then it will"
        + " add them together, unless one of them is 13. Then it will add"
        + " any numbers before 13, but not after it");
    System.out.println("Please enter 3 integers:");
    int luckySumA = scanner.nextInt();

    int luckySumB = scanner.nextInt();
    int luckySumC = scanner.nextInt();
    int luckySumS = calculateLuckySum(luckySumA, luckySumB, luckySumC);
    System.out.println("Lucky sum: " + luckySumS);
    System.out.println("");
  }

  public static void calculateRedLotteryTicket(final Scanner scanner) {
    // Flow Control 5 - Red Lottery Number
    // Gives a value based off 3 "lottery tickets" with values of 0 to 2
    System.out.println("This program will ask you for 3 integers, and it will"
        + " then tell you the value of your 'ticket' based on those"
        + " numbers");
    int lotteryA = 0;
    int lotteryB = 0;
    int lotteryC = 0;
    int lotteryS;
    System.out.println("Please enter 3 integers from 0 to 2: ");
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        lotteryA = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        lotteryB = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        lotteryC = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    if (lotteryA == 2 && lotteryB == 2 && lotteryC == 2) {
      lotteryS = 10;
    } else if (lotteryA == lotteryB && lotteryB == lotteryC) {
      lotteryS = 5;
    } else if (lotteryA != lotteryB && lotteryA != lotteryC) {
      lotteryS = 1;
    } else {
      lotteryS = 0;
    }
    System.out.println("The value of your ticket is: " + lotteryS);
    System.out.println("");
  }

  public static int calculateLuckySum(final int num1, final int num2,
                                      final int num3) {
    // Uses some if-else statements to determine how to add 3 numbers
    // 13 and any numbers input after it are not added
    int sum;
    final int magicLuckyThirteen = 13;
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
