public class QuantumComputer extends AbstractComputer {

  @Override
  public void mountProcessor() {
    System.out.println("Quantum processor has been mounted");
  }

  @Override
  public void mountProcessorCooling() {
    System.out.println("Quantum cooling has been mounted.");
  }
}
