package basic;

import java.sql.*;

public class ResultSetTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@70.12.115.67:1521:orcl";
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		
		try {
			// 1. 드라이버 로딩 
			Class.forName(driver);
			
			// 2. 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			
			// 3. sql문장
			String sql = "SELECT * FROM account ";
			
			// 4. 전송객체
			Statement st = con.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE, //ResultSet.TYPE_FORWARD_ONLY가 기본값
					ResultSet.CONCUR_READ_ONLY
					);
			
			// 5. 전송
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				System.out.print(rs.getString("ACCOUNT_NO") + "\t");
				System.out.print(rs.getString("CUSTOMER") + "\t");
				System.out.println(rs.getString("AMOUNT"));
			}
			/*
			rs.last();
			while(rs.previous()){ // 거꾸로 읽기 
				System.out.print(rs.getString("ACCOUNT_NO") + ">");
				System.out.print(rs.getString("CUSTOMER") + ">");
				System.out.println(rs.getString("AMOUNT"));
			}*/
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e){
			System.out.println("SQL에러");
		} finally {
			// 6. 닫기 
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
	}

}
