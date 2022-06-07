package ch06;

public class StudentTest {
	
	// 클라이언트 모듈

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}
