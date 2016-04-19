
/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.3
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
    this.quantity = 0;
    this.priceAfterQuantity = 0;
  }

  /**
   * Initializes the name, unitPrice, quantity, and priceAfterQuantity fields.
   *
   * @param tempName  String that indicates the name of the item
   * @param tempPrice The price of the item per unit
   * @param tempQuan  The quantity of the item that is being bought
   */
  public CountedItem(String tempName, double tempPrice, int tempQuan) {
    super(tempName, tempPrice);
    setQuantity(tempQuan);
    setPriceAfterQuantity();
  }

  /**
   * Sets the quantity of the item being bought if the value is over 0.
   *
   * @param tempQuan The amount of the item that is being bought
   */
  public void setQuantity(int tempQuan) {
    if (tempQuan > 0) {
      this.quantity = tempQuan;
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
    return getName() + "@ $" + getPrice() + " per unit with " + quantity
        + " units bought, for a total of $" + getPriceAfterQuantity();
  }
}
