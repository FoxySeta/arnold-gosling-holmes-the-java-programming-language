/*
 * Exercise 1.10: Modify the ImprovedFibonacci application to store its sequence
 * in an array. Do this by creating a new class to hold both the value and a
 * boolean value that says whether the value is even, and then having an array
 * of object references to objects of that class.
 */

public class Ex10 {

  static final int MAX_INDEX = 9;

  /**
  * Print out the first few Fibonacci numbers,
  * marking evens with a '*'
  */
  public static void main(String[] args) {
    int lo = 1;
    int hi = 1;
    String mark;
    Entry[] fibonacci = new Entry[MAX_INDEX - 1];
    for (int i = MAX_INDEX; i >= 2; --i) {
      fibonacci[i - 2] = new Entry(hi);
      hi = lo + hi;
      lo = hi - lo;
    }
    for (int i = 0; i < fibonacci.length; ++i)
      System.out.println((i + 2) + ": " + fibonacci[i].getNumber() +
        (fibonacci[i].isEven() ? "*" : ""));
  }

}

class Entry {

  public Entry(int value) {
    n = value;
    e = n % 2 == 0;
  }

  public int getNumber() {
    return n;
  }

  public boolean isEven() {
    return e;
  }

  final private int n;
  final private boolean e;

}
