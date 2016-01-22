//Integration project that demonstrates the skills I learned in COP 2006
//Introduce each program, cite sources, add comments to code

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //Hello World
		System.out.println("Hello World!");
		
		//Variables 1 - Declaring Variables
		//Simply declares a few variables and then prints them
	  int a1 = 63;
	  float b1 = 45.0f;
	  double c1 = 67.675586d;
	  System.out.println("The value of first variable is " + a1);
	  System.out.println("The value of second variable is " + b1);
	  System.out.println("The value of third variable is " + c1);
	  
    //Variables 2 - Even or Odd
	  //Takes one number from the user and then prints if it is even or odd
	  Scanner scanner = new Scanner(System.in);  //Creates a new scanner object to accept input
    int evenCheck = 0;
    int evenNum = scanner.nextInt();
    System.out.println("Enter a number:");
    evenCheck = evenNum % 2;  //Divides by 2 and checks for a remainder to determine if the number is even or odd
    if(evenCheck == 0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
        
    //Variables 3 - Multiple Any Two Numbers
    //Takes two numbers from the user, multiplies them, and then prints the product
    int product = 0;
    System.out.println("Enter the 1st number:");
    int num1=scanner.nextInt();
    System.out.println("Enter the 2nd number:");
    int num2=scanner.nextInt();
    product = num1 * num2;
    System.out.println("The product of the two numbers is: " + product);
        
    //Variables 4 - Age, Name, Salary
    //Takes input from he user and then prints it back with comments on the input
    String name = scanner.nextLine();
    System.out.println("Hi " + name + "! How old are you?");
    int age = scanner.nextInt();
    System.out.println("So you're " + age + " eh? That's not old at all!");
    System.out.println("How much do you make " + name + "?");
    double salary = scanner.nextDouble();
    System.out.println(salary + "! I hope that's per hour and not per year!");
       
    //Variables 5 - Prime Number Checker
    //Takes a number from the user and then checks if it is prime
    System.out.println("Enter your input number: ");
    int n = scanner.nextInt();
    int i = 2;
    int isPrime = 1;
    while(i < n / 2){
      if(n % i == 0){
        isPrime = 0;
      }
      i++;
    }
    if(isPrime == 0){
      System.out.println("Input number is not a prime number");
    }
    else{
      System.out.println("Input number is a prime number");
    }
        
    //Variables 6 - Testing Your Variable Knowledge
    //Subtracts a variable from a number and then prints the original and the result
    int variableKnowledgeA = 10;
    int variableKnowledgeB = 100 - variableKnowledgeA;
    System.out.println("Output is: " + variableKnowledgeA);
    System.out.println("Output is: " + variableKnowledgeB);
       
    //Variables 7 - Variable Max Values
    //Prints the minimum and maximum values of the int variable in Java
    int min = -2_147_483_648;
    int max = 2_147_483_647;
    System.out.println(min);
    System.out.println(max);
       
		//Variables 8 - Area of a Triangle
    //All code from this exercise except for the triangleArea function is from Programmr.com
    double a;
    a = triangleArea(3, 3, 3);
    System.out.println("A triangle with sides 3, 3, 3 has an area of: " + a);
    a = triangleArea(3, 4, 5);
    System.out.println("A triangle with sides 3, 4, 5 has an area of: " + a);
    a = triangleArea(9, 9, 9);
    System.out.println("A triangle with sides 9, 9, 9 has an area of: " + a);
  }
  public static double triangleArea(double a, double b, double c){
    //Uses Heron's formula to calculate the area of a triangle from its side lengths
    double s =  (a + b + c)/2;
    double heronBase = s * (s - a) * (s - b) * (s - c);
    double area = Math.pow(heronBase, 0.5);
    return area;
  }
}  
