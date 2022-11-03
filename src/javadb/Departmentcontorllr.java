package javadb;

import java.util.List;

public class Departmentcontorllr {
	public Departmentcontorllr() {
		// TODO Auto-generated constructor stub
	}

	public void departmentsAllprocess() {
		DepartmentdDAO dao = DepartmentdDAO.getInstance();
		List<Departmentsdtd> aList = dao.listDepartments();

		for (Departmentsdtd dto : aList) {
			System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(),
					dto.getLocation_id());
		}
	}
}
