
/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-03-01
 */
public class DateExample {
  private int day;
  private int month;
  private int year;

  /**
   * Default constructor with no parameters, sets all fields to 0.
   */
  public DateExample() {
    setDay(0);
    setMonth(0);
    setYear(0);
  }

  /**
   * Constructor for the class that has parameters for all fields.
   * 
   * @param newDay   The day for the date object being created
   * @param newMonth The month for the date object being created
   * @param newYear  The year for the date object being created
   */
  public DateExample(int newDay, int newMonth, int newYear) {
    setDay(newDay);
    setMonth(newMonth);
    setYear(newYear);
  }

  /**
   * Returns the current value of the day field.
   * 
   * @return an int value that is the current day stored in the object
   */
  public int getDay() {
    return this.day;
  }

  /**
   * Returns the current value of the month field.
   * 
   * @return an int value that is the current month stored in the object
   */
  public int getMonth() {
    return this.month;
  }

  /**
   * Returns the current value of the year field.
   * 
   * @return an int value that is the current year stored in the object
   */
  public int getYear() {
    return this.year;
  }

  /**
   * Sets the day field to the value given in the parameter.
   * 
   * @param inputDay an int value that represents the new day for the object
   */
  public void setDay(int inputDay) {
    if (inputDay > 0 || inputDay < 32) {
      this.day = inputDay;
    } else {
      System.out.println("Error: Day must be between 1 and 31");
      System.out.println("Setting day to 1");
      this.day = 1;
    }
  }

  /**
   * Sets the month field to the value given in the parameter.
   * 
   * @param inputMonth an int value that represents the new month for the object
   */
  public void setMonth(int inputMonth) {
    if (inputMonth > 0 && inputMonth < 13) {
      this.month = inputMonth;
    } else {
      System.out.println("Error: Month must be between 1 and 12");
      System.out.println("Setting month to 1");
      this.month = 1;
    }
  }

  /**
   * Sets the year field to the value given in the parameter.
   * 
   * @param inputYear an int value that represents the new year for the object
   */
  public void setYear(int inputYear) {
    if (inputYear > 0) {
      this.year = inputYear;
    } else {
      System.out.println("Error: Year must be 1 or larger");
      System.out.println("Setting year to 1;");
      this.year = 1;
    }
  }

  /**
   * Displays the current values for day, month, and year in a formatted string.
   */
  public void displayDate() {
    System.out.printf("%nThe date is (in dd/mm/yyyy format): %d/%d/%d", getDay(), getMonth(),
        getYear());
  }
}
