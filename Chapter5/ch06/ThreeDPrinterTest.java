package ch06;

public class ThreeDPrinterTest {
  public static void main(String[] args) {
    
    Powder powder = new Powder();
    ThreeDPrinter3 printer = new ThreeDPrinter3();

    printer.setMaterial(powder);

    // Powder p = printer.getMaterial(); => 오류가 나와서 강제로 (Powder)로 형변환을 해줘야한다.
  }
}
