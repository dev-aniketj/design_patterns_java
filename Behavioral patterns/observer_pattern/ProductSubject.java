import java.util.ArrayList;
import java.util.List;

public class ProductSubject {

  private List<Observer> observerList = new ArrayList<>();
  String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
    notifyAllObservers();
  }

  public void attachObserver(Observer observer) {
    observerList.add(observer);
  }

  public void notifyAllObservers() {
    for (Observer observer : observerList) {
      observer.update();
    }
  }
}
