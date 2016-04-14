// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Week 2 - Arithmetic and
// Week 2 - Operators categories of the menu

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekTwoArithmeticOperators {
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
        + " and then it will tell you the result of rounding it up and"
        + " down");
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
        + " will then find the square root and fourth root, and then tell"
        + " you they are to 5 decimal places");
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
    double sinTaylorSeries = sinRadians - ((sinRadians * sinRadians
        * sinRadians) / (3 * 2)) + ((sinRadians * sinRadians * sinRadians
        * sinRadians * sinRadians) / (5 * 4 * 3 * 2)) - ((sinRadians
        * sinRadians * sinRadians * sinRadians * sinRadians * sinRadians
        * sinRadians) / (7 * 6 * 5 * 4 * 3 * 2));
    DecimalFormat taylorSeriesRounding = new DecimalFormat("0.000000");
    String sinRounded = taylorSeriesRounding.format(sinTaylorSeries);
    System.out.println("The sine of the angle is: " + sinRounded);
    System.out.println("");
  }

  public static void findThreeAndFiveMultiples(final Scanner scanner) {
    // Arithmetic 5 - Multiples of 3 and 5
    // Finds the sum of the multiples of 3 and 5 less than the input
    System.out.println("This program will ask you to input a number, and then"
        + " it will calculate the sum of the sum of all the multiples of 3"
        + " and the sum of all the multiples of 5 less than that number");
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
    if (num1 == num2 && num2 == num3) {
      System.out.println("The entered numbers are all the same.");
    } else if (num1 > num2 && num1 > num3) {
      System.out.println("The first number, " + num1 + ", is largest.");
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("The second number, " + num2 + ", is largest.");
    } else {
      System.out.println("The third number, " + num3 + ", is largest.");
    }
    System.out.println("");
  }

  public static void calculateSimpleInterest(final Scanner scanner) {
    // Operators 3 - Find Simple Interest
    // Takes initial investment and the annual interest rate, then tells you
    // how much interest you make in a year
    System.out.println("This program will tell you how much annual interest"
        + " you will make, given the original investment and interest"
        + " rate");
    double principal = 0; // the value of the investment
    double rate = 0;      // the annual interest rate
    System.out.println("Please enter the initial investment: ");
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
    double interest;      // the interest earned during the year
    interest = principal * (rate / 100);
    principal = principal + interest;
    System.out
        .println("The value of the investment after one year is: " + principal);
    System.out.println("");
  }

  public static void convertCelsiusToFahrenheit(final Scanner scanner) {
    // Operators 4 - DegreeToFahrenheit
    // This program converts Celsius to Fahrenheit
    System.out.println("This program will ask you for a temperature in Celsius"
        + " and then convert it to Fahrenheit");
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
    double num1 = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        num1 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.print("Enter b: ");
    double num2 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        num2 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    double resultAddition = num1 + num2;
    double resultSubtraction = num1 - num2;
    double resultMultiplication = num1 * num2;
    double resultDivision = num1 / num2;
    System.out.println("The result of adding is " + resultAddition);
    System.out.println("The result of subtracting is " + resultSubtraction);
    System.out.println("The result of multiplying is " + resultMultiplication);
    System.out.println("The result of dividing is " + resultDivision);
    System.out.println("");
  }
}
