package ch05;

public class MyLinkedQueueTest {
  public static void main(String[] args) {
    
    MyLinkedQueue listQueue = new MyLinkedQueue();
    listQueue.enQueue("A");
    listQueue.enQueue("B");
    listQueue.enQueue("C");
    listQueue.enQueue("D");

    listQueue.printQueue();

    System.out.println(listQueue.deQueue());
    System.out.println(listQueue.deQueue());
  }
}
