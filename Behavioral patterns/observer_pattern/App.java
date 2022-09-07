public class App {

  public static void main(String[] args) {
    ProductSubject computer = new ProductSubject();
    StoreObserver storeObserver = new StoreObserver(computer);
    computer.setState("New");
    computer.setState("Sold");

    SupplyChainObserver supplyChainObserver = new SupplyChainObserver(computer);
    computer.setState("Ordered");
  }
}
