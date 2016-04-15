
/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.3
 * @since   2016-04-13
 */
public class WeighedItem extends PurchasedItem {

  /**
   * The total weight of the items being bought.
   */
  private double weight;

  /**
   * The price of the total amount of items being bought based on the weight.
   */
  private double priceAfterWeight;

  /**
   * Initializes the name, unitPrice, quantity, and priceAfterQuantity fields.
   *
   * @param tempName   String that indicates the name of the item
   * @param tempPrice  The price of the item per unit
   * @param tempWeight The total weight of the items that are being bought
   */
  public WeighedItem(String tempName, double tempPrice, double tempWeight) {
    super(tempName, tempPrice);
    setWeight(tempWeight);
    setPriceAfterWeight();
  }

  /**
   * Sets the weight of the items being bought if the given value is over 0.
   *
   * @param tempWeight The weight of the items being bought
   */
  public void setWeight(double tempWeight) {
    if (tempWeight > 0) {
      this.weight = tempWeight;
    } else {
      this.weight = 0;
    }
  }

  /**
   * Gets the current value stored in the weight field.
   *
   * @return Returns the weight of the items being bought
   */
  public double getWeight() {
    return weight;
  }

  /**
   * Sets the value of the priceAfterWeight field based on the unitPrice and
   * weight.
   */
  public void setPriceAfterWeight() {
    this.priceAfterWeight = getPrice() * getWeight();
  }

  /**
   * Gets the current value stored in the priceAfterWeight field.
   *
   * @return Returns the price of the items being bought based on the total
   *         weight of the items
   */
  public double getPriceAfterWeight() {
    return priceAfterWeight;
  }

  /**
   * Prints all of the information in the fields of the item.
   *
   * @return Returns a formatted string containing information from all the
   *         fields of the item.
   */
  public String printInfo() {
    return getName() + "@ $" + getPrice() + " per Kg with " + weight + " Kg "
        + "bought, for a total of $" + getPriceAfterWeight();
  }
}
