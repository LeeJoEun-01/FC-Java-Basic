package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
  
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5};

    for(int num : arr ) {
      System.out.println(num);
    }

    System.out.println("---------------------------------");
    // 스트림 생성하고 요소 하나씩 꺼내는 연산자 사용
    Arrays.stream(arr).forEach(n->System.out.println(n));

    // max 연산자 사용 함
    IntStream is = Arrays.stream(arr);
    System.out.println(is.max());

    // 새로운 연산자를 사용하려면 다시 스트림을 생성해야 한다! 
    int sum = Arrays.stream(arr).sum();
    System.out.println(sum);

  }
}
