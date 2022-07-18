package ch10;

public class Counting {
  public static void main(String[] args) {
    
    int[] people = { 55, 40, 27, 99, 76, 81, 29, 31,33, 62, 101, 48, 21, 17}; 
    int[] ages = new int[10];

    for(int i=0; i<people.length; i++) {
      int target = 0;
      target = people[i]/10;
      if (target == 10) {
        ages[0] = ages[0] + 1;
      }
      else{
        ages[target] = ages[target] + 1;
      }
    }
    
    int number = people.length;
    System.out.println( number + "명 중 10대는 " + ages[1]+ "명 입니다.");
    System.out.println( number + "명 중 20대는 " + ages[2]+ "명 입니다.");
		System.out.println( number + "명 중 30대는 " + ages[3]+ "명 입니다.");
		System.out.println( number + "명 중 40대는 " + ages[4]+ "명 입니다.");
		System.out.println( number + "명 중 50대는 " + ages[5]+ "명 입니다.");
		System.out.println( number + "명 중 60대는 " + ages[6]+ "명 입니다.");
		System.out.println( number + "명 중 70대는 " + ages[7]+ "명 입니다.");
		System.out.println( number + "명 중 80대는 " + ages[8]+ "명 입니다.");
		System.out.println( number + "명 중 90대는 " + ages[9]+ "명 입니다.");
    System.out.println( number + "명 중 100대는 " + ages[0]+ "명 입니다.");
  
  }
}
