// Created by Tyler Bratton
// Contains all of the sub-menus for each category, which then call the user
// selected "programs" (methods)

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.3
 * @since   2016-03-04
 */
public class Menus {
  
  /**
   * The menu for the Week Zero - Explanations category, calls user selected programs.
   */
  public static void weekZeroMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) { // Lets user choose a program
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Hello World");
        System.out.println("2. Explanation of variable types in Java");
        System.out.println("3. Explanation of integer division");
        System.out.println("4. Explanation of relational and conditional"
            + " operators");
        System.out.println("5. Example of class with private fields and"
            + " set/get methods");
        System.out.println("6. Explanation and demonstration of Inheritance"
            + " and Polymorphism");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 6) {
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
      switch (userChoice) {
        case 1:
          WeekZeroExamples.explainHelloWorld();
          break;
        case 2:
          WeekZeroExamples.explainVariableTypes();
          break;
        case 3:
          WeekZeroExamples.explainIntegerDivision();
          break;
        case 4:
          WeekZeroExamples.explainRelationalConditional();
          break;
        case 5:
          WeekZeroExamples.privateFieldsDemonstration(scanner);
          break;
        case 6:
          WeekZeroExamples.demonstrateInheritanceAndPolymorphism(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week One - Variables category, calls user selected programs.
   */
  public static void weekOneMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Even or Odd");
        System.out.println("2. Multiply Any Two Numbers");
        System.out.println("3. Age, Name, and Salary");
        System.out.println("4. Prime Number Checker");
        System.out.println("5. Area of a Triangle");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 5) {
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
      switch (userChoice) {
        case 1:
          WeekOneVariables.checkIfEvenOrOdd(scanner);
          break;
        case 2:
          WeekOneVariables.multiplyTwoNumbers(scanner);
          break;
        case 3:
          WeekOneVariables.takeAgeNameSalary(scanner);
          break;
        case 4:
          WeekOneVariables.checkIfPrime(scanner);
          break;
        case 5:
          WeekOneVariables.askForTriangleSides(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week Two - Arithmetic category, calls user selected programs.
   */
  public static void weekTwoArithmeticMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Absolute Equals");
        System.out.println("2. Floor and Ceiling");
        System.out.println("3. Square Root");
        System.out.println("4. Taylor Series");
        System.out.println("5. Multiples of 3 and 5");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 7) {
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
      switch (userChoice) {
        case 1:
          WeekTwoArithmeticOperators.checkIfAbsoluteValueIsEqual(scanner);
          break;
        case 2:
          WeekTwoArithmeticOperators.findFloorAndCeiling(scanner);
          break;
        case 3:
          WeekTwoArithmeticOperators.calculateSquareRoot(scanner);
          break;
        case 4:
          WeekTwoArithmeticOperators.useTaylorSeries(scanner);
          break;
        case 5:
          WeekTwoArithmeticOperators.findThreeAndFiveMultiples(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week Two - Operators category, calls user selected programs.
   */
  public static void weekTwoOperatorsMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Leap Year");
        System.out.println("2. Find Largest of Three Numbers");
        System.out.println("3. Find Simple Interest");
        System.out.println("4. Convert Celsius to Fahrenheit");
        System.out.println("5. Arithmetic in Java Example");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 5) {
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
      switch (userChoice) {
        case 1:
          WeekTwoArithmeticOperators.checkIfLeapYear(scanner);
          break;
        case 2:
          WeekTwoArithmeticOperators.findLargestNumber(scanner);
          break;
        case 3:
          WeekTwoArithmeticOperators.calculateSimpleInterest(scanner);
          break;
        case 4:
          WeekTwoArithmeticOperators.convertCelsiusToFahrenheit(scanner);
          break;
        case 5:
          WeekTwoArithmeticOperators.useArithmeticOperators(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week Three - Flow Control category, calls user selected programs.
   */
  public static void weekThreeMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. No Multiples of Three or Four");
        System.out.println("2. Right or Wrong");
        System.out.println("3. Space Boxing");
        System.out.println("4. Lucky Sum");
        System.out.println("5. Red Lottery Ticket");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 5) {
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
      switch (userChoice) {
        case 1:
          WeekThreeFlowControl.listNotMultiplesOfThreeOrFour(scanner);
          break;
        case 2:
          WeekThreeFlowControl.tellRightOrWrong(scanner);
          break;
        case 3:
          WeekThreeFlowControl.convertSpaceWeight(scanner);
          break;
        case 4:
          WeekThreeFlowControl.takeLuckySum(scanner);
          break;
        case 5:
          WeekThreeFlowControl.calculateRedLotteryTicket(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week Four - Methods category, calls user selected programs.
   */
  public static void weekFourMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Find the Area of a Circle");
        System.out.println("2. Convert Upper Case to Lower Case");
        System.out.println("3. Check if a Number is a Multiple");
        System.out.println("4. Find the Square Root of a Number");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 4) {
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
      switch (userChoice) {
        case 1:
          WeekFourMethods.calculateAreaOfACircle(scanner);
          break;
        case 2:
          WeekFourMethods.convertUppercaseToLowercase(scanner);
          break;
        case 3:
          WeekFourMethods.checkIfMultiple(scanner);
          break;
        case 4:
          WeekFourMethods.calculateSquare(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week Five - Loops category, calls user selected programs.
   */
  public static void weekFiveMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Sum of Prime Digits in a String");
        System.out.println("2. Number of a character in a String");
        System.out.println("3. Printing a Box of #'s");
        System.out.println("4. Sum of 5 Numbers");
        System.out.println("5. Reverse a String");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 5) {
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
      switch (userChoice) {
        case 1:
          WeekFiveLoops.findSumOfPrimeDigits(scanner);
          break;
        case 2:
          WeekFiveLoops.findNumberOfACharacter(scanner);
          break;
        case 3:
          WeekFiveLoops.printBoxOfPounds(scanner);
          break;
        case 4:
          WeekFiveLoops.findSumOfFiveNumbers(scanner);
          break;
        case 5:
          WeekFiveLoops.reverseString(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }
  
  /**
   * The menu for the Week Six - Exception Handling category, calls user selected programs.
   */
  public static void weekSixMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. ID Number Machine");
        System.out.println("2. Ask For a Certain Number");
        System.out.println("3. Slope Point");
        System.out.println("4. Convert Feet and Inches to Centimeters");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 4) {
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
      switch (userChoice) {
        case 1:
          WeekSixExceptionHandling.idNumberMachine(scanner);
          break;
        case 2:
          WeekSixExceptionHandling.checkIfMultipleOfFive(scanner);
          break;
        case 3:
          WeekSixExceptionHandling.slopePoint(scanner);
          break;
        case 4:
          WeekSixExceptionHandling.convertToCentimeters(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week Seven - Arrays category, calls user selected programs.
   */
  public static void weekSevenMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Even Numbers Only");
        System.out.println("2. Locate Smallest Number in Array");
        System.out.println("3. Sum of Integers in Array");
        System.out.println("4. Reverse a String");
        System.out.println("5. Search Two Dimensional Array");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 5) {
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
      switch (userChoice) {
        case 1:
          WeekSevenArrays.printEvenNumbersOnly(scanner);
          break;
        case 2:
          WeekSevenArrays.locateSmallestInArray(scanner);
          break;
        case 3:
          WeekSevenArrays.findSumOfIntegersInArray(scanner);
          break;
        case 4:
          WeekSevenArrays.reverseAString(scanner);
          break;
        case 5:
          WeekSevenArrays.searchTwoDimensionalArray(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week Eight - Collections category, calls user selected programs.
   */
  public static void weekEightMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Copying ArrayLists");
        System.out.println("2. Locating Largest Value in ArrayList");
        System.out.println("3. Longest String");
        System.out.println("4. Stack");
        System.out.println("5. The Largest Value in an ArrayList");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 5) {
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
      switch (userChoice) {
        case 1:
          WeekEightCollections.copyArrayLists(scanner);
          break;
        case 2:
          WeekEightCollections.locateLargestValue(scanner);
          break;
        case 3:
          WeekEightCollections.findLongestString(scanner);
          break;
        case 4:
          WeekEightCollections.useStack(scanner);
          break;
        case 5:
          WeekEightCollections.findLargestValueInArrayList(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }

  /**
   * The menu for the Week Nine - Strings category, calls user selected programs.
   */
  public static void weekNineMenu(Scanner scanner) {
    boolean loopRunning = true;
    int userChoice = 0;
    while (loopRunning) {
      boolean goodUserInput = false;
      while (!goodUserInput) {
        System.out.println("Please choose the program that you would like"
            + " to run from the list below by entering the number in"
            + " front of its name: ");
        System.out.println("1. Length of a String");
        System.out.println("2. Longest Word in a String");
        System.out.println("3. Palindrome Check");
        System.out.println("4. Remove Vowels");
        System.out.println("5. Convert Uppercase to Lowercase");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 5) {
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
      switch (userChoice) {
        case 1:
          WeekNineStrings.findLengthOfAString(scanner);
          break;
        case 2:
          WeekNineStrings.findLongestWord(scanner);
          break;
        case 3:
          WeekNineStrings.checkPalindrome(scanner);
          break;
        case 4:
          WeekNineStrings.removeVowels(scanner);
          break;
        case 5:
          WeekNineStrings.convertUpperToLower(scanner);
          break;
        default:
          break;
      }
      loopRunning = Main.askToRunAgain(scanner, 1);
    }
  }
}
