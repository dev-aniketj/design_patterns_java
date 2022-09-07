public class App {

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 2;

    Context context = new Context(new AddOperation());
    System.out.println(context.executeStrategy(num1, num2));

    context = new Context(new MultiplyOperation());
    System.out.println(context.executeStrategy(num1, num2));
  }
}
