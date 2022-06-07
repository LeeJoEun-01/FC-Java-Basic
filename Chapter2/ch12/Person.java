package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
//		다른 생성자를 나타내는
		this("no name", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public Person getPerson() {
//		자신의 현재 위치를 반환
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
	}
}
