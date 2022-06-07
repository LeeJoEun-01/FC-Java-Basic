package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
//		노란줄이 뜨는 이유?
//		serialNum가 static 변수이니까 클래스 이름으로 참조해서 써라 라는 의미이다.
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
//		결과가 같다 = 두 개의 인스턴스가 하나의 메모리를 공유한다.
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
	}

}
