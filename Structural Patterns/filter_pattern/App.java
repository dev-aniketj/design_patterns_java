import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {
    Purse redPurse = new Purse(new Red());
    Purse bluePurse = new Purse(new Blue());
    Purse anotherBluePurse = new Purse(new Blue());
    Purse yetAnotherBluePurse = new Purse(new Blue());

    List<Purse> purses = new ArrayList<>();
    purses.add(redPurse);
    purses.add(bluePurse);
    purses.add(anotherBluePurse);
    purses.add(yetAnotherBluePurse);

    Filter blueFilter = new BlueFilter();

    List<Purse> bluePurses = blueFilter.meetFilter(purses);
    for (Purse purse : bluePurses) {
      System.out.println(
        "The purse from this list is: " +
        purse.getColour().getClass().getName().toLowerCase()
      );
    }
  }
}
