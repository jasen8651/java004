package javanat;


import java.util.Scanner;

public class Test {
//https://yongku.tistory.com/entry/%EC%9E%90%EB%B0%94Java-%EB%8F%84%EC%84%9C-%EA%B4%80%EB%A6%AC-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EC%B5%9C%EC%A2%85

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookManger bm = new BookManger();
		
		int num=0;
		
		do {
			System.out.println("1등록 2삭제 3검색 4리스트");
			num = sc.nextInt();
			
			if(num ==1) {
				System.out.println("아래 칸에 입력하라");
				System.out.println("책 제목 : ");
				String title = sc.nextLine();
				System.out.println("아래 칸에 입력하라");
				System.out.println("책 저자 :");
				String author = sc.nextLine();
				
				bm.add(title, author);
			}else if (num ==2) {
				System.out.println("삭제할 제목을 입력하라");
				String title  =sc.nextLine();
				bm.remove(title);
			}else if (num ==3) {
				System.out.println("검색할 제목은");
				String title = sc.nextLine();
				bm.search(title);
			}else if (num ==4) {
				bm.bookList();
			}
		}while(num!=0);
		
		
		
		
	}

}
