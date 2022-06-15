package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest { // 유일하게 read와 write를 둘 다 제공!! 스트림은 아님!!!
  
  public static void main(String[] args) throws IOException {
    
    RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

    rf.writeInt(100);
    System.out.println("pos: "+ rf.getFilePointer());
    rf.writeDouble(3.14);
    System.out.println("pos: "+ rf.getFilePointer());
    rf.writeUTF("안녕하세요"); // 한글 = 3byte / 3*5 + 2(문자열 맨 마지막에 오는 null) = 17byte
    System.out.println("pos: "+ rf.getFilePointer());

    rf.seek(0);

    int i = rf.readInt();
    double d = rf.readDouble();
    String str = rf.readUTF();

    System.out.println(i);
    System.out.println(d);
    System.out.println(str);

  }
}
