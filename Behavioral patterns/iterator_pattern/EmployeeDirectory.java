import java.util.List;

public class EmployeeDirectory implements Container {

  public List<String> names;

  public EmployeeDirectory(List<String> names) {
    this.names = names;
  }

  @Override
  public Iterator getIterator() {
    return new NameIterator(this);
  }
}
