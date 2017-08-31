package db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;



public class DbConnect {
	 public static void main(String[] args) throws Exception {
		        // TODO Auto-generated method stub
		        Class.forName("com.mysql.jdbc.Driver");       
		        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study", "root","root");
		        Statement stmt =  conn.createStatement();
		        System.out.println("数据库连接成功");
		        String sql="insert into sunkaile(name,birthday,age,createdt)values('sunkaile','1996-08-09','22','2017-08-30')";
		        stmt.execute(sql);
		        ResultSet rs = stmt.executeQuery("select * from sunkaile");    
		        while (rs.next()) {
		           String name=rs.getString("name");
		           String age=rs.getString("age");
		           String birthday=rs.getString("birthday");
		           String createDate=rs.getString("createdt");
		           System.out.println("name:"+name+" age:"+age+" birthday:"+birthday+" creatdate:"+createDate);
		            }        
		        if (rs != null) {
		            rs.close();
		        }
		        if (stmt != null) {
		            stmt.close();   
		        }
		        if (conn != null) {
		            conn.close();   
		        }
		    }
	 
}
