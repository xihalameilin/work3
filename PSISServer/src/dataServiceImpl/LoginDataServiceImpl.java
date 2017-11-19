package dataServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataservice.Logindataservice;
import po.PersonAccountPO;
import utility.DBUtil;

public class LoginDataServiceImpl implements Logindataservice{

	@Override
	public int addPersonAccount(PersonAccountPO p) {
		boolean flag=true;
		Connection conn=DBUtil.open();
		String sql="insert into PersonAccountTBL (name,password,identity)values(?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getNumber());
			pstmt.setString(2, p.getPassword());
			pstmt.setString(3, p.getIdentity());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			flag=false;
			e.printStackTrace();
		}finally{DBUtil.close(conn);}
		
		return (flag==true)?1:0;
	}

	@Override
	public String getpassword(String name) {
	    String sql="select name,password,identity from PersonAccountTBL where name =?";
	    String password="";
		Connection conn=DBUtil.open();
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){password=rs.getString(2);}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return password;
	}

}
