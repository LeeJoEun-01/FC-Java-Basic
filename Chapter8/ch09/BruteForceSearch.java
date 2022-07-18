package ch09;

public class BruteForceSearch {
  public static void main(String[] args) {
    int price = 100; // 단위: 만원
    int[] wallet = {1, 2, 5, 10, 20, 50}; // 단위: 만원
    int count = 0;

    for(int a=0; a<3; a++){
      for(int b=0; b<6; b++){
        for(int c=0; c<11; c++){
          for(int d=0; d<21; d++){
            for(int e=0; e<51; e++){
              for(int f=0; f<101; f++){
                if(price == (50*a+20*b+10*c+5*d+2*e+1*f)) {
                  count ++;
                }
              }
            }
          }
        }
      }
    }

    System.out.println("지불 가능한 가지 수는 : " +  count + "가지 입니다.");
  }
}
