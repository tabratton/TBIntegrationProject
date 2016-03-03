// Created by Tyler Bratton - Integration project that demonstrates the
// skills I learned in COP 2006
// Some code for exercises taken from programmr.com

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean loopRunning = true;
    while (loopRunning) { // Loops the choosing of a category
      boolean goodUserInput = false;
      int userChoice = 0;
      while (!goodUserInput) {
        System.out.println("Please choose the category of programs you would"
            + " like to run from the list below by entering the number in front"
            + " of its name: ");
        System.out.println("1. Explanations and Demonstrations and simple"
            + " things");
        System.out.println("2. Variables Exercises");
        System.out.println("3. Operators Exercises");
        System.out.println("4. Arithmetic Exercises");
        System.out.println("5. Flow Control Exercises");
        System.out.println("6. Methods Exercises");
        System.out.println("7. Loops Exercises");
        System.out.println("8. Exception Handling Exercises");
        System.out.println("");
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 1 || userChoice > 8) {
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
          // Explanations, Demonstrations, and simple things
          while (loopRunning) { // Lets user choose a program
            goodUserInput = false;
            while (!goodUserInput) {
              System.out.println("Please choose the program that you would like"
                  + " to run from the list below by entering the number in"
                  + "front of its name: ");
              System.out.println("1. Hello World");
              System.out.println("2. Explanation of variable types in Java");
              System.out.println("3. Explanation of integer division");
              System.out.println("4. Explanation of relational and "
                  + " conditional operators");
              System.out.println("5. Example of class with private fields and"
                  + " set/get methods");
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
                // Call to the explainHelloWorld method, program execution
                // returns here after the method is done running
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
              default:
                break;
            }
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 2:
          // Week 1 - Variable Exercises
          while (loopRunning) { // Same as case 1, same loop for all cases
            goodUserInput = false;
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
                // Another method call, this time passing the scanner object
                // for user input as an argument to the method
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
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 3:
          // Week 2 - Operators Exercises
          while (loopRunning) {
            goodUserInput = false;
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
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 4:
          // Week 2 The Sequel - Arithmetic Exercises
          while (loopRunning) {
            goodUserInput = false;
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
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 5:
          // Week 3 - Flow Control Exercises
          while (loopRunning) {
            goodUserInput = false;
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
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 6:
          // Week 4 - Methods Exercises
          while (loopRunning) {
            goodUserInput = false;
            while (!goodUserInput) {
              System.out.println("Please choose the program that you would like"
                  + " to run from the list below by entering the number in"
                  + " front of its name: ");
              System.out.println("1. Find the Area of a Circle");
              System.out.println("2. Convert Upper Case to Lower Case");
              System.out.println("3. Check if a number is a multiple");
              System.out.println("4. Find the Square of a Number");
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
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 7:
          // Week 5 - Loops Exercises
          while (loopRunning) {
            goodUserInput = false;
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
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 8:
          // Week 6 - Exception Handling Exercises
          while (loopRunning) {
            goodUserInput = false;
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
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        default:
          break;
      }
      loopRunning = askToRunAgain(scanner, 0);
    }
    System.out.println("The program has ended.");
  }

  public static boolean askToRunAgain(final Scanner scanner, final int menu) {
    boolean validInput = false;
    boolean isLoopRunning = true;
    if (menu == 0) {
      while (!validInput) {
        System.out.println("Would you like to choose a program to run from"
            + " a different category?");
        System.out.println("Enter 0 for No, or 1 for Yes");
        int userChoice;
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 0 || userChoice > 1) {
            throw new Exception();
          }
          if (userChoice == 0) {
            isLoopRunning = false;
          } else {
            isLoopRunning = true;
          }
          validInput = true;
          System.out.println("");
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        } catch (Exception ex) {
          System.out.println("You did not enter 0 or 1");
          scanner.nextLine();
          System.out.println("");
        }
      }
    } else {
      while (!validInput) {
        System.out.println("Would you like to choose a different program to"
            + " run from this category?");
        System.out.println("Enter 0 for No, or 1 for Yes");
        int userChoice;
        try {
          userChoice = scanner.nextInt();
          if (userChoice < 0 || userChoice > 1) {
            throw new Exception();
          }
          if (userChoice == 0) {
            isLoopRunning = false;
          } else {
            isLoopRunning = true;
          }
          validInput = true;
          System.out.println("");
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        } catch (Exception ex) {
          System.out.println("You did not enter 0 or 1");
          scanner.nextLine();
          System.out.println("");
        }
      }
    }
    return isLoopRunning;
  }
}
