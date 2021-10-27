/*
 * Exercise 1.14: Sketch out a set of classes that reflects the class structure
 * of the Sony Walkman product family we have described. Use methods to hide the
 * data, making all the data private and the methods public. What methods would
 * belong in the Walkman class? Which methods would be added for which extended
 * classes?
 */

public class Ex14 {

  public static void main(String[] args) {
    Walkman w = new Walkman();
    System.out.printf("#%d: %d jack(s), serial %d%n", w.nextSerial(),
      w.JACKS, w.getSerial());
    Walkman2 w2 = new Walkman2();
    System.out.printf("#%d: %d jack(s), serial %d%n", w2.nextSerial(),
      w2.JACKS, w2.getSerial());
  }

}

// Serial number, one jack
class Walkman {

  final public static int JACKS = 1;

  public Walkman() {
    serial = instances++;
  }

  public int getSerial() {
    return serial;
  }

  public static int nextSerial() {
    return instances;
  }

  private static int instances = 0;
  final int serial;

}

// Serial number, two jacks
class Walkman2 extends Walkman {

  final public static int JACKS = 2;

}
