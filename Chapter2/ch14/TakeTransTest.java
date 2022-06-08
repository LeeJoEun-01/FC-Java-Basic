package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Toams", 10000);
		Student studentE = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		// Bus bus202 = new Bus(202);
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		// Subway blueSubway = new Subway(1);
		
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		bus100.showBusinfo();
		
		System.out.println("\n");
		studentT.showInfo();
		greenSubway.showSubwayInfo();
		
		Texi texi1 = new Texi("잘나간다 운수");
		
		studentE.takeTaxi(texi1);
		
		System.out.println("\n");
		studentE.showInfo();
		texi1.showTexiInfo();
		
	}

}
