/*
 * Exercise 1.4: Write a program that generates a different sequence, such as a
 * table of squares.
 */

public class Ex04 {

  public static void main(String[] args) {
    final int rows = 50;
    System.out.println("Table of the first " + rows + " squares");
    for (int i = 0; i < rows; ++i)
      System.out.println(i + "\t" + i * i);
  }

}
