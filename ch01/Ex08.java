/*
 * Exercise 1.8: Add a method to the Point class that sets the current object's
 * coordinates to those of a passed in Point object.
 */

public class Ex08 {

  public static void main(String[] args) {
    Point p1 = new Point();
    p1.x = 1.0;
    p1.y = 2.0;
    System.out.println("P1(" + p1.x + ", " + p1.y + ")");
    Point p2 = new Point();
    p2.x = 3.0;
    p2.y = 4.0;
    System.out.println("P2(" + p2.x + ", " + p2.y + ")");
    p1.move(p2); 
    System.out.println("P1(" + p1.x + ", " + p1.y + ")");
  }

}

class Point {

  public double x, y;

  public void clear() {
    x = 0.0;
    y = 0.0;
  }

  public double distance(Point that) {
    double xdiff = x - that.x;
    double ydiff = y - that.y;
    return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
  }

  public void move(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void move(Point that) {
    this.x = that.x;
    this.y = that.y;
  }

}
