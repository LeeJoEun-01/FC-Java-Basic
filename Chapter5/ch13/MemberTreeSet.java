package ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
  
  private TreeSet<Member> treeSet;

// Comparator를 사용하려면 대상을 무조건 써줘야한다!!!!!!!!
  public MemberTreeSet() {
    treeSet = new TreeSet<Member>(new Member());
  }

  public void addMember(Member member){ 
		treeSet.add(member);
	}

  public boolean removeMember(int memberId) {

    // Iterator 방식
    Iterator<Member> ir = treeSet.iterator();

    while(ir.hasNext()) {

      Member member = ir.next();

      int tempId = member.getMemberId();
      if(tempId == memberId) {
        treeSet.remove(member);
        return true;
      }
    }


    System.out.println(memberId +"가 존재하지 않습니다.");
    return false;
  }
  public void showAllMember() {

    for( Member member : treeSet) {
      System.out.println(member);
    }
    System.out.println();
  }
}
