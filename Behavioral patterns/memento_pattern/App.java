public class App {

  public static void main(String[] args) {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("State #1");
    careTaker.add(originator.storeStateToMemento());
    originator.setState("State #2");
    careTaker.add(originator.storeStateToMemento());
    originator.setState("State #3");
    careTaker.add(originator.storeStateToMemento());

    originator.setState("State #4");
    System.out.println("Current State: " + originator.getState());

    for (int index = 0; index < careTaker.getSize(); index++) {
      originator.retrieveStateFromMemento(careTaker.get(index));
      System.out.println(originator.getState());
    }
  }
}
