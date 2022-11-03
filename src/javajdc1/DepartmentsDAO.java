package javajdc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO : Data Access Object(데이터 접근 객체)
// 싱글톤 패턴 : 하나의 객체를 만들어서 사용하기 위해, 작성시 계속해서 작성하지 않기 위해.
public class DepartmentsDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;

	private static DepartmentsDAO dao = new DepartmentsDAO();

	private DepartmentsDAO() {
	}

	public static DepartmentsDAO getInstance() {
		return dao;
	}

	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";

		return DriverManager.getConnection(url, username, password);
	} // end init()

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (psmt != null)
			psmt.close();
		if (conn != null)
			conn.close();
	} // end exit()

	public List<DepartmentsDTO> listDepartments() {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();

		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return aList;
	}// end listDepartments

	public List<DepartmentsDTO> searchDepartments(String data) {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();

		try {
			conn = init();
			conn.setAutoCommit(false);

			/*
			 * stmt = conn.createStatement(); String sql =
			 * "SELECT * FROM departments WHERE department_name LIKE '%" + data +
			 * "%' ORDER BY department_id"; rs = stmt.executeQuery(sql);
			 */
			String sql = "SELECT * FROM departments WHERE department_name LIKE ? ORDER BY department_id";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%"+data+"%");
			rs =psmt.executeQuery();
			// ? -> 플레이 솔더 
			
			while(rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return aList;
	} // end searchDepartments

}
