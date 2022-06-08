package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1; // 주소 복사 
		
//		실제 주소값은 다르지만 논리적으로 같다. 
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
//		진짜 해쉬코드(주소값)
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		System.out.println(System.identityHashCode(std3));
		
		
		std1.setStudentName("Kim");
//		clone은 생성이 아니라 instance의 상태를 그대로 복제
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}
}
