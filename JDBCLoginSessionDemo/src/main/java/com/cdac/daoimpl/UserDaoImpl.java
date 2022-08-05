package com.cdac.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cdac.connection.DbConnection;
import com.cdac.dao.UserDao;
import com.cdac.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUserCredentials(User user) {
		
		try(Connection con = DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst = 
					con.prepareStatement("SELECT * FROM registration"
							+ " WHERE name = ? and password = ?");
			
			pst.setString(1, user.getName());
			pst.setString(2, user.getPassword());
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.isBeforeFirst())
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addNewUser(User user) {
		
		try(Connection con = DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst = 
					con.prepareStatement("INSERT INTO registration "
							+ "VALUES(?,?,?,?,?,?)");
			
			pst.setString(1, user.getName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getMobile());
			pst.setString(5, user.getGender());
			pst.setString(6, user.getCountry());
			
			int count = pst.executeUpdate();
			
			if(count > 0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}












