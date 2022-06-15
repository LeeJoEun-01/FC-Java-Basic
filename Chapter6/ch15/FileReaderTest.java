package ch15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
  
  public static void main(String[] args) {
    
    // FileInputStream은 한글을 못  읽지만 FileReader를 사용하면 잘 읽을 수 있다.
    try(FileReader fr = new FileReader("reader.txt")) {
      int i;

      while( (i = fr.read()) != -1) {
        System.out.print((char)i);
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
