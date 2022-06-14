package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
  
  public static void main(String[] args) {
    
    // FileInputStream fis = null;

    // // try-catch-finally 구문이 불리면 무조건 finally까지 불린다.
    // try {
    //   fis = new FileInputStream("a.txt");
    //   System.out.println("read");

    // } catch (FileNotFoundException e) {
    //   System.out.println(e);
    // } finally {
    //   if(fis != null) {
    //     try {
    //       fis.close();
    //     } catch (IOException e) {
    //       // TODO Auto-generated catch block
    //       e.printStackTrace();
    //     }
    //   }
    //   System.out.println("finally");
    // }
    // System.out.println("end");

    //try-with-resources문 
    try (FileInputStream fis = new FileInputStream("a.txt")) {
      System.out.println("read");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("end");
  }
}
