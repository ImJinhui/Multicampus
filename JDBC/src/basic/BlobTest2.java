package basic;

import java.io.*;
import java.sql.*;

public class BlobTest2 {

	public static void main(String[] args) {
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@70.12.115.67:1521:orcl";
			String user = "scott";
			String pass = "tiger";
		
		// 2. 연결객체를 얻어오기 
			Connection con = DriverManager.getConnection(url, user, pass);
			FileOutputStream fis = new FileOutputStream("aaa.jpg");
			// 3. SQL 문장
			String sql = "SELECT img_binary FROM imgtest";
			
		// 4. SQL 전송 객체
			PreparedStatement ps = con.prepareStatement(sql);
			
		// 5. 전송
			ResultSet rs = ps.executeQuery();
			InputStream in = null;
			if(rs.next()){
				in = rs.getBinaryStream("img_binary");
			}
			byte[] buffer = new byte[1024];
			int size = 0;
			while((size=in.read(buffer)) != -1){
				fis.write(buffer, 0, size);
			}
		// 6. 닫기 
			ps.close();
			con.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		}
	}

}
