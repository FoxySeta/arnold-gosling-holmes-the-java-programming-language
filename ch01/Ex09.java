/*
 * Exercise 1.9: Modify the Fibonacci application to store the sequence into an
 * array and print the list of values at the end.
 */

public class Ex09 {

  /** Print out the Fibonacci sequence for values < 50 */
  public static void main(String[] args) {
    int lo = 1, hi = 1;
    System.out.println("Fibonacci");
    int[] fibonacci = new int[50];
    fibonacci[0] = lo;
    int n = 1;
    while (hi < 50) {
      fibonacci[n++] = hi;
      hi += lo; // new hi
      lo = hi - lo; // new lo is (sum - old lo) that is, the old hi
    }
    for (int i = 0; i < n; ++i)
      System.out.println(fibonacci[i]);
  }

}
