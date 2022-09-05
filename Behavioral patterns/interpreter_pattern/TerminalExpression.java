public class TerminalExpression extends AbstractExpression {

  String data;

  public TerminalExpression(String context) {
    this.data = context;
  }

  @Override
  boolean interpret(String context) {
    if (context.contains(data)) return true; else return false;
  }
}
