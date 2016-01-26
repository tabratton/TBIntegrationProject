//Integration project that demonstrates the skills I learned in COP 2006
//Test from eclipse
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    //Hello World
    System.out.println("The Hello World is the most basic computer program, " +
        "showing that you made the computer do something");
    System.out.println("Hello World!");
    System.out.println("");

    //Variables 1 - Declaring Variables
    //Simply declares a few variables and then prints them
    System.out.println("This next program will just print a few variables to " +
        "demonstrate the kinds of variables in Java.");
    int declaringVariablesInt = 63;
    float declaringVariablesFloat = 45.0f;
    double declaringVariablesDouble = 67.675586d;
    System.out.println("The value of first variable is " + declaringVariablesInt);
    System.out.println("The value of second variable is " + declaringVariablesFloat);
    System.out.println("The value of third variable is " + declaringVariablesDouble);
    System.out.println("");

    //Variables 2 - Even or Odd
    //Takes one number from the user and then prints if it is even or odd
    //Creates a new scanner object to accept input
    System.out.println("This program will ask you for a number, and will then" +
        " tell you if it is even or odd");
    Scanner scanner = new Scanner(System.in);
    int evenCheck;
    System.out.println("Enter a number:");
    int evenNum = scanner.nextInt();
    //Divides by 2 and checks for a remainder to determine if the number is
    // even or odd
    evenCheck = evenNum % 2;
    if(evenCheck == 0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
    System.out.println("");

    //Variables 3 - Multiple Any Two Numbers
    //Takes two numbers from the user, multiplies them, and then prints the
    // product
    System.out.println("The following program will ask you to give it two " +
        "numbers, which it will then multiply them and tell you the product");
    int multiplyAnyTwoNumersProduct;
    System.out.println("Enter the 1st number:");
    int multiplyAnyTwoNumbers1 = scanner.nextInt();
    System.out.println("Enter the 2nd number:");
    int multiplyAnyTwoNumbers2 = scanner.nextInt();
    multiplyAnyTwoNumersProduct = multiplyAnyTwoNumbers1 * multiplyAnyTwoNumbers2;
    System.out.println("The product of the two numbers is: " + multiplyAnyTwoNumersProduct);
    System.out.println("");

    //Variables 4 - Age, Name, Salary
    //Takes input from he user and then prints it back with comments on the
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

    //Variables 5 - Prime Number Checker
    //Takes a number from the user and then checks if it is prime
    System.out.println("This program will ask for you to give it a number, " +
        "and it will then tell you if that number is a prime number or not");
    System.out.println("Enter your input number: ");
    int primeNumberInput = scanner.nextInt();
    int primeNumberLoopCounter = 2;
    int isPrime = 1;
    //This while loop checks to see if the given number is evenly divisible
    // by any number greater than 2 and less than half of the original number
    //  If it is, then the number is not a prime.
    while(primeNumberLoopCounter < primeNumberInput / 2){
      if(primeNumberInput % primeNumberLoopCounter == 0){
        isPrime = 0;
      }
      primeNumberLoopCounter++;
    }
    if(isPrime == 0){
      System.out.println("Input number is not a prime number");
    }
    else{
      System.out.println("Input number is a prime number");
    }
    System.out.println("");

    //Variables 6 - Testing Your Variable Knowledge
    //Subtracts a variable from a number and then prints the original and the
    // result
    System.out.println("The next program is a very simple one that just " +
        "prints the result of a variable being subtracted from a number");
    int variableKnowledgeA = 10;
    int variableKnowledgeB = 100 - variableKnowledgeA;
    System.out.println("Output is: " + variableKnowledgeA);
    System.out.println("Output is: " + variableKnowledgeB);
    System.out.println("");

    //Variables 7 - Variable Max Values
    //Prints the minimum and maximum values of the int variable in Java
    System.out.println("Similar to the second program you saw, this one " +
        "simply prints the minimum and maximum values for the int variable in" +
        " Java.");
    int intMin = -2_147_483_648;
    int intMax = 2_147_483_647;
    System.out.println(intMin);
    System.out.println(intMax);
    System.out.println("");

    //Variables 8 - Area of a Triangle
    //All code from this exercise except for the triangleArea function is
    // from http://www.programmr.com/area-triangle
    System.out.println("This program takes the side lengths of a triangle and" +
        " uses Heron's formula to calculate the area, which it then prints to" +
        " the console.");
    double triangleAreaVariable;
    triangleAreaVariable = triangleArea(3, 3, 3);
    System.out.println("A triangle with sides 3, 3, 3 has an area of: " + triangleAreaVariable);
    triangleAreaVariable = triangleArea(3, 4, 5);
    System.out.println("A triangle with sides 3, 4, 5 has an area of: " + triangleAreaVariable);
    triangleAreaVariable = triangleArea(9, 9, 9);
    System.out.println("A triangle with sides 9, 9, 9 has an area of: " + triangleAreaVariable);
    System.out.println("");
    
    //Arithmetic 1 - Absolute Equals
    boolean equal = false;
    System.out.println("Enter the 1st number:");
    int num1 = Math.abs(scanner.nextInt());
    System.out.println("Enter the 2nd number:");
    int num2 = Math.abs(scanner.nextInt());
    if(num1 == num2){
      equal = true;
    }
    else if(num1 != num2){
      equal = false;
    }
    System.out.println("Result is: " + equal);

    //Arithmetic 2 - Floor and Ceiling
    System.out.println("Enter a number: ");
    double dob = scanner.nextDouble();
    System.out.println((int) Math.ceil(dob));
    System.out.println((int) Math.floor(dob));
    
    //Arithmetic 3 - Square Root
    
    System.out.println("Enter a number: ");
    double x = scan.nextDouble();
    DecimalFormat df = new DecimalFormat("0.00000");
    System.out.println(df.format(Math.pow(x, 0.5)));
    System.out.println(df.format(Math.pow(x, 0.25)));

    //Arithmetic 4 - Taylor Series
    double sinDegrees = scanner.nextDouble();
    double sinRadians = sinDegrees * 3.14 / 180;
    double sinTaylorSeries = sinRadians - ((sinRadians * sinRadians *
    sinRadians) / (3 * 2 * 1)) + ((sinRadians * sinRadians * sinRadians * sinRadians * sinRadians) / (5 * 4 * 3 * 2 * 1)) - ((sinRadians * sinRadians * sinRadians * sinRadians * sinRadians * sinRadians * sinRadians) / (7 * 6 * 5 * 4 * 3 * 2 * 1));
    DecimalFormat df = new DecimalFormat("0.00000#");
    String sinRounded = df.format(sinTaylorSeries);
    System.out.println(sinRounded);

    //Arithmetic 5 - Multiples of 3 and 5
    int i = 0;
    int j = 0;
    int k = 0;
    int sumFive = 0;
    int sumThree = 0;
    int sumFifteen = 0;
    System.out.println("Enter a number below which sum must be calculated: ");
    int input = scanner.nextInt();
    while(i < input){
      sumFive = i + sumFive;
      i = i + 5;
    }
    while(j < input){
      sumThree = j + sumThree;
      j = j + 3;
    }
    while(k < input){
      sumFifteen = k + sumFifteen;
      k = k + 15;
    }
    int finalSum = sumFive + sumThree - sumFifteen;
    System.out.println(finalSum);
    
//Leap Year


    System.out.println("Enter the year to be checked: ");
    int leapYear = scanner.nextInt();
    boolean isLeap = false;
    if(leapYear % 400 == 0){
      isLeap = true;
    }
    else if(leapYear % 100 == 0){
      isLeap = false;
    }
    else if(leapYear % 4 == 0){
      isLeap = true;
    }
    System.out.println(isLeap);


//Largest of Three Numbers

    int x, y, z;
    System.out.println("Enter three integers:");
    x = scanner.nextInt();
    y = scanner.nextInt();
    z = scanner.nextInt();
    if(x == y || x == z || y == z){
      System.out.println("Entered numbers are not distinct.");
    }
    else if(x > y && x > z){
      System.out.println("First number is largest.");
    }
    else if(y > x && y > z){
      System.out.println("Second number is largest.");
    }
    else if(z > x && z > y){
      System.out.println("Third number is largest.");
    }


//FindSimpleInterest
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

  //DegreeToFahrenheit
    System.out.println("Enter a temperature in Celsius: ");
    
    double celsiusDegrees = scanner.nextDouble();
    double fahrenheitDegrees = 0;
    fahrenheitDegrees = (celsiusDegrees * 9 / 5) + 32;
    System.out.println("The temperature in Fahrenheit is: " +
        fahrenheitDegrees);

  //Arithmetic Operator
   calculateValues();
}  
  public static double triangleArea(double a, double b, double c){
    //Uses Heron's formula to calculate the area of a triangle from its side
    // lengths
    double s = (a + b + c)/2;
    double heronBase = Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);
    return heronBase;
  }
  static void calculateValues() {
    float a, b;
    int resulta, results, resultm;
    float resultd;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a:");
    a = sc.nextInt();
    System.out.print("Enter b:");
    b = sc.nextInt();
    resulta = (int) (a + b);
    results = (int) (a - b);
    resultm = (int) (a * b);
    resultd = a / b;
    System.out.println("The result of adding is " + resulta);
    System.out.println("The result of subtracting is " + results);
    System.out.println("The result of multiplying is " + resultm);
    System.out.println("The result of dividing is " + resultd);
  }
}