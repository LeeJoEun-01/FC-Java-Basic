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

  public int pop() {
    if( isEmpty() ) {
      System.out.println("stack is empty.");
      return MyArray.ERROR_NUM;
    }
    
    // 마지막 요소가 삭제 되었음으로 top = top-1 
    return arrayStack.removeElement(--top);
  }

  public int peek() {
    if( isEmpty() ) {
      System.out.println("stack is empty.");
      return MyArray.ERROR_NUM;
    }
    
    return arrayStack.getElement(--top);
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

  public boolean isEmpty() {
    if( top == 0) {
      System.out.println("stack is empty.");
      return true;
    }
    else {
      return false;
    }
  }

  public void printAll()
	{
		arrayStack.printAll();
	}

}
