package ch19;

public class ForTest {

	public static void main(String[] args) {

		int count = 1;
		int sum = 0;
		
		for(int i= 0; i< 10; i++, count++) {
			
			sum += count;
		}
		
		System.out.println(sum);
		
		int count2 = 1;
		int sum2 = 0;
		
		while( count2 <= 10) {
			
			sum2 += count2;
			count2++;
		}
		
		System.out.println(sum2);
	}

}
