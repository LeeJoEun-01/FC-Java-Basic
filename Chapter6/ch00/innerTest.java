package ch00;

class OutClass{
  private int num = 10;
  private static int sNum = 20;
  private InClass inClass;

  public OutClass() { //OutClass가 생성될 때 InClass도 생성 
    inClass = new InClass();
  }

  class InClass{ // 내부 클래스를 프라이빗으로 많이 선언한다.
    int iNum = 100; // 내부 클래스에서는 static(정적) 변수 사용 불가

    void inTest() {
      System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass inNum = "+iNum+"(외부 클래스의 인스턴스 변수)");
    }
  }

  public void usingClass() {
    inClass.inTest();
  }

  static class InStaticClass {
    // 정적 클래스에서 외부 클래스의 인스턴스는 사용할 수 없다.

    int iNum = 100;
    static int sInNum = 200;

    void inTest() {
      System.out.println("OutClass num = "+iNum+"(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass inNum = "+sInNum+"(외부 클래스의 인스턴스 변수)");
    }

    static void sTest() {
      // System.out.println("OutClass num = "+iNum+"(외부 클래스의 인스턴스 변수)"); => 정적 클래스의 정적 메서드는 정적 변수만 호출할 수 있다.
      System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass inNum = "+sInNum+"(외부 클래스의 인스턴스 변수)");
    }
  }
}

public class innerTest {
//   public static void main(String[] args) {

// //  InClass가 private일 때
//     OutClass outClass = new OutClass();
//     outClass.usingClass();

// //  InClass가 private이 아닐 때
//     OutClass.InClass inner = outClass.new InClass();
//     inner.inTest();
//   }
 public static void main(String[] args) {
  OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //=> 정적 내부 클래스 
  sInClass.inTest();

  System.out.println();

  OutClass.InStaticClass.sTest();
 }
}
