public class AuthenticationHandler implements Handler {

  AuthorizationHandler authorizationHandler = new AuthorizationHandler();

  @Override
  public void handleRequest() {
    System.out.println("Authentication is successful");
    checkAuthorization();
  }

  private void checkAuthorization() {
    authorizationHandler.handleRequest();
  }
}
