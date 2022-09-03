public class App {

  public static void main(String[] args) {
    OnlineStoreAccount johnSmith = new OnlineStoreAccount.Builder(1L)
      .withName("JohnSmith")
      .withAddress("Oxford Lane 35A")
      .withBudget(100L)
      .withDiscount(2L)
      .build();

    System.out.println(johnSmith.getId());
    System.out.println(johnSmith.getName());
    System.out.println(johnSmith.getAddress());
    System.out.println(johnSmith.getBudget());
    System.out.println(johnSmith.getDiscountRate());
  }
}
