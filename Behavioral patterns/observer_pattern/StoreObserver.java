public class StoreObserver implements Observer {

  ProductSubject productSubject;

  public StoreObserver(ProductSubject productSubject) {
    this.productSubject = productSubject;
    this.productSubject.attachObserver(this);
  }

  @Override
  public void update() {
    System.out.println(
      "Store Observer updated, the new state of the subject is: " +
      productSubject.getState()
    );
  }
}
