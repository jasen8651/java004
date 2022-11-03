package javajdc1;

import java.util.List;

public class DepartmentsController {
	public DepartmentsController() {

	}
	
	public List<DepartmentsDTO> departmentsAllProcess(){
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.listDepartments();
	}

//	public void departmentsAllProcess() {
//		DepartmentsDAO dao = DepartmentsDAO.getInstance();
//		List<DepartmentsDTO> aList = dao.listDepartments();
//
//		for (DepartmentsDTO dto : aList) {
//			System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(),
//					dto.getLocation_id());
//		}
//	} // end departmentsAllProcess()
	
	public List<DepartmentsDTO> departmentsSearchProcess(String data){
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.searchDepartments(data);
	}

} // end class
