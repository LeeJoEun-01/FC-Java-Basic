package ch14;

public class IfElseTest {

	public static void main(String[] args) {

		int age = 8;
		
		if (age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");
		}
		else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		
		System.out.println("��°� ���� ����");
		
//		ch15 
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if(age < 20) {
			charge = 2300;
			System.out.println("��, ����л��Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�����Դϴ�.");
		}
		
		System.out.println("������"+charge+"�Դϴ�.");
	}

}
