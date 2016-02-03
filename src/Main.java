//Integration project that demonstrates the skills I learned in COP 2006

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Hello World
    // It says hello world.  That's it.  That's all there is.
    System.out.println("The Hello World program is the most basic computer " +
        "program, showing that you made the computer do something");
    System.out.println("Hello World!");
    System.out.println("");

    // Variables 1 - Declaring Variables
    // Simply declares a few variables and then prints them
    byte declaringVariablesByte = 65;
    short declaringVariablesShort = 15_065;
    int declaringVariablesInt = 7_355_608;
    long declaringVariablesLong = 6_441_023_087_321_637_684L;
    float declaringVariablesFloat = 45.4f;
    double declaringVariablesDouble = 67.675586d;
    char declaringVariablesChar = 't';
    boolean declaringVariablesBoolean = true;
    System.out.println("This next program will print a few variables to " +
        "demonstrate the kinds of variables in Java.");
    System.out.println("A Variable is kind of like a box.  You can put things" +
        " (numbers) into it for the program to store and use later");
    System.out.println("There are 8 different types of variables in Java, " +
        "called primitive data types, and they are as follows:");
    System.out.println("byte: An 8-bit integer. Has a minimum value of -128 " +
        "and a maximum of 127. Example: " + declaringVariablesByte);
    System.out.println("short: A 16-bit integer. Has a minimum value of -32," +
        "168 and a maximum of 32,767. Example: " + declaringVariablesShort);
    System.out.println("int: A 32-bit integer. Has a minimum value of -2,147," +
        "483,648 and a maximum of 2,147,483,647. Example: " +
        declaringVariablesInt);
    System.out.println("long: A 64-bit integer. Has a minimum value of " +
        "-9,223,372,036,854,775,808 and a maximum of 9,223,372,036,854,775," +
        "807. Example: " + declaringVariablesLong);
    System.out.println("float: A single-precision 32-bit floating point " +
        "number. Unlike the previous data types, floating point numbers can " +
        "be used for decimal numbers instead of just integers. Example " +
        declaringVariablesFloat);
    System.out.println("double: A double-precision 64-bit floating point " +
        "number. Unlike the previous data types, floating point numbers can " +
        "be used for decimal numbers instead of just integers. Example: " +
        declaringVariablesDouble);
    System.out.println("char: A single 16-bit Unicode character. Example: " +
        declaringVariablesChar);
    System.out.println("boolean: Only has two possible values, true and false" +
        ". Example: " + declaringVariablesBoolean);
    System.out.println("");

    // Variables 2 - Even or Odd
    // Takes one number from the user and then prints if it is even or odd
    // Creates a new scanner object to accept input
    System.out.println("This program will ask you for a number, and will then" +
        " tell you if it is even or odd");
    Scanner scanner = new Scanner(System.in);
    int evenCheck;
    System.out.println("Enter a number:");
    int evenNum = scanner.nextInt();
    evenCheck = evenNum % 2;  // Checks if the number is even by dividing by 2
    if (evenCheck == 0) {     // If the remainder is 0, the number even
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    System.out.println("");

    // Variables 3 - Multiple Any Two Numbers
    // Takes two numbers from the user, multiplies them, and then prints the
    // product
    System.out.println("The following program will ask you to give it two " +
        "numbers, which it will then multiply them and tell you the product");
    int multiplyAnyTwoNumbersProduct;
    System.out.println("Enter the 1st number:");
    int multiplyAnyTwoNumbers1 = scanner.nextInt();
    System.out.println("Enter the 2nd number:");
    int multiplyAnyTwoNumbers2 = scanner.nextInt();
    multiplyAnyTwoNumbersProduct = multiplyAnyTwoNumbers1 *
        multiplyAnyTwoNumbers2;
    System.out.println("The product of the two numbers is: " +
        multiplyAnyTwoNumbersProduct);
    System.out.println("");
    System.out.println("This wasn't in the original exercise, but I want to " +
        "demonstrate what integer division is");
    System.out.println("I'm going to divide 2 integers and hopefully you'll " +
        "see how this works");
    System.out.println("The result of dividing 9 by 5 is: " + 9/5);
    System.out.println("As you can see, that isn't the actual answer you " +
        "would get by dividing 9 and 5");
    System.out.println("This happens because Java does something called " +
        "truncating when two integers are divided");
    System.out.println("Since an integer can't have any decimal places in it," +
        " Java simply cuts off the decimal place and anything that comes " +
        "after it when two integers are divided");
    System.out.println("");

    // Variables 4 - Age, Name, Salary
    // Takes input from the user and then prints it back with comments on the
    // input
    System.out.println("This program will ask you for some basic information " +
        "about yourself and then respond to you with small comments on it");
    String name = scanner.nextLine();
    System.out.println("Hi " + name + "! How old are you?");
    int age = scanner.nextInt();
    System.out.println("So you're " + age + " eh? That's not old at all!");
    System.out.println("How much do you make " + name + "?");
    double salary = scanner.nextDouble();
    System.out.println(salary + "! I hope that's per hour and not per year!");
    System.out.println("");

    // Variables 5 - Prime Number Checker
    // Takes a number from the user and then checks if it is prime
    System.out.println("This program will ask for you to give it a number, " +
        "and it will then tell you if that number is a prime number or not");
    System.out.println("Enter your input number: ");
    int primeNumberInput = scanner.nextInt();
    int primeNumberLoopCounter = 2;
    int isPrime = 1;
    // This while loop checks to see if the given number is evenly divisible
    // by any number greater than 2 and less than half of the original number
    // If it is, then the number is not a prime.
    while (primeNumberLoopCounter < primeNumberInput / 2) {
      if (primeNumberInput % primeNumberLoopCounter == 0) {
        isPrime = 0;
      }
      primeNumberLoopCounter++;
    }
    if (isPrime == 0) {
      System.out.println("Input number is not a prime number");
    } else {
      System.out.println("Input number is a prime number");
    }
    System.out.println("");

    // Variables 6 - Testing Your Variable Knowledge
    // Subtracts a variable from a number and then prints the original and the
    // result
    System.out.println("The next program is a very simple one that just " +
        "prints the result of a variable being subtracted from a number");
    int variableKnowledgeA = 10;
    int variableKnowledgeB = 100 - variableKnowledgeA;
    System.out.println("Output is: " + variableKnowledgeA);
    System.out.println("Output is: " + variableKnowledgeB);
    System.out.println("");

    // Variables 7 - Variable Max Values
    // Prints the minimum and maximum values of the int variable in Java
    System.out.println("Similar to the second program you saw, this one " +
        "simply prints the minimum and maximum values for the int variable in" +
        " Java.");
    int intMin = -2_147_483_648;
    int intMax = 2_147_483_647;
    System.out.println("The minimum value of int is: " + intMin);
    System.out.println("The maximum value of int is: " + intMax);
    System.out.println("");

    // Variables 8 - Area of a Triangle
    // All code from this exercise except for the triangleArea function is
    // from http://www.programmr.com/area-triangle
    System.out.println("This program takes the side lengths of a triangle and" +
        " uses Heron's formula to calculate the area, which it then prints to" +
        " the console.");
    double triangleAreaVariable;
    triangleAreaVariable = triangleArea(3, 3, 3);
    System.out.println("A triangle with sides 3, 3, 3 has an area of: " +
        triangleAreaVariable);
    triangleAreaVariable = triangleArea(3, 4, 5);
    System.out.println("A triangle with sides 3, 4, 5 has an area of: " +
        triangleAreaVariable);
    triangleAreaVariable = triangleArea(9, 9, 9);
    System.out.println("A triangle with sides 9, 9, 9 has an area of: " +
        triangleAreaVariable);
    System.out.println("");

    // Arithmetic 1 - Absolute Equals
    // This program takes two numbers and then tells the user if the absolute
    // value of both numbers is equal
    System.out.println("This program will ask you for two numbers, and then " +
        "it will tell you if the absolute value of both numbers is the same");
    boolean equal;
    System.out.println("Enter a negative or positive integer: ");
    int num1 = Math.abs(scanner.nextInt());
    System.out.println("Enter another negative a positive integer: ");
    int num2 = Math.abs(scanner.nextInt());
    if (num1 == num2) {
      equal = true;
      System.out.println(equal + ", the absolute values of the numbers are " +
          "equal");
    } else if (num1 != num2) {
      equal = false;
      System.out.println(equal + ", the absolute values of the numbers are " +
          "not equal");
    }
    System.out.println("");

    // Arithmetic 2 - Floor and Ceiling
    // Demonstrates two different ways to round numbers in Java by using the
    // floor and ceil functions
    System.out.println("This program will ask you to enter a decimal number, " +
        "and then it will tell you the result of rounding it up and down");
    System.out.println("Enter a number: ");
    double dob = scanner.nextDouble();
    System.out.println("The number rounded up is: " + (int) Math.ceil(dob));
    System.out.println("The number rounded down is: " + (int) Math.floor(dob));
    System.out.println("");

    // Arithmetic 3 - Square Root
    // Finds the square root and fourth root of a user inputted number and
    // rounds it to 5 decimal places
    System.out.println("This program will ask you to enter a number, and it " +
        "will then find the square root and fourth root, and then tell you " +
        "they are to 5 decimal places");
    System.out.println("Enter a number: ");
    double roots = scanner.nextDouble();
    DecimalFormat squareRootRounding = new DecimalFormat("0.00000");
    System.out.println("The square root of the number is: " +
        squareRootRounding.format(Math.pow(roots, 0.5)));
    System.out.println("The fourth root of the number is: " +
        squareRootRounding.format(Math.pow(roots, 0.25)));
    System.out.println("");

    // Arithmetic 4 - Taylor Series
    // Finds the sine of an angle by using the Taylor Series to five terms
    System.out.print("This program will ask you for an angle in degrees, and " +
        "it will then tell you the sine of that number using the Taylor " +
        "Series to 5 terms");
    System.out.println("Please enter an angle in degrees: ");
    double sinDegrees = scanner.nextDouble();
    double sinRadians = sinDegrees * 3.14 / 180;
    double sinTaylorSeries = sinRadians - ((sinRadians * sinRadians *
        sinRadians) / (3 * 2)) + ((sinRadians * sinRadians * sinRadians *
        sinRadians * sinRadians) / (5 * 4 * 3 * 2)) - ((sinRadians *
        sinRadians * sinRadians * sinRadians * sinRadians * sinRadians *
        sinRadians) / (7 * 6 * 5 * 4 * 3 * 2));
    DecimalFormat taylorSeriesRounding = new DecimalFormat("0.00000#");
    String sinRounded = taylorSeriesRounding.format(sinTaylorSeries);
    System.out.println("The sine of the angle is: " + sinRounded);
    System.out.println("");

    // Arithmetic 5 - Multiples of 3 and 5
    // Finds the sum of the multiples of 3 and 5 less than the input
    System.out.println("This program will ask you to input a number, and then" +
        " it will calculate the sum of the sum of all the multiples of 3 and" +
        " the sum of all the multiples of 5 less than that number");
    int sumFiveCounter = 0;
    int sumThreeCounter = 0;
    int sumFifteenCounter = 0;
    int sumFive = 0;
    int sumThree = 0;
    int sumFifteen = 0;
    System.out.println("Enter a number below which sum must be calculated: ");
    int input = scanner.nextInt();
    while (sumFiveCounter < input) {
      sumFive = sumFiveCounter + sumFive;
      sumFiveCounter = sumFiveCounter + 5;
    }
    while (sumThreeCounter < input) {
      sumThree = sumThreeCounter + sumThree;
      sumThreeCounter = sumThreeCounter + 3;
    }
    while (sumFifteenCounter < input) {
      sumFifteen = sumFifteenCounter + sumFifteen;
      sumFifteenCounter = sumFifteenCounter + 15;
    }
    int finalSum = sumFive + sumThree - sumFifteen;
    System.out.println("The final sum is: " + finalSum);
    System.out.println("");

    // Operators 1 - Leap Year
    // Takes an input year and then says if it's a leap year or not
    System.out.println("This program will ask you to enter a year, then it " +
        "will tell you if it is a leap year or not");
    System.out.println("Enter the year to be checked: ");
    int leapYear = scanner.nextInt();
    boolean isLeap = false;
    if (leapYear % 400 == 0) {
      isLeap = true;
    } else if (leapYear % 100 == 0) {
      isLeap = false;
    } else if (leapYear % 4 == 0) {
      isLeap = true;
    }
    if(isLeap == true){
      System.out.println(leapYear + " is a leap year");
    } else{
      System.out.println(leapYear + " is not a leap year");
    }
    System.out.println("");

    // Operators 2 - Largest of Three Numbers
    // Takes 3 input numbers and says what the largest is
    System.out.println("This program will ask you to input 3 numbers, and it " +
        "will then tell you which one is the largest");
    int x, y, z;
    System.out.println("Enter three integers:");
    x = scanner.nextInt();
    y = scanner.nextInt();
    z = scanner.nextInt();
    if (x == y || x == z || y == z) {
      System.out.println("Entered numbers are not distinct.");
    } else if (x > y && x > z) {
      System.out.println("First number is largest.");
    } else if (y > x && y > z) {
      System.out.println("Second number is largest.");
    } else if (z > x && z > y) {
      System.out.println("Third number is largest.");
    }
    System.out.println("");

    // Operators 3 - Find Simple Interest
    // Takes initial investment and the annual interest rate, then tells you
    // how much interest you make in a year
    System.out.println("This program will tell you how much annual interest " +
        "you will make, given the original investment and interest rate");
    double principal;  // the value of the investment
    double rate;       // the annual interest rate
    double interest;   // the interest earned during the year
    System.out.println("Enter the initial investment: ");
    principal = scanner.nextDouble();
    System.out.println("Enter the annual interest rate: ");
    rate = scanner.nextDouble();
    interest = principal * (rate / 100);
    principal = principal + interest;
    System.out.println("The value of the investment after one year is: "
        + principal);
    System.out.println("");

    // Operators 4 - DegreeToFahrenheit
    // This program converts Celsius to Fahrenheit
    System.out.println("This program will ask you for a temperature in " +
        "Celsius and then convert it to Fahrenheit");
    System.out.println("Enter a temperature in Celsius: ");
    double celsiusDegrees = scanner.nextDouble();
    double fahrenheitDegrees;
    fahrenheitDegrees = (celsiusDegrees * 9 / 5) + 32;
    System.out.println("The temperature in Fahrenheit is: " +
        fahrenheitDegrees);
    System.out.println("");

    // Operators 5 - Arithmetic Operator
    // Performs some basic arithmetic on some numbers
    System.out.println("This program will ask you to input 2 numbers, it will" +
        " then tell you the results of adding, subtracting, multiplying, and " +
        "dividing them");
    calculateValues();
    System.out.println("");

    // Flow Control 1 - No Multiples of 3 or 4
    // Prints every number between 1 and the input that is not a multiple of
    // 3 or 4
    System.out.println("This program will ask you for a number, and then it " +
        "will list every number between 1 and the number you entered that is " +
        "not a multiple of 3 or 4");
    System.out.println("Enter a number:");
    int noMultiplesOf3Or4 = scanner.nextInt();
    int i = 0;
    while (i <= noMultiplesOf3Or4) {
      if (i % 3 == 0 || i % 4 == 0) {
        i++;
      } else {
        System.out.println(i);
        i++;
      }
    }
    System.out.println("");

    // Flow Control 2 - Right or Wrong
    // Asks the user the answer to an addition question, tells them if
    // they're wrong
    System.out.println("What is 12 + 12?");
    int rightOrWrongInput = scanner.nextInt();
    boolean rightOrWrongAnswer;
    if (rightOrWrongInput == 24) {
      rightOrWrongAnswer = true;
    } else {
      rightOrWrongAnswer = false;
    }
    System.out.println(rightOrWrongAnswer);
    System.out.println("");

    // Flow Control 3 - Space Boxing
    // This program converts weight on earth to weight on other planets
    System.out.println("This program will ask for your current weight, and " +
        "then tell you your weight on another planet of your choice");
    System.out.print("Please enter your current earth weight : ");
    double earthWeight = scanner.nextFloat();
    System.out.println();
    System.out.println("I have information for the following planets :");
    System.out.println("1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. " +
        "Neptune, which planet are you visiting : ");
    int inputPlanet = scanner.nextInt();
    switch (inputPlanet) {
      case 1:
        earthWeight *= 0.78;
        break;
      case 2:
        earthWeight *= 0.39;
        break;
      case 3:
        earthWeight *= 2.65;
        break;
      case 4:
        earthWeight *= 1.17;
        break;
      case 5:
        earthWeight *= 1.05;
        break;
      case 6:
        earthWeight *= 1.23;
        break;
      default:
        System.out.println("You did not enter a valid planet");
        break;
    }
    System.out.println("Your weight in pounds : " + earthWeight);
    System.out.println("");

    // Flow Control 4 - Lucky Sum
    // Adds numbers together, but a number is 13, it is not added, and any
    // numbers after it are not added either
    System.out.println("This program will ask you for 3 numbers, then it will" +
        " add them together, unless one of them is 13. Then it will add any " +
        "numbers before 13, but not after it");
    int luckySumA, luckySumB, luckySumC, luckySumS;
    System.out.println("Enter 3 values:");
    luckySumA = scanner.nextInt();
    luckySumB = scanner.nextInt();
    luckySumC = scanner.nextInt();
    luckySumS = luckySum(luckySumA, luckySumB, luckySumC);
    System.out.println("Lucky sum: " + luckySumS);
    System.out.println("");

    // Flow Control 5 - Red Lottery Number
    // Gives a value based off 3 "lottery tickets" with values of 0 to 2
    System.out.println("This program will ask you for 3 numbers, and it will " +
        "then tell you the value of your 'ticket' based on those numbers");
    int lotteryA, lotteryB, lotteryC, lotteryS;
    System.out.println("Enter 3 values from 0 to 2:");
    lotteryA = scanner.nextInt();
    lotteryB = scanner.nextInt();
    lotteryC = scanner.nextInt();
    if (lotteryA == 2 && lotteryB == 2 && lotteryC == 2) {
      lotteryS = 10;
    } else if (lotteryA == lotteryB && lotteryB == lotteryC) {
      lotteryS = 5;
    } else if (lotteryA != lotteryB && lotteryA != lotteryC) {
      lotteryS = 1;
    } else {
      lotteryS = 0;
    }
    System.out.println("The value of your ticket: " + lotteryS);
    System.out.println("");
  }

  public static double triangleArea(double a, double b, double c) {
    // Uses Heron's formula to calculate the area of a triangle from its side
    // lengths
    double s = (a + b + c) / 2;
    double heronBase = Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);
    return heronBase;
  }

  static void calculateValues() {
    float a, b;
    float resultAddition, resultSubtraction, resultMultiplication;
    float resultDivision;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a:");
    a = sc.nextInt();
    System.out.print("Enter b:");
    b = sc.nextInt();
    resultAddition = a + b;
    resultSubtraction = a - b;
    resultMultiplication = a * b;
    resultDivision = a / b;
    System.out.println("The result of adding is " + resultAddition);
    System.out.println("The result of subtracting is " + resultSubtraction);
    System.out.println("The result of multiplying is " + resultMultiplication);
    System.out.println("The result of dividing is " + resultDivision);
  }

  public static int luckySum(int a, int b, int c) {
    // Uses some if-else statements to determine how to add 3 numbers
    // 13 and any numbers input after it are not added
    int sum;
    if (a == 13) {
      sum = 0;
    } else if (b == 13) {
      sum = a;
    } else if (c == 13) {
      sum = a + b;
    } else {
      sum = a + b + c;
    }
    return sum;
  }
}