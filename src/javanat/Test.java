/*
 * package javanat;
 * 
 * import java.util.Scanner;
 * 
 * public class Test { public static void main(String[] args) { Scanner sc = new
 * Scanner(System.in); BookManger bm = new BookManger();
 * 
 * 
 * int num=0;
 * 
 * do { System.out.println("******************");
 * System.out.println("1 : 책 등록"); System.out.println("2 : 책 삭제");
 * System.out.println("3 : 책 검색"); System.out.println("4 : 책 리스트");
 * System.out.println("0 : 종료***********");
 * System.out.println("******************");
 * System.out.println("**사용번호를 입력하라***"); num = sc.nextInt();
 * 
 * if(num == 1) { System.out.println("아래 사항을 입력하라");
 * 
 * System.out.print("책 재목 :    책처자 : \n"); String title = sc.nextLine(); String
 * author = sc.nextLine();
 * 
 * bm.add(title, author); }else if(num == 2) {
 * System.out.println("삭제할 책제목을 입력하라"); String title = sc.next();
 * bm.remove(title); }else if (num ==3) { System.out.println("검색할 책 제목을 입력하라");
 * String title = sc.next(); bm.searchBytitle(title, title); }else if (num == 4)
 * { bm.getList(null); } }while(num!=0); }
 * 
 * }
 */