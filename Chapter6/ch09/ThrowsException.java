package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
  
  public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {

    FileInputStream fis = new FileInputStream(fileName);

    Class c = Class.forName(className);
    return c;
  }

  public static void main(String[] args) {
    
    ThrowsException test = new ThrowsException();

    try {
      test.loadClass("a.txt", "abc");
    } catch (ClassNotFoundException  e) {
      System.out.println("1 "+e);
    } catch (FileNotFoundException e) {
      System.out.println("2 "+e);
    } catch( Exception e) {
      // 위의 두 경우를 제외한 다른 예외는 여기로 들어온다. 항상 마지막에 써야함!!!!!!!!! 
      System.out.println("3 "+e);
    }
    // 에러를 같이 처리하는 방법도 있다. 
    // } catch (ClassNotFoundException | FileNotFoundException e) {
    //   System.out.println(e);
    // }

    System.out.println("end");
  }
}
