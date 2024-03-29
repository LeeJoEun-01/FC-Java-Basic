package test;

import javax.swing.DefaultBoundedRangeModel;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {

  School goodSchool = School.getInstance();
  Subject korean;
  Subject math;
  Subject dance;

  GenerateGradeReport gradeReport = new GenerateGradeReport();
  public static void main(String[] args) {
    
    TestMain test = new TestMain();

    test.createSubject();
    test.createStudent();

    String report = test.gradeReport.getReport(); //성적 결과 생성
    System.out.println(report); //출력 


  }

  //테스트 과목 생성
  public void createSubject() {

    korean = new Subject(Define.KOREAN, "국어");
    math = new Subject(Define.MATH, "수학");
    dance = new Subject(Define.DANCE, "댄스");

// default가 AB타입 이기 때문에 PF 타입으로 지정해서 바꾸어 줘야한다. SAB타입을 따로 설정하지 않은 이유는 major에 따라서 점수 계산 방법이 달라지도록 if문으로 설정했기때문에
//major와 상관없이 타입을 바꿔주는 경우 지정해줘야 한다.
    dance.setGradeType(Define.PF_TYPE);

    goodSchool.addSubject(korean);
    goodSchool.addSubject(math);
    goodSchool.addSubject(dance);
  }

  //테스트 학생 생성
  public void createStudent() {

    Student student1 = new Student(211213, "강감찬", korean);
    Student student2 = new Student(212330, "김유신", math);
    Student student3 = new Student(201518, "신사임당", korean);
    Student student4 = new Student(202360, "이순신", korean);
    Student student5 = new Student(201290, "홍길동", math);

    goodSchool.addStudent(student1);
    goodSchool.addStudent(student2);
    goodSchool.addStudent(student3);
    goodSchool.addStudent(student4);
    goodSchool.addStudent(student5);

    korean.register(student1);
    korean.register(student2);
    korean.register(student3);
    korean.register(student4);
    korean.register(student5);

    math.register(student1);
    math.register(student2);
    math.register(student3);
    math.register(student4);
    math.register(student5);

    dance.register(student1);
    dance.register(student2);
    dance.register(student3);

    addScoreForStudent(student1, korean, 95);
    addScoreForStudent(student1, math, 56);

    addScoreForStudent(student2, korean, 95);
    addScoreForStudent(student2, math, 95);

    addScoreForStudent(student3, korean, 100);
    addScoreForStudent(student3, math, 88);

    addScoreForStudent(student4, korean, 89);
    addScoreForStudent(student4, math, 95);

    addScoreForStudent(student5, korean, 85);
    addScoreForStudent(student5, math, 56);

    // 댄스 점수 추가
    addScoreForStudent(student1, dance, 95);
    addScoreForStudent(student2, dance, 85);
    addScoreForStudent(student3, dance, 55);
  }

  //과목별 성적 입력
  public void addScoreForStudent(Student student, Subject subject, int point) {
    Score score = new Score(student.getStudentId(), subject, point);
    student.addSubjectScore(score);
  }
}
