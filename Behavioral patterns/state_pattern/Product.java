public class Product {

  private ProductState state;

  public Product() {
    this.state = new Available();
  }

  public ProductState getState() {
    return state;
  }

  public void setState(ProductState state) {
    this.state = state;
  }

  public void previousState() {
    state.previous(this);
  }

  public void nextState() {
    state.next(this);
  }

  public void printStatus() {
    System.out.println(
      "Status for the state is: " + state.getClass().getName()
    );
  }
}
