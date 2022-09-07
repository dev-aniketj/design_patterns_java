public abstract class AbstractComputer {

  public void mountMotherboard() {
    System.out.println("Motherboard mounted");
  }

  public void mountProcessor() {
    System.out.println("Processor is mounted");
  }

  public void mountProcessorCooling() {
    System.out.println("Processor cooling is mounted");
  }

  public void mountGPU() {
    System.out.println("GPU is mounted");
  }

  public void mountMemory() {
    System.out.println("Memory is mounted");
  }

  public void buildComputer() {
    mountMotherboard();
    mountProcessor();
    mountProcessorCooling();
    mountMemory();
    mountGPU();
  }
}
