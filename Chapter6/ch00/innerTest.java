package ch00;

class OutClass{
  private int num = 10;
  private static int sNum = 20;
  private InClass inClass;

  public OutClass() { //OutClass가 생성될 때 InClass도 생성 
    inClass = new InClass();
  }

  class InClass{
    int iNum = 100; // 내부 클래스에서는 static(정적) 변수 사용 불가

    void inTest() {
      System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass inNum = "+inNum+"(외부 클래스의 인스턴스 변수)");
    }
  }

  public void usingClass() {
    inClass.inTest();
  }
}

public class innerTest {
  
}
