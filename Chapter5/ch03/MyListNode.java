package ch03;

public class MyListNode {

//	노드 정의
	private String data;       // 자료
	public MyListNode next;    // 다음 노드를 가리키는 링크
	
//	노드 생성 방법
	
//	1) 둘 다 null,null
	public MyListNode(){
		data = null;
		next = null;
	}
	
//	2) 데이터는 입력받고 다음 노드를 가리키는 데이터는 null
	public MyListNode(String data){
		this.data = data;
		this.next = null;
	}
	
	
//	3) 둘 다 데이터를 입력 받는 경우
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}
}

