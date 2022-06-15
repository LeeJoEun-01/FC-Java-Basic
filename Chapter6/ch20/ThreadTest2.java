package ch20;

// 방법2) 쓰레드 상속 못 받아서 Runnable 인터페이스 사용
class MyThread implements Runnable{

  @Override
  public void run() {
    int i;
    for (i=1; i<=200; i++) {
      System.out.print(i + "\t");
    }
    
  }

}

public class ThreadTest2 {
  
  public static void main(String[] args) {

    System.out.println(Thread.currentThread() + " start");
    MyThread runnable = new MyThread();

    Thread th1 = new Thread(runnable);
    Thread th2 = new Thread(runnable);

    th1.start();
    th2.start();

    System.out.println(Thread.currentThread() + " end");

    Runnable run = new Runnable() {
      
      @Override
      public void run() {
        System.out.println("run");
      }
    };

    run.run();
    
  }
}

