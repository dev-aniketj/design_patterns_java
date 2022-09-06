public class NameIterator implements Iterator {

  EmployeeDirectory employeeDirectory;

  public NameIterator(EmployeeDirectory employeeDirectory) {
    this.employeeDirectory = employeeDirectory;
  }

  int index;

  @Override
  public boolean hasNext() {
    if (index < employeeDirectory.names.size()) {
      return true;
    }
    return false;
  }

  @Override
  public Object next() {
    if (this.hasNext()) {
      return employeeDirectory.names.get(index++);
    }
    return null;
  }
}
