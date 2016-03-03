import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekSixExceptionHandling {
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
        System.out.println(
                "Incorrect. " + userInput + " is not a multiple of 5" + ".");
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
  
  public static double height(int feet, int inches) { // 1 inch = 2.54 cm
    return (feet * 30.48) + (inches * 2.54);          // 1 foot = 30.48 cm
  }
}
