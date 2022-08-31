public class App {
    public static void main(String[] args) {
        OnlineStoreAccount johnSmith = new OnlineStoreAccount.Builder(1L)
                .withName("JohnSmith")
                .withAddress("Oxford Lane 35A")
                .withBudget(100L)
                .withDiscount(2L)
                .build();

        System.out.println(johnSmith.getName());
    }
}
