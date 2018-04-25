package basic;

import java.sql.*;

public class CallPrepTest {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@70.12.115.67:1521:orcl";
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		CallableStatement cs = null;
		
		try {
			// 1. 드라이버 로딩 
			Class.forName(driver);
			
			// 2. 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			
			// 3. sql문장
			String sql = "{ call proc_account(?,?,?) }";
			
			// 4. 전송객체
			cs = con.prepareCall(sql);
			cs.setString(1, "123-12-1234");
			cs.setString(2, "돌돌이");
			cs.setInt(3, 2000);
			
			// 5. 전송
			int result = cs.executeUpdate();
			System.out.println(result + "행 입력");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e){
			System.out.println("SQL에러");
		} finally {
			// 6. 닫기 
			try {
				cs.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

}
