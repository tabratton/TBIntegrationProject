// Created by Tyler Bratton
// Creates a subclass of PurchasedItem that deals with items based on weight

public class WeighedItem extends PurchasedItem {
  private double weight;
  private double priceAfterWeight;

  // Constructor for the WeighedItem class, calls the constructor from the
  // parent class to set the name and unitPrice fields, then sets the weight
  // and priceAfterWeight fields
  public WeighedItem(String tempName, double tempPrice, double tempWeight) {
    super(tempName, tempPrice);
    setWeight(tempWeight);
    setPriceAfterWeight();
  }

  // Sets the value of the weight field to the given value if it is over 0
  public void setWeight(double tempWeight) {
    if (tempWeight > 0) {
      weight = tempWeight;
    } else {
      weight = 0;
    }
  }

  // Returns the current value of the weight field
  public double getWeight() {
    return weight;
  }

  // Sets the value of the priceAfterWeight field based on unitPrice and weight
  public void setPriceAfterWeight() {
    priceAfterWeight = getPrice() * getWeight();
  }

  // Returns the current value of the priceAfterWeight field
  public double getPriceAfterWeight() {
    return priceAfterWeight;
  }

  // Prints all the information about the item entered by the user
  public String printInfo() {
    return getName() + "@ $" + getPrice() + " per Kg with " + weight + " Kg "
        + "bought, for a total of $" + getPriceAfterWeight();
  }
}
