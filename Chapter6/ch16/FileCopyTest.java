package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {
  
  public static void main(String[] args) {
    
    long millisecond = 0;

// FileInputStream,FileOutputStream 사용하면 오래걸리기 때문에 BufferedInputStream,BufferedOutputStream을 사용한다.

    try(BufferedInputStream fis = new BufferedInputStream(new FileInputStream("a.zip"));
    // FileOutputStream fos = new FileOutputStream("copy.zip")) {
      BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {

      millisecond = System.currentTimeMillis();

      int i;
      while ( (i = fis.read()) != -1) {
        fos.write(i);
      }

      millisecond = System.currentTimeMillis() - millisecond;

      
    } catch (IOException e) {
        e.printStackTrace();
    }

    // System.out.println(millisecond + " 소요되었습니다.");

    // Socket socket = new Socket();

    // BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    // br.readLine(); // 한 줄 씩 읽을 수 있다.
  }
}
