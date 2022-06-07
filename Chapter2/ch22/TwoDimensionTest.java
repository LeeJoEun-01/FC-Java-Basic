package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3}, {1,2,3,4}};
		
		int i, j;
		
		for(i=0; i<arr.length; i++) { // arr.length=2 => 행이 바깥
			System.out.print("\n");
			
			for(j=0; j<arr[i].length; j++) { //arr[0].length=3, arr[1].length=4  => 열이 안쪽
				System.out.print(arr[i][j]+ ",");
			}
			System.out.print("\t"+arr[i].length);
		}
	}

}
