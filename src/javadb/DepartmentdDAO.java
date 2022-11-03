package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentdDAO {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private PreparedStatement pstmt;

	private static DepartmentdDAO dao = new DepartmentdDAO();

	private DepartmentdDAO() {
	}

	public static DepartmentdDAO getInstance() {
		return dao;
	}

	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");

		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}

	public List<Departmentsdtd> listDepartments() {
		List<Departmentsdtd> aList = new ArrayList<Departmentsdtd>();

		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = " SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Departmentsdtd dto = new Departmentsdtd();
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
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return aList;
	}
}
