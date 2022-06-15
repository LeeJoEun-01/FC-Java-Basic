package ch14;

import java.io.FileInputStream;
import java.io.IOException;

// int read 사용 
public class FileInputStreamTest2 {
  
  public static void main(String[] args) {
    
    int i;
    try(FileInputStream fis = new FileInputStream("input.txt")) { // =리소스

      while( (i = fis.read()) != -1 ) {  // -1은 텍스트 파일의 마지막을 알린다.
        System.out.println((char)i);
      }

    } catch(IOException e) {
        System.out.println(e);
    }
  }
}
