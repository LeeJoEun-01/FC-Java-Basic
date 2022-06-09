package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {
  
  public static void main(String[] args) {

    TreeSet<String> set = new TreeSet<>();

    // set.add("홍길동");
    // set.add("강감찬");
    // set.add("이순신");

    // // 정렬이 되서 나온다. (String이 Comparable을 포함하고 있기때문에 비교 가능)
    // System.out.println(set);
    
    MemberTreeSet memberHashSet = new MemberTreeSet(); // TreeSet을 사용하려는 변수는 comparable이나 comparator을 구현해야한다! 

    Member memberLee = new Member(1001, "이순신");
    Member memberKim = new Member(1002, "김유신");
    Member memberKang = new Member(1003, "강감찬");
    Member memberHong = new Member(1004, "홍길동");

    memberHashSet.addMember(memberLee);
    memberHashSet.addMember(memberKim);
    memberHashSet.addMember(memberKang);
    memberHashSet.addMember(memberHong);

    Member memberKang2 = new Member(1003, "강강강");
    // memberId의 중복만 체크하는 메서드를 만들었기 때문에 이름이 같아도 Id가 다르기 때문에 중복을 인식하지 못하고 배열에 추가된다.
    Member memberHong2 = new Member(1005, "홍길동");

    memberHashSet.addMember(memberKang2);
    memberHashSet.addMember(memberHong2);

    // 들어간 순서대로 나오지 않는다.
    memberHashSet.showAllMember();
  }
}
