public class CountedItem extends PurchasedItem {
  private int quantity;
  private double priceAfterQuantity;

  public CountedItem(String n, double up, int q) {
    super(n, up);
    this.quantity = q;
    this.priceAfterQuantity = getPrice() * getQuantity();
  }

  public int getQuantity() {
    return quantity;
  }

  public double getPriceAfterQuantity() {
    return priceAfterQuantity;
  }

  public String printInfo() {
    return getName() + "@ $" + getPrice() + " per unit with " + quantity
        + " units bought, for a total of $" + getPriceAfterQuantity();
  }
}
