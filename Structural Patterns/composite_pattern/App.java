public class App {

  public static void main(String args[]) {
    Human human = new Human();
    human.setName("John");
    human.setDepartment("HR");

    Robot robot = new Robot();
    robot.setName("R2D2");
    robot.setDepartment("Manufacturing");

    WorkManager workManager = new WorkManager();
    workManager.add(human);
    workManager.add(robot);
    System.out.println(workManager);
    System.out.println(human);
    System.out.println(robot);

    // extra for checking the interface is working properly or not.
    human.performTask();
    robot.performTask();
    workManager.performTask();
  }
}
