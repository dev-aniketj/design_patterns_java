import java.util.Hashtable;

public abstract class ObjectPool<T> {

  private Hashtable<T, Boolean> checkedIn = new Hashtable<>();

  public abstract T create();

  public synchronized void checkOut(T t) {
    checkedIn.put(t, false);
  }

  public synchronized T checkIn() {
    for (T t : checkedIn.keySet()) {
      if (checkedIn.get(t)) { // getting value of key(t)
        return t;
      }
    }
    return null;
  }
}
