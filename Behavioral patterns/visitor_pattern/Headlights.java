public class Headlights implements VehiclePart {

  @Override
  public void accept(VechiclePartVisitor vechiclePartVisitor) {
    vechiclePartVisitor.visit(this);
  }
}
