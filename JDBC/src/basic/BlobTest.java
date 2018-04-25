package basic;

import java.io.*;
import java.sql.*;

public class BlobTest {

	public static void main(String[] args) {
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@70.12.115.67:1521:orcl";
			String user = "scott";
			String pass = "tiger";
		
		// 2. 연결객체를 얻어오기 
			Connection con = DriverManager.getConnection(url, user, pass);
			File f = new File("src\\basic\\wang.jpg");
			FileInputStream fis = new FileInputStream(f);			
		// 3. SQL 문장
			String sql = "INSERT INTO imgtest VALUES(?,?)";
			
		// 4. SQL 전송 객체
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, f.toString());
			ps.setBinaryStream(2, fis, f.length()); // 통로끼리 연결?
			
		// 5. 전송
			ps.executeUpdate();
		// 6. 닫기 
			ps.close();
			con.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		}
	}

}
