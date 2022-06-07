package ch24;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
//	 수강하는 과목을 배열로 가지고 있자 (정의)
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
//		리스트 생성
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			
			total += s.getScorePoint();
			System.out.println("학생 "+ studentName +"의"+ s.getName() + "과목 성적은"+ s.getScorePoint() +"입니다.");
		}
		System.out.println("학생 "+ studentName + "의 총점은" + total + " 입니다.");
	}
	
}
