package ch04;

public class StudentTest {

	public static void main(String[] args) {

//		클래스를 기반으로 만들어진 객체 = 인스턴스
		Student studentLee = new Student();
		
//		studentLee => 참조변수 (메모리 위치를 나타낸다.)
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentIfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentIfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
//		(결과)
//		@이 앞은 클래스의 풀네임(패키지 이름 + 클래스 이름)
//		@은 주소값(=참조값) => heap에 studentLee와 studentKim이 자리잡은 주소!!!
//		ch04.Student@4517d9a3
//		ch04.Student@372f7a8d
		
		
	}

}
