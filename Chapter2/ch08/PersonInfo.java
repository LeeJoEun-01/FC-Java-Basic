package ch08;

public class PersonInfo {

	public int tall;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	PersonInfo(int tall, int weight, String gender, String name, int age){
		this.tall = tall;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public String showPersonInfo() {
		return "키가 "+ tall + " 이고 몸무게가 " + weight + "킬로인 "+ gender +"이 있습니다. 이름은 "+ name + " 이고 나이는 "+age+"세 입니다.";
	}
	
}
