public class ConcreteColleague implements Colleague {

  private Mediator mediator;
  private String name;

  public ConcreteColleague(Mediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }

  @Override
  public void send(String msg) {
    System.out.println(this.name + ": " + msg);
    mediator.sendMessage(msg, this);
  }

  @Override
  public void receive(String msg) {
    System.out.println(this.name + " Received Message: " + msg);
  }
}
