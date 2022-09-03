public class PortableComputer extends AbstractFactory {

  @Override
  Computer getComputer(String computerType) {
    switch (computerType) {
      case "Laptop":
        return new Laptop();
      case "Phone":
        return new Phone();
      case "SmartTv":
        return new SmartTv();
      default:
        return null;
    }
  }
}
