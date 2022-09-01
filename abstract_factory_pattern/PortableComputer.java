public class PortableComputer extends AbstractFactory {

  @Override
  Computer getComputer(String computerType) {
    if (computerType.equalsIgnoreCase("Laptop")) {
      return new Laptop();
    } else if (computerType.equalsIgnoreCase("Phone")) {
      return new Phone();
    }

    return null;
  }
}
