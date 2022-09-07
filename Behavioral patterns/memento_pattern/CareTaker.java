import java.util.ArrayList;
import java.util.List;

public class CareTaker {

  private List<Memento> mementoList;

  public CareTaker() {
    initializeList();
  }

  private void initializeList() {
    this.mementoList = new ArrayList<Memento>();
  }

  public void add(Memento state) {
    mementoList.add(state);
  }

  public Memento get(int index) {
    return mementoList.get(index);
  }

  public int getSize() {
    return mementoList.size();
  }
}
