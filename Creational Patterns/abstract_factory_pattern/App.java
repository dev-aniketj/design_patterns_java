public class App {

  public static void main(String[] args) {
    AbstractFactory computerFactory = FactoryProducer.getFactory(false);
    Computer computer = computerFactory.getComputer("SmartTv");
    computer.compute();
  }
}
