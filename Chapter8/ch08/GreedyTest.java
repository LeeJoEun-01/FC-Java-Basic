package ch08;

public class GreedyTest {
  public static void main(String[] args) {
    int price = 8370;
    int[] wallet = {500, 100, 50, 10};
    int count = 0;

    for(int i=0; i<wallet.length; i++) {
      count = 0;
      count = price/wallet[i];
      price = price%wallet[i];

      System.out.println(wallet[i]+"짜리 동전 "+ count +"가 필요합니다.");
    }

  }
}
