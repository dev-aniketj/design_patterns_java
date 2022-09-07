public class App {

  public static void main(String[] args) {
    Product smartPhone = new Product();
    System.out.println("The smartphone has been sold");
    smartPhone.nextState();
    smartPhone.printStatus();
    System.out.println("The smartphone has been returned by the customer");
    smartPhone.previousState();
    smartPhone.printStatus();
  }
}
