package java003_01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Prob002_LinkedList {

	public static void main(String[] args) {

		LinkedList<Doctor> queue = new LinkedList<Doctor>();
		// hospital.txt파일의 내용을 LinkedList에 Queue자료구조로 저장
		// 수행하는 프로그램을 구현하시오.
		try {
			Scanner sc;
			File file = new File("./src/java003_01/hospital.txt");
			sc = new Scanner(file);
			Doctor d;
			while (sc.hasNextLine()) {
				String stn = sc.nextLine();
				String[] data= stn.split("/");
				d= new Doctor(data[0], data[1], Integer.parseInt(data[2]));
				queue.offer(d);
			}
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		prnDisplay(queue);
		
	}// end main()

	public static void prnDisplay(LinkedList<Doctor> queue) {
		/*
		 * 출력결과 
		 * [김병조 의사] 진료과목 : 외과 환자수 : 39
		 * [이상만 의사] 진료과목 : 내과 환자수 : 50
		 * [박상기 의사] 진료과목 : 피부과 환자수 : 20
		 */
		while (!queue.isEmpty()) {
			Doctor d = queue.poll();
			System.out.printf("[%s 의사]  ", d.getName());
			System.out.printf("진료과목:%s  ", d.getMedical());
			System.out.printf("환자수:%d\n\n", d.getPatient());
		}
	}// end prnDisplay()

}// end class
