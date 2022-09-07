import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

  private List<Colleague> colleagues;

  public ConcreteMediator() {
    this.colleagues = new ArrayList<>();
  }

  @Override
  public void addColleague(Colleague colleague) {
    this.colleagues.add(colleague);
  }

  @Override
  public void sendMessage(String msg, Colleague user) {
    for (Colleague colleague : colleagues) {
      if (colleague != user) {
        colleague.receive(msg);
      }
    }
  }
}
