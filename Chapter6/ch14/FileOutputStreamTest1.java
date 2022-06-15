package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
  
  public static void main(String[] args) {
    
    try(FileOutputStream fos = new FileOutputStream("output.txt",true)){ 
    // 파일이 없으면 새로 만들어준다. 파일 이름 뒤에 false(=default)가 있으면 파일이 새로고침되어 써지고, true면 append되어 써진다.
      
      fos.write(65);
      fos.write(66);
      fos.write(67);
      fos.write(68);

    } catch(IOException e) {
      System.out.println(e);
    }
    System.out.println("end");
  }
}
