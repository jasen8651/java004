package java003_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 
		 * 프로그램을 구현하시오.
		 *  title             	publisher   writer     price
		 	JSP Programming  	JSPPub     JSPExpert   21000
			Servlet Programming WeBBest 	GoodName	 20000
			JDBC Programming 	JDBCBest 	NaDo SQL 	30000
			SQL Fundmental 		SQLBest		 Na SQL 	47000
			Java Programming 	JavaBest	 Kim kava	 25000
		 */
		LinkedList<String> sta = new LinkedList<String>();
		Scanner sc;
		try {
			File file =  new File("./src/java003_01/booklist.txt");
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String stn = sc.nextLine();
				String data = stn.replaceAll("/", " ");
				sta.push(new String(data));
			}
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		while(!sta.isEmpty())
		System.out.println(sta.pop());
		
	
	}//end main()

}//end class











