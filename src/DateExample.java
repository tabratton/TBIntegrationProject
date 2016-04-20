
/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.3
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
    this.day = 0;
    this.month = 0;
    this.year = 0;
  }

  /**
   * Constructor for the class that has parameters for all fields.
   * 
   * @param newDay   The day for the date object being created
   * @param newMonth The month for the date object being created
   * @param newYear  The year for the date object being created
   */
  public DateExample(int newDay, int newMonth, int newYear) {
    this.day = newDay;
    this.month = newMonth;
    this.year = newYear;
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
    this.day = inputDay;
  }

  /**
   * Sets the month field to the value given in the parameter.
   * 
   * @param inputMonth an int value that represents the new month for the object
   */
  public void setMonth(int inputMonth) {
    this.month = inputMonth;
  }

  /**
   * Sets the year field to the value given in the parameter.
   * 
   * @param inputYear an int value that represents the new year for the object
   */
  public void setYear(int inputYear) {
    this.year = inputYear;
  }

  /**
   * Displays the current values for day, month, and year in a formatted string.
   */
  public void displayDate() {
    System.out.println("The date is (in dd/mm/yyyy format): " + getDay()
        + "/" + getMonth() + "/" + getYear());
  }
}
