package ch03;

public class MuNumberTest {
  
  public static void main(String[] args) {
    
    MyNumber mynumber = (x,y)-> x > y? x: y;

    System.out.println(mynumber.getMax(10, 20));
  }
}
