public class AuthorizationHandler implements Handler {

  @Override
  public void handleRequest() {
    System.out.println("Client authorized to use the system as a customer.");
  }
}
