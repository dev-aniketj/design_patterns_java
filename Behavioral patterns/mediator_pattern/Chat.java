public class Chat {

  public static void main(String[] args) {
    Mediator mediator = new ConcreteMediator();
    Colleague colleague1 = new ConcreteColleague(mediator, "Tom");
    Colleague colleague2 = new ConcreteColleague(mediator, "Anna");
    mediator.addColleague(colleague1);
    mediator.addColleague(colleague2);
    colleague1.send("Hello");
    colleague1.receive("Hello");
  }
}
