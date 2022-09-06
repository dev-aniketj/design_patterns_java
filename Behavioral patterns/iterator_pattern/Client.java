import java.util.ArrayList;
import java.util.List;

public class Client {

  public static void main(String[] args) {
    List<String> listOfEmployees = new ArrayList<>();
    listOfEmployees.add("John Smith");
    listOfEmployees.add("Susan Jones");
    listOfEmployees.add("Sam Taylor");

    EmployeeDirectory employeeDirectory = new EmployeeDirectory(
      listOfEmployees
    );

    for (
      Iterator iterator = employeeDirectory.getIterator();
      iterator.hasNext();
    ) {
      System.out.println("Name of the employee is: " + iterator.next());
    }
  }
}
