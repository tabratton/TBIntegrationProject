// Created by Tyler Bratton
// Creates a class of that stores information about items being bought

public class PurchasedItem {
  private String name;
  private double unitPrice;

  // Constructor for the PurchasedItem class, sets the values of the name and
  // unitPrice fields
  public PurchasedItem(String n, double up) {
    setName(n);
    setPrice(up);
  }

  // Sets the name field to the given value
  public void setName(String n) {
    name = n;
  }

  // Returns the current value of the name field
  public String getName() {
    return name;
  }

  // Sets the unitPrice field to the given value if it is over 0
  public void setPrice(double up) {
    if (up > 0) {
      unitPrice = up;
    } else {
      unitPrice = 0;
    }
  }

  // Returns the current value of the unitPrice field
  public double getPrice() {
    return unitPrice;
  }

  // Prints all the information about the item entered by the user
  public String printInfo() {
    return getName() + "@ " + getPrice();
  }
}
