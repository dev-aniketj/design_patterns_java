public class Vehicle implements VehiclePart {

  VehiclePart[] parts;

  public Vehicle() {
    parts = new VehiclePart[] { new CarBody(), new Headlights(), new Engine() };
  }

  @Override
  public void accept(VechiclePartVisitor vechiclePartVisitor) {
    for (VehiclePart vehiclePart : parts) {
      vehiclePart.accept(vechiclePartVisitor);
    }
    vechiclePartVisitor.visit(this);
  }
}
