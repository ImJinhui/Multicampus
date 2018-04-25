package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.vo.Customer;

public class CustomerModel {

	Connection con;
	String oldTel;
	
	public ArrayList<String> list = new ArrayList<String>();
	
	public CustomerModel() throws Exception{
		
		con = DBcon.getConnection();
	}
	
	public void insertCustomer(Customer dao) throws Exception{
		
		// 3. sql 문장 만들기
		String sql = "INSERT INTO member(tel, name, tel2, addr, email) VALUES (?,?,?,?,?)";
		// 4. sql 전송객체 (PreparedStatement)	
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dao.getCustTel1());
		ps.setString(2, dao.getCustName());
		ps.setString(3, dao.getCustTel2());
		ps.setString(4, dao.getCustAddr());
		ps.setString(5, dao.getCustEmail());
		
		// 5. sql 전송
		ps.executeUpdate();
		
		// 6. 닫기 (PreparedStatement  만 닫기)
		ps.close();
	}
	
	public Customer selectByTel(String tel) throws Exception{
		Customer dao = new Customer();
		
		String sql = "SELECT * FROM member WHERE tel=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			dao.setCustAddr(rs.getString("ADDR"));
			dao.setCustName(rs.getString("NAME"));
			dao.setCustEmail(rs.getString("EMAIL"));
			dao.setCustTel1(rs.getString("TEL"));
			dao.setCustTel2(rs.getString("TEL2"));
		}
		oldTel = dao.getCustTel1();
		rs.close();
		ps.close();
		return dao;
	}
	
	public Customer selectByName(String name) throws Exception{
		Customer dao = new Customer();
		
		String sql = "SELECT * FROM member WHERE name=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		
		ResultSet rs = ps.executeQuery();
		
			while (rs.next()) {
				dao.setCustAddr(rs.getString("ADDR"));
				dao.setCustName(rs.getString("NAME"));
				dao.setCustEmail(rs.getString("EMAIL"));
				dao.setCustTel1(rs.getString("TEL"));
				dao.setCustTel2(rs.getString("TEL2"));
				
				list.add(dao.getCustTel1());
			}
			System.out.println(list.size());

		rs.close();
		ps.close();
		return dao;
	}
	
	public int updateCustomer(Customer dao) throws Exception{
		String sql = "UPDATE member SET name=?, tel2=?, addr=?, email=?, tel=? WHERE tel=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dao.getCustName());
		ps.setString(2, dao.getCustTel2());
		ps.setString(3, dao.getCustAddr());
		ps.setString(4, dao.getCustEmail());
		ps.setString(5, dao.getCustTel1());
		ps.setString(6, oldTel);
		
		int result = 0;
		
		result = ps.executeUpdate();
		ps.close();
		
		return result;
	}
}
