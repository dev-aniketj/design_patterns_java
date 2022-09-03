public class ParkingAssistant extends CarDecorator {

  public ParkingAssistant(Machine machine) {
    super(machine);
  }

  @Override
  public String doOperation() {
    return machine.doOperation() + addParkingAssistant();
  }

  public String addParkingAssistant() {
    return " + Parking Assistant";
  }
}
