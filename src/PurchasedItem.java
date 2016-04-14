public class PurchasedItem {
  private String name;
  private double unitPrice;

  public PurchasedItem(String n, double up) {
    setName(n);
    setPrice(up);
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void setPrice(double up) {
    unitPrice = (up > 0) ? up : 0;
  }

  public double getPrice() {
    return unitPrice;
  }

  public String printInfo() {
    return getName() + "@ " + getPrice();
  }
}
