public class Originator {

  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public Memento storeStateToMemento() {
    return new Memento(state);
  }

  public void retrieveStateFromMemento(Memento memento) {
    state = memento.getState();
  }
}
