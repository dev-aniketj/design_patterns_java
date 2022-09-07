public class Sold implements ProductState {

  @Override
  public void next(Product prod) {
    System.out.println("Package is already sold");
  }

  @Override
  public void previous(Product prod) {
    prod.setState(new Available());
  }
}
