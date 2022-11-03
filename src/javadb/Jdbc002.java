package javadb;

import java.util.List;
import java.util.Scanner;

import javajdc1.DepartmentsController;
import javajdc1.DepartmentsDTO;

public class Jdbc002 {

	public static void main(String[] args) {
	
		DepartmentsController dController = new DepartmentsController();
		Scanner sc = new Scanner(System.in);
		System.out.print("1 전체, 2 검색어 :");
		int input = Integer.parseInt(sc.nextLine());
		if (input == 1) {
			List<DepartmentsDTO> aList = dController.departmentsAllProcess();
			for (DepartmentsDTO dto : aList) {
				System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(),
						dto.getManager_id(), dto.getLocation_id());
			}
		} else if (input == 2) {
			System.out.print("부서 입력 : ");
			String line = sc.nextLine();
			List<DepartmentsDTO> aList = dController.departmentsSearchProcess(line);
			for (DepartmentsDTO dto : aList) {
				System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(),
						dto.getManager_id(), dto.getLocation_id());
			}
		}		
		//dc.departmentsAllprocess();

	}
	

}
