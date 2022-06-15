package ch20;

// 방법1) 쓰레드 상속받기
class MyThread extends Thread{

  public void run() {
    int i;
    for (i=1; i<=200; i++) {
      System.out.print(i + "\t");
    }
  }
}

public class ThreadTest1 {
  
  public static void main(String[] args) {

    System.out.println(Thread.currentThread() + " start");
    MyThread th1 = new MyThread();
    MyThread th2 = new MyThread();

    th1.start();
    th2.start();
    System.out.println(Thread.currentThread() + " end");
    
  }
}
