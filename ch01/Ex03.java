/*
 * Exercise 1.3: Add a title to the printed list of the Fibonacci program.
 */

class Ex03 {

  /** Print out the Fibonacci sequence for values < 50 */
  public static void main(String[] args) {
    int lo = 1, hi = 1;
    System.out.println("Fibonacci");
    System.out.println(lo);
    while (hi < 50) {
      System.out.println(hi);
      hi += lo; // new hi
      lo = hi - lo; // new lo is (sum - old lo) that is, the old hi
    }
  }

}
