package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
  
  public static void main(String[] args) {
    
    FileInputStream fis = null;
  
    try {
      fis = new FileInputStream("input.txt");
      // read는 들어있는 값들을 읽다가 더 이상 읽을것이 없으면 -1를 반환한다. 
      // 따라서 자료형이 int임으로 (char)으로 형변환을 해줘야 한다.
      System.out.println((char)fis.read()); 
      System.out.println((char)fis.read());
      System.out.println((char)fis.read());

    } catch (IOException e) {
      e.printStackTrace();
        // try {
        //   fis.close();
        // } catch (IOException e1) {
        //   // TODO Auto-generated catch block
        //   e1.printStackTrace();
        // } catch(Exception e2) {
        //   // null일 경우
        //   System.out.println(e2);
        // }
    } finally {
        try {
          fis.close();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch(Exception e2) {
          System.out.println(e2);
        }
    }
    System.out.println("end");
  }
}
