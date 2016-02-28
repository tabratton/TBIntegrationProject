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
                explainHelloWorld();
                break;
              case 2:
                explainVariableTypes();
                break;
              case 3:
                explainIntegerDivision();
                break;
              case 4:
                explainRelationalConditional();
                break;
              case 5:
                privateFieldsDemonstration(scanner);
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
                checkIfEvenOrOdd(scanner);
                break;
              case 2:
                multiplyTwoNumbers(scanner);
                break;
              case 3:
                takeAgeNameSalary(scanner);
                break;
              case 4:
                checkIfPrime(scanner);
                break;
              case 5:
                askForTriangleSides(scanner);
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
                checkIfLeapYear(scanner);
                break;
              case 2:
                findLargestNumber(scanner);
                break;
              case 3:
                calculateSimpleInterest(scanner);
                break;
              case 4:
                convertCelsiusToFahrenheit(scanner);
                break;
              case 5:
                useArithmeticOperators(scanner);
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
                checkIfAbsoluteValueIsEqual(scanner);
                break;
              case 2:
                findFloorAndCeiling(scanner);
                break;
              case 3:
                calculateSquareRoot(scanner);
                break;
              case 4:
                useTaylorSeries(scanner);
                break;
              case 5:
                findThreeAndFiveMultiples(scanner);
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
                listNotMultiplesOfThreeOrFour(scanner);
                break;
              case 2:
                tellRightOrWrong(scanner);
                break;
              case 3:
                convertSpaceWeight(scanner);
                break;
              case 4:
                takeLuckySum(scanner);
                break;
              case 5:
                calculateRedLotteryTicket(scanner);
                break;
              default:
                break;
            }
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 6:
          // Week 5 - Methods Exercises
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
                calculateAreaOfACircle(scanner);
                break;
              case 2:
                convertUppercaseToLowercase(scanner);
                break;
              case 3:
                checkIfMultiple(scanner);
                break;
              case 4:
                calculateSquare(scanner);
                break;
              default:
                break;
            }
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 7:
          // Week 6 - Loops Exercises
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
                findSumOfPrimeDigits(scanner);
                break;
              case 2:
                findNumberOfACharacter(scanner);
                break;
              case 3:
                printBoxOfPounds(scanner);
                break;
              case 4:
                findSumOfFiveNumbers(scanner);
                break;
              case 5:
                reverseString(scanner);
                break;
              default:
                break;
            }
            loopRunning = askToRunAgain(scanner, 1);
          }
          break;
        case 8:
          // Week 7 - Exception Handling Exercises
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
                idNumberMachine(scanner);
                break;
              case 2:
                checkIfMultipleOfFive(scanner);
                break;
              case 3:
                slopePoint(scanner);
                break;
              case 4:
                convertToCentimeters(scanner);
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

  public static void explainHelloWorld() {
    // Hello World
    // It says hello world. That's it. That's all there is.
    System.out.println("The Hello World program is the most basic computer"
        + " program, showing that you made the computer do something");
    System.out.println("Hello World!");
    System.out.println("");
  }

  public static void explainVariableTypes() {
    // Examples and Explanations of variable types
    // Declares variables, explains the different types, and prints them
    final byte declaringVariablesByte = 65;
    final short declaringVariablesShort = 15_065;
    final int declaringVariablesInt = 7_355_608;
    final long declaringVariablesLong = 6_441_023_087_321_637_684L;
    final float declaringVariablesFloat = 45.4f;
    final double declaringVariablesDouble = 67.675586d;
    final char declaringVariablesChar = 't';
    final boolean declaringVariablesBoolean = true;
    System.out.println("This next program will print a few variables to"
        + " demonstrate the kinds of variables in Java.");
    System.out.println("A Variable is kind of like a box.  You can put things"
        + " (numbers) into it for the program to store and use later");
    System.out.println("There are 8 different types of variables in Java,"
        + " called primitive data types, and they are as follows:");
    System.out.println("byte: An 8-bit integer. Has a minimum value of -128"
        + " and a maximum of 127. Example: " + declaringVariablesByte);
    System.out.println("short: A 16-bit integer. Has a minimum value of -32,168"
        + " and a maximum of 32,767. Example: "
        + declaringVariablesShort);
    System.out.println("int: A 32-bit integer. Has a minimum value of -2,147,"
        + " 483,648 and a maximum of 2,147,483,647. Example: "
        + declaringVariablesInt);
    System.out.println("long: A 64-bit integer. Has a minimum value of -9,223,"
        + "372,036,854,775,808 and a maximum of 9,223,372,036,854,775,807."
        + " Example: " + declaringVariablesLong);
    System.out.println("float: A single-precision 32-bit floating point number."
        + " Unlike the previous data types, floating point numbers can be used"
        + " for decimal numbers instead of just integers."
        + " Example " + declaringVariablesFloat);
    System.out.println("double: A double-precision 64-bit floating point"
        + " number. Unlike the previous data types, floating point numbers"
        + " can be used for decimal numbers instead of just integers. Example: "
        + declaringVariablesDouble);
    System.out.println("char: A single 16-bit Unicode character. Example: "
        + declaringVariablesChar);
    System.out.println("boolean: Only has two possible values, true and false."
        + " Example: " + declaringVariablesBoolean);
    System.out.println("");
  }

  public static void explainIntegerDivision() {
    // Integer Division Definition
    final int nine = 9;
    final int five = 5;
    System.out.println("This program is going to demonstrate, and try to"
        + " explain what integer division is and how it works in Java");
    System.out.println("I'm going to divide 2 integers and hopefully you'll"
        + " see how this works");
    System.out.println("The result of dividing 9 by 5 is: " + nine / five);
    System.out.println("As you can see, that isn't the actual answer you"
        + " would get by dividing 9 and 5");
    System.out.println("This happens because Java does something called"
        + " truncating when two integers are divided");
    System.out.println("Since an integer can't have any decimal places in it,"
        + " Java simply cuts off the decimal place and anything that comes"
        + " after it when two integers are divided");
    System.out.println("");
  }

  public static void explainRelationalConditional() {
    System.out.println("Relational operators are used to create boolean"
        + " expressions that are then used to determine if a value is greater"
        + " than, greater than or equal to, less than, or less than or equal to"
        + " another value.  When the statement is not true, the boolean"
        + " expression becomes false, and when it is true, the expression"
        + " becomes true");
    System.out.println("These operators will probably be very familiar from"
        + " experience in math classes, but here is a list of them: ");
    System.out.println("> Determines if the operand on the left is greater"
        + " than the one on the right");
    System.out.println(">= Determines if the operand on the left is greater"
        + " than or equal to the one on the right");
    System.out.println("< Determines if the operand on the left is less"
        + " than the one on the right");
    System.out.println("> Determines if the operand on the left is less"
        + " than or equal to the one on the right");
    System.out.println("There are also two equality operators, which"
        + " determine if the statement on equality is true or false");
    System.out.println("== Determines if the values on either side are equal"
        + " to each other");
    System.out.println("!= Determines if the values on either side are not"
        + " equal to each other.  Note: When they are not equal, the"
        + " expression is true");
    System.out.println("There are also two conditional operators in Java."
        + "  These operators are used with the above relational operators to"
        + " create more complex boolean expressions.  Note: There must always"
        + " be a statement on either side of the conditional operator in"
        + " order for it to be valid, you cannot use a conditional operator"
        + " with just one statement.");
    System.out.println("&& is the conditional operator that means AND.  This"
        + " means that the boolean expression created by two or more statements"
        + " and the conditional operator is true only if both of the statements"
        + " are true.  Otherwise, it is false.");
    System.out.println("|| is the conditional operator that means OR.  This"
        + "means that the boolean expression created by two or more statements"
        + " and the conditional operator is true if any of the statements in"
        + " the expression are true.  The only way for the whole boolean"
        + " expression to be false is if all of the statements within it is"
        + " false.");
    System.out.println("Some demonstrations: ");
    System.out.println("1 > 5 evaluates to: " + (1 > 5));
    System.out.println("11 < 87 evaluates to: " + (11 < 87));
    System.out.println("5 == 5 evaluates to: " + (5 == 5));
    System.out.println("5 != 6 evaluates to: " + (5 != 6));
    System.out.println("1 > 5 && 11 < 87 evaluates to: " + (1 > 5 && 11 < 87));
    System.out.println("1 > 5 || 11 < 87 evaluates to: " + (1 > 5 || 11 < 87));
    System.out.println("");
  }

  // The method header for checkIfEvenOrOdd, contains the modifiers public
  // and static, the void keyword describes if it returns a value or not.
  // Inside the parentheses is an argument that accepts objects of type
  // Scanner from method calls.
  public static void checkIfEvenOrOdd(final Scanner scanner) {
    // Variables 1 - Even or Odd
    // Takes one number from the user and then prints if it is even or odd
    // Creates a new scanner object to accept input
    System.out.println("This program will ask you for a number, and will then"
        + " tell you if it is even or odd");
    boolean goodUserInput = false;
    int userInput = 0;
    System.out.println("Please enter an integer: ");
    while (!goodUserInput) {  // Basic loop and try catch structure for all
      try {                   // Integer and Double input
        userInput = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    if (userInput % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    System.out.println("");
  }

  public static void multiplyTwoNumbers(final Scanner scanner) {
    // Variables 2 - Multiply Any Two Numbers
    // Takes two numbers from the user, multiplies them, and then prints the
    // product
    System.out.println("The following program will ask you to give it two"
        + " numbers, which it will then multiply them and tell you the"
        + " product");
    System.out.println("Please enter the 1st integer: ");
    int userInputNumber1 = 0;
    int userInputNumber2 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        userInputNumber1 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the 2nd integer: ");
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        userInputNumber2 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int product = userInputNumber1 * userInputNumber2;
    System.out.println("The product of the two numbers is: " + product);
    System.out.println("");
  }

  public static void takeAgeNameSalary(final Scanner scanner) {
    // Variables 3 - Age, Name, Salary
    // Takes input from the user and then prints it back with comments on the
    // input
    System.out.println("This program will ask you for some basic information"
        + " about yourself and then respond to you with small comments on it");
    System.out.println("Please enter your name: ");
    scanner.nextLine();
    String name = scanner.nextLine();
    System.out.println("Hi " + name + "! How old are you?");
    int age = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        age = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("So you're " + age + " eh? That's not old at all!");
    System.out.println("How much do you make " + name + "?");
    double salary = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        salary = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println(salary + "! I hope that's per hour and not per year!");
    System.out.println("");
  }

  public static void checkIfPrime(final Scanner scanner) {
    // Variables 4 - Prime Number Checker
    // Takes a number from the user and then checks if it is prime
    System.out.println("This program will ask for you to give it a number,"
        + " and it will then tell you if that number is a prime number or not");
    System.out.println("Please enter an integer: ");
    int primeNumberInput = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        primeNumberInput = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    boolean isPrime = true;
    // This while loop checks to see if the given number is evenly divisible
    // by any number greater than 2 and less than half of the original number
    // If it is, then the number is not a prime.
    for (int loopCounter = 2; loopCounter <= primeNumberInput / 2;
         loopCounter++) {
      if (primeNumberInput % loopCounter == 0) {
        isPrime = false;
      }
    }
    if (primeNumberInput == 1) {
      System.out.println(primeNumberInput + " is not a prime number");
    } else if (!isPrime) {
      System.out.println(primeNumberInput + " is not a prime number");
    } else {
      System.out.println(primeNumberInput + " is a prime number");
    }
    System.out.println("");
  }

  public static void askForTriangleSides(final Scanner scanner) {
    // Variables 5 - Area of a Triangle
    // Rewritten from programmr exercise to take user input instead of
    // displaying the area of predetermined triangles
    System.out.println("This program takes the side lengths of a triangle and"
        + " uses Heron's formula to calculate the area, which it then prints"
        + " to the console.");
    System.out.println("Please enter the length of the first side");
    double side1 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        side1 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the length of the second side");
    double side2 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        side2 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the length of the third side");
    double side3 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        side3 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double triangleArea = calculateTriangleArea(side1, side2, side3);
    System.out.println("A triangle with sides " + side1 + ", " + side2 + ", "
        + " and " + side3 + " has an area of: " + triangleArea);
    System.out.println("");
  }

  public static void checkIfAbsoluteValueIsEqual(final Scanner scanner) {
    // Arithmetic 1 - Absolute Equals
    // This program takes two numbers and then tells the user if the absolute
    // value of both numbers is equal
    System.out.println("This program will ask you for two numbers, and then"
        + " it will tell you if the absolute value of both numbers is the"
        + " same");
    System.out.println("Please enter a negative or positive integer: ");
    int num1 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        num1 = Math.abs(scanner.nextInt());
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter another negative a positive integer: ");
    int num2 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        num2 = Math.abs(scanner.nextInt());
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    if (num1 == num2) {
      System.out.println("The absolute values of the numbers are equal");
    } else if (num1 != num2) {
      System.out.println("The absolute values of the numbers are not equal");
    }
    System.out.println("");
  }

  public static void findFloorAndCeiling(final Scanner scanner) {
    // Arithmetic 2 - Floor and Ceiling
    // Demonstrates two different ways to round numbers in Java by using the
    // floor and ceil functions
    System.out.println("This program will ask you to enter a decimal number,"
        + " and then it will tell you the result of rounding it up and down");
    System.out.println("Please enter a number: ");
    double dob = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        dob = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("The number rounded up is: " + (int) Math.ceil(dob));
    System.out.println("The number rounded down is: " + (int) Math.floor(dob));
    System.out.println("");
  }

  public static void calculateSquareRoot(final Scanner scanner) {
    // Arithmetic 3 - Square Root
    // Finds the square root and fourth root of a user input number and
    // rounds it to 5 decimal places
    System.out.println("This program will ask you to enter a number, and it"
        + " will then find the square root and fourth root, and then tell you"
        + " they are to 5 decimal places");
    System.out.println("Please enter a number: ");
    double roots = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        roots = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    DecimalFormat squareRootRounding = new DecimalFormat("0.00000");
    System.out.println("The square root of the number is: "
        + squareRootRounding.format(Math.pow(roots, 0.5)));
    System.out.println("The fourth root of the number is: "
        + squareRootRounding.format(Math.pow(roots, 0.25)));
    System.out.println("");
  }

  public static void useTaylorSeries(final Scanner scanner) {
    // Arithmetic 4 - Taylor Series
    // Finds the sine of an angle by using the Taylor Series to five terms
    System.out.println("This program will ask you for an angle in degrees,"
        + " and it will then tell you the sine of that number using the"
        + " Taylor Series to 5 terms");
    System.out.println("Please enter an angle in degrees: ");
    double sinDegrees = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        sinDegrees = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double sinRadians = sinDegrees * 3.14 / 180;
    double sinTaylorSeries = sinRadians - ((sinRadians * sinRadians *
        sinRadians) / (3 * 2)) + ((sinRadians * sinRadians * sinRadians *
        sinRadians * sinRadians) / (5 * 4 * 3 * 2)) - ((sinRadians *
        sinRadians * sinRadians * sinRadians * sinRadians * sinRadians *
        sinRadians) / (7 * 6 * 5 * 4 * 3 * 2));
    DecimalFormat taylorSeriesRounding = new DecimalFormat("0.000000");
    String sinRounded = taylorSeriesRounding.format(sinTaylorSeries);
    System.out.println("The sine of the angle is: " + sinRounded);
    System.out.println("");
  }

  public static void findThreeAndFiveMultiples(final Scanner scanner) {
    // Arithmetic 5 - Multiples of 3 and 5
    // Finds the sum of the multiples of 3 and 5 less than the input
    System.out.println("This program will ask you to input a number, and then"
        + " it will calculate the sum of the sum of all the multiples of 3 and"
        + " the sum of all the multiples of 5 less than that number");
    int sumFive = 0;
    int sumThree = 0;
    int sumFifteen = 0;
    System.out.println("Enter a number below which sum must be calculated: ");
    int input = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        input = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    for (int threeCounter = 0; threeCounter < input; threeCounter += 3) {
      sumThree += threeCounter;
    }
    for (int fiveCounter = 0; fiveCounter < input; fiveCounter += 5) {
      sumFive += fiveCounter;
    }
    for (int fifteenCounter = 0; fifteenCounter < input; fifteenCounter += 15) {
      sumFifteen += fifteenCounter;
    }
    int finalSum = sumFive + sumThree - sumFifteen;
    System.out.println("The final sum is: " + finalSum);
    System.out.println("");
  }

  public static void checkIfLeapYear(final Scanner scanner) {
    // Operators 1 - Leap Year
    // Takes an input year and then says if it's a leap year or not
    System.out.println("This program will ask you to enter a year, then it will"
        + " tell you if it is a leap year or not");
    System.out.println("Please enter the year to be checked: ");
    int leapYear = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        leapYear = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    boolean isLeap;
    if (leapYear % 400 == 0) {
      isLeap = true;
    } else if (leapYear % 100 == 0) {
      isLeap = false;
    } else if (leapYear % 4 == 0) {
      isLeap = true;
    } else {
      isLeap = false;
    }
    if (isLeap) {
      System.out.println(leapYear + " is a leap year");
    } else {
      System.out.println(leapYear + " is not a leap year");
    }
    System.out.println("");
  }

  public static void findLargestNumber(final Scanner scanner) {
    // Operators 2 - Largest of Three Numbers
    // Takes 3 input numbers and says what the largest is
    System.out.println("This program will ask you to input 3 numbers, and it"
        + " will then tell you which one is the largest");
    System.out.println("Enter three integers: ");
    int x = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        x = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int y = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        y = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int z = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        z = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    if (x == y && y == z) {
      System.out.println("The entered numbers are all the same.");
    } else if (x > y && x > z) {
      System.out.println("The first number, " + x + ", is largest.");
    } else if (y > x && y > z) {
      System.out.println("The second number, " + y + ", is largest.");
    } else {
      System.out.println("The third number, " + z + ", is largest.");
    }
    System.out.println("");
  }

  public static void calculateSimpleInterest(final Scanner scanner) {
    // Operators 3 - Find Simple Interest
    // Takes initial investment and the annual interest rate, then tells you
    // how much interest you make in a year
    System.out.println("This program will tell you how much annual interest"
        + " you will make, given the original investment and interest rate");
    double principal; // the value of the investment
    double rate;      // the annual interest rate
    double interest;  // the interest earned during the year
    System.out.println("Please enter the initial investment: ");
    principal = scanner.nextDouble();
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        principal = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the annual interest rate: ");
    rate = scanner.nextDouble();
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        rate = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    interest = principal * (rate / 100);
    principal = principal + interest;
    System.out.println("The value of the investment after one year is: "
        + principal);
    System.out.println("");
  }

  public static void convertCelsiusToFahrenheit(final Scanner scanner) {
    // Operators 4 - DegreeToFahrenheit
    // This program converts Celsius to Fahrenheit
    System.out.println("This program will ask you for a temperature in"
        + " Celsius and then convert it to Fahrenheit");
    System.out.println("Please enter a temperature in Celsius: ");
    double celsiusDegrees = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        celsiusDegrees = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double fahrenheitDegrees = (celsiusDegrees * 9 / 5) + 32;
    System.out.println("The temperature in Fahrenheit is: "
        + fahrenheitDegrees);
    System.out.println("");
  }

  public static void useArithmeticOperators(final Scanner scanner) {
    // Operators 5 - Arithmetic Operator
    // Performs some basic arithmetic on some numbers
    System.out.println("This program will ask you to input 2 numbers, it will"
        + " then tell you the results of adding, subtracting, multiplying,"
        + " and dividing them");
    System.out.print("Enter a: ");
    double a = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        a = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.print("Enter b: ");
    double b = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        b = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double resultAddition = a + b;
    double resultSubtraction = a - b;
    double resultMultiplication = a * b;
    double resultDivision = a / b;
    System.out.println("The result of adding is " + resultAddition);
    System.out.println("The result of subtracting is " + resultSubtraction);
    System.out.println("The result of multiplying is " + resultMultiplication);
    System.out.println("The result of dividing is " + resultDivision);
    System.out.println("");
  }

  public static void listNotMultiplesOfThreeOrFour(final Scanner scanner) {
    // Flow Control 1 - No Multiples of 3 or 4
    // Prints every number between 1 and the input that is not a multiple of
    // 3 or 4
    System.out.println("This program will ask you for a number, and then it"
        + " will list every number between 1 and the number you entered that"
        + " is not a multiple of 3 or 4");
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
    int i = 1;
    while (i <= noMultiplesOf3Or4) {
      if (i % 3 == 0 || i % 4 == 0) {
        i++;
      } else {
        System.out.println(i);
        i++;
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
        + " add them together, unless one of them is 13. Then it will add any"
        + " numbers before 13, but not after it");
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
        + " then tell you the value of your 'ticket' based on those numbers");
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

  public static void calculateAreaOfACircle(final Scanner scanner) {
    // Methods 1 - Area of a Circle
    // Asks the user for the radius of a circle, then calculates the area
    System.out.println("This program will ask you to enter the radius of a"
        + " circle, and then it will tell the area of that circle");
    System.out.print("Please enter the radius: ");
    double radius = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        radius = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double area = radius * radius * 3.14;
    System.out.print("The area of the circle is: " + area);
    System.out.println("");
  }

  public static void convertUppercaseToLowercase(final Scanner scanner) {
    // Methods 2 - Convert Upper Case to Lower Case
    // Asks the user for a string, and converts all upper case letters to
    // lower case
    System.out.println("This program will ask you to enter a string, and then"
        + " it will convert all the uppercase letters to lowercase letters");
    System.out.println("Please enter a string: ");
    String input;
    input = scanner.nextLine();
    System.out.println(
        "The lowercase version of the string: " + input.toLowerCase());
    System.out.println("");
  }

  public static void checkIfMultiple(final Scanner scanner) {
    // Methods 3 - Check if a number is a multiple
    // Asks the user for 2 numbers and checks if the second number is a
    // multiple of the first number
    System.out.println("This program will ask you to enter 2 integers, it"
        + " will then check to see if the second integer is a multiple of the"
        + " first integer");
    System.out.println("Please enter the first integer: ");
    int x = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        x = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("Please enter the second integer: ");
    int y = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        y = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    if (y % x == 0) {
      System.out.println("True, the second integer is a multiple of the first"
          + " integer");
    } else {
      System.out.println("False, the second integer is not a multiple of the"
          + " first integer");
    }
    System.out.println("");
  }

  public static void calculateSquare(final Scanner scanner) {
    // Methods 4 - Calculate Square
    // Asks the user for a number and then prints that number squared
    System.out.println("This program will ask you to enter a number, and then"
        + " it will tell you the square of that number");
    System.out.print("Please enter a number: ");
    double number = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        number = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double answer = Math.sqrt(number);
    System.out.println("The square of " + number + " is: " + answer);
    System.out.println("");
  }

  public static void findSumOfPrimeDigits(final Scanner scanner) {
    // Loops 1 - Sum of Prime Digits
    // Asks the user for a number and then finds the sum of all the prime
    // digits in the number
    System.out.println("This program will ask you to enter an integer, and then"
        + " it will tell you the sum of all of the prime digits in that"
        + " number");
    String str = "";
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.print("Please enter an integer: ");
        scanner.nextLine();
        str = scanner.nextLine();
        Integer.parseInt(str);
        goodUserInput = true;
      } catch (Exception ex) {
        System.out.println("You have to enter an integer.");
      }
    }
    int primeSum = 0;
    for (int i = 0; i < str.length(); i++) {
      char characterNumber = str.charAt(i);
      int number = Character.getNumericValue(characterNumber);
      int primeCounter = 2;
      boolean isPrime = true;
      while (primeCounter <= number / 2) {
        if (number % primeCounter == 0) {
          isPrime = false;
        }
        primeCounter++;
      }
      if (number == 1) {
        isPrime = false;
      }
      if (isPrime) {
        primeSum += number;
      }
    }
    System.out.println("The sum of the prime digits is: " + primeSum);
    System.out.println("");
  }

  public static void findNumberOfACharacter(final Scanner scanner) {
    // Loops 2 - Number of a Character
    // Asks the user for a character they want to count and then to enter a
    // string. Then it counts the number of that character in the string
    System.out.println("This program will ask you to enter a character to"
        + " count, and then tell you how many times that character appears in"
        + " a string that you type");
    scanner.nextLine();
    String initialString = "";
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the character you would like to count:"
            + " ");
        initialString = scanner.nextLine();
        if (initialString.length() > 1) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You have to enter one character");
        scanner.nextLine();
        System.out.println("");
      }
    }
    char desiredCharacter = initialString.charAt(0);
    System.out.print("Please enter a string: ");
    String str = scanner.nextLine();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      if (character == desiredCharacter) {
        count += 1;
      }
    }
    System.out.println("The number of " + desiredCharacter + "'s in the string"
        + " is: " + count);
    System.out.println("");
  }

  public static void printBoxOfPounds(final Scanner scanner) {
    // Loops 3 - Box of #'s
    // Asks the user for the width and height of a box, then prints a box
    // that wide and high composed of # characters
    System.out.println("This program will ask you to enter the height and"
        + " width of a box, and then it will print a box of # characters with"
        + " that height and width");
    int height = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.print("Please enter the height: ");
        height = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int width = scanner.nextInt();
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.print("Please enter the width: ");
        width = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("#");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  public static void findSumOfFiveNumbers(final Scanner scanner) {
    // Loops 4 - Sum of Five Numbers
    // Asks the user for 5 numbers, and then adds them together
    System.out.println("This program will ask you how many integers you want"
        + " to add, then it will ask you to put in those integers, and then"
        + " it will tell you the sum of those integers");
    int total = 0;
    int number;
    int numberOfIntegers = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the number of integers you would like"
            + " to add: ");
        numberOfIntegers = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    for (int i = 0; i < numberOfIntegers; i++) {
      number = 0;
      goodUserInput = false;
      while (!goodUserInput) {
        try {
          System.out.println("Please enter an integer: ");
          number = scanner.nextInt();
          goodUserInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("You have to enter an integer");
          scanner.nextLine();
          System.out.println("");
        }
      }
      total += number;
    }
    System.out.println("The total of the 5 numbers is: " + total);
    System.out.println("");
  }

  public static void reverseString(final Scanner scanner) {
    // Loops 5 - Reverse a String
    // Asks the user for a string and then prints that string reversed
    System.out.println("This program will ask you to enter a string, and then"
        + " it will print out the reverse of that string");
    StringBuffer buf = new StringBuffer();
    System.out.println("Please enter a string: ");
    scanner.nextLine();
    String string = scanner.nextLine();
    for (int i = string.length() - 1; i >= 0; i--) {
      buf.append(string.charAt(i));
    }
    String reversedString = buf.toString();
    System.out.println("The reversed string is: " + reversedString);
    System.out.println("");
  }

  public static void idNumberMachine(final Scanner scanner) {
    // Exception Handling 1 - ID Number Machine
    // Asks the user to enter a 10 digit long ID. Throws and catches an
    // exception if it is not a number or if it is not 10 digits long
    System.out.println("This program will ask you to enter an ID number that"
        + " is 10 digits long.  If you do not enter a number or if it is"
        + " not 10 digits, then an exception will be thrown and caught and"
        + " you will be told what was wrong.");
    String userInputString = scanner.nextLine();
    long userInputNumber = 0;
    try {
      System.out.println("Enter the ID number:");
      userInputNumber = Long.parseLong(userInputString);
      if (userInputString.length() > 10 || userInputString.length() < 10) {
        throw new Exception();
      } else {
        System.out.println(userInputNumber + " is a valid ID number");
      }
    } catch (Exception e) {
      System.out.println(userInputNumber + " is not a valid ID number");
    }
    System.out.println("");
  }

  public static void checkIfMultipleOfFive(final Scanner scanner) {
    // Exception Handling 2 - Ask For Certain Number
    // Asks the user to input a number that is a multiple of 5 and that is
    // not also 5
    System.out.println("This program will ask you to enter a number that is a"
        + " multiple of 5.  If you do not enter a multiple of 5 or if you enter"
        + " 5, an exception is thrown and caught that will then tell you that"
        + " you entered a bad number.");
    int userInput = scanner.nextInt();
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter a multiple of 5: ");
        userInput = scanner.nextInt();
        if (userInput == 5) {
          throw new Exception();
        } else if (userInput % 5 == 0 || userInput % 2 == 0) {
          System.out.println("Correct. " + userInput + " is a multiple of 5.");
          goodUserInput = true;
        } else {
          throw new Exception();
        }
      } catch (InputMismatchException e) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception e) {
        System.out.println("Incorrect. " + userInput + " is not a multiple of 5"
            + ".");
      }
    }
    System.out.println("");
  }

  public static void slopePoint(final Scanner scanner) {
    // Exception Handling 3 - Slope Point
    // Asks the user for 2 points in (x, y) form, and then calculates the
    // slope of the line formed by connecting the points
    System.out.println("This program will ask you to enter the x and y values"
        + " of two points, and then it will tell you the slope of the line"
        + " between those points.  If your points create a vertical line, an"
        + " exception is caught and it tells you that the slope is undefined");
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the x coordinate of the current"
            + " point: ");
        x1 = scanner.nextInt();
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
        System.out.println("Please enter the y coordinate of the current"
            + " point: ");
        y1 = scanner.nextInt();
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
        System.out.println("Please enter the x coordinate of the target"
            + " point: ");
        x2 = scanner.nextInt();
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
        System.out.println("Please enter the y coordinate of the target"
            + " point: ");
        y2 = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    try {
      double slope = ((y2 - y1) / (x2 - x1));
      System.out.println("The slope of the line is " + slope);
    } catch (Exception e) {
      System.out.println("This is a vertical line, the slope is undefined.");
    }

    System.out.println("");
  }

  public static void convertToCentimeters(final Scanner scanner) {
    // Exception Handling 4 - Convert feet and inches to cm
    // Asks the user a height in feet and inches and then prints what
    // that is in centimeters. Displays Exceptions if an integer is not
    // entered or a negative integer is entered
    System.out.println("This program will ask you to enter a height in feet"
        + " and inches.  If you enter invalid values, the program will catch"
        + " an exception and tell you what you did wrong.");
    int feet = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter height in feet: ");
        feet = scanner.nextInt();
        if (feet < 0) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You cannot enter a negative number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int inches = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("and any remaining height in inches: ");
        inches = scanner.nextInt();
        if (inches < 0) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You cannot enter a negative number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double result = height(feet, inches);
    System.out.println("The result is: " + result + " cm");
    System.out.println("");
  }

  // Classes 1 - Date Class
  // Creates a separate class and creates an object from that class, then
  // asks the user for input and uses a constructor to create the object,
  // displays their input, and uses set/get methods to enter new values for
  // private fields
  public static void privateFieldsDemonstration(final Scanner scanner) {
    System.out.println("This program will create a class called day and"
        + " an object created from that class that will store the day, month,"
        + " and year that you input.  It will then print back the day you put"
        + " in, ask you to input a new day, and then also print the new day");
    int day = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the day: ");
        day = scanner.nextInt();
        if (day > 31 || day < 1) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You have to enter a day between 1 and 31");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int month = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the month: ");
        month = scanner.nextInt();
        if (month > 12 || month < 1) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You have to enter a day between 1 and 12");
        scanner.nextLine();
        System.out.println("");
      }
    }
    int year = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the year: ");
        year = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    DateExample date1 = new DateExample(day, month, year);
    date1.DisplayDate();
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter another day: ");
        day = scanner.nextInt();
        if (day > 31 || day < 1) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You have to enter a day between 1 and 31");
        scanner.nextLine();
        System.out.println("");
      }
    }
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please another the month: ");
        month = scanner.nextInt();
        if (month > 12 || month < 1) {
          throw new Exception();
        }
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You have to enter a day between 1 and 12");
        scanner.nextLine();
        System.out.println("");
      }
    }
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter another year: ");
        year = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    date1.setDay(day);
    date1.setMonth(month);
    date1.setYear(year);
    date1.DisplayDate();
  }

  public static double calculateTriangleArea(final double a, final double b,
                                             final double c) {
    // Uses Heron's formula to calculate the area of a triangle from its side
    // lengths
    double s = (a + b + c) / 2;
    return Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);
  }

  public static int calculateLuckySum(final int a, final int b, final int c) {
    // Uses some if-else statements to determine how to add 3 numbers
    // 13 and any numbers input after it are not added
    int sum;
    final int magicLuckyThirteen = 13;
    if (a == magicLuckyThirteen) {
      sum = 0;
    } else if (b == magicLuckyThirteen) {
      sum = a;
    } else if (c == magicLuckyThirteen) {
      sum = a + b;
    } else {
      sum = a + b + c;
    }
    return sum;
  }

  public static double height(int feet, int inches) { // 1 inch = 2.54 cm
    return (feet * 30.48) + (inches * 2.54);          // 1 foot = 30.48 cm
  }
}

class DateExample {
  private int day;
  private int month;
  private int year;

  public DateExample(int newDay, int newMonth, int newYear) {
    this.day = newDay;
    this.month = newMonth;
    this.year = newYear;
  }

  int getDay() {
    return this.day;
  }

  int getMonth() {
    return this.month;
  }

  int getYear() {
    return this.year;
  }

  void setDay(int inputDay) {
    this.day = inputDay;
  }

  void setMonth(int inputMonth) {
    this.month = inputMonth;
  }

  void setYear(int inputYear) {
    this.year = inputYear;
  }

  public void DisplayDate() {
    System.out.println("The date is: " + getDay() + "/" + getMonth() + "/"
        + getYear());
  }
}
