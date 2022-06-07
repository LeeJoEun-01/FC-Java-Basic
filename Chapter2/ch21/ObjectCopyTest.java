package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
//      얕은 복사 => 하나의 값을 바꾸면 library, copyLibrary 두 배열의 값이 다 바뀐다. => 같은 주소 값을 가지고 있기 때문!
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("== 얕은 복사 ==");
		System.out.println("== library ==");
		for( Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copy library ==");
		for( Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
//      깊은 복사 => 하나의 값을 바꿔도 다른 라이브러리에 영향을 미치지 않는다.
		Book[] copyLibrary2 = new Book[5];
		
		copyLibrary2[0] = new Book();
		copyLibrary2[1] = new Book();
		copyLibrary2[2] = new Book();
		copyLibrary2[3] = new Book();
		copyLibrary2[4] = new Book();
		
		for(int i=0; i <library.length; i++) {
			copyLibrary2[i].setAuthor(library[i].getAuthor());
			copyLibrary2[i].setTitle(library[i].getTitle());
		}
		
		System.out.println("== 깊은 복사 ==");
		
		System.out.println("== copy library2 ==");
		for( Book book : copyLibrary2) {
			System.out.println(book);
			book.showInfo();
		}
		
	}

}
