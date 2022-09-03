public class Navigation extends CarDecorator {

  public Navigation(Machine machine) {
    super(machine);
  }

  @Override
  public String doOperation() {
    return machine.doOperation() + addNavigation();
  }

  public String addNavigation() {
    return " + Navigation";
  }
}
