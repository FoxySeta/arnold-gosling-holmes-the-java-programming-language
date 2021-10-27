/*
 * Exercise 1.15: Write an interface that extends Lookup to declare add and
 * remove methods. Implement the extended interface in a new class.
 */

public class Ex15 {

  public static void main(String[] args) {
    SimpleLookup2 sl2 = new SimpleLookup2(
      new String[]{"A", "B"},
      new Object[]{"Alice", "Bob"}
    );
    sl2.add("C", "Candace");
    System.out.println("C like " + sl2.find("C"));
    sl2.remove("B");
    System.out.println("'Not found' is represented as " + sl2.find("B"));
  }

}

interface Lookup {
 /** Return the value associated with the name, or
 * null if there is no such value */
 Object find(String name);
}

interface Lookup2 extends Lookup {
  public void add(String n, Object o);
  public boolean remove(String n);
}

class SimpleLookup2 implements Lookup2 {

  private String[] names;
  private Object[] values;

  public SimpleLookup2(String[] n, Object[] v) {
    names = n;
    values = v;
  }

  public Object find(String name) {
  for (int i = 0; i < names.length; i++)
    if (names[i].equals(name))
      return values[i];
  return null; // not found
  }

  public void add(String n, Object o) {
    final String[] oldNames = names;
    final Object[] oldValues = values;
    names = new String[names.length + 1];
    values = new Object[values.length + 1];
    for (int i = 0; i < oldNames.length; ++i) {
      names[i] = oldNames[i];
      values[i] = oldValues[i];
    }
    names[oldNames.length] = n;
    values[oldValues.length] = o;
  }

  public boolean remove(String n) {
    for (int i = 0; i < names.length; i++)
      if (names[i].equals(n)) {
        final String[] oldNames = names;
        final Object[] oldValues = values;
        names = new String[names.length - 1];
        values = new Object[values.length - 1];
        for (int j = 0; j < i; ++j) {
          names[j] = oldNames[j];
          values[j] = oldValues[j];
        }
        for (int j = i; j < names.length; ++j) {
          names[j] = oldNames[j + 1];
          values[j] = oldValues[j + 1];
        }
        return true;
      }
    return false; // not found
  }

}
