package javadb;

import java.util.List;
/*
 * 패턴
 * model : 데이터 관리
 * view : 결과 화면
 * contoroller  : 클라이언트 요청 응답 및 처리, 모델과 뷰의 인터페이스, 
 */
public class DepartmentsController {
	public DepartmentsController() {
		
	}

	public void departmentsAllprocess() {
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		List<DepartmentsDTO> aList = dao.listDepartments();

		for (DepartmentsDTO dto : aList) {
			System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(),
					dto.getLocation_id());
		}
	}
	
}
