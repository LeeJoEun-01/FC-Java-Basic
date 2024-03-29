package ch21;

public class JoinTest extends Thread{
  
  int start;
  int end;
  int total;

  public JoinTest(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public void run() {
    
    int i;
    for (i=start; i<=end; i++) {
      total += i;
    }
  }

  public static void main(String[] args) {

    System.out.println(Thread.currentThread() + "start");
    
    JoinTest jt1 = new JoinTest(1, 50);
    JoinTest jt2 = new JoinTest(51, 100);

    jt1.start();
    jt2.start();

    try {
      jt1.join(); 
      jt2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    // jt1, jt2(Non-Runnable 상태에 빠짐)의 계산이 끝날 때까지 lastTotal을 계산하지 말라.
    // join 사용하면 InterruptedException 에러 사용해주기 

    int lastTotal = jt1.total + jt2.total;

    System.out.println("jt1.total = "+ jt1.total);
    System.out.println("jt2.total = "+ jt2.total);

    System.out.println("lastTotal = "+ lastTotal);
    
  }
}
