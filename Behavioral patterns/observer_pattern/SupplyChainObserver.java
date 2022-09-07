public class SupplyChainObserver implements Observer {

  ProductSubject productSubject;

  public SupplyChainObserver(ProductSubject productSubject) {
    this.productSubject = productSubject;
    this.productSubject.attachObserver(this);
  }

  @Override
  public void update() {
    System.out.println(
      "Supply Chain Observer updated, the new state of the subject is: " +
      productSubject.getState()
    );
  }
}
