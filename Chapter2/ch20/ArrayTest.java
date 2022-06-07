package ch20;

public class ArrayTest {

	public static void main(String[] args) {

//		int 자료형이 10개인 배열  + new라는 키워드를 쓰면 모두 초기화 됨(int는 0으로 초기화 됨)
		int[] arr = new int[10];
		int total = 0;
		
//		for(int i=0, num=1; i<arr.length; i++) {
//			arr[i] = num++;
//		}
		
		for( int num : arr) {
			total += num;
		}
		
		System.out.println(total+"\n");
		
		double[] dArr = new double[5];
		
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		double mtotal = 1;
		
		for(int i=0; i< dArr.length; i++) {
			mtotal *= dArr[i];
			System.out.println(mtotal);
		}
		
		System.out.println(mtotal+"\n");
		
		double[] dArr2 = new double[5];
		
		int count = 0;
		dArr2[0] = 1.1; count++;
		dArr2[1] = 2.1; count++;
		dArr2[2] = 3.1; count++;
		
		double mtotal2 = 1;
		
		for(int i=0; i< count; i++) {
			mtotal2 *= dArr[i];
			System.out.println(mtotal2);
		}
		
		System.out.println(mtotal2);
		
		
	}

}
