package ch01;

public class MinMaxProblem {
  
  public static void main(String[] args) {
    int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45, -1};

    int max = arr[0];
    int min = arr[0];
    int max_pos = 0;
    int min_pos = 0;

    for (int i=0; i<arr.length; i++) {
      if ( arr[i] > max) {
        max = arr[i];
        max_pos = i;
      } 
      else {
        if( arr[i] < min) {
          min = arr[i];
          min_pos = i;
        }
        else {
          //아무 일도 일어나지 않는다.
        }
      }
    }

    System.out.println("최대값: "+max+" / 최대값의 위치: "+max_pos);
    System.out.println("최소값: "+min+" / 최소값의 위치: "+min_pos);
  }
}
