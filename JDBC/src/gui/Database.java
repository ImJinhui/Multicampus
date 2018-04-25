package gui;

import java.sql.*;
import java.util.ArrayList;

public class Database {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@70.12.115.67:1521:orcl";
	String user = "scott";
	String pass = "tiger";
	Connection con;
	
	//생성자
	public Database() throws Exception {
		// 1. 드라이버 로딩
		Class.forName(driver);
		// 2. 연결객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);
	}
	
	public void insertData(InfoVO info) throws Exception{
		// 3. sql 문장생성
		String sql = "INSERT INTO info_tab(tel, name, jumin, gender, home, age) "
				+ " VALUES(?,?,?,?,?,?)";
		
		// 4. sql 전송 객체 얻어오기
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, info.getTel());
		ps.setString(2, info.getName());
		ps.setString(3, info.getId());
		ps.setString(4, info.getGender());
		ps.setString(5, info.getHome());
		ps.setInt(6, info.getAge());
		
		// 5. sql 전송 
		ps.executeUpdate();
		// 6. 닫기 (Connection제외)
		ps.close();
	}
	
	public InfoVO selectByPk(String tel) throws Exception {
		InfoVO vo = new InfoVO();
		// 3. sql 문장생성
		String sql = "SELECT * FROM info_tab WHERE tel='"+tel+"'";
				
		// 4. sql 전송 객체 얻어오기
		Statement st = con.createStatement();
				
		// 5. sql 전송 
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()){
			vo.setName(rs.getString("NAME"));
			vo.setGender(rs.getString("GENDER"));
			vo.setHome(rs.getString("HOME"));
			vo.setId(rs.getString("JUMIN"));
			vo.setTel(rs.getString("TEL"));
			vo.setAge(rs.getInt("AGE"));
		}
		// 6. 닫기 (Connection제외)
		st.close();
		return vo;
	}

	public void updateData(InfoVO info) throws Exception {
		// 3. sql 문장생성
		String sql = "UPDATE info_tab SET name=?, jumin=?, gender=?, home=?, age=? "
				+ " WHERE tel=?";
				
		// 4. sql 전송 객체 얻어오기
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, info.getName());
		ps.setString(2, info.getId());
		ps.setString(3, info.getGender());
		ps.setString(4, info.getHome());
		ps.setInt(5, info.getAge());
		ps.setString(6, info.getTel());
				
		// 5. sql 전송 
		ps.executeUpdate();
		// 6. 닫기 (Connection제외)
		ps.close();
		
	}

	public void delete(String tel) throws Exception {
		// 3. sql 문장생성
		String sql = "DELETE FROM info_tab WHERE tel=?";
		
		// 4. sql 전송 객체 얻어오기
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		
		// 5. sql 전송 
		ps.executeUpdate();
		// 6. 닫기 (Connection제외)
		ps.close();
		
	}
	
	public ArrayList<InfoVO> selectAll() throws Exception{
		
		String sql = "SELECT name, jumin, tel, nvl(gender, '여자') gender, age, home FROM info_tab";
		// PreparedStatement는 sql을 먼저 끌고감 ->executeQuery(sql) 금지
		PreparedStatement ps = con.prepareStatement(sql); 
	
		ResultSet rs = ps.executeQuery();
		ArrayList<InfoVO> list = new ArrayList<InfoVO>();
		
		while(rs.next()){
			InfoVO vo = new InfoVO(); // 한사람에 대한 정보
			vo.setName(rs.getString("NAME"));
			vo.setGender(rs.getString("GENDER"));
			vo.setHome(rs.getString("HOME"));
			vo.setId(rs.getString("JUMIN"));
			vo.setTel(rs.getString("TEL"));
			vo.setAge(rs.getInt("AGE"));
			
			list.add(vo); // 여러명의 정보 집합 
		}
		
		rs.close();
		ps.close();
		
		return list;
	}
}

