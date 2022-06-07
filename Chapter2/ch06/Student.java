package ch06;

public class Student {
	
	// 서비스 모듈

//	멤버 변수는 만들어지면 자동으로 null이나 0으로 초기화된다.
	public int studentNumber;
	public String studentName;
	public int grade;
	
//  생성자1
	public Student() {}
	
//	생성자2
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
