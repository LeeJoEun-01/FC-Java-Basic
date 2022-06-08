package ch04;

import ch02.MyArray;

public class MyArrayStack {

  MyArray arrayStack;
  int top; // 맨 마지막 요소으 위치

  public MyArrayStack() {
    top = 0;
    arrayStack = new MyArray();
  }

  public MyArrayStack(int size) {
    top = 0;
    arrayStack = new MyArray(size);
  }

  public void push(int data) {
    if( isFull() ){
      System.out.println("stack is full.");
      return;
    }
    arrayStack.addElement(data);
    top++;
  }

  // 배열이 꽉 찼는지 확인하는 메서드 
  public boolean isFull() {
    if( top == arrayStack.ARRAY_SIZE) {
      return true;
    }
    else {
      return false;
    }
  }

}
