/*
 * Exercise 1.6: Change your program from Exercise 1.3 to use a named string
 * constant for the title.
 */

public class Ex06 {

  final public static String title = "Fibonacci";

  /** Print out the Fibonacci sequence for values < 50 */
  public static void main(String[] args) {
    int lo = 1, hi = 1;
    System.out.println(title);
    System.out.println(lo);
    while (hi < 50) {
      System.out.println(hi);
      hi += lo; // new hi
      lo = hi - lo; // new lo is (sum - old lo) that is, the old hi
    }
  }

}
