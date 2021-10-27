/*
 * Exercise 1.12: Modify ImprovedFibonacci to store the String objects it
 * creates into an array instead of invoking println with them directly.
 */

public class Ex12 {

  static final int MAX_INDEX = 9;

  /**
  * Print out the first few Fibonacci numbers,
  * marking evens with a '*'
  */
  public static void main(String[] args) {
    int lo = 1;
    int hi = 1;
    String mark;
    String[] fibonacci = new String[MAX_INDEX - 1];
    for (int i = MAX_INDEX; i >= 2; --i) {
      fibonacci[i - 2] = (i + 2) + ": " + hi + (hi % 2 == 0 ? "*" : "");
      hi = lo + hi;
      lo = hi - lo;
    }
    for (int i = 0; i < fibonacci.length; ++i)
      System.out.println(fibonacci[i]);
  }

}
