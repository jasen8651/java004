package javanat;

public class BookManger {
	int MAX_SIZE=100;
	Book[] books = new Book[MAX_SIZE];
	int size=0;
	
	public void add(String title, String author) {
		Book b = new Book();
		b.setTitle(title);
		b.setAuthor(author);
		
		books[size++]=b;
	}
	public void remove(String title) {
		System.out.println("책삭제한다.");
		for(int i=0; i<size; i++) {
			if(books[i].getTitle().equals(title)) {
				for(; i<size; i++) {
					books[i] = books[i+1];
				}
				size--;
			}
		}
	}
	public void search(String title) {
		System.out.println("책 검색");
		for(int i=0; i<size; i++) {
			if(books[i].getTitle().equals(title)) {
				System.out.println(books[i]);
			}
		}
		
	}
	public void bookList() {
		System.out.println("책 리스트 목록");
		for(int i=1; i<size; i++) {
			System.out.println(books[i]);
		}
	}
	 
}
