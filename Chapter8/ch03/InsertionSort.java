package ch03;

public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};
		
    int i = 0;
    int j = 0;
    int target = 0;
    int count = arr.length;  // 배열의 크기만큼 나오니 조심해서 사용!!!!

    for(i = 1; i<count; i++) {
      target = arr[i];
      j = i;
      while( (j>0) && arr[j-1] > target ) {
        arr[j] = arr[j-1];
        
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
