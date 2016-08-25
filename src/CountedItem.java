
/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.4
 * @since   2016-04-13
 */
public class CountedItem extends PurchasedItem {

  /**
   * The amount of the item that is being bought.
   */
  private int quantity;

  /**
   * The price of the total amount of the item being bought.
   */
  private double priceAfterQuantity;

  /**
   * Default constructor with no parameters, initializes values to null and 0.
   */
  public CountedItem() {
    super();
    setQuantity(0);
    setPriceAfterQuantity();
  }

  /**
   * Initializes the name, unitPrice, quantity, and priceAfterQuantity fields.
   *
   * @param tempName  String that indicates the name of the item
   * @param tempPrice The price of the item per unit
   * @param tempQuantity  The quantity of the item that is being bought
   */
  public CountedItem(String tempName, double tempPrice, int tempQuantity) {
    super(tempName, tempPrice);
    setQuantity(tempQuantity);
    setPriceAfterQuantity();
  }

  /**
   * Sets the quantity of the item being bought if the value is over 0.
   *
   * @param tempQuantity the amount of the item that is being bought
   */
  public void setQuantity(int tempQuantity) {
    if (tempQuantity > 0) {
      this.quantity = tempQuantity;
    } else {
      this.quantity = 0;
    }
  }

  /**
   * Gets the current value stored in the quantity field.
   *
   * @return Returns the current value of the quantity field
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the priceAfterQuantity field based on the current
   * value of the unitPrice and quantity fields.
   */
  public void setPriceAfterQuantity() {
    this.priceAfterQuantity = getPrice() * getQuantity();
  }

  /**
   * Gets the current value stored in the priceAfterQuantity field
   *
   * @return Returns the current price for the total amount of the item being
   *         bought.
   */
  public double getPriceAfterQuantity() {
    return priceAfterQuantity;
  }

  /**
   * Prints all of the information in the fields of the item.
   *
   * @return Returns a formatted string containing information from all the
   *         fields of the item.
   */
  public String printInfo() {
    return String.format("%s@ $%.2f per unit with %d units bought, for a total of $%.2f", getName(),
        getPrice(), getQuantity(), getPriceAfterQuantity());
  }
}
