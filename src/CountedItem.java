// Created by Tyler Bratton
// Creates a subclass of PurchasedItem that deals with items based on unit price

public class CountedItem extends PurchasedItem {
  private int quantity;
  private double priceAfterQuantity;
  
  // Constructor for the CountedItem class, calls the constructor from the
  // parent class to set the name and unitPrice fields, then sets the quantity
  // and PriceAfterQuantity fields
  public CountedItem(String n, double up, int q) {
    super(n, up);
    setQuantity(q);
    setPriceAfterQuantity();
  }

  // Sets the value of the quantity field to the given value if it is over 0
  public void setQuantity(int q) {
    if (q > 0) {
      quantity = q;
    } else {
      quantity = 0;
    }
  }

  // Returns the current value of the quantity field
  public int getQuantity() {
    return quantity;
  }

  // Sets the value of the priceAfterQuantity field based on unitPrice and
  // quantity
  public void setPriceAfterQuantity() {
    priceAfterQuantity = getPrice() * getQuantity();
  }
  
  // Returns the current value of the priceAfterQuantity field
  public double getPriceAfterQuantity() {
    return priceAfterQuantity;
  }
  
  // Prints all the information about the item entered by the user
  public String printInfo() {
    return getName() + "@ $" + getPrice() + " per unit with " + quantity
        + " units bought, for a total of $" + getPriceAfterQuantity();
  }
}
