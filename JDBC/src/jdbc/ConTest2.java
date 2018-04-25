package jdbc;
import java.sql.*;

public class ConTest2 {

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
//			String sql = "INSERT INTO emp_copy(empno, ename, sal) VALUES(9998, '홍돌이', 4000)";
//			String sql = "UPDATE emp_copy SET comm=2000, deptno=20 WHERE ename='홍돌이'";
			String sql = "INSERT INTO ex_good VALUES ('1003', 'ㅎㅎ', 'rkskek',200)";
		// 4. SQL 전송 객체
			Statement st = con.createStatement();
//			CallableStatement cs = con. // procedure나  function호출
		// 5. 전송
			st.executeUpdate(sql); //자동커밋
		// 6. 닫기 
			st.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		}
	}

}
