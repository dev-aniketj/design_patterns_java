import java.util.ArrayList;
import java.util.List;

public class InventoryBackend {

  private final Market market = new Market();
  private final List<Order> orders = new ArrayList<>();

  void takeOrder(String productName, long orderNumber) {
    Product product = market.lookup(productName);
    Order order = new Order(orderNumber, product);
    orders.add(order);
  }

  synchronized void process() {
    for (Order order : orders) {
      order.manageOrder();
    }
  }

  String report() {
    return "The total number of objects created: " + market.getSizeOfProducts();
  }
}
