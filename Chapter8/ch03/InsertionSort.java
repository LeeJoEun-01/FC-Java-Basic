package ch03;

public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = {50, 70, 80, 10};
		
    int i = 0;
    int j = 0;
    int target = 0;
    int count = 4;
    // int target = arr[j];

    for(i = 1; i<count; i++) {
      target = arr[i];
      j = i;
      while( (j>0) && arr[j-1] > target ) {
        arr[j] = arr[j-1];
        System.out.println("target: "+ target + "/ 비교하는 숫자: "+arr[j-1] +"/ 위치: "+j +"\n");
        for( int num : arr ){
          System.out.print(num+" "+"\n");
        }
        j = j-1;
      }
      arr[j] = target; 

    }
    System.out.println("완료: "+"\n"); 
    for( int num : arr ){
      System.out.print(num+" "+"\n");
    }
  }
}
