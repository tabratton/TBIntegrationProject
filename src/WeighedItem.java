public class WeighedItem extends PurchasedItem {
  private double weight;
  private double priceAfterWeight;

  public WeighedItem(String n, double up, double w) {
    super(n, up);
    this.weight = w;
    this.priceAfterWeight = getPrice() * getWeight();
  }

  public double getWeight() {
    return weight;
  }

  public double getPriceAfterWeight() {
    return priceAfterWeight;
  }

  public String printInfo() {
    return getName() + "@ $" + getPrice() + " per Kg with " + weight + " Kg " +
        "bought, for a total of $" + getPriceAfterWeight();
  }
}
