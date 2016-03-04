
public class DateExample {
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
