public class Client {

  public static void main(String[] args) {
    AbstractExpression car1 = new TerminalExpression("Toyota");
    AbstractExpression car2 = new TerminalExpression("Lexus");
    AbstractExpression isFast = new OrExpression(car1, car2);

    AbstractExpression car3 = new TerminalExpression("Mazda");
    AbstractExpression reliable = new TerminalExpression("Reliable");
    AbstractExpression isReliable = new AndExpression(car3, reliable);

    System.out.println(isFast.interpret("Toyota"));
    System.out.println(isReliable.interpret("Reliable, Mazda"));
    System.out.println(isReliable.interpret("Reliable, Lexus"));
  }
}
