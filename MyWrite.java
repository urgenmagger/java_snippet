import java.io.*;

public class MyWrite {
  public static void main(String[] args) {
    File myFile = new File("result.txt");
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
      String lineSeparator = System.getProperty("line.separator");
      writer.write("example of writing to a file " + lineSeparator);
      writer.flush();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}



