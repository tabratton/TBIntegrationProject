
/**
 * @author  Tyler Bratton tylerbratton96@gmail.com
 * @version 1.3
 * @since   2016-04-13
 */
public class PurchasedItem {

  /**
   * The name of the item.
   */
  private String name;

  /**
   * The price of the item per unit of that item.
   */
  private double unitPrice;
  
  /**
   * Default constructor with no parameters, initializes values to null and 0.
   */
  public PurchasedItem() {
    this.name = null;
    this.unitPrice = 0;
  }

  /**
   * Initializes the name and unitPrice fields for the item.
   *
   * @param tempName  String that indicates the name of the item
   * @param tempPrice The price of the item per unit
   */
  public PurchasedItem(String tempName, double tempPrice) {
    setName(tempName);
    setPrice(tempPrice);
  }

  /**
   * Sets the name of the item to the given string.
   *
   * @param tempName A string that will become the name of the item
   */
  public void setName(String tempName) {
    this.name = tempName;
  }

  /**
   * Gets the current name of the item.
   *
   * @return Returns a string that is the name of the item being bought
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the unitPrice of the item being bought if the value is over 0.
   *
   * @param tempPrice The price of the item that is being bought per unit
   */
  public void setPrice(double tempPrice) {
    if (tempPrice > 0) {
      this.unitPrice = tempPrice;
    } else {
      this.unitPrice = 0;
    }
  }

  /**
   * Gets the current value stored in the unitPrice field.
   *
   * @return Returns the price of the item per unit of that item
   */
  public double getPrice() {
    return unitPrice;
  }

  /**
   * Prints all of the information in the fields of the item.
   *
   * @return Returns a formatted string containing information from all the
   *         fields of the item.
   */
  public String printInfo() {
    return getName() + "@ " + getPrice();
  }
}
