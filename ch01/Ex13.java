/*
 * Exercise 1.13: Rewrite the ImprovedFibonacci program using printf instead of
 * println.
 */

class Ex13 {

  static final int MAX_INDEX = 9;

  /**
  * Print out the first few Fibonacci numbers,
  * marking evens with a '*'
  */
  public static void main(String[] args) {
    int lo = 1;
    int hi = 1;
    String mark;
    System.out.printf("1: %d", lo);
    for (int i = 2; i <= MAX_INDEX; i++) {
      if (hi % 2 == 0)
        mark = " *";
      else
       mark = "";
      System.out.printf("%d: %d%s%n", i, hi, mark);
      hi = lo + hi;
      lo = hi - lo;
    }
  }

}
