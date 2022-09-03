public abstract class CarDecorator implements Machine {

  protected Machine machine;

  public CarDecorator(Machine machine) {
    this.machine = machine;
  }

  @Override
  public String doOperation() {
    return machine.doOperation();
  }
}
