// Created by Tyler Bratton
// Simple class that stores the specified day, month, and year
// Contains getters and setters to access and change the day, month, and year

public class DateExample {
  private int day;
  private int month;
  private int year;

  // Constructor for the class that takes no arguments, just sets the fields
  // to a default value of 0
  public DateExample() {
    this.day = 0;
    this.month = 0;
    this.year = 0;
  }

  // Constructor for the class that takes values for all three fields as
  // arguments
  public DateExample(final int newDay, final int newMonth, final int newYear) {
    this.day = newDay;
    this.month = newMonth;
    this.year = newYear;
  }

  // Returns the current value of the day field
  int getDay() {
    return this.day;
  }

  // Returns the current value of the month field
  int getMonth() {
    return this.month;
  }

  // Returns the current value of the year field
  int getYear() {
    return this.year;
  }

  // Sets the day field to the value of the argument from the method call
  void setDay(final int inputDay) {
    this.day = inputDay;
  }

  // Sets the month field to the value of the argument from the method call
  void setMonth(final int inputMonth) {
    this.month = inputMonth;
  }

  // Sets the year field to the value of the argument from the method call
  void setYear(final int inputYear) {
    this.year = inputYear;
  }

  // Displays the current values for day, month, and year and a string to
  // explain the output
  public void displayDate() {
    System.out.println("The date is (in dd/mm/yyyy format): " + getDay()
        + "/" + getMonth() + "/" + getYear());
  }
}
