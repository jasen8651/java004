package javadb;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc001 {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public void process() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);

			// System.out.println(conn);
			conn.setAutoCommit(false); // 자동 오토 커밋

			// 3. 쿼리문 실행 준비
			stmt = conn.createStatement();

			// 4.쿼리문 실행
			String sql = " SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			// System.out.println(rs);

			// 5.결과 출력
			while (rs.next()) {
				int department_Id = rs.getInt("department_id");
				String departName = rs.getString("department_name");
				int managerId = rs.getInt("department_id");
				int locationId = rs.getInt("location_id");
				System.out.printf("%d %s %d %d\n", department_Id, departName, managerId, locationId);
			}
			conn.commit();

		} catch (ClassNotFoundException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 종료

			try {
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
