package jdbc;
import java.beans.Statement;
import java.sql.*;


public class SelectTest2 {

	public static void main(String[] args) {
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@70.12.115.67:1521:orcl";
			String user = "scott";
			String pass = "tiger";
			
		// 2. 연결객체를 얻어오기 
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("성공");
		// 3. SQL 문장
			int wolgup = 2000;
			String buseo = "SALES";
			
			String sql = "SELECT e.empno empno, e.ename ename, d.dname dname  "
					+ "FROM emp e, dept d  "
					+ "WHERE e.deptno=d.deptno AND d.dname=? AND e.sal>? "; 
	
			
		// 4. SQL 전송 객체
//			java.sql.Statement st = con.createStatement();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, buseo);
			pst.setInt(2, wolgup);
		// 5. 전송
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.print(rs.getInt("EMPNO") + "\t");
				System.out.print(rs.getString("ENAME")+ "\t");
				System.out.print(rs.getString("dname"));
				System.out.println();
			}
			// 6. 닫기 
			rs.close();
			pst.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		}
	
	}

}
