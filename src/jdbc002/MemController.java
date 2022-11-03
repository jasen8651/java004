package jdbc002;

import java.util.HashMap;
import java.util.List;

public class MemController {

	private MemDAO dao;

	public MemController() {
		dao = MemDAO.getInstance();
	}
	public List<MemDTO> listprocess(){
		return dao.listMethod();
	}
	public int insertProcess(MemDTO dto) {
		return dao.inserMethod(dto);
	}
	public int updateprocess(HashMap<String, Object> hmap) {
		return dao.updatamethod(hmap);
	}
	public int deletprocess(int age) {
		return dao.deletemethod(age);
	}
}
