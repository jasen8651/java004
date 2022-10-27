package javanat;

import java.util.Scanner;

public class BookManger {
	Scanner sc = new Scanner(System.in);
	Book[] books = new Book[100];

	boolean isRun = true;
	int selectNo = 0;
	int count = 1;

	public BookManger() {
		run();
	}

	public void run() {
		while (isRun) {
			System.out.println("==================================================");
			System.out.println("=1.도서등록 | 2.도서목록 | 3.도서수정 | 4.도서삭제 | 5종료=");
			System.out.println("==================================================");
			selectNo = getSelectNum("번호를 선택 ");

			switch (selectNo) {
			case 1:
				registerBook();
				break;
			case 2:
				selsctBook();
				break;
			case 3:
				updataBook();
				break;
			case 4:
				deletBook();
				break;
			case 5:
				terminate();
				break;
			default:
				System.out.println("등록된 메뉴가 아니다.");
			}
		}
	}
	public void terminate() {
		System.out.println("pg종료");
		isRun=false;
	}
	public void registerBook() {
		System.out.println("도서 등록");
		String title = getData("등록할 책의 제목 입력 :");
		String author = getData("등록할 책의 저자 입력 :");
		for(int i=0; i<books.length; i++) {
			if(books[i]==null) {
				count=i+1;
				books[i]= new Book(count,title,author);
				System.out.println("등록완료");
				break;
			}
		}
	}
	private void selsctBook() {
		System.out.println("도서 목록");
		for(Book b : books) {
			if(b!=null) {
				printBookinfo(b);
			}
		}
	}
	public void updataBook() {
		 int bookNum = getSelectNum("수정할 도서의 관리 번호를 입력 ");
		 Book b = findBook(bookNum);
		 if(b ==null) {
			 System.out.println("입력한 숫자가 존재하지 않는다.");
			 return;
		 }
		 boolean isUpdata=true;
		 while(isUpdata) {
			 System.out.println("================================");
			 System.out.println("=1.제목수정 | 2.저자수정 | 3.수정완료 =");
			 System.out.println("================================");
			 
			 selectNo = getSelectNum("번호입력 >>");
			 switch(selectNo) {
			 case 1 :
	                String title = getData("제목을 수정");
	                b.setTitle(title);
	                System.out.println("제목 수정 완료 ");
			 case 2 :
	                String author = getData("저자를 수정");
	                b.setTitle(author);
	                System.out.println("저자 수정 완료 ");
			 case 3 :
	               System.out.println("종료");
	               isUpdata= false;
	               break;
			 		}
		 		}
			}
	public void deletBook() {
		System.out.println("도서 삭제");
		 int bookNum = getSelectNum("삭제할 도서의 관리 번호를 입력 ");
		 Book b = findBook(bookNum);
		 if(b==null) {
			 System.out.println("입력한 숫자 존재하지 않는다");
			 return;
		 }
		 for(int i=0; i<books.length; i++) {
			 if(books[i]!= null&&books[i].getNum()==bookNum) {
				 books[i]= null;
				 System.out.println("삭제완료");
				 return;
			 }
		 }
	}
	public void printBookinfo(Book b) {
		System.out.println(b.toString());
	}
	public Book findBook(int num) {
		for(int i=0; i<books.length; i++) {
			if(books[i]!=null&&books[i].getNum()==num) {
				return books[i];
			}
		}
		return null;
	}
	String getData(String message) {
		System.out.println(message);
		return sc.next();
	}
	int getSelectNum(String message) {
		return sc.nextInt();
		
	}
	public static void main(String[] args) {
		new BookManger();
	}
	
}
	
