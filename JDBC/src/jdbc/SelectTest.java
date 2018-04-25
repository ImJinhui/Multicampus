package jdbc;
import java.beans.Statement;
import java.sql.*;


public class SelectTest {

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
			String sql = "SELECT count(*) cnt "
					+ "FROM emp   "; 
	
			
		// 4. SQL 전송 객체
			java.sql.Statement st = con.createStatement();
//			PreparedStatement pst = con.prepareStatement(sql);
		// 5. 전송
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			int getsu = rs.getInt("CNT");
			System.out.println(getsu);
			
			// 6. 닫기 
			rs.close();
			st.close();
//			pst.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		}
	
	}

}
