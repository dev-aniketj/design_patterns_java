public class App {

  public static void main(String[] args) {
    ObjectPool robotsPool = new RobotsPool();
    Robot firstRobot = (Robot) robotsPool.create();
    Robot secondRobot = (Robot) robotsPool.create();

    robotsPool.checkOut(firstRobot);

    Robot thirdRobot = (Robot) robotsPool.checkIn();
  }
}
