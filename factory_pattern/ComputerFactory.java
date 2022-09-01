public class ComputerFactory {

  public Computer getComputer(String computer) {
    switch (computer) {
      case "Laptop":
        return new Laptop();
      case "Phone":
        return new Phone();
      case "SmartTV":
        return new SmartTv();
      default:
        return null;
    }
  }
}
