package ch07;

public class GenericPrinterTest {
  public static void main(String[] args) {
    
    Powder powder = new Powder();
    // 여기서는 <T>에서 T 대신에 어떤 자료형을 쓸 것인지 넣어준다 ex. <Powder>, <Plastic>
    GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();  // <>는 다이아몬드 연산자라 부르면 나중에 컴파일러가 자료형을 알아서 넣어준다.
    powderPrinter.setMaterial(powder);

    Powder p = powderPrinter.getMaterial();
    System.out.println(powderPrinter.toString());

    GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
    plasticPrinter.setMaterial(new Plastic());
    Plastic plastic = plasticPrinter.getMaterial();
    System.out.println(plasticPrinter);
  }
}
