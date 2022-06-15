package ch19;

public abstract class Decorator extends Coffee{  //abstract을 추가함으로써 상속을 하기 위한 상위클래스로 사용

  Coffee coffee;

  public Decorator(Coffee coffee) {

    this.coffee = coffee;
  }

  @Override
  public void brewing() {
    
    coffee.brewing();
    
  }
  
}
