package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;


public class RentModel {

	Connection con;

	public RentModel() throws Exception {
		
		// 2. Connection 연결객체 얻어오기
		con = DBcon.getConnection();
	}

	
	public void rent(String tel, String videoNo) throws Exception {
		
		String sql = "INSERT INTO rental(RCODE,OUTDATE,INDATE,TEL,VCODE) VALUES(seq_rental.nextval, sysdate,null,?,?)";
		PreparedStatement ps1 = con.prepareStatement(sql);
		
		ps1.setString(1, tel);
		ps1.setString(2, videoNo);
		int re1 = ps1.executeUpdate();
		if (re1 != 1) {
			con.rollback();
			return;
		}
		
		// 6. 닫기 (PreparedStatement 만 닫기)
		ps1.close();
	}


	


	public void returnVideo(String vnum) throws Exception{
		String sql= "UPDATE RENTAL SET INDATE =sysdate , state='TRUE' WHERE vcode="+vnum
				+"AND indate is null";
		PreparedStatement ps1 = con.prepareStatement(sql);
	
		int re1 = ps1.executeUpdate();
		if (re1 != 1) {
			con.rollback();
			return;
		}
		
		// 6. 닫기 (PreparedStatement 만 닫기)
		ps1.close();
		
		
	}
	
	public ArrayList search() throws Exception{
		ArrayList data = new ArrayList();
		String sql = "SELECT vi.VICODE viCode, vi.TITLE viTitle, m.NAME mName, m.TEL mTel, (r.OUTDATE+3) willReturn,'미납' isReturned "
				+ "FROM rental r, member m, video v, vinfo vi "
				+ "WHERE r.tel = m.tel and r.VCODE = v.VCODE and v.VICODE=vi.VICODE and r.indate is null";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<ArrayList> list = new ArrayList<>();
		while(rs.next()){
			ArrayList<String> temp = new ArrayList<String>();
			temp.add(rs.getString("VICODE"));
			temp.add(rs.getString("viTitle"));
			temp.add(rs.getString("mName"));
			temp.add(rs.getString("mTel"));
			temp.add(rs.getString("willReturn"));
			temp.add(rs.getString("isReturned"));
			
			list.add(temp);
		}
		rs.close();
		st.close();
		
		return list;
	}
		
}

