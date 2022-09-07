public class App {

  public static void main(String[] args) {
    VehiclePart vehiclePart = new Vehicle();
    vehiclePart.accept(new VehiclePartShowVisitor());
  }
}
