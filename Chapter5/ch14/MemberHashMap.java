package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
  
  // key= integer, value= Member
  private HashMap<Integer, Member> hashMap;

  public MemberHashMap() {
    hashMap = new HashMap<>();
  }

  public void addMember(Member member) {
    hashMap.put(member.getMemberId(), member);
  }

  public boolean removeMember(int memberId) {
    if( hashMap.containsKey(memberId)) { //containsKey=> Map에 인자로 보낸 key가 있으면 true 없으면 false
      hashMap.remove(memberId);
    }

    System.out.println("no element");
    return false;
  }

  public void showAllMember() {

    Iterator<Integer> ir= hashMap.keySet().iterator(); // hashMap 자체는 Iterator 하지 못하지만 key나 value를 iterator 할 수 있다. 

    while(ir.hasNext()) {

      int key = ir.next();
      Member member = hashMap.get(key);
      System.out.println(member);
    }
  }
}
