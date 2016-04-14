// Created by Tyler Bratton
// Contains all of the "programs" (methods) for the Explanations category of
// the menu

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekZeroExamples {
  // Explains the "Hello World!" program and then demonstrates it.
  public static void explainHelloWorld() {
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
        + " and a maximum of 32,767. Example: " + declaringVariablesShort);
    System.out.println("int: A 32-bit integer. Has a minimum value of -2,147,"
        + " 483,648 and a maximum of 2,147,483,647. Example: "
        + declaringVariablesInt);
    System.out.println("long: A 64-bit integer. Has a minimum value of -9,223,"
        + "372,036,854,775,808 and a maximum of 9,223,372,036,854,775,807."
        + " Example: " + declaringVariablesLong);
    System.out.println("float: A single-precision 32-bit floating point number."
        + " Unlike the previous data types, floating point numbers can be used"
        + " for decimal numbers instead of just integers." + " Example "
        + declaringVariablesFloat);
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
    // Explanation of Relational and Conditional Operators
    System.out.println("Relational operators are used to create boolean"
        + " expressions that are then used to determine if a value is greater"
        + " than, greater than or equal to, less than, or less than or equal to"
        + " another value.");
    System.out.println("When the expression is not true, it will become"
        + " 'false', and when it is true, it will become 'true'");
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
        + " determine if the expression on equality is true or false");
    System.out.println("== Determines if the values on either side are equal"
        + " to each other");
    System.out.println("!= Determines if the values on either side are not"
        + " equal to each other.  Note: When they are not equal, the"
        + " expression will be true");
    System.out.println("There are also two conditional operators in Java."
        + " These operators are used with the above relational operators to"
        + " create more complex boolean expressions.");
    System.out.println("Note: There must always be an expression on either"
        + " side of the conditional operator in order for it to be valid, you"
        + " cannot use a conditional operator with an expression on just one"
        + " side.");
    System.out.println("&& is the conditional operator that means AND.");
    System.out.println("This means that the boolean expression created by two"
        + " or more expressions and the conditional operator is true only if"
        + " both of the expressions are true.  Otherwise, it is false.");
    System.out.println("|| is the conditional operator that means OR.");
    System.out.println("This means that the boolean expression created by two"
        + " or more expressions and the conditional operator is true if any"
        + " of the expressions in the larger expression are true.");
    System.out.println("The only way for the whole boolean expression to be"
        + " false is if all of the statements within it is false.");
    System.out.println("Some demonstrations: ");
    System.out.println("1 > 5 evaluates to: " + (1 > 5));
    System.out.println("11 < 87 evaluates to: " + (11 < 87));
    System.out.println("5 == 5 evaluates to: " + (5 == 6));
    System.out.println("5 != 6 evaluates to: " + (5 != 6));
    System.out.println("1 > 5 && 11 < 87 evaluates to: " + (1 > 5 && 11 < 87));
    System.out.println("1 > 5 || 11 < 87 evaluates to: " + (1 > 5 || 11 < 87));
    System.out.println("");
  }

  public static void privateFieldsDemonstration(final Scanner scanner) {
    // Classes 1 - Date Class
    // Creates a separate class and creates an object from that class, then
    // asks the user for input and uses a constructor to create the object,
    // displays their input, and uses set/get methods to enter new values for
    // private fields
    System.out.println("This program will create a class called day and"
        + " an object created from that class that will store the day, month,"
        + " and year that you input.");
    System.out.println("It will then print back the day you put in, ask you to"
        + " input a new day, and then also print the new day");
    int day = 0;
    int month = 0;
    int year = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter the day: ");
        day = scanner.nextInt();
        if (day > 31 || day < 1) {
          throw new Exception();
        }
        goodUserInput = true;
        System.out.println("");
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
        System.out.println("Please enter the month: ");
        month = scanner.nextInt();
        if (month > 12 || month < 1) {
          throw new Exception();
        }
        goodUserInput = true;
        System.out.println("");
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
        System.out.println("Please enter the year: ");
        year = scanner.nextInt();
        if (year < 1) {
          throw new Exception();
        }
        goodUserInput = true;
        System.out.println("");
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You cannot have a negative year");
        scanner.nextLine();
        System.out.println();
      }
    }
    DateExample date1 = new DateExample(day, month, year);
    date1.displayDate();
    System.out.println("");
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        System.out.println("Please enter another year: ");
        year = scanner.nextInt();
        if (year < 1) {
          throw new Exception();
        }
        goodUserInput = true;
        System.out.println("");
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      } catch (Exception ex) {
        System.out.println("You cannot have a negative year");
        scanner.nextLine();
        System.out.println();
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
        System.out.println("");
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
        System.out.println("Please enter another day: ");
        day = scanner.nextInt();
        if (day > 31 || day < 1) {
          throw new Exception();
        }
        goodUserInput = true;
        System.out.println("");
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
    DateExample date2 = new DateExample();
    date2.setDay(day);
    date2.setMonth(month);
    date2.setYear(year);
    date2.displayDate();
    System.out.println("");
  }

  public static void demonstrateInheritanceAndPolymorphism(Scanner scanner) {
    // This method creates two objects of different types derived from the
    // same base class, and demonstrates inheritance and polymorphism with them
    scanner.nextLine();
    System.out.println("Inheritance is when a class, called a subclass, gets"
        + " all of the fields and methods in another class, called the"
        + " superclass. These fields and methods are available to be used in"
        + " the subclass without having to be rewritten in it.");
    System.out.println("");
    System.out.println("This program will ask you to enter information about"
        + " items you are buying, and it will then create two objects that"
        + " inherit from the same base class");
    System.out.println("");
    
    System.out.println("Please enter the name of the first item: ");
    final String name1 = scanner.nextLine();
    
    System.out.println("Please enter the unit price of the first item: ");
    double unitPrice = 0;
    boolean goodUserInput = false;
    while (!goodUserInput) {
      try {
        unitPrice = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    
    System.out.println("Please enter the weight of the first item: ");
    double weight = 0;
    goodUserInput = false;
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
    
    scanner.nextLine();
    System.out.println("Please enter the name of the second item: ");
    final String name2 = scanner.nextLine();
    
    System.out.println("Please enter the unit price of the second item: ");
    double unitPrice2 = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        unitPrice2 = scanner.nextDouble();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter a number");
        scanner.nextLine();
        System.out.println("");
      }
    }
    
    System.out.println("Please enter the quantity of the second item: ");
    int quantity = 0;
    goodUserInput = false;
    while (!goodUserInput) {
      try {
        quantity = scanner.nextInt();
        goodUserInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("You have to enter an integer");
        scanner.nextLine();
        System.out.println("");
      }
    }
    System.out.println("");
    System.out.println("Polymorphism is the concept that objects can be"
        + " multiple different data types. This means that objects created"
        + " from a subclass have the data type of the subclass, as well as"
        + " the data type of its superclass, as well as the data type of all"
        + " the classes up the chain of inheritance to the Object class of"
        + " Java.");
    System.out.println("");
    System.out.println("For example, this program will now create an array of"
        + " type PurchasedItem, and put the objects created from its"
        + " subclasses WeightItem and CountedItem into it. It then iterates"
        + " through the array and prints each objects respective information");
    WeighedItem item1 = new WeighedItem(name1, unitPrice, weight);
    CountedItem item2 = new CountedItem(name2, unitPrice2, quantity);
    PurchasedItem[] items = new PurchasedItem[] { item1, item2 };
    for (PurchasedItem currentItem : items) {
      System.out.println(currentItem.printInfo());
    }
    System.out.println("");
  }
}
