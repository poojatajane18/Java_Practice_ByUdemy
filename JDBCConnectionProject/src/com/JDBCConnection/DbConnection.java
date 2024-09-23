package com.JDBCConnection;
import java.sql.*;


public class DbConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * import package
		 * load and register
		 * create connection
		 * create statement
		 * execute statement
		 * process the results
		 * close
		 */
		
		int sid = 102;
		String sname = "Rakhi";
		int marks = 42;
		
		String url = "jdbc:mysql://localhost:3306/jdbcconn";
		String uname = "root";
		String pass = "Swati@187";
		//String sql = "select sname from student where sid=1";
		//String sql = "select * from student";
		//String sql = "insert into student values (7,'John',45)";
		//String sql = "update student set sname = 'Max' where sid=7";
		//String sql = "delete  from student where sid = 7";
		//String sql = "insert into student values(" + sid + ",'" + sname + "'," + marks + ")";
		String sql = "insert into student values(?,?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection Established");
		//Statement st = con.createStatement();
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1,sid);
		st.setString(2, sname);
		st.setInt(3, marks);
		
		/*ResultSet rs = st.executeQuery(sql);
		
		/-----rs.next();
		String name = rs.getString("sname");
		System.out.println("Name of the student is "+name);--------/
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" - ");
			System.out.print(rs.getString(2)+" - ");
			System.out.println(rs.getInt(3));
			
		}*/
		
		/*boolean status = st.execute(sql);
		System.out.println(status);
		*/
		
		st.execute();
		
		con.close();
		System.out.println("Connection Closed");


	}

}
