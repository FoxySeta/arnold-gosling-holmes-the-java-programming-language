/*
 * Exercise 1.11: Modify the StringsDemo application to use different strings.
 */

public class Ex11 {

  public static void main(String[] args) {
    String myName = "Stefano";
    String occupation = "Student Developer";
    myName += " Volpe";
    myName += " ";
    myName += "(" + occupation + ")";
    System.out.println("Name = " + myName);
  }

}
