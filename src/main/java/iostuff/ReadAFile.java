package iostuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAFile {
  public static void main(String[] args) {
    // auto-generated "finally" block closes your resources...
    try (BufferedReader input = // "Autocloseable"
             Files.newBufferedReader(Paths.get("infot.txt"));) {
      String line = null;
      while ((line = input.readLine()) != null) {
        System.out.println("> " + line);
      }
    } catch (IOException ioe) {
      System.out.println("IO error: " + ioe.getMessage());
    }
  }
}
