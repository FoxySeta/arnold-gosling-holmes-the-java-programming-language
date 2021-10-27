/*
 * Exercise 1.16: Add fields to BadDataSetException to hold the set name and the
 * I/O exception that signaled the problem so that whoever catches the exception
 * will know details about the error.
 */

public class Ex16 {

  public static void main(String[] args) {

  }

}

class BadDataSetException extends Exception {
  
  public BadDataSetException(String name, IOException exception) {
    n = name;
    e = exception;
  }

  public String name() {
    return name;
  }

  public IOException exception() {
    return e;
  }

  final String n;
  final IOException e;

}

class MyUtilities {

  public double[] getDataSet(String setName) throws BadDataSetException {
    String file = setName + ".dset";
    FileInputStream in = null;
    try {
      in = new FileInputStream(file);
      return readDataSet(in);
    } catch (IOException e) {
      throw new BadDataSetException(setName, e);
    } finally {
      try {
        if (in != null)
          in.close();
      } catch (IOException e) {
      ; // ignore: we either read the data OK
        // or we're throwing BadDataSetException
      }
    }

  }

  private double[] readDataSet(FileInputStream in)
    throws IOException {
  }

}
