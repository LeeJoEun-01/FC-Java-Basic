package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {
  
  private String subjectName;  //과목 이름
  private int subjectId;       //과목 고유번호
  private int gradeType;       //과목 평가 방법 기본은 A,B 방식

  // 수강 신청한 학생 리스트
  // register() 메서드를 호출하면 리스트에 추가된다.
  private ArrayList<Student> studentList = new ArrayList<>();

  public Subject(int subjectId, String subjectName) {
    this.subjectId = subjectId;
    this.subjectName = subjectName;
    this.gradeType = Define.AB_TYPE;
  }

  public int getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(int subjectId) {
    this.subjectId = subjectId;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public int getGradeType() {
    return gradeType;
  }

  public void setGradeType(int gradeType) {
    this.gradeType = gradeType;
  }

  public ArrayList<Student> getStudentList() {
    return studentList;
  }

  public void setStudentList(ArrayList<Student> studentList) {
    this.studentList = studentList;
  }

  public void register(Student student) { //수강신청
    studentList.add(student);
  }

}
