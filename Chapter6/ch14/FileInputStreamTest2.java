package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
  
  public static void main(String[] args) {
    
    try(FileInputStream fis = new FileInputStream("input.txt")) { // =리소스

    } catch(IOException e) {
        System.out.println(e);
    }
  }
}
