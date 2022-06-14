package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest11 {
  
  public static void main(String[] args) {
    
    System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");

    int i;

    try {
      InputStreamReader irs = new InputStreamReader(System.in); //=> 바이트를 문자로 바꿔주는 클래스 
      while((i = irs.read()) != '\n') { //   irs.read() = System.in.read() => 이제 한글도 사용 가능 
        // System.out.println(i);
        System.out.println((char)i);
      }
    } catch (IOException e) {
      
      e.printStackTrace();
    }
  }
}
