package ch01;

class Outer2 {

  int outNum = 100;
  static int sNum = 200;
  
  // 이 메서드가 생성되고 끝나면 스택 안에 들어 있는 변수 i와 local 변수가 같이 사라진다.
  // 그러면 run에서 값을 바꿔줄 수가 없음으로 final 처리 해준다.
  Runnable getRunnable(final int i) {

    final int num = 10;

    // 익명함수 1
    return new Runnable() {

      int localNum = 1000;

      // local inner class
      @Override
      public void run() {

        System.out.println("i = "+ i);
        System.out.print("num = "+num);
        System.out.println("localNum = " +localNum);

        System.out.println("outNum = "+ outNum + "(외부 클래스 인스턴스 변수)");
        System.out.println("Outter.sNum = "+ Outer2.sNum + "(외부 클래스 정적 변수)");
      }

    };
  }

  // 익명함수 2
  Runnable runnable = new Runnable() {

    @Override
    public void run() {
      System.out.println("Runnable class");
      
    }
    
  };
}

public class AnonumousInnerTest {
  
  public static void main(String[] args) {
     Outer2 out = new Outer2();
     Runnable runner = out.getRunnable(100);

     runner.run();

     out.runnable.run();
  }
}
