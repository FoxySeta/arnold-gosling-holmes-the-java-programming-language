/*
 * Exercise 1.7: Change the loop in ImprovedFibonacci so that i counts backward
 * instead of forward.
 */

public class Ex07 {

  static final int MAX_INDEX = 9;

  /**
  * Print out the first few Fibonacci numbers,
  * marking evens with a '*'
  */
  public static void main(String[] args) {
    int lo = 1;
    int hi = 1;
    String mark;
    System.out.println("1: " + lo);
    for (int i = MAX_INDEX; i >= 2; --i) {
      if (hi % 2 == 0)
        mark = " *";
      else
        mark = "";
    System.out.println(i + ": " + hi + mark);
    hi = lo + hi;
    lo = hi - lo;
    }
  }
}
