package com.miniproject.userImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.miniproject.user.UserVO;

public class UserDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private final String USER_GET = "select * from users where id=? and password=?";
	

    public UserVO insertUser(UserVO user) {
    	
    	System.out.println("insertUser");
    	UserVO vo = null;
    	
        try {
        	
            pstmt = conn.prepareStatement(USER_GET);
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getPass());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getNickname());
            pstmt.setString(5, user.getPhone());

            rs = pstmt.executeQuery();
            
            if(rs.next()) {
				vo = new UserVO();
				user.setId(rs.getString("id"));
				user.setPass(rs.getString("pass"));
				user.setName(rs.getString("name"));
				user.setPhone(rs.getString("phone"));
				user.setNickname(rs.getString("nickname"));
			}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		return user;
    }
}