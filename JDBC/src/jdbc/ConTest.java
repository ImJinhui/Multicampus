package jdbc;
import java.sql.*;

public class ConTest {

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
//			String sql = "INSERT INTO account (account_no, customer, amount) VALUES ('333-33-3333', '홍길수', 10000)";
			String accno = "";
			String name = "";
			int money = 0;
			/*String sql = "INSERT INTO account (account_no, customer, amount) "
					+ "VALUES ('" + accno + "', '" + name + "', "+money+")";*/
			
			String sql = "INSERT INTO account VALUES(?,?,?)"; // preparedStatements
//			String sql = "UPDATE account SET customer=?, amount=? WHERE account_no=?"; // preparedStatements
			System.out.println(sql);
		// 4. SQL 전송 객체
//			Statement st = con.createStatement();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, accno);
			pst.setString(2, name);
			pst.setInt(3, money);
		// 5. 전송
//			st.executeUpdate(sql); //자동커밋
			pst.executeUpdate(); // sql 지정하면 안됨 
			int result = pst.executeUpdate();
			System.out.println(result + "행을 수정하였습니다");
		// 6. 닫기 
//			st.close();
			pst.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		}
	}

}
