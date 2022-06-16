package ch22;

class Bank {  // share resource

  private int money = 10000;

  // critical section
  public synchronized void saveMoney(int save) {
    // 방법 1) synchronized method
    // synchronized로 되어있는 메서드를 수행하는 동안
    // 이 메서드가 포함된 객체에 lock(=bank)을 걸어서 자신을 제외한 다른 메서드들이 접근 못하게

    //방법 2) synchronized block
    // synchronized(this) { // this에 lock을 걸 객체를 적어준다.

    // }

    int m = getMoney();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    setMoney(m + save);
  }

  public void minusMoney(int minus) {

    synchronized (this) {
      int m = getMoney();

      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      setMoney(m - minus);
    }
  }

 public void setMoney(int money) {
    this.money = money;
  }

 public int getMoney() {
    return money;
  }

}

class Park extends Thread {

  public void run() {
    //synchronized (SyncMain.myBank) {
    System.out.println("start save");
    SyncMain.myBank.saveMoney(3000);
    System.out.println("saveMoney(3000) : "+SyncMain.myBank.getMoney());
    //}
  }
}

class ParkWife extends Thread {

  public void run() {
    System.out.println("start minus");
    SyncMain.myBank.minusMoney(1000);
    System.out.println("minusMoney(1000) : "+ SyncMain.myBank.getMoney());
  }
}

public class SyncMain {
  
  public static Bank myBank = new Bank();

  public static void main(String[] args) {
    
    Park p = new Park();
    p.start();

    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    ParkWife pw = new ParkWife();
    pw.start();

  }
}
