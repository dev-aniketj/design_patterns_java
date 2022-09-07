public class Available implements ProductState {

  @Override
  public void next(Product prod) {
    prod.setState(new Sold());
  }

  @Override
  public void previous(Product prod) {
    System.out.println("There is no previous state for this product");
  }
}
