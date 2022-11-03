package jdbc002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import oracle.net.aso.p;

public class MemDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;
	private static MemDAO dao = new MemDAO();

	private MemDAO() {

	}

	static MemDAO getInstance() {
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
	}

	public List<MemDTO> listMethod() {
		List<MemDTO> aList = new ArrayList<MemDTO>();
		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "select * from mem order by num";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);
			}
			conn.commit();

			rs = stmt.executeQuery(sql);
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return aList;
	}

	// 삽입
	public int inserMethod(MemDTO dto) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);

			String sql = "insert into mem(num, name, age, loc) ";
			sql += "values(mem_num_seq.nextval, ?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			psmt.setInt(2, dto.getAge());
			psmt.setString(3, dto.getLoc());

			chk = psmt.executeUpdate();

			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return chk;
	}
	//수정
	public int updatamethod(HashMap<String, Object>hmap) {
		int chk =-1;
		
		try {
			conn = init();
			conn.setAutoCommit(false);
			String sql = "update mem set name=? where num=?";
			psmt =conn.prepareStatement(sql);
			psmt.setString(1, hmap.get("name").toString());
			psmt.setInt(2,  Integer.parseInt( hmap.get("num").toString()));
			
			chk = psmt.executeUpdate();
			
			conn.commit();
		} catch (ClassNotFoundException |SQLException e) {	
			e.printStackTrace();
			try {
				conn.rollback();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				exit();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}	
		return chk;
	}
	//삭제
	public int deletemethod(int age) {
		int chk =-1;
		
		try {
			conn = init();
			conn.setAutoCommit(false);
			
			String sql ="delete from mem where age>=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, age);
			
			chk =  psmt.executeUpdate();
			conn.commit();
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return chk;
	}
}
