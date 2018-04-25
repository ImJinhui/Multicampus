package basic;

import java.sql.*;

public class ResultSetTest2 {

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
					ResultSet.CONCUR_UPDATABLE
					);
			
			// 5. 전송
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				System.out.print(rs.getString("ACCOUNT_NO") + "\t");
				System.out.print(rs.getString("CUSTOMER") + "\t");
				int money = rs.getInt("AMOUNT") + 10000;
				rs.updateInt(3, money);
				rs.updateRow(); // 데이터베이스 정책문제로 oracle은 안됨 mysql은 됨 
			}
			
			
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
