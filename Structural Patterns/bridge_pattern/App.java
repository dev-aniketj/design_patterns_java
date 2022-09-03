public class App {

  public static void main(String[] args) {
    Bag redBag = new Bag(new Red());
    Bag blueBag = new Bag(new Blue());

    Purse redPurse = new Purse(new Red());
    Purse bluePurse = new Purse(new Blue());

    redBag.getColour();
    blueBag.getColour();

    redPurse.getColour();
    bluePurse.getColour();
  }
}
