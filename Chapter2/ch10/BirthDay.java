package ch10;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid; // default 값이 false다 
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
//	우클릭 --> source --> Generate Getters and Setters 누르면 자동으로 만들어진다.
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if( month <1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
//	get,set을 사용하지 않으면 (멤버변수의 오류 등)객체가 잘 못 사용되는 것을 노출하게되고 문제가 생긴다.
//	그래서 변수를 변경하거나 대입할 때 set 메서드로 변수를 제어해주면 오류를 막을 수 있다. 
	
	public void showDate()
	{
		if(isValid) {
			System.out.println(year+"년 " + month +"월 "+ day +"일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
//	이 파일안에서 값이 정해져야 하기 때문에 따로 set 메서드를 만들어주지는 않는다. == read only
	public boolean getIsValid() {
		return isValid;
	}
}
