package ch01;

public class MinMaxProblem {
  
  public static void main(String[] args) {
    int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45, -1};

    int max = arr[0];
    int min = arr[0];
    int max_pos = 0;
    int min_pos = 0;

    for (int i=0; i<arr.length; i++) {
// 안의 구문을 if/else로 만들게 되면 if문이 true일 때 else문을 돌지 않는데
// 이 문제의 경우 최대, 최소를 나눠서 생각하기 때문에 if문을 두 번 사용한다.

     if ( arr[i] > max) {
        max = arr[i];
        max_pos = i;
      } 

      if( arr[i] < min) {
        min = arr[i];
        min_pos = i;
      }
    }

    System.out.println("최대값: "+max+" / 최대값의 위치: "+(max_pos+1));
    System.out.println("최소값: "+min+" / 최소값의 위치: "+(min_pos+1));
  }
}
